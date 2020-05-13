#include<iostream>
using namespace std;
int main()
{
  //Type your code here.
  float f, f1, f2, f3, s, s1, s2, s3, a, a1, a2, a3;
  std::cin>>f1>>f2>>f3>>s1>>s2>>s3>>a1>>a2>>a3;
  f=f1-(f1*(f2/100))+f3;
  s=s1-(s1*(s2/100))+s3;
  a=a1-(a1*(a2/100))+a3;
  std::cout<<"In Flipkart Rs."<<f;
  std::cout<<"\nIn Snapdeal Rs."<<s;
  std::cout<<"\nIn Amazon Rs."<<a;
  if(f<s&&f<a)
    std::cout<<"\nHe will prefer Flipkart";
  else if(s<f&s<a)
    std::cout<<"\nHe will prefer Snapdeal";
   else if(a<f&a<s)
    std::cout<<"\nHe will prefer Amazon";
  else if(f<a&& f<=s)
    std::cout<<"\nHe will prefer Flipkart";
}