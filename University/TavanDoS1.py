def main():
    number = int(input())
    pow = 1

    while number >= pow:
        pow *= 2

    print(pow)

if __name__ == "__main__":
    main()
