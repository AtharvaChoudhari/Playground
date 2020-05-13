#include<iostream>
using namespace std;
void printresult(int volume[],int n,int s){
	int sum = 0;
   for(int i=0;i<n;i++){
      sum += volume[i];
    }
  if(sum <= s){
    cout<<"YES";
  }else{
   cout<<"NO"; 
  }
  
}
int main()
{
  int n,s;
  cin>>n>>s;
  int volume[n];
  for(int i=0;i<n;i++){
   cin>>volume[i];
  }
  printresult(volume,n,s);
}