#include<iostream>
using namespace std;
int main()
{
  int hand_shake = 0;
  int n;
  cin>>n;
  for(int i=n-1;i>0;i--){
   
    hand_shake += i;
    
  }
  cout<<hand_shake;
}