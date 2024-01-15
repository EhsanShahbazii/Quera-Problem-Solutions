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
    try () {
        var  number  int64 = get_input[int64]();
        var  pow  int64 = 1;
        for(number >= pow) {
            pow *= 2;
        }
        fmt.Print(pow);
    }
}

func main(){
	var task = Main{};
	task.main_1(os.Args);
}
