#include<iostream>
using namespace std;
int main()
{
  int n;
  cin>>n;
  int first_digit;
  int last_digit = n%10;
  int cnt=0;
  while(cnt<3){
    n=n/10;
    cnt++;
  }
  cout<<last_digit+n;
}