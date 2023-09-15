# Python 3.6+
from time import sleep
from random import randrange
from threading import Thread

def sleeper(i):
  sleep_time = randrange(0, 300)  # 0 - 5 min	
  print(f"Thread {i} dormindo por {sleep_time} segundos...")
  sleep(sleep_time)
  print(f"Thread {i} acordou!")
  
for i in range(20):   # 20 threads
  thrd = Thread(target=sleeper, args=(i,))
  thrd.start() 

