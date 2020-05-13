#include<iostream>
using namespace std;
int** createArray(int r,int c){
 	int **mat;
 	mat = (int**)malloc(r*sizeof(int));
    for(int i=0;i<r;i++){
     *(mat+i) = (int *)malloc(c*sizeof(int)); 
    }
  
    for(int i=0;i<r;i++){
     	for(int j=0;j<c;j++){
         cin>>mat[i][j];
        }
    }
  
  	return mat;
}

int** addMatrix(int** mat1,int** mat2,int r,int c){
  int **add;
  
  add = (int**)malloc(r*sizeof(int));
    for(int i=0;i<r;i++){
     *(add+i) = (int *)malloc(c*sizeof(int)); 
    }
  
  
  for(int i=0;i<r;i++){
     	for(int j=0;j<c;j++){
         add[i][j] = mat1[i][j]+mat2[i][j];
        }
    }
  return add;
}
int main()
{
	int r,c;
  	cin>>r>>c;
  	
  	int **mat1 = createArray(r,c);
    int **mat2 = createArray(r,c);
    int **add = addMatrix(mat1,mat2,r,c);
  
      for(int i=0;i<r;i++){
     	for(int j=0;j<c;j++){
         cout<<add[i][j]<<" "; 
        }
        cout<<endl;
    }
}