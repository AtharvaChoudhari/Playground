#include<iostream>
#include<iomanip>
using namespace std;
int main()
{
  int age;
  float time;
  
  cin>>age;
  cin>>time;
  //cin>>fixed>>setprecision(1)>>time;

  if(age > 13){
    if(time == 13.3f){
      cout<<"$5.00";
    }else{
      cout<<"$8.00";
    }
  }else{
   	if(time == 13.3f){
      cout<<"$2.00";
    }else{
      cout<<"$4.00";
    }
  }
}