n, k = map(int, input().split())

min_index = 0
min_value = float('inf')
group_size = k + 1

for i in range(n):
    a, b, x = map(int, input().split())
    
    if group_size <= x:
        total_cost = a
    else:
        total_cost = a + (group_size - x) * b

    if total_cost < min_value or (total_cost == min_value and i + 1 < min_index):
        min_value = total_cost
        min_index = i + 1

print(min_index)
