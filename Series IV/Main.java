#include<iostream>
using namespace std;
int main()
{
  int n;
  cin>>n;
  int ans;
  int gap;
  for(int i=1;i<=n;i++){
  	if(i==1){
      ans = 0;
      gap = 2;
    }else{
     ans = ans+gap;
     if(i%2 == 0) 
     	gap = gap+4;
    }

    cout<<ans<<" ";
     
  }
}