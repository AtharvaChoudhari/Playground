#include<iostream>
using namespace std;
int main()
{
  //Type your code here.
  float b ,c, d, e;
  int a;
  std::cin>>a>>b>>c;
  c=b*(0.5);
  d=b+c;
  e=b*2;
  
  switch(a)
  {
    case 1 : std::cout<<b;
      break;
    case 2 : std::cout<<d;
      break;
    case 3 : std::cout<<e;
      break;
      default : std::cout<<"Number of items is more";
      break;
}
}