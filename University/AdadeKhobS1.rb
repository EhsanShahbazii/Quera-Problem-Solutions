class Main
    def self.main()
        scanner =  java.util.Scanner
        number = gets.chomp
        sum = 0
        n = 1
        flag = true
        while (flag)
            m = (n * (n + 1)) / 2
            i = 1
            while (i <= m)
                if (m % i == 0)
                    sum += 1
                end
                i += 1
            end
            if (number <= sum)
                print(m)
                flag = false
            end
            sum = 0
            n += 1
        end
    end
end
Main.main()
