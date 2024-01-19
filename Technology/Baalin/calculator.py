def calculate_floor(string):
    now = 0
    for i, c in enumerate(string):
        if (c == "U"):
            now = now + 1
        else:
            now = now - 1
    return now
    
print(calculate_floor("UUDU"))
