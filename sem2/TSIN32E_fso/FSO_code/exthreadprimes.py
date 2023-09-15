#coding: utf-8
import threading

class PrimeNumber(threading.Thread): 
    def __init__(self, number): 
        threading.Thread.__init__(self) 
        self.Number = number
 
    def run(self):  # Brute force. DON'T USE!    
        if self.Number == 2:
            print(f"{self.Number} é primo")
        elif (self.Number == 1) or (self.Number % 2 == 0):
            print(f"{self.Number} não é primo")
        else:
            i = self.Number - 1
            while i > 1:
                if self.Number % i == 0:
                    print(f"{self.Number} não é primo")
                    break
                i -= 1
            else:
                print(f"{self.Number} é primo") 

while True: 
    num = int(input("número? [0 termina]:")) 
    if num < 1: 
        break 
    thread = PrimeNumber(num) 
    # thread.daemon = True
    thread.start()

    
