#include <iostream>
#include <string>
#include <vector>

class JavaToStdCpp {
	public:
	template < typename T > static T input() {
		T value;
		std::cin >> value;
		return value;
	}
};
class Main
{
    public:
    static void main(
    std::vector<std::string> &args)
    {
        try (
        java.util.Scanner scanner =  java.util.Scanner(java.io.BufferedInputStream@382db087);)
        {
            int side1 = JavaToStdCpp::input<int>();
            int side2 = JavaToStdCpp::input<int>();
            int side3 = JavaToStdCpp::input<int>();
            if (side1 * side1 == side2 * side2 + side3 * side3)
            {
                std::cout << "YES";
            }
            else if (side2 * side2 == side1 * side1 + side3 * side3)
            {
                std::cout << "YES";
            }
            else if (side3 * side3 == side1 * side1 + side2 * side2)
            {
                std::cout << "YES";
            }
            else
            {
                std::cout << "NO";
            }
        }
    }
};
int main(int argc, char **argv){
	std::vector<std::string> parameter(argv + 1, argv + argc);
	Main::main(parameter);
	return 0;
};
