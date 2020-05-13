#include <iostream>
using namespace std;

int main(){
  int n;
  cin>>n;
  for(int i=1;i<=4;i++){
   for(int j=1;j<=4;j++){
     if(i >= j)
    	cout<<n+i-1;
   }
    cout<<endl;
  }
  for(int i=1;i<=4;i++){
   for(int j=1;j<=4;j++){
     if(i+j <= 5)
    	cout<<n+3-(i-1);
   }
    cout<<endl;
  }

  return 0;
}
