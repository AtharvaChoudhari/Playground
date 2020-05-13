#include<iostream>
using namespace std;
void queue(int n,int m,int grp[]){
 int sum = 0;
  for(int i=0;i<n;i++){
   sum += grp[i]; 
  }
  int no_bus = sum/m;
  if(sum%m != 0){
    no_bus++;
  }
  if(n == m){
      cout<<no_bus+1;
  }else{
      cout<<no_bus;
  }

}
int main()
{
	int n;
    int m;
    int grp[n];
   cin>>n>>m;
  for(int i=0;i<n;i++){
    cin>>grp[i];
  }
  
  queue(n,m,grp);
}