def main():
    num = int(input())
    print(fact(num))

def fact(num):
    if num == 0:
        return 1
    else:
        return num * fact(num - 1)

if __name__ == "__main__":
    main()
