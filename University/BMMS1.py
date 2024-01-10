def main():
    n = int(input())
    m = int(input())

    print(gcd(n, m))

def gcd(p, q):
    if q == 0:
        return p
    else:
        return gcd(q, p % q)

if __name__ == "__main__":
    main()
