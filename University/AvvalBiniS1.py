def main():
    min_val = int(input())
    max_val = int(input())
    flag = True
    result = ""

    for i in range(min_val + 1, max_val):
        for j in range(2, i // 2 + 1):
            if i % j == 0:
                flag = False
                break
        if flag:
            result += str(i) + ","
        flag = True

    if len(result) > 1:
        print(result[:-1])

if __name__ == "__main__":
    main()
