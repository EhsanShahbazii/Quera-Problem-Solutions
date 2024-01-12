import sys

def main():
    n = input()
    numbers = [int(x) for x in input().split()]
    if n == "1":
        print(numbers[0])
    else:
        numbers.sort()
        print(numbers[-1])

if __name__ == "__main__":
    main()
