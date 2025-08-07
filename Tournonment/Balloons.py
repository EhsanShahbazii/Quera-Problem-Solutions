def can_form_acpc(s):
    target = "acpc"
    i = 0
    for char in s.strip().lower():
        if char == target[i]:
            i += 1
            if i == 4:
                return True
    return False

t = int(input())
for _ in range(t):
    s = input()
    print("YES" if can_form_acpc(s) else "NO")
