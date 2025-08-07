n = int(input())

numbers = []
for i in range(n):
    numbers.append(input())

def validation(num):
    if num.startswith('+98') and num.count('+') == 1 and len(num) == 13:
        return num
    if num.count('+') == 0:
        if num.startswith('09') and len(num) == 11:
            return '+98' + num[1:]
        if num.startswith('98') and len(num) == 12:
            return '+' + num

    return 'invalid'

for i in numbers:
    print(validation(i))

