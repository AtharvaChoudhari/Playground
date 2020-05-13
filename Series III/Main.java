#include <iostream>
using namespace std;
int main()
{
  int n;
  cin>>n;
  int ans;
  
  for(int i=1;i<=n;i++){
  		if(i == 1)
          ans = 6;
  		else
          ans = ans+5*(i-1);
    cout<<ans<<" ";
  }
 return 0; 
}