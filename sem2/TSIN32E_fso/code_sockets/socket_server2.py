from socket import *

my_host = ''  # localhost
my_port = 5050

sock = socket(AF_INET, SOCK_STREAM)
sock.bind((my_host, my_port))
sock.listen(5)

while 1:
    conn, addr = sock.accept()
    print(f'Servidor conectado por {addr}')
    while 1:
        data = conn.recv(1024)
        if not data:
            break
        conn.send(str.encode(f'Echo ==>{data}'))
    conn.close()

