def main_5():
    n = int(input())
    for a in range(1, n):
        for b in range(a, n):
            c = n - a - b
            if a * a + b * b == c * c:
                numbers = [a, b, c]
                numbers.sort()
                print(numbers[0], numbers[1], numbers[2])
                return
    print("Impossible")
