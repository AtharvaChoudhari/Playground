#include<iostream>
using namespace std;
int main()
{
  int a,b,c;
  cin>>a>>b>>c;
  int max=a;
  int min=a;
  if(max < b){
   	max = b; 
  }
  if(min > b){
   	min = b; 
  }
  if(max < c){
   	max = c; 
  }
  if(min > c){
   	min = c; 
  }
  if((a != min) && (a != max)){
    cout<<"The treasure is in box which has number "<<a<<endl;
  }else if((b != min) && (b != max)){
     cout<<"The treasure is in box which has number "<<b<<endl;
  }else{
     cout<<"The treasure is in box which has number "<<c<<endl;
  }
  for(int i=min;i>0;i--){
   		if(a%i==0 && b%i==0 && c%i==0){
          cout<<"The code to open the box is "<<i;
          break; 
        }
  }
}