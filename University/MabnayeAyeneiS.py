class Main:
    @staticmethod
    def get_max_area(hist):
        n = len(hist)
        s = []
        max_area = 0
        i = 0
        while i < n:
            if not s or hist[s[-1]] <= hist[i]:
                s.append(i)
                i += 1
            else:
                tp = s.pop()
                area_with_top = hist[tp] * (i if not s else i - s[-1] - 1)
                max_area = max(max_area, area_with_top)
        while s:
            tp = s.pop()
            area_with_top = hist[tp] * (i if not s else i - s[-1] - 1)
            max_area = max(max_area, area_with_top)
        return max_area

    @staticmethod
    def main():
        n = int(input())
        arr = list(map(int, input().split()))
        print(Main.get_max_area(arr))

Main.main()
