#include<iostream>
#include<string>
using namespace std;
struct employee{
  string name;
  string id;
  int age;
  string designation;
  int salary; 
};
int main()
{
  employee e1;
  cout<<"Enter name:";
  getline(cin,e1.name);
  cout<<"\nEnter ID:";
  getline(cin,e1.id);
  cout<<"\nEnter age:";
  cin>>e1.age;
  cout<<"\nEnter designation:";
  cin>>e1.designation;
  cout<<"\nEnter Salary:";
  cin>>e1.salary;
  
  cout<<"\nEmployee Details"<<endl;
  cout<<"Name of the Employee : "<<e1.name<<endl;
  cout<<"ID of the Employee : "<<e1.id<<endl;
  cout<<"Age of the Employee : "<<e1.age<<endl;  
  cout<<"Designation of the Employee : "<<e1.designation<<endl;  
  cout<<"Salary of the Employee : "<<e1.salary<<endl;
  
  
}