package main
import "os"
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
    var  scanner*  Scanner =  java.util.Scanner(java.io.BufferedInputStream@4e41089d);
    var  n  int = get_input[int]();
    var  m  int = get_input[int]();
    if (n == 1) {
        fmt.Print(1);
    } else {
        var fib [1000000]int
        fib[0] = 1;
        fib[1] = 1;
        var  f1  int = 1;
        var  f2  int = 1;
        var  f3  int = 2;
        var  i  int = 2;
        for(f3 <= n) {
            fib[i] = f3;
            i++;
            f1 = f2;
            f2 = f3;
            f3 = f1 + f2;
        }
        for  j  := i - 1; j >= 0; j-- {
            fmt.Println(fib[j]);
        }
    }
}

func main(){
	var task = Main{};
	task.main_1(os.Args);
}
