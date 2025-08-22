def draw_line(a: int):
    print(" ".join(["*"] * a))

def draw_square(a: int, b: int):
    off = (a - b) // 2 
    for i in range(a):
        if i < off or i >= off + b:
            draw_line(a) 
        else:
            row = []
            for j in range(a):
                if j < off or j >= off + b:
                    row.append("*")
                else:
                    row.append(" ")
            print(" ".join(row))

def main():
    a = int(input().strip())
    b = int(input().strip()) 

    if b >= a:
        print("Wrong order!")
    elif (a - b) % 2 != 0:
        print("Wrong difference!")
    else:
        draw_square(a, b)

if __name__ == "__main__":
    main()
