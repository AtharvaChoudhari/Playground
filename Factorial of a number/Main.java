#include<iostream>
using namespace std;
int facto(int no)
{
	int sum=1;
  while(no>0)
  {
  	sum*=no;
    no--;
  }
  return sum;
}
int main(){
  // Type your code here
	int n,ret;
  	cin>>n;
  ret=facto(n);
  cout<<ret<<endl;
  return 0;
}

