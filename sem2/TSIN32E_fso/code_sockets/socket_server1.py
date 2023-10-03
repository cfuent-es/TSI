# !/usr/bin/python3
# coding: utf-8

import time
from socket import *

HOST = ''  # indica qualquer interface IPv4
PORT = 8888  # porta para ouvir

s = socket(AF_INET, SOCK_STREAM)  # cria o socket TCP
s.bind((HOST, PORT))  # bind para a porta
s.listen(5)  # ouvindo, até 5 conexões pendentes

while True:
    conn, addr = s.accept()  # obtém a conexão
    print(f"Accepted connection from [{addr}]")
    curr_time = time.ctime(time.time())

    conn.send(str.encode(curr_time))  # envia
    conn.close()  # fecha a conexão
