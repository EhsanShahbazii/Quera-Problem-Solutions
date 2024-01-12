def main():
    row1, column, column2 = map(int, input().split())
    array1 = [[0 for _ in range(101)] for _ in range(101)]
    array2 = [[0 for _ in range(101)] for _ in range(101)]
    result = [[0 for _ in range(101)] for _ in range(101)]

    for i in range(row1):
        array1[i] = list(map(int, input().split()))

    for i in range(column):
        array2[i] = list(map(int, input().split()))

    for i in range(row1):
        for j in range(column2):
            for k in range(column):
                result[i][j] += array1[i][k] * array2[k][j]

    for i in range(row1):
        for j in range(column2):
            print(result[i][j], end=" ")
        print("")

if __name__ == "__main__":
    main()
