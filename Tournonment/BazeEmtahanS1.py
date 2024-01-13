import sys
class Main(object) :
    @staticmethod
    def main( args) :
        try (scanner =  "Python-inputs") :
            s = input()
            f = input()
            l = input()
            x = input()
            if (x < s) :
                print("exam did not started!")
            elif(x >= f) :
                print("exam finished!")
            elif(f - x > l) :
                print(l)
            else :
                print(f - x)

if __name__=="__main__":
    Main.main(sys.argv)
