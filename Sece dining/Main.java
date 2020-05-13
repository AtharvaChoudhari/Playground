#include<iostream>
#include<string>
using namespace std;
int main()
{
  string door;
  int rail;
  
  cin>>door>>rail;
  if(door == "front"){
    if(rail == 1){
      cout<<"Left Handed";//left
    }else{
      cout<<"Right Handed";//right
    }
  }else{
    if(rail == 1){
       cout<<"Right Handed";//right
    }else{
      cout<<"Left Handed";//left
    }
  }
}