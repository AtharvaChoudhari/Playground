#include<iostream>
using namespace std;
struct dist{
  int inch;
  float feet;
};
int main()
{
  dist d1,d2,d3;
  
  cin>>d1.inch;
  cin>>d1.feet;
  cin>>d2.inch;
  cin>>d2.feet;
  
  d3.inch = d1.inch + d2.inch;
  
  d3.feet = d1.feet + d2.feet;
  
  if(d3.feet > 12.0f){
    d3.inch++;
    d3.feet =  d3.feet-12.0f;
  }
  
  cout<<d3.inch<<"'-"<< d3.feet<<"\"" ;
  
  
  
}