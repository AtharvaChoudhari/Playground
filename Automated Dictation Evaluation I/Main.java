#include<iostream>
#include<string.h>
#include<cstring>
using namespace std;
int main()
{
    char str1[100];
  	char str2[100];
    int i=0;
    cin >> str1;
    cin >> str2;
  
  int res = strcmp(str1,str2);
  if(res == 0)
    cout << "It is correct";
  else{
    cout << "It is wrong";
  }
}