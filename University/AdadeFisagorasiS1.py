def main():
    side1 = int(input())
    side2 = int(input())
    side3 = int(input())

    if side1 * side1 == side2 * side2 + side3 * side3:
        print("YES")
    elif side2 * side2 == side1 * side1 + side3 * side3:
        print("YES")
    elif side3 * side3 == side1 * side1 + side2 * side2:
        print("YES")
    else:
        print("NO")

if __name__ == "__main__":
    main()
