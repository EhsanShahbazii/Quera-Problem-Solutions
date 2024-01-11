def main():
    n, m = map(int, input().split())
    kmm = (n * m) // gcd(n, m)
    print(gcd(n, m), kmm)

def gcd(p, q):
    if q == 0:
        return p
    else:
        return gcd(q, p % q)

if __name__ == "__main__":
    main()
