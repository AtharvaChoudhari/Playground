#include<iostream>
using namespace std;
int main()
{
  int r;
  int c;
    cin>>r>>c;
  int arr[r][c];

  for(int i=0;i<r;i++){
   	for(int j=0;j<c;j++){
     cin>>arr[i][j]; 
    }
  }
  
  for(int i=0;i<c;i++){
   int max = arr[0][i];
   for(int j=0;j<r;j++){
     if(max < arr[j][i]){
      max = arr[j][i]; 
     }
   }
    cout<<max<<endl;
  }
}