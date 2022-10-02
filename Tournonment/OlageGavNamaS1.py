t,a,b = [int(x) for x in input().split()]

a_count = 0
b_count = 0

while(True):
    t = t-1
    if (t >= 0):
        a_count = a_count+1
    else:
        break
    
    t = t-a
    
    t = t-1
    if(t >= 0):
        b_count = b_count+1
    else:
        break
    
    t = t-b
    
print(a_count, b_count)    

# </Ctrl+Z>
