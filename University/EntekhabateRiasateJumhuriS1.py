def main():
    n = int(input())
    print(person(n, 2) + 1)

def person(n, k):
    if n == 1:
        return 0
    else:
        return (person(n - 1, k) + k) % n

if __name__ == "__main__":
    main()
