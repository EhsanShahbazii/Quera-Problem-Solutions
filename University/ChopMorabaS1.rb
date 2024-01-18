class Main
    def self.main()
        try ()
        {
            side = gets.chomp
            i = 1
            while (i <= side)
                if (i == 1)
                    self.print(side)
                    print("")
                elsif (i == side)
                    self.print(side)
                else
                    self.printDeep(side)
                end
                print("","\n")
                i += 1
            end
        }
    end
    def self.print( side)
        i = 1
        while (i <= side)
            print("*")
            i += 1
        end
    end
    def self.printDeep( side)
        i = 1
        while (i <= side)
            if (i == 1 || i == side)
                print("*")
            else
                print(" ")
            end
            i += 1
        end
    end
end
Main.main()
