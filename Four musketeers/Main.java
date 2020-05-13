#include<iostream>
#include<cmath>
using namespace std;
int main()
{
  //Type your code here.
  int x1, y1, x2, y2, x3, y3;
  std::cin>>x1>>y1>>x2>>y2>>x3>>y3;
  float x4, y4;
  x4=(x1+x2+x3)/3.0f;
  y4=(y1+y2+y3)/3.0f;
  std::cout<<x4;
  std::cout<<"\n"<<y4;
}