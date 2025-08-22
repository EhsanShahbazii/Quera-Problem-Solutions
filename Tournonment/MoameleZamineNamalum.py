import math

m, M = map(int, input().split())

if m >= M:
    print("impossible")
else:
    area = m * math.sqrt(M*M - m*m)
    print(f"{area:.12f}")
