#include<iostream>
using namespace std;
int sum_digits(int n){
	if(n <= 9){
     return n; 
    }
    return n%10 + sum_digits(n/10);
}
int main(){
   
 int n;
 cin>>n;
 int sum = n;
 while(sum>=10){
   sum = sum_digits(sum);
 }
 cout<<sum;
 return 0;
}