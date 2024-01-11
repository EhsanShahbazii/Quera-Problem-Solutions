def main():
    n, m = map(int, input().split())
    if n == 1:
        print(1)
    else:
        fib = [0] * 1000000
        fib[0] = 1
        fib[1] = 1
        f1, f2, f3, i = 1, 1, 2, 2
        while f3 <= n:
            fib[i] = f3
            i += 1
            f1, f2, f3 = f2, f3, f1 + f2
        for j in range(i - 1, -1, -1):
            print(fib[j])

if __name__ == "__main__":
    main()
