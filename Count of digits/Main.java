#include<iostream>
using namespace std;
int main()
{
  int n , cnt;
  cnt = 0;
  cin >> n;
  
  do{
    n = n / 10;
    cnt ++;
  }while(n > 0);
  cout << cnt;
}