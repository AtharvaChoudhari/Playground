#include<iostream>
int main()
{
  int a, b, add, sub, mul, mod;
  float div;
  std::cin>>a;
  std::cin>>b;
  add=a+b;
  std::cout<<"a+b="<<add;
  sub=a-b;
  std::cout<<"\na-b="<<sub;
  mul=a*b;
  std::cout<<"\na*b="<<mul;
  div=a/b;
  std::cout<<"\na/b="<<div;
   mod=a%b;
  std::cout<<"\na%b="<<mod;
 
}