#include <iostream>

using namespace std;
int main(){
  int n;
  cin>>n;
  float ans;
  for(int i=1;i<=n;i++){
   	if(i == 1)
     	ans = 0.5;
    else
    	ans = ans*3; 
    cout<<ans<<" ";
  }

 return 0; 
}