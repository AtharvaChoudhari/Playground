#include<iostream>
using namespace std;
int factorial(int n){
  if(n == 0 || n == 1){
    return 1;
  }else{
    return n*factorial(n-1);
  }
}
int main(){
  int n;
  cin>>n;
  int fact = factorial(n);
  cout<<"The factorial of "<<n<<" is "<<fact;
}