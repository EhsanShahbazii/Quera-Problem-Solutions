import sys
class Main(object) :
    @staticmethod
    def main( args) :
        scanner =  "Python-inputs"
        input1 = input()
        input2 = input()
        if (input1[0] >= input2[0]) :
            print("Left", end ="")
        else :
            print("Right", end ="")


if __name__=="__main__":
    Main.main(sys.argv)
