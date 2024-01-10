def main():
    string = input("Enter a string: ")

    for i in range(len(string)):
        print(string[i] + ": ", end="")
        for j in range(int(string[i])):
            print(string[i], end="")
        print("")

if __name__ == "__main__":
    main()
