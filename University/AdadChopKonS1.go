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
        var  string  string = get_input[string]();
        for  i  := 0; i < len(string); i++ {
            fmt.Print(string(string[i]) + ": ");
            for  j  := 0; j < string[i] - 48; j++ {
                fmt.Print(string[i]);
            }
            fmt.Println("");
        }
    }
}

func main(){
	var task = Main{};
	task.main_1(os.Args);
}
