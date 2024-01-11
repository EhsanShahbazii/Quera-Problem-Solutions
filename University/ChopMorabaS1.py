def main():
    side = int(input())
    for i in range(1, side + 1):
        if i == 1:
            print("*" * side, end="")
        elif i == side:
            print("*" * side)
        else:
            print_deep(side)
        print("")

def print_deep(side):
    print("*" + " " * (side - 2) + "*")

if __name__ == "__main__":
    main()
