class Main:
    def main(self):
        data = ["shanbe", "1shanbe", "2shanbe", "3shanbe", "4shanbe", "5shanbe", "jome"]

        a = int(input())
        for _ in range(a):
            data.remove(input())

        b = int(input())
        for _ in range(b):
            data.remove(input())

        c = int(input())
        for _ in range(c):
            data.remove(input())

        print(len(data))

if __name__ == "__main__":
    main = Main()
    main.main()
