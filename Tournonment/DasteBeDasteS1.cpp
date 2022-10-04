#include <bits/stdc++.h> 
using namespace std;

int team[1<<17]; 
long long calculate(int l, int r)
{
    if(l == r)
        return team[l];
    int mid = (l+r)/2;
    long long c1 = calculate(l, mid);
    long long c2 = calculate(mid+1, r);
    int max1 = *max_element(team+mid+1, team+r+1); 
    int max2 = *max_element(team+l, team+mid+1); 
    
    return max(c1 + max1, c2 + max2); 
}

int main()
{
    int n;
    cin >> n;
    for(int i=0; i<(1<<n); i++) 
        cin >> team[i];
    
    cout << calculate(0, (1<<n)-1) << endl;
    return 0;
}

// </Ctrl+Z>
