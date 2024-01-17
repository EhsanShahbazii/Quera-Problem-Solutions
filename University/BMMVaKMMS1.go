package main
import "os"
import "strconv"
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
        var  m  int64 = get_input[int64]();
        var  kmm  int64 = (n * m) / this.gcd(n, m);
        fmt.Print(strconv.Itoa(this.gcd(n, m)) + " " + strconv.Itoa(kmm));
    }
}
func (this *Main) gcd( p  int64,  q  int64)int64 {
    if (q == 0) {
        return p;
    } else {
        return this.gcd(q, p % q);
    }
}

func main(){
	var task = Main{};
	task.main_1(os.Args);
}
