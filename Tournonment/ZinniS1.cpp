#include <iostream>

using namespace std;

int main()
{
    int nIndex;
    int mIndex;
    
    cin >> nIndex;
    cin >> mIndex;
    
    int a[nIndex][mIndex];
    int sum = 0;
  
    for (int i = 0; i < nIndex; i++) {
        for (int j = 0; j < mIndex; j++) {
             cin >> a[i][j];
        }
    }
    
    for (int i = 1; i < nIndex - 1; i++) {
        for (int j = 1; j < mIndex - 1; j++) {
             if ((a[i][j] < a[i - 1][j] && a[i][j] < a[i + 1][j] && a[i][j] > a[i][j - 1] && a[i][j] > a[i][j + 1]) || 
                 (a[i][j] > a[i - 1][j] && a[i][j] > a[i + 1][j] && a[i][j] < a[i][j - 1] && a[i][j] < a[i][j + 1])){
                 sum = sum + 1;
             }
        }
    }
    
    cout << sum;

    return 0;
}

// </Ctrl+Z>
