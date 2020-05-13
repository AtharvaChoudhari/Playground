#include <iostream>
using namespace std;

int main(){
    int n;
    cin>>n;
    int r,c;

    c = n;
    r = n;

    int l=1;
    int right = (n*n);

    for(int i=1;i<=r;i++){
            if(i != 1)
                right = right -1;
        for(int j=1;j<=2*c;j++){
            if(j>=i && (i+j <= (r+c+1)) ){
                if(j<=c){
                    cout<<l<<"*";
                    l++;
                    if(i != 1){
                        right = right-2;
                    }
                }else{
                        right += 1;
                    if(i+j != (r+c+1)){
                        cout<<right<<"*";
                    }else{
                        cout<<right;
                    }

                }
            }else{
                if(j<i)
                    cout<<"--";

            }
        }
        cout<<"\n";
    }
}
