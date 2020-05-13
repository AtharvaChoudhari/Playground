#include<iostream>
using namespace std;
int main()
{
  int no;
  int key;
  int is_pass = 0;
  cin>>no;
  
  int arr[no];
  for(int i=0;i<no;i++){
   cin>>arr[i]; 
  }
  
  cin>>key;
  
  for(int i=0;i<no;i++){
   if(key == arr[i]){
     is_pass = 1;
     cout<<"She passed her exam";
     break; 
   }
  }
  
  if(is_pass == 0){
   cout<<"She failed"; 
  }
  
  
}