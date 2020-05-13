#include<iostream>
#include<cmath>
using namespace std;
int main()
{
  float n;
  cin>>n;
  float cnt = 0;
    cnt += n;
    n = sqrt(n);
  	cnt += floor(n);
  

  cout<< cnt+1;
}