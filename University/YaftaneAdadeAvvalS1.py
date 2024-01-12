def main():
    number = int(input())
    sum = 0
    count = 0
    prime = 0
    distance = number

    while number > 0:
        sum += number % 10
        number //= 10

    if distance == 1:
        print(2)
    else:
        flag = False
        while count < sum:
            distance += 1
            for i in range(2, (distance + 1)//2 + 1):
                if distance % i == 0:
                    flag = True
                    break
            if not flag:
                count += 1
                prime = distance
            flag = False

        print(prime)

if __name__ == "__main__":
    main()
