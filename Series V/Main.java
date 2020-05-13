#include<iostream>
using namespace std;
int main()
{
  int n;
  cin>>n;
  int ans = 121;
  for(int i=0;i<n;i++){
    cout<<ans<<" ";
    ans = ans + 104 + 32*i;
  }
}