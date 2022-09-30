#include <iostream>

using namespace std;

int main()
{
    string keyvoonAlgo = "331122";
    string nezamAlgo = "123";
    string shirAlgo = "2123";
    
    int k_sum = 0;
    int n_sum = 0;
    int s_sum = 0;
    
    int n;
    string s;
    
    cin >> n;
    cin >> s;
    
    
    for (int i = 0; i < n; i++) {
        if (keyvoonAlgo[i % keyvoonAlgo.length()] == s[i]){
            k_sum++;
        }
         if (nezamAlgo[i % nezamAlgo.length()] == s[i]){
            n_sum++;
        }
         if (shirAlgo[i % shirAlgo.length()] == s[i]){
            s_sum++;
        }
    }
    
    int max;

    if(k_sum >= n_sum && k_sum >= s_sum)
        max = k_sum;

    if(n_sum >= k_sum && n_sum >= s_sum)
        max = n_sum;
    
    if(s_sum >= k_sum && s_sum >= n_sum)
        max = s_sum;
  
    cout << max << endl;
    
    if (max == k_sum){
        cout << "keyvoon" << endl;
    }
    if (max == n_sum){
        cout << "nezam" << endl;
    }
    if (max == s_sum){
        cout << "shir farhad" << endl;
    }
    return 0;
}

// </Ctrl+Z>
