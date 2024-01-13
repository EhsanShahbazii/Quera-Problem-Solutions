import sys
class Main(object) :
    @staticmethod
    def main( args) :
        try (scanner =  "Python-inputs") :
            currentScore = input()
            tripDay = input()
            finalScore = 0
            if (tripDay == 7) :
                print(currentScore, end ="")
            elif(tripDay == 0) :
                print(20, end ="")
            else :
                finalScore = currentScore - tripDay
                if (finalScore < 0) :
                    print(0, end ="")
                else :
                    print(finalScore, end ="")


if __name__=="__main__":
    Main.main(sys.argv)
