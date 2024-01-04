def main():
    input_num = int(input("Enter a number: "))
    divisors_sum = 0
    for i in range(1, input_num):
        if input_num % i == 0:
            divisors_sum += i
          
    z = 1
    flag = False
    while z <= divisors_sum:
        if z == divisors_sum:
            flag = True
        z *= 2
      
    if flag:
        print(1)
    else:
        print(0)

if __name__ == "__main__":
    main()
