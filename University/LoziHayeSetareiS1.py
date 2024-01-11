if __name__ == "__main__":
    n = int(input())
    space = 1
    k = 0
    line = [""] * ((n + 1) // 2)
    space = n - 1
    for j in range(1, (n + 1) // 2 + 1):
        line[k] = ""
        for i in range(1, space + 1, 2):
            line[k] += " "
        for i in range(1, 2 * j):
            line[k] += "*"
        for i in range(1, space + 1, 2):
            line[k] += "  "
        for i in range(1, 2 * j):
            line[k] += "*"
        space -= 2
        k += 1
    if n == 1:
        print("*")
    else:
        for m in range((n + 1) // 2):
            print(line[m])
        for m in range((n - 1) // 2 - 1, -1, -1):
            print(line[m])
