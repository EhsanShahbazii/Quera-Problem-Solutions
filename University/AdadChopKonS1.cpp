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
        java.util.Scanner scanner =  java.util.Scanner(java.io.BufferedInputStream@33b37288);)
        {
            std::string string = JavaToStdCpp::input<std::string>();
            for (int i = 0; i < string.length(); i++)
            {
                std::cout << string.at(i)  <<  ": ";
                for (int j = 0; j < string.at(i) - 48; j++)
                {
                    std::cout << string.at(i);
                }
                std::cout << "" << std::endl;
            }
        }
    }
};
int main(int argc, char **argv){
	std::vector<std::string> parameter(argv + 1, argv + argc);
	Main::main(parameter);
	return 0;
};
