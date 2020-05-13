#include<iostream>
using namespace std;
int main()
{
   int dol1,dol2,cen1,cen2;
  	cin>>dol1;
  	cin>>cen1;
    cin>>dol2;
  	cin>>cen2;
  
  	int new_dol = (cen1+cen2) / 100;
  	int new_cent =  (cen1+cen2) % 100;
  	
  	cout<<dol1+dol2+new_dol<<endl;
  	cout<<new_cent;
  
}