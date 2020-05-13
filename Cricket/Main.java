#include<iostream>
#include<cmath>
//#include<minmap>
using namespace std;
int main()
{
  float total_balls;
  float total_runs;
  float run_scored;
  float ball_bowled;
  
  cin>>total_balls>>total_runs>>run_scored>>ball_bowled;
  
  float total_overs = total_balls/6;
  cout<<total_overs<<endl;
  
  float overs_bowled;
  overs_bowled = int(ball_bowled)/6 + (int(ball_bowled)%6)/10.0f;
  cout<<overs_bowled<<endl;
  printf("%0.1f", run_scored/overs_bowled);
  cout<<endl;
  //cout<<fixed<<setprecision(2)<<round(run_scored/overs_bowled)<<endl;
  printf("%0.1f", total_runs/total_overs);
  //cout<<total_runs/total_overs<<endl;
  cout<<endl;
  
  if(run_scored/overs_bowled >= total_runs/total_overs){
   cout<<"Eligible to Win" ;
  }else{
  	cout<<"Not Eligible to Win";
  }
  
}