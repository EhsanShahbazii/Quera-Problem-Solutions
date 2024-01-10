def main():
    number = int(input())

    sum_val = 0
    n = 1
    flag = True

    while flag:
        m = (n * (n + 1)) // 2
        for i in range(1, m + 1):
            if m % i == 0:
                sum_val += 1
        if number <= sum_val:
            print(m)
            flag = False
        sum_val = 0
        n += 1

if __name__ == "__main__":
    main()
