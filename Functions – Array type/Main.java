#include<iostream>
using namespace std;
int check(int n,int *arr){
  int is_even = 0;
  int is_odd = 0;
  
  if(arr[0] % 2 == 0){
   is_even = 1; 
  }else{
   is_odd = 1; 
  }
 
  for(int i=1;i<n;i++){
      if(arr[i] %2 == 0 && is_even == 1){
        continue;
      }else if(arr[i] %2 != 0 && is_odd == 1){
        continue;
      }else{
        return 3;
      }
  }
      
    if(is_even == 1){
      return 1;
    }else{
      return 2;
    } 
  
}
int main()
{
  int n;
  cout<<"Enter the number of elements in the array"<<endl;
  cin>>n;
  int arr[n];
  cout<<"Enter the elements in the array"<<endl;
  for(int i=0;i<n;i++){
   cin>>arr[i]; 
  }
  
  int res = check(n,arr);
  
  if(res == 1){
    cout<<"The array is Even";
  }else if(res == 2){
    cout<<"The array is Odd";
  }else{
    cout<<"The array is Mixed";
  }
}