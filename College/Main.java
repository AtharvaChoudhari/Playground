#include<iostream>
using namespace std;
struct College { 
  char name[100]; 
  char city[100]; 
  int establishmentYear; 
  float passPercentage; 
};
int main()
{
  int n;
  cout<<"Enter the number of colleges";
  cin>>n;
  College cl[n];
  for(int i=0;i<n;i++){
    cout<<"\nEnter the details of college "<<i+1<<endl;
    cout<<"Enter name";
    cin.ignore();
    cin.getline(cl[i].name,100);
    cout<<"\nEnter city";
    cin.getline(cl[i].city,100);
    cout<<"\nEnter year of establishment";
    cin>>cl[i].establishmentYear;
    cout<<"\nEnter pass percentage";
    cin>>cl[i].passPercentage;
  }
  cout<<"\nDetails of colleges";
 
  for(int i=0;i<n;i++){
    cout<<"\nCollege:"<<i+1;
    cout<<"\nName:"<<cl[i].name;
    cout<<"\nCity:"<<cl[i].city;
    cout<<"\nYear of establishment:"<<cl[i].establishmentYear;
    cout<<"\nPass percentage:"<<cl[i].passPercentage;
  }
  
  
}