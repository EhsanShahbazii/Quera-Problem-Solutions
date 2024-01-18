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
        var  side  int = get_input[int]();
        for  i  := 1; i <= side; i++ {
            if (i == 1) {
                this.print(side);
                fmt.Print("");
            } else if (i == side) {
                this.print(side);
            } else {
                this.printDeep(side);
            }
            fmt.Println("");
        }
    }
}
func (this *Main) print( side  int) {
    for  i  := 1; i <= side; i++ {
        fmt.Print("*");
    }
}
func (this *Main) printDeep( side  int) {
    for  i  := 1; i <= side; i++ {
        if (i == 1 || i == side) {
            fmt.Print("*");
        } else {
            fmt.Print(" ");
        }
    }
}

func main(){
	var task = Main{};
	task.main_1(os.Args);
