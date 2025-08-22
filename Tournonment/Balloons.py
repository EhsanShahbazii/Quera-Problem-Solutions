def can_form_acpc(s: str) -> bool:
    target = "acpc"
    i = 0
    for ch in s.strip():
        if ch == target[i]:
            i += 1
            if i == 4:
                return True
    return False

t = int(input())
for _ in range(t):
    s = input().strip()
    
    if len(s) == 4 and s == "acpc":
        print("NO")
        continue
    
    print("YES" if can_form_acpc(s) else "NO")
