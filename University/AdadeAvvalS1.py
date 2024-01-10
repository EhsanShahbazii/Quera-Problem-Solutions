def main():
    min_val = int(input())
    max_val = int(input())
    flag = True
    if min_val == 1:
        min_val += 1

    for i in range(min_val, max_val + 1):
        for j in range(2, i // 2 + 1):
            if i % j == 0:
                flag = False
                break
        if flag:
            print(i)
        flag = True

if __name__ == "__main__":
    main()
