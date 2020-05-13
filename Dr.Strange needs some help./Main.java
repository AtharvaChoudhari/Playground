#include<iostream>
using namespace std;

int main(){
  
  int a, b, c;
  cin >> a >> b >> c;
  int func(int,int);
  if(func(a,b) >= c){
    cout << "Doctor, you can proceed with your experiment.";
  }
  else{
  	cout << "Sorry Doctor! You need more bacteria.";
  }
}

int func(int x, int y){
  int mult = 1;
  for(int i=0 ; i < y ; i++){
    mult = mult * x;
  }
  return mult;
}