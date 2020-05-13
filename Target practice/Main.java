#include<iostream>
using namespace std;
int main()
{
  int target;
  cin>>target;
  int sum = 0;
  int i=0;
  int pts;
  while(sum < target){
	cin>>pts;
   	sum += pts;
    i++;
  }
  cout<<"The number of turns is "<<i;
}
