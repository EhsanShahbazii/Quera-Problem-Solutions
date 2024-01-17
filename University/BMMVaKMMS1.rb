class Main
    def self.main()
        try ()
        {
            n = gets.chomp
            m = gets.chomp
            kmm = (n * m) / self.gcd(n, m)
            print(self.gcd(n, m).to_s + " " + kmm.to_s)
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
