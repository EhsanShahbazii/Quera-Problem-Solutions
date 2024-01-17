package main
import "strings"
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
        var  n  int64 = get_input[int64]();
        var  b  int = get_input[int]();
        var  result  string = Integer.toString(Integer.parseInt(String.valueOf(n),10),b);
        fmt.Print(strings.ToUpper(result));
    }
}

func main(){
	var task = Main{};
	task.main_1(os.Args);
}
