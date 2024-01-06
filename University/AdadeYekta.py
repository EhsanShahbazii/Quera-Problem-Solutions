import numpy as np

def main():
    n = int(input())
    input_arr = list(map(int, input().split()))
  
    series = np.unique(input_arr)

    for i in range(len(series)):
        count = 0
        for j in range(len(input_arr)):
            if series[i] == input_arr[j]:
                count += 1
        if count > 1:
            series[i] = -1
        count = 0
      
    result = 0
    for i in range(len(series)):
        s = series[i]
        if s != -1:
            result ^= s

    print(result)

if __name__ == "__main__":
    main()
