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
        var  reverse  string = "";
        for  i  := 0; i < len(number); i++ {
            reverse = reverse.concat(String.valueOf(number[len(number) - (i + 1)]));
        }
        if ((reverse==number)) {
        fmt.Print("YES");
        } else {
            fmt.Print("NO");
        }
    }
}

func main(){
	var task = Main{};
	task.main_1(os.Args);
