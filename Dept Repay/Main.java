#include<iostream>
using namespace std;
int main()
{
  //Type your code here.
  int p, r, t, in, a;
  float d, f;
  std:cin>>p>>r>>t;
  in=(p*r*t)/100;
  a=p+in;
  d=in*0.02;
  f=a-d;
  std::cout<<in;
  std::cout<<"\n"<<a;
  std::cout<<"\n"<<d;
  std::cout<<"\n"<<f;
}