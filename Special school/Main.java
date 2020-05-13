#include<iostream>
#include<string>
using namespace std;
int main()
{
  string str1;
  string str2;
  cin>>str1;
  cin>>str2;
  int i=0;
  int len = str1.length()-1;
  if(str1.length() != str2.length()){
    cout<<"It is wrong";
    return 0;
  }
  
  while((str1[i] == str2[len-i]) && i<=len){
   i++; 
  }
  if(i > len){
    cout<<"It is correct";
  }else{
    cout<<"It is wrong";
  }

}