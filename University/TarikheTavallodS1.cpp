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
        java.util.Scanner scanner =  java.util.Scanner(java.io.BufferedInputStream@35a50a4c);)
        {
            std::string number = JavaToStdCpp::input<std::string>();
            std::cout << "saal:"  <<  number.at(0)  <<  number.at(1) << std::endl;
            std::cout << "maah:"  <<  number.at(2)  <<  number.at(3) << std::endl;
        }
    }
};
int main(int argc, char **argv){
	std::vector<std::string> parameter(argv + 1, argv + argc);
	Main::main(parameter);
	return 0;
};
