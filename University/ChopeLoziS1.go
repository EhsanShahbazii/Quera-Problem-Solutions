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
    var  n  int;
    var  i  int;
    var  j  int;
    var  space  int = 1;
    var  s*  Scanner =  java.util.Scanner(java.io.BufferedInputStream@6a396c1e);
    n = get_input[int]();
    n++;
    space = n - 1;
    for j = 1; j <= n; j++ {
        for i = 1; i <= space; i++ {
            fmt.Print(" ");
        }
        space--;
        for i = 1; i <= 2 * j - 1; i++ {
            fmt.Print("*");
        }
        fmt.Println("");
    }
    space = 1;
    for j = 1; j <= n - 1; j++ {
        for i = 1; i <= space; i++ {
            fmt.Print(" ");
        }
        space++;
        for i = 1; i <= 2 * (n - j) - 1; i++ {
            fmt.Print("*");
        }
        fmt.Println("");
    }
}

func main(){
	var task = Main{};
	task.main_1(os.Args);
}
