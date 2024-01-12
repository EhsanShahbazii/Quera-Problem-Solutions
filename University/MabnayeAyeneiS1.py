def main():
    a = input()
    b = int(input())
    c = int(input())

    result = format(int(a, b), '0' + str(c))

    if reverse(result) == result:
        print("YES")
    else:
        print("NO")

def reverse(input):
    result = ""
    for i in range(len(input)):
        result = result + input[len(input) - 1 - i]
    return result

if __name__ == "__main__":
    main()
