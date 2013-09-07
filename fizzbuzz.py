#!/usr/bin/python
import sys

if __name__ == "__main__":
    if len(sys.argv) < 2:
        print "Need number argument > 0!"
        exit(-1)

    num = int(sys.argv[1]);
    for n in range(1,num+1):
        if n % 15 == 0:
            print "FizzBuzz"
        elif n % 5 == 0:
            print "Buzz"
        elif n % 3 == 0:
            print "Fizz"
        else:
            print "%d" % n
