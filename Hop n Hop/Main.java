#include<iostream>
using namespace std;
int main()
{
  int x;
  int y;
  cin>>x;
  cin>>y;
  int result  = (x-3) > (y-4) ? x-3:y-4; 
  cout<<result;
}