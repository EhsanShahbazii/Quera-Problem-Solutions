def separator(ls):
    a = []
    b = []
    for x in ls:
        if(x % 2 == 0):
            a.append(x)
        else:
            b.append(x)
    return(a, b)        
    
print(separator([-3, -2, -1, 0, 1, 2, 3]))