class Main
    def self.main()
        try ()
        {
            number = gets.chomp
            sum = 0
            count = 0
            prime = 0
            distance = number
            while (number > 0)
                sum += number % 10
                number /= 10
            end
            if (distance == 1)
                print(2)
            else
                flag = false
                while (count < sum)
                    distance += 1
                    i = 2
                    while (i <= (distance + 1) / 2)
                        if (distance % i == 0)
                            flag = true
                            break
                        end
                        i += 1
                    end
                    if (!flag)
                        count += 1
                        prime = distance
                    end
                    flag = false
                end
                print(prime)
            end
        }
    end
end
Main.main()
