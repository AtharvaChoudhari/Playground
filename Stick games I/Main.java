#include<iostream>
using namespace std;
void print(int m){
 if(m%2 == 0){
   cout<<"Mani Iyer";
 }else{
  cout<<"Arun Gupta"; 
 }
}
int main()
{
  int m,n;
  cin>>n>>m;
  
  int intersection = n*m;
  int moves = 0;
  while(intersection != 0){
    moves++;
    n--;
    m--;
    intersection = n*m;
  }
  print(moves);
}