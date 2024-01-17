package main
import "strings"
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
        var  min  int = get_input[int]();
        var  max  int = get_input[int]();
        var  flag  bool = true;
        var  result  string = "";
        for  i  := min + 1; i < max; i++ {
            for  j  := 2; j <= i / 2; j++ {
                if (i % j == 0) {
                    flag = false;
                    break;
                }
            }
            if (flag) {
            result = result.concat(strconv.Itoa(i) + ",");
            }
            flag = true;
        }
        if (len(result) > 1) {
        fmt.Print(result[0,len(result) - 1]);
        }
    }
}

func main(){
	var task = Main{};
	task.main_1(os.Args);/
}
