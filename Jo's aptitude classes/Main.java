#include<iostream>
using namespace std;
int main()
{
  	int a,b,c,z;
  cin>>a>>b>>c>>z;
  if(a%z==0&&b%z==0&&c%z==0)
  {
  	cout<<"Answer is correct."<<endl;
  }
  else cout<<"Answer is wrong."<<endl;
	return 0;
}