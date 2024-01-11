from decimal import Decimal

def main():
    count = int(input())
    result = Decimal(0)

    for _ in range(count):
        num = Decimal(input())
        result += num

    print(result)

if __name__ == "__main__":
    main()
