n = int(input())

data = [n]
flag = True

data = [int(x) for x in input().split()]

for i in range(1,n-1):
    if (data[i] > data[i-1] and data[i] > data[i+1]):
        flag = False
        break
    
if (flag):
    print("Bah Bah! Ajab jooji!")
else:
    print("Ey baba :(")

# </Ctrl+Z>
