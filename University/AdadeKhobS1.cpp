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
        java.util.Scanner scanner =  java.util.Scanner(java.io.BufferedInputStream@43d7741f);
        long number = JavaToStdCpp::input<long long>();
        int sum = 0;
        int n = 1;
        long m;
        bool flag = true;
        while (flag)
        {
            m = (n * (n + 1)) / 2;
            for (int i = 1; i <= m; i++)
            {
                if (m % i == 0)
                {
                    sum++;
                }
            }
            if (number <= sum)
            {
                std::cout << m;
                flag = false;
            }
            sum = 0;
            n++;
        }
    }
};
int main(int argc, char **argv){
	std::vector<std::string> parameter(argv + 1, argv + argc);
	Main::main(parameter);
	return 0;
};
