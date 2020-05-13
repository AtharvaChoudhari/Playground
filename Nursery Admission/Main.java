#include<iostream>
using namespace std;
int main()
{
  string name;
  cin >> name;
  int count = 0;
  for(int i = 0 ; i < name.length() ; i++){
    count++;
  }
  cout << "The number of letters in the name is " << count;
}