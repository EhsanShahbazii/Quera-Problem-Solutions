n = int(input().strip())
a, b = map(int, input().split())
c, d = map(int, input().split())

if (a == c and b == d) or (a == d and b == c):
    print(2)
    raise SystemExit

if a in (c, d) or b in (c, d):
    print(3)
    raise SystemExit

def in_interval(a, b, x, n):
    if a == b:
        return False
    if a < b:
        return a < x < b
    return x > a or x < b


cuts = in_interval(a, b, c, n) ^ in_interval(a, b, d, n)

print(4 if cuts else 3)
