#include<iostream>
using namespace std;
int main(){
 int n;
  cin>>n;
  int cnt=1;
  for(int i=1;i<=n;i++){
     for(int j=1;j<=i;j++){
       if(i%2 == 0){
         cout<<cnt+(i+1)-2*j;
         cnt++;
       }else{
         cout<<cnt;
         cnt++;
       }
       
       if(j != i){
        cout<<"*"; 
       }
       
     }
    cout<<endl;
  }
  
 return 0; 
}
