import sys

T = int(sys.stdin.readline())
units = [("MiB", 1024 * 1024), ("KiB", 1024), ("B", 1)]

for _ in range(T):
    m = int(sys.stdin.readline())
    for name, size in units:
        n = m // size
        if 1 <= n <= 1023:
            print(f"{n}{name}")
            break
