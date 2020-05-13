#include<iostream>
using namespace std;
int main()
{
  int n;
  cin>>n;
  int arr[n][n];
  for(int i=0;i<n;i++){
   	for(int j=0;j<n;j++){
     cin>>arr[i][j]; 
    }
  }
  
  int sum_r = 0;
  int sum_r_old = 0;
  int sum_r_new = 0;
 for(int i=0;i<n;i++){
   sum_r_old =  sum_r_new;
   sum_r_new = 0;
   for(int j=0;j<n;j++){
      sum_r_new += arr[i][j];
   }
   if(i!=0 && (sum_r_old != sum_r_new)){
     sum_r = -1;
     break;
   }
 }
  if(sum_r != 1){
    sum_r = sum_r_new;
  }
  
  int  sum_c=0;
  int sum_c_old = 0;
  int sum_c_new = 0;
 for(int j=0;j<n;j++){
   sum_c_old =  sum_c_new;
   sum_c_new = 0;
   for(int i=0;i<n;i++){
      sum_c_new += arr[i][j];
   }
   if(j!=0 && (sum_c_old != sum_c_new)){
     sum_c = -1; 
   }
}
   if(sum_c != 1){
    sum_c = sum_c_new;
   }
  
  int sum_d = 0;
  for(int i=0;i<n;i++){
   for(int j=0;j<n;j++){
    if((i-j) == 0){
     sum_d +=  arr[i][j];
    }
   }
  }
   int sum_md = 0;
  for(int i=0;i<n;i++){
   for(int j=0;j<n;j++){
    if(i+j == (n-1)){
     sum_md +=  arr[i][j];
    }
   }
  }
  
  if(sum_md == sum_d && sum_d == sum_r && sum_d == sum_c){
   cout<<"Yes"; 
  }else{
   cout<<"No"; 
  }

}