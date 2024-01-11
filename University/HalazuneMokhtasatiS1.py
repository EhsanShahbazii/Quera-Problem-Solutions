if __name__ == "__main__":
    point = int(input())
    if (point + 1) % 4 == 0:
        n = (point + 1) // 4
        print(n, n)
    elif point % 4 == 0:
        n = point // 4
        print(-1 * n, n)
    elif (point - 1) % 4 == 0:
        n = (point - 1) // 4
        print(-1 * n, -1 * n)
    else:
        n = (point + 2) // 4
        print(n, -1 * n + 1)
