class Main
    def self.main()
        space = 1
        s =  java.util.Scanner
        n = gets.chomp
        n += 1
        space = n - 1
        j = 1
        while (j <= n)
            i = 1
            while (i <= space)
                print(" ")
                i += 1
            end
            space -= 1
            i = 1
            while (i <= 2 * j - 1)
                print("*")
                i += 1
            end
            print("","\n")
            j += 1
        end
        space = 1
        j = 1
        while (j <= n - 1)
            i = 1
            while (i <= space)
                print(" ")
                i += 1
            end
            space += 1
            i = 1
            while (i <= 2 * (n - j) - 1)
                print("*")
                i += 1
            end
            print("","\n")
            j += 1
        end
    end
end
Main.main()
