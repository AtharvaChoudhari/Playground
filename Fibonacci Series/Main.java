#include<iostream>
using namespace std;
int fibonacci(int t){
  if(t == 1){
    return 0;
  }else if(t == 2){
     return 1;
  }else{
   return fibonacci(t-1) + fibonacci(t-2); 
  }
  
}
int main()
{
  int term;
  cin>>term;
  int ans = fibonacci(term);
  cout<<"The term "<<term<<" in the fibonacci series is "<<ans;
  
}