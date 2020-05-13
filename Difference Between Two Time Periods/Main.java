#include<iostream>
using namespace std;
struct time{
  int h;
  int min;
  int s;
};
int main()
{
	struct time t1,t2;
    cin>>t1.h>>t1.min>>t1.s>>t2.h>>t2.min>>t2.s;
    int hr_gap = t1.h-t2.h;
    int min_gap = t1.min-t2.min;
    int sec_gap = t1.s-t2.s;
      
    if(min_gap < 0){
      hr_gap--;
      min_gap = 60 + min_gap;
    }
  
  	if(sec_gap < 0){
      min_gap--;
      sec_gap = 60 + sec_gap;
    }
  
   cout<<hr_gap<<":"<<min_gap<<":"<<sec_gap;
  
    
}