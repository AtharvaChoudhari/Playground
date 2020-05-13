#include <iostream>
using namespace std;
int main(){
  
  int enc;
  int ter;
  cin>>enc>>ter;
  int num = enc + ter;
  int sum = 0;
  for(int i=1;i<=num/2;i++){
   	if(num % i == 0){
    	sum += i;
    }
  }
  
  if(sum == num){
   cout<<"They can read the message";
  }else{
    cout<<"They can't read the message";
  }
  
  
 return 0; 
}