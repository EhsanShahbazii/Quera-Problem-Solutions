def main():
    num1 = input()
    num2 = input()

    result = abs(int(num2) - int(num1))

    finals = ""
    for i in range(2, result + 1):
        if result % i == 0:
            finals += str(i) + " "

    print(finals[:-1])

if __name__ == "__main__":
    main()
