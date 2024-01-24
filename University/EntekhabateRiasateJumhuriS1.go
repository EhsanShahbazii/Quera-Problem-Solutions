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
    var  scanner*  Scanner =  java.util.Scanner(java.io.BufferedInputStream@80169cf);
    var  n  int = get_input[int]();
    fmt.Println(this.person(n, 2) + 1);
}
func (this *Main) person( n  int,  k  int)int {
    if (n == 1) {
        return 0;
    } else {
        return (this.person(n - 1, k) + k) % n;
    }
}

func main(){
	var task = Main{};
	task.main_1(os.Args);
}
