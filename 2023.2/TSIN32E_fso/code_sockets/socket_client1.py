# !/usr/bin/python3
# coding: utf-8

import sys
from socket import *


def get_srv_time(srv_addr='localhost', port=8888):
    s = socket(AF_INET, SOCK_STREAM)  # cria o socket

    s.connect((srv_addr, int(port)))  # conecta-se ao server

    tm = s.recv(1024)  # recebe até 1024 B

    s.close()

    print(f"Received from server:{tm}")


if __name__ == "__main__":
    if len(sys.argv) < 3:
        get_srv_time()
    else:
        get_srv_time(sys.argv[1], sys.argv[2])
