import math
import decimal

def main():
    x = int(input())
    n = int(input())
    result = decimal.Decimal(0)

    for i in range(1, n+1):
        result += pows(x, i-1) / factorial(i-1)

    print("{:.3f}".format(result))

def factorial(n):
    if n == 0:
        return decimal.Decimal(1)
    else:
        return decimal.Decimal(n) * factorial(n-1)

def pows(num, n):
    result = decimal.Decimal(1)
    for i in range(n):
        result *= decimal.Decimal(num)
    return result

if __name__ == "__main__":
    main()
