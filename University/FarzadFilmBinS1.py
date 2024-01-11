def to_camel_case(s):
    parts = s.split(" ")
    camel_case_string = ""
    for part in parts:
        camel_case_string = camel_case_string + to_proper_case(part) + " "
    return camel_case_string

def to_proper_case(s):
    return s[0].upper() + s[1:].lower()

if __name__ == "__main__":
    num = int(input())
    data = [to_camel_case(input()) for _ in range(num)]
    for item in data:
        print(item)
