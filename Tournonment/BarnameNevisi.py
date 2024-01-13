import sys
class Main(object) :
    @staticmethod
    def main( args) :
        scanner =  "Python-inputs"
        n = input()
        k = input()
        if (n <= 60) :
            print(n * 1500)
        else :
            x = 60 * 1500
            if (n - 60 <= k) :
                print(x + (n - 60) * 1500)
            else :
                print(x + k * 1500 + (n - 60 - k) * 3000)


if __name__=="__main__":
    Main.main(sys.argv)
