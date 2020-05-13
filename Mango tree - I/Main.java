#include<iostream>
using namespace std;
int main()
{
  int row, col, tree_no;
  
  cin >> row >> col >> tree_no;
  
  if( tree_no >= 1 && tree_no <= col )
  	cout << "Yes";
  else if( tree_no % col == 0 || tree_no % col == 1)
  	cout << "Yes";
  else
  	cout << "No";
}