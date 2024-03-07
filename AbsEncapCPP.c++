/*Write a C++ class 'AccessSpecifierDemo' with the following members:
Member Variables :
1. private int priVar
2. protected int proVar
3. public int pubVar
Member Methods:
1. public void setVar(int priValue,int proValue, int pubValue)
2. public void getVar()
Assign values for each member variable(priVar,proVar,pubvar) and using methods(setVar(),getVar()) and disaply them
*/
#include<iostream>
using namespace std;
class AccessSpecifierDemo{
    private: 
        int privar;
    protected: 
        int provar;
    public: 
        int pubvar;
    void setVar(int priValue,int proValue, int pubValue){
        privar=priValue;
        provar=proValue;
        pubvar=pubValue;
    }
    void getVar(){
        cout<<"private variable :"<<privar<<endl;
        cout<<"protected variable :"<<provar<<endl;
        cout<<"public variable :"<<pubvar<<endl;
    }

};
int main(){
    AccessSpecifierDemo obj;
    obj.setVar(34,45,56);
    obj.getVar();

}
