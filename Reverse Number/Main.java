#include <iostream>
int main() 
{
	// Type your code here
  int num, rev=0, rem;
  std::cin>>num;
  while(num!=0)
  {
    rem=num%10;
    rev=rev*10+rem;
    num=num/10;
  }
    std::cout<<rev;
	return 0;
}