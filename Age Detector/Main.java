#include<iostream>
using namespace std;
int main()
{
  //Type your code here.
  int a, b;
  std::cin>>a>>b;
  if(a<b)
    std::cout<<b-a;
  else if(a>b)
    std::cout<<100-a+b;
}