#include<iostream>
using namespace std;

int main()
{
 int a;
 int b;
 cin>>a>>b;
  int small = a;
  if(a>b){
   small = b; 
  }
  int gcd = 1;
  while(small != 1){
   if(a%small == 0 && b%small == 0){
      gcd = small;
     break;
   }
    small--;
  }
  cout<<"G.C.D of "<<a<<" and "<<b<<" = "<<gcd;
}