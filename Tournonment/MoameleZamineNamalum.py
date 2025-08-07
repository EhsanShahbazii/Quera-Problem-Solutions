import math

m, n = map(int, input().split(' '))

try:
    a = math.sqrt(n**2 - m**2) 
    res = a * m
    if res == 0:
        print('impossible')
    else:
        print(res)
except:
    print('impossible')