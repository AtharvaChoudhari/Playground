#include<iostream>
using namespace std;
int main()
{
  int n;
  cout<<"Enter the number of elements in the array"<<endl;
  cin>>n;
  int arr[n+1];
  cout<<"Enter the elements in the array"<<endl;
  
  for(int i=0;i<n;i++){
   cin>>arr[i]; 
  }

  
  int pos = 0;
  cout<<"Enter the location where you wish to insert an element"<<endl;
  cin>>pos;
  
  if(pos > n){
    cout<<"Invalid Input";
   return 0; 
  }
 
  
  
  for(int i=n;i>=pos;i--){
    arr[i] = arr[i-1];
  }
  cout<<"Enter the value to insert"<<endl;
  cin>>arr[pos-1];
  
  cout<<"Array after insertion is"<<endl;
  
  for(int i=0;i<=n;i++){
   cout<<arr[i]<<endl; 
  }
  
  
  
  
}