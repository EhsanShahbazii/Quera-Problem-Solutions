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
    var  scanner*  Scanner =  java.util.Scanner(java.io.BufferedInputStream@3d8314f0);
    var  number  int64 = get_input[int64]();
    var  sum  int64 = 0;
    var  n  int64 = 1;
    var  m  int64;
    var  flag  bool = true;
    for(flag) {
        m = (n * (n + 1)) / 2;
        for  i  := 1; i <= m; i++ {
            if (m % i == 0) {
                sum++;
            }
        }
        if (number <= sum) {
            fmt.Print(m);
            flag = false;
        }
        sum = 0;
        n++;
    }
}

func main(){
	var task = Main{};
	task.main_1(os.Args);
}
