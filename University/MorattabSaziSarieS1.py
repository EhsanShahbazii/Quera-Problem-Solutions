def main():
    input_str = input()
    data = input_str.split()

    for i in range(len(data)):
        for j in range(i + 1, len(data)):
            if int(data[i]) > int(data[j]):
                data[i], data[j] = data[j], data[i]

    for item in data:
        print(item, end=" ")

if __name__ == "__main__":
    main()
