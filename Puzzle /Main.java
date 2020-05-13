#include<iostream>
using namespace std;

int main()
{
    int r;
  	int c;
  	cin>>r>>c;
  	int input[r][c];
	int output[c][r];
  	for(int i=0;i<r;i++){
     for(int j=0;j<c;j++){
      	cin>>input[i][j]; 
        output[j][i] = input[i][j];
     }
    }
  
  for(int i=0;i<c;i++){
   for(int j=0;j<r;j++){
    cout<<output[i][j]<<" "; 
   }
    cout<<endl;
  }
  
    
}