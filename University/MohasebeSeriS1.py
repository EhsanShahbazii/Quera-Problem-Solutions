from math import factorial

def main_1():
    n = int(input())
    sum = 0
    for i in range(1, n+1):
        sum += multi(i)
    print(sum)

def fact(n):
    result = 1
    for i in range(2, n+1):
        result *= i
    return result

def comb(n, m):
    return fact(n) // (fact(m) * fact(n-m))

def multi(i):
    results = 1
    for j in range(1, i+1):
        results *= comb(i, j)
    return results
