def main():
    n = int(input())
    space = 1
    for j in range(1, n + 1):
        print(" " * space + "*" * (2 * j - 1))
        space += 1
    space = n - 1
    for j in range(1, n):
        print(" " * space + "*" * (2 * (n - j) - 1))
        space -= 1

if __name__ == "__main__":
    main()
