#include <iostream>
#include <string>
#include <vector>

class JavaToStdCpp {
	public:
	// returns a value of standard input in c++
	template < typename T > static T input() {
		T value;
		std::cin >> value;
		return value;
	}
    // Convert a single character to a string
    static std::string java_lang_string_value_of(char c) {
        // Convert the character to a string
        std::string result;
        result.push_back(c);
        return result;
    }

    // Convert a character array (substring) to a string
    static std::string java_lang_string_value_of(char arr[], int startIndex, int length) {
        // Create a string and append the characters from the array
        std::string result;
        for (int i = startIndex; i < startIndex + length; i++) {
            result.push_back(arr[i]);
        }
        return result;
    }

    // Convert a character array (complete) to a string
    static std::string java_lang_string_value_of(char arr[]) {
        // Get the length of the array and call the previous method
        int length = sizeof(arr) / sizeof(arr[0]);
        return valueOf(arr, 0, length);
    }

    // Convert an object to a string
    static std::string java_lang_string_value_of(const void* obj) {
        // Convert the object's memory address to a string using std::stringstream
        std::stringstream stream;
        stream << obj;
        return stream.str();
    }

    // Convert a boolean value to a string
    static std::string java_lang_string_value_of(bool b) {
        // Return "true" or "false" based on the boolean value
        return b ? "true" : "false";
    }

    // Convert a double value to a string
    static std::string java_lang_string_value_of(double d) {
        // Convert the double value to a string using std::to_string
        return std::to_string(d);
    }

    // Convert a long value to a string
    static std::string java_lang_string_value_of(long l) {
        // Convert the long value to a string using std::to_string
        return std::to_string(l);
    }

    // Convert an integer value to a string
    static std::string java_lang_string_value_of(int i) {
        // Convert the integer value to a string using std::to_string
        return std::to_string(i);
    }

    // Convert a float value to a string
    static std::string java_lang_string_value_of(float f) {
        // Convert the float value to a string using std::to_string
        return std::to_string(f);
    }
};
class Main
{
    public:
    static void main(
    std::vector<std::string> &args)
    {
        try (
        java.util.Scanner scanner =  java.util.Scanner(java.io.BufferedInputStream@1efee8e7);)
        {
            std::string number = JavaToStdCpp::input<std::string>();
            std::string reverse = "";
            for (int i = 0; i < number.length(); i++)
            {
                reverse = reverse + JavaToStdCpp::java_lang_string_value_of(number.at(number.length() - (i + 1)));
            }
            if (reverse == number)
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
