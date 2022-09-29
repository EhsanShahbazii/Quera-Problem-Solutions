#include<bits/stdc++.h>

#define watch(x) cout<<(#x)<<" is "<<(x)<<"\n"
#define print(x) cout<<x<<"\n"
#define For(i,x,y) for(i = x; i < y; i++)
typedef std::vector<int> vi;
typedef std::vector<std::vector<int>> vvi;
typedef long long ll;
int INF = 999999;
using namespace std;

int main(){
    ios_base::sync_with_stdio(false);
  
    int num,counter;
    cin>>num>>counter;
  
    int temp = counter;
    int index = 1;
  
    temp = temp % num;
    while(temp != 0){
        index++;
        temp += counter;
        temp = temp % num;
    }
    cout<<index<<endl;
}

// </Ctrl+Z>
