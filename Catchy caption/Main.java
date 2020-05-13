#include <string>
#include <iostream>
using namespace std;
int main()
{
  string input;
  getline(cin,input);
  int wsp = 1;
  for(int i=0;i<input.size();i++){
    if(input[i] == ' ')
   		wsp++; 
  }
  if(wsp < 10){
    cout<<"Caption eligible for the contest";
  }else{
   cout<<"Caption not eligible for the contest"; 
  }
   
}