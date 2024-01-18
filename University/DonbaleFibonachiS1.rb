class Main
    def self.main()
        scanner =  java.util.Scanner
        n = gets.chomp
        m = gets.chomp
        if (n == 1)
            print(1)
        else
            fib = Array.new(1000000){0}
            fib[0] = 1
            fib[1] = 1
            f1 = 1
            f2 = 1
            f3 = 2
            i = 2
            while (f3 <= n)
                fib[i] = f3
                i += 1
                f1 = f2
                f2 = f3
                f3 = f1 + f2
            end
            j = i - 1
            while (j >= 0)
                print(fib[j],"\n")
                j -= 1
            end
        end
    end
end
Main.main()
