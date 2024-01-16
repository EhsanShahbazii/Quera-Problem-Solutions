class Main
    def self.main()
        try ()
        {
            number = gets.chomp
            reverse = ""
            i = 0
            while (i < number.length)
                reverse = reverse.concat(number[number.length - (i + 1)].join(""))
                i += 1
            end
            if (reverse===number)
                print("YES")
            else
                print("NO")
            end
        }
    end
end
Main.main()
