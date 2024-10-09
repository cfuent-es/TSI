/* Servidor socket TCP
   A porta é passada como argumento */
#include <stdio.h>
#include <stdlib.h>
#include <string.h>
#include <unistd.h>
#include <sys/types.h> 
#include <sys/socket.h>
#include <netinet/in.h>

// void bzero(void *s, size_t n);
#define bzero(s, n) memset((s), 0, (n))

// void bcopy(const void *s1, void *s2, size_t n);
#define bcopy(s1, s2, n) memmove((s2), (s1), (n))


void error(const char *msg){
    perror(msg);
    exit(1);
}
const char response[]="Sou o Servidor. Recebi sua mensagem.";
int main(int argc, char *argv[]){
     int sockfd, newsockfd, portno;
     socklen_t clilen;
     char buffer[256];
     struct sockaddr_in serv_addr, cli_addr;
     int n;
     if (argc < 2) {
         fprintf(stderr,"ERRO: porta não fornecida\n");
         exit(1);
     }
     sockfd = socket(AF_INET, SOCK_STREAM, 0);
     if (sockfd < 0) 
        error("ERRO: abertura do socket");
     bzero((char *) &serv_addr, sizeof(serv_addr));
     portno = atoi(argv[1]);
     serv_addr.sin_family = AF_INET;
     serv_addr.sin_addr.s_addr = INADDR_ANY;
     serv_addr.sin_port = htons(portno);
     if (bind(sockfd, (struct sockaddr *) &serv_addr,
              sizeof(serv_addr)) < 0) 
              error("ERRO: ligação");
     printf("Servidor ouvindo na porta [%s]...\n",argv[1]);
     listen(sockfd,5);
     clilen = sizeof(cli_addr);
     newsockfd = accept(sockfd, 
                 (struct sockaddr *) &cli_addr, 
                 &clilen);
     if (newsockfd < 0) 
          error("ERRO: aceite");
     bzero(buffer,256);
     n = read(newsockfd,buffer,255);
     if (n < 0) error("ERRO: leitura do socket");
     printf("Mensagem recebida do cliente: %s\n",buffer);
     n = write(newsockfd,response,strlen(response));
     if (n < 0) error("ERRO: escrita no socket");
     close(newsockfd);
     close(sockfd);
     return 0; 
}
