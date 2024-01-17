class Main
    def self.main()
        try ()
        {
            n = gets.chomp
            m = gets.chomp
            print(self.gcd(n, m))
        }
    end
    def self.gcd( p,  q)
        if (q == 0)
            return p
        else
            return self.gcd(q, p % q)
        end
    end
end
Main.main()
