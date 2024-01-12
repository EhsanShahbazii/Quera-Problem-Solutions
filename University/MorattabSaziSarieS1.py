def main_2():
    data = list(map(int, input().split()))
    data.sort()
    for item in data:
        print(item, end=" ")

def pascal(n):
    pascal = [[0] * (i+2) for i in range(n+1)]
    pascal[1][1] = 1
    for i in range(2, n+1):
        pascal[i] = [pascal[i-1][j-1] + pascal[i-1][j] for j in range(1, len(pascal[i])-1)]
    for i in range(1, n+1):
        for j in range(1, len(pascal[i])-1):
            print(pascal[i][j], end=" ")
        print()
