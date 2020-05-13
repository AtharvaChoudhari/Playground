#include<iostream>
using namespace std;
int main()
{
  int num;
  
  int sum = 0;
  cin>>num;
  int temp = num;
  
  while(num>0){
    sum += (num % 10);
    num = num /10;
  }
  
  if(temp % sum == 0){
    cout<<"Harshad Number";
  }else{
   cout<<"Not Harshad Number"; 
  }
}