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
        java.util.Scanner scanner =  java.util.Scanner(java.io.BufferedInputStream@133e16fd);)
        {
            int min = JavaToStdCpp::input<int>();
            int max = JavaToStdCpp::input<int>();
            bool flag = true;
            if (min == 1)
            {
                min++;
            }
            for (int i = min; i <= max; i++)
            {
                for (int j = 2; j <= i / 2; j++)
                {
                    if (i % j == 0)
                    {
                        flag = false;
                        break;
                    }
                }
                if (flag == true)
                {
                    std::cout << i << std::endl;
                }
                flag = true;
            }
        }
    }
};
int main(int argc, char **argv){
	std::vector<std::string> parameter(argv + 1, argv + argc);
	Main::main(parameter);
	return 0;
};
