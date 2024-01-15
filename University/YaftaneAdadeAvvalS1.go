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
        var  sum  int64 = 0;
        var  count  int64 = 0;
        var  prime  int64 = 0;
        var  distance  int64 = number;
        for(number > 0) {
            sum += number % 10;
            number /= 10;
        }
        if (distance == 1) {
            fmt.Print(2);
        } else {
            var  flag  bool = false;
            for(count < sum) {
                distance++;
                for  i  := 2; i <= (distance + 1) / 2; i++ {
                    if (distance % i == 0) {
                        flag = true;
                        break;
                    }
                }
                if (!flag) {
                    count++;
                    prime = distance;
                }
                flag = false;
            }
            fmt.Print(prime);
        }
    }
}

func main(){
	var task = Main{};
	task.main_1(os.Args);
}
