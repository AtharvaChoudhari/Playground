#include<iostream>
using namespace std;
int main()
{
  string input;
  cin>>input;
  char last = input.back();
  while(input != "####"){
    cout<<input<<endl;
    cin>>input;
    if(last != input.front() || input == "####"){
      break;
    }else{
      last = input.back();
    }
  }
  
  
}