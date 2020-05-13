#include<iostream>
using namespace std;
int main(){
 
  int min,max;
  cin>>min;
  cin>>max;
  int sum;
  
  for(int i=min;i<=max;i++){
   	sum = 0;
    for(int j=1;j<=i/2;j++){
     	if(i%j == 0){
         	sum += j; 
        } 
    }
    if(sum == i){
     	cout<<i<<" "; 
    }
  }
  
  return 0;
}