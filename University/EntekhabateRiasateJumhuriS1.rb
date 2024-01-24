class Main
    def self.main()
        scanner =  java.util.Scanner
        n = gets.chomp
        print(self.person(n, 2) + 1,"\n")
    end
    def self.person( n,  k)
        if (n == 1)
            return 0
        else
            return (self.person(n - 1, k) + k) % n
        end
    end
end
Main.main()
