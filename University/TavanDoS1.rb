class Main
    def self.main()
        try ()
        {
            number = gets.chomp
            pow = 1
            while (number >= pow)
                pow *= 2
            end
            print(pow)
        }
    end
end
Main.main()
