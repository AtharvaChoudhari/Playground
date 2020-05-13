#include<iostream>
using namespace std;
int main()
{
 
   int n;
   cin>>n;
   int a[2];
   int ans,prev1,prev2;
   
  for(int i=0;i<n;i++){
    if(i == 0){
      prev2 = 0; 
    }
    if(i == 1){
      prev1  = 1;
    }
    if(i>1){
      ans = prev1+prev2;
      prev2 = prev1;
      prev1 = ans;
    }
  }
  
  cout<<ans;
  
}