#include<iostream>
#include<string>
using namespace std;
int main()
{
  string input;
  int word_cnt=1;
  getline(cin,input);
  for(int i=0;i<input.size();i++){
    if(input[i] == ' '){
    	word_cnt++;
    }
  }
  string word[word_cnt];
  string wd=""; 
  int j;
  for(int  i=0,j=0;i<=input.size();i++){
   if(input[i] == ' ' || i==input.size()){
   	word[j] = wd;
    wd="";
    j++; 
   }
    wd += input[i];
  }
  
  for(int i=0;i<word_cnt;i++){
   for(int j=i+1;j<word_cnt;j++){
     if(word[i] == word[j]){
       word[j] = '!';
       word[i] = '!';
     }
       
   }
  }
  
    for(int i=0;i<word_cnt;i++){
      if(word[i] != "!")
        cout<<word[i];
  	}
  
  
  
  
}