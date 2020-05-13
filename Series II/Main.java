#include <iostream>
using namespace std;

int main(){
  int n;
  cin>>n;
  int ans;
  for(int i=1;i<=n;i++){
    if(i == 1)
    	ans = 121;
    else
    	ans = ans+104+32*(i-2);
    cout<<ans<<" ";
  }
 return 0; 
}