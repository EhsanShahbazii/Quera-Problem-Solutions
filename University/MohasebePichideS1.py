import math

def main():
    a, x, n = map(int, input().split())
    result = 0
    for k in range(n+1):
        result += (factorial(n) // (factorial(k) * factorial(n-k))) * (x ** k) * (a ** (n-k))
    print(result)

def factorial(n):
    if n == 0:
        return 1
    else:
        return n * factorial(n-1)

if __name__ == "__main__":
    main()
