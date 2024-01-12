def gcd(p, q):
    if q == 0:
        return p
    else:
        return gcd(q, p % q)

def main_4():
    num1, num2 = map(int, input().split())
    if num1 < 0:
        num1 *= -1
    if num2 < 0:
        num2 *= -1
    print(gcd(num1, num2))
