#include<iostream>
#include<cstdlib>
using namespace std;

int main(){
  
  int n;
  int male=0,female=0;
  cin>>n;
  int *ptr = (int *)calloc(n,sizeof(int));
  
  for(int i=0;i<n;i++){
   cin>>*(ptr+i); 
   if(*(ptr+i) % 2 == 0){
    female++;
   }else{
    male++; 
   }
  }
  cout<<male<<endl<<female;
  return 0;
}