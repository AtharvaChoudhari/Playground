#include<iostream>
using namespace std;
int main()
{
  //Type your code here.
  float m;
  int p, d;
  std::cin>>m>>p>>d;
  if(d>=m*p)
    std::cout<<"Cannot reach";
  else
    std::cout<<"Can reach";
}