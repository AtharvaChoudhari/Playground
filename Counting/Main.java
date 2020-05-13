#include<iostream>
#include<string>

using namespace std;
int main()
{
  int vov=0,wsp=0,dig=0,con=0,sym=0;
  string input;
  getline(cin,input);
  for(int i=0;i<input.length();i++){
   if(input[i] == 'a' || input[i] == 'e' || input[i] == 'i' || input[i] == 'o' || input[i] == 'u' ) 
  		vov++;
    else if(input[i] == 'A' || input[i] == 'E' || input[i] == 'I' || input[i] == 'O' || input[i] == 'U' ) 
  		vov++;
    else if(input[i] == ' ')
      	wsp++;
    else if(input[i] == '1' || input[i] == '2' || input[i] == '3' || input[i] == '4' || input[i] == '6' || input[i] == '7' || input[i] == '8' || input[i] == '9' || input[i] == '0' || input[i] == '5')
      	dig++;
    else if((int(input[i])>=65 && int(input[i])<=90) || ((int(input[i])>=97 && int(input[i])<=122)))
        con++;
    else
         sym++;  
  }
            cout<<"Vowels:"<<vov<<endl;
            cout<<"Consonants:"<<con<<endl;
            cout<<"White Spaces:"<<wsp<<endl;
            cout<<"Digits:"<<dig;
            cout<<"\nSymbols:"<<sym;
}