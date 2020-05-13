#include<iostream>
using namespace std;
int main()
{
  int units;
  cin>>units;
  float rate;
  int extra;
  
  if(units <= 200){
   rate = 0.5; 
  }else if(units <= 400){
   rate = 0.65; 
    extra = 100;
  }else if(units <= 600){
   rate =  0.80;
    extra = 200;
  }else{
   	rate =  1.25;
    extra = 425;
  }
  int result = (units*rate) + extra;
  cout<<"Rs."<<result;
}