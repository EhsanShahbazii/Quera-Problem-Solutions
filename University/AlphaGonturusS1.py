def main():
    n = int(input())
    b = int(input())

    result = format(n, '0' + str(b) + 'X')
    print(result)

if __name__ == "__main__":
    main()
