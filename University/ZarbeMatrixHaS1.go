package main
import "os"
import "strconv"
import "fmt"

func get_input[T any]() T {
	var i T
	fmt.Scan(&i)
	return i
}
type Main struct {
}
func Main_1() * Main {
    var this * Main =  &Main{};
    return this;
}
func (this *Main) main_1(args []string) {
    var  input*  Scanner =  java.util.Scanner(java.io.BufferedInputStream@6a472554);
    var  row1  byte = get_input[byte]();
    var  column  byte = get_input[byte]();
    var  column2  byte = get_input[byte]();
    var array1 [101][101]int
    var array2 [101][101]int
    var result [101][101]int
    for  i  := 0; i < row1; i++ {
        for  j  := 0; j < column; j++ {
            array1[i][j] = get_input[int]();
        }
    }
    for  i  := 0; i < column; i++ {
        for  j  := 0; j < column2; j++ {
            array2[i][j] = get_input[int]();
        }
    }
    for  i  := 0; i < row1; i++ {
        for  j  := 0; j < column2; j++ {
            for  k  := 0; k < column; k++ {
                result[i][j] += array1[i][k] * array2[k][j];
            }
        }
    }
    for  i  := 0; i < row1; i++ {
        for  j  := 0; j < column2; j++ {
            fmt.Print(strconv.Itoa(result[i][j]) + " ");
        }
        fmt.Println("");
    }
}

func main(){
	var task = Main{};
	task.main_1(os.Args);
}
