#include <iostream>
using namespace std;
struct Complex{
 int r;
 int img;
};

int main(){
  int choice;
  cin>>choice;
  Complex c1,c2,cr;
  
  cin>>c1.r;
  cin>>c1.img;
  cin>>c2.r;
  cin>>c2.img;
  
  if(choice == 1){
    cr.r = c1.r + c2.r;
    cr.img =  c1.img + c2.img;
  }else if(choice == 2){
    cr.r = c1.r - c2.r;
    cr.img =  c1.img - c2.img;
  }else if(choice == 3){
    cr.r = c1.r*c2.r -  c1.img*c2.img;
    cr.img = c1.r*c2.img + c1.img*c2.r;
  }else{
   cout<<"Invalid choice";
    return 0;
  }
   if(cr.img>=0){
     cout<<cr.r<<'+'<<cr.img<<"i";
   }else{
      cout<<cr.r<<cr.img<<"i";
   }
   
  
 return 0; 
}