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
        var  number  string = get_input[string]();
        fmt.Println("saal:" + string(number[0]) + string(number[1]));
        fmt.Println("maah:" + string(number[2]) + string(number[3]));
    }
}

func main(){
	var task = Main{};
	task.main_1(os.Args);
}
