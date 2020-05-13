#include<iostream>
#include<string>

using namespace std;
int main()
{
  string input;
  string output="";
  getline(cin,input);
  for(int i=0;i<input.length();i++){
   if((int(input[i])>=65 && int(input[i])<=90) || (int(input[i])>=97 && int(input[i])<=122)){
    output+=input[i]; 
   }
  }
  cout<<output;
      
  
}