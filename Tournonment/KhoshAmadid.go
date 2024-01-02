package main

import (
	"fmt"
)

func HelloCodeCup(n int) string {
	return fmt.Sprintf("%s%d", "Hello CodeCup ", n)
}

func main() {
	str := HelloCodeCup(6)
	fmt.Println(str)
}
