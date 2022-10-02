a,b,c,d,m = [int(x) for x in input().split()]

pro_a = c*m
pro_b = d*m

if (a+pro_a > b+pro_b and pro_a > pro_b):
    print("Eyval baba!")
elif (b+pro_b > a+pro_a and pro_b > pro_a):
    print("Eyval baba!")
else:
    print("Naaa, eshtebahe!")
    
# </Ctrl+Z>
