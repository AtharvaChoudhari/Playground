#include<iostream>
using namespace std;
int main()
{
  int r,c;
  cin>>r>>c;
  int arr[r][c];
 
  
  for(int i=0;i<r;i++){
   for(int j=0;j<c;j++){
    cin>>arr[i][j]; 
   }
  }
  
  int sum_r[r];
  int sum_c[c];
  
  for(int i=0;i<r;i++){
    int sum = 0;
   for(int j=0;j<c;j++){
     sum += arr[i][j];
     if(j==(c-1)){
     	sum_r[i] = sum;
     }
   }
  }
  
   for(int i=0;i<c;i++){
    int sum = 0;
   for(int j=0;j<r;j++){
     sum += arr[j][i];
     if(j==(r-1)){
     	sum_c[i] = sum;
     }
   }
  }
  
  cout<<"Sum of rows is ";
  
  int r_max = 0;
  int c_max = 0;
  int r_max_i = 0;
  int c_max_i = 0;
  for(int i=0;i<r;i++){
   cout<<sum_r[i]<<" "; 
    if(r_max < sum_r[i]){
     r_max = sum_r[i];
      r_max_i = i+1;
    }
  }
  
  cout<<"\nRow "<<r_max_i<<" has maximum sum";
  cout<<"\nSum of columns is ";
  for(int i=0;i<c;i++){
   cout<<sum_c[i]<<" "; 
    if(c_max < sum_c[i]){
     c_max = sum_c[i];
      c_max_i = i+1;
    }
  }
  cout<<"\nColumn "<<c_max_i<<" has maximum sum";
  
  
}