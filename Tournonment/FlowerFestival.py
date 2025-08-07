n, f = map(int, input().split(' '))

durations = []
for i in range(n):
    x, v = map(int, input().split(' '))
    durations.append((f - x)/v)

first_car = min(enumerate(durations), key=lambda x: x[1])[0] + 1

print(first_car)