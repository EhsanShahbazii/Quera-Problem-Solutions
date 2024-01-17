class Main
    def self.main()
        try ()
        {
            min = gets.chomp
            max = gets.chomp
            flag = true
            result = ""
            i = min + 1
            while (i < max)
                j = 2
                while (j <= i / 2)
                    if (i % j == 0)
                        flag = false
                        break
                    end
                    j += 1
                end
                if (flag)
                    result = result.concat(i.to_s + ",")
                end
                flag = true
                i += 1
            end
            if (result.length > 1)
                print(result[0...result.length - 1])
            end
        }
    end
end
Main.main()
