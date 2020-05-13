#include<iostream>
using namespace std;
int power(int m,int n)
{
    int j,i;
    for(i=1,j=1;i<=n;i++)
        j=j*m;
    return j;
}
int arm(int n)
{
  int sum = 0, cnt = 0, temp, s, s1, temp1;
  s = n;
  s1 = n;
  while(s1){
    cnt++;
    s1 = s1 / 10;
  }
  while(n){
    temp = n % 10;
    temp1 = power(temp,cnt);
    sum = sum + temp1;
    n = n / 10;
  }
  if(sum == s){
    return 1;
  }
  else{
    return 0;
  }
}
int main()
{
    int n;
  int arm(int);
  int power(int, int);
    std::cin >> n;
    if(arm(n) == 1)
        cout<<"Kindly proceed with encrypting";
    else
        cout<<"It is not an Armstrong number";
    
}