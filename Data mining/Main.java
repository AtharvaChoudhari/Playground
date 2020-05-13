#include<iostream>
using namespace std;
int main()
{
  int num;
  cin>>num;
  int cnt = 0;
  int sum_odd=0;
  int sum_even=0;
  while(num != 0){
    cnt++;
    if(cnt % 2 == 0){
      sum_even += (num%10);
    }else{
      sum_odd +=  (num%10);
    }
    num = num / 10;
  }
  if(sum_odd == sum_even){
   cout<<"Yes"; 
  }else{
   cout<<"No"; 
  }
}