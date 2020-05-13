#include<iostream>
#include<cmath>
using namespace std;
int main()
{
  int num;
  int len = 0;
  cin>>num;
  int temp_num = num;
  
   while(num != 0){
     len++;
     num = num/10;
   }
  
   int num_sq = pow(temp_num,2);

   int temp = num_sq;
   int i = 0;
   int number_right = 0;
   int number_left = 0;
     while(temp != 0){
        if(i<len){
     	  number_right += (temp % 10) * pow(10,i);
        }else{
          number_left += (temp % 10) * pow(10,i-len);
        }
       temp = temp/10;  
       i++;
     }

 if(number_right+number_left == temp_num){
   cout<<"Kaprekar Number";
 }else{
      cout<<"Not a Kaprekar Number";
 }
   

}