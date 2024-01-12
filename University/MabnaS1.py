def main():
    a = input()
    c = int(input())

    result = format(int(a, 10), '0' + str(c))

    sum1, sum2 = 0, 0
    for i in range(len(result)):
        num = int(result[i])
        if i % 2 == 0:
            sum1 += num
        else:
            sum2 += num

    if sum1 == sum2:
        print("Yes")
    else:
        print("No")

if __name__ == "__main__":
    main()
