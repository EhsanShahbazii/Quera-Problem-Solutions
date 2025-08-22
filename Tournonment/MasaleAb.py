a, b, c, d, e, f = map(int, input().split())

A, B = sorted((a, b)) 

ok = False
for x, y in ((d, e), (d, f), (e, f)): 
    x, y = sorted((x, y))           
    if x <= A and y <= B:        
        ok = True
        break

print("zende mimuni" if ok else "dari mimiri")
