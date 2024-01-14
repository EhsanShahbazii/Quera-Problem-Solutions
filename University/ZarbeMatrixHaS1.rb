class Main
    def self.main()
        input =  java.util.Scanner
        row1 = input.nextByte()
        column = input.nextByte()
        column2 = input.nextByte()
        array1 = Array.new(101){Array.new(101){0}}
        array2 = Array.new(101){Array.new(101){0}}
        result = Array.new(101){Array.new(101){0}}
        i = 0
        while (i < row1)
            j = 0
            while (j < column)
                array1[i][j] = gets.chomp
                j += 1
            end
            i += 1
        end
        i = 0
        while (i < column)
            j = 0
            while (j < column2)
                array2[i][j] = gets.chomp
                j += 1
            end
            i += 1
        end
        i = 0
        while (i < row1)
            j = 0
            while (j < column2)
                k = 0
                while (k < column)
                    result[i][j] += array1[i][k] * array2[k][j]
                    k += 1
                end
                j += 1
            end
            i += 1
        end
        i = 0
        while (i < row1)
            j = 0
            while (j < column2)
                print(result[i][j].to_s + " ")
                j += 1
            end
            print("","\n")
            i += 1
        end
    end
end
Main.main()
