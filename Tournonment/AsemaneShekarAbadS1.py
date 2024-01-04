import sys

def main():
    row, column = map(int, input().split())
    data = [['' for _ in range(column)] for _ in range(row)]
    count = 0

    for i in range(row):
        input_str = input()
        for j in range(column):
            data[i][j] = input_str[j]
            if data[i][j] == '*':
                count += 1

    print(count)

if __name__ == "__main__":
    main()
