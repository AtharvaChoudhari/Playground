#include<iostream>
using namespace std;
int main()
{
  //Type your code here.
  int x,y,z;
  cin>>x>>y>>z;
  if(((z<=x*2)&&(z>x))||((z>=(y-2)*x)&&(z<=(y-1)*x)))
  {
  cout<<"It is a mango tree"<<endl;
  }
  else cout<<"It is not a mango tree"<<endl;
  return 0;
}