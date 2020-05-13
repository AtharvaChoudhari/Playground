#include<iostream>
#include<iomanip>
using namespace std;
int main()
{

  int n;
  float score = 0;
  int flag = 0;
  int count = 0;
   do{
     cin>>n;
 
     if(n < 0){
       score -= 1.0f;
       flag = 1;
     }else if(n % 2 == 0){
        score -= 0.5f;
     }else{
        score += 1.0f;
           count++;
     }
     
   }while(flag != 1 && count < 3);
  
  cout<<fixed<<setprecision(1)<<score;
}