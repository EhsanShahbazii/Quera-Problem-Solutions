def main():
    number = int(input())
    result = 1

    for i in range(2, number // 2 + 1):
        if number % i == 0:
            result += i

    if result == number:
        print("YES")
    else:
        print("NO")

if __name__ == "__main__":
    main()
