#include<iostream>
using namespace std;
int main()
{
  int size;
  cin>>size;
  int marks[size];
  int max=0;
  for(int i=0;i<size;i++){
   cin>>marks[i];
     if(max < marks[i]){
      max = marks[i]; 
     }
  }
  cout<<max;
}