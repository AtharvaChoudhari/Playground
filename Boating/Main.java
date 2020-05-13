#include<iostream>
using namespace std;
int main()
{
  //Type your code here.
  int a, b, c, d, e, f, g;
  std::cin>>a>>b>>c;
  d=b*75;
  e=c*30;
  g=d+e;
  if(a>g)
    std::cout<<"Boat is stable";
    else
      std::cout<<"Boat will drow";
}