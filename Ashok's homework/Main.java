#include<iostream>
using namespace std;
int main()
{
    int r,c;
    cin>>r>>c;
    int mat1[r][c];
  	int mat2[r][c];
  	int mat3[r][c];

    for(int i=0;i<r;i++){
    	for(int j=0;j<c;j++){
         	cin>>mat1[i][j]; 
        }
    }
   
    for(int i=0;i<r;i++){
      for(int j=0;j<c;j++){
        cin>>mat2[i][j]; 
      }
    }
  
    for(int i=0;i<r;i++){
    for(int j=0;j<c;j++){
         	mat3[i][j] = mat2[i][j]+mat1[i][j]; 
            cout<<mat3[i][j]<<" ";
        }
          cout<<endl;
    }
  
  
}