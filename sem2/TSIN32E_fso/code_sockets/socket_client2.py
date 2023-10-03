import sys
from socket import *
server_host = 'localhost'
server_port = 5050

message = ('Hello world!', 'Again!')
if len(sys.argv) > 1:
    server_host = sys.argv[1]
    if len(sys.argv) > 2:
        message = sys.argv[2]

sock = socket(AF_INET, SOCK_STREAM)
sock.connect ((server_host, server_port))

for line in message:
    sock.send(str.encode(line))
    data = sock.recv(1024).decode()
    print(f'Received: {data}')
sock.close()

