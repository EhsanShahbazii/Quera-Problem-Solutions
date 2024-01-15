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
        java.util.Scanner scanner =  java.util.Scanner(java.io.BufferedInputStream@6fb0d3ed);)
        {
            long number = JavaToStdCpp::input<long long>();
            int pow = 1;
            while (number >= pow)
            {
                pow *= 2;
            }
            std::cout << pow;
        }
    }
};
int main(int argc, char **argv){
	std::vector<std::string> parameter(argv + 1, argv + argc);
	Main::main(parameter);
	return 0;
};
