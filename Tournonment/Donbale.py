import sys
from math import isqrt
from collections import defaultdict

data = sys.stdin.buffer.read().split()
it = iter(data)

n = int(next(it))
A = [0]*(n+1)
for i in range(1, n+1):
    A[i] = int(next(it))

Q = int(next(it))
queries = []
for qi in range(Q):
    s = int(next(it))
    k = int(next(it))
    queries.append((s, k))

B = isqrt(n)  
ans = [0]*Q

small_groups = defaultdict(list) 
big_queries = []              

for idx, (s, k) in enumerate(queries):
    if k <= B:
        small_groups[k].append((idx, s))
    else:
        big_queries.append((idx, s, k))

for k, items in small_groups.items():
    dp = [0]*(n+1)
    for i in range(n, 0, -1):
        j = i + k
        dp[i] = A[i] + (dp[j] if j <= n else 0)
    for idx, s in items:
        ans[idx] = dp[s]
    del dp

for idx, s, k in big_queries:
    total = 0
    i = s
    while i <= n:
        total += A[i]
        i += k
    ans[idx] = total

sys.stdout.write("\n".join(map(str, ans)))
