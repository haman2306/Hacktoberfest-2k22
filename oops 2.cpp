#include <iostream>
using namespace std;
struct Point
{
    int x1, x2, x3, y1, y2, y3;
};
int main()
{
    Point p;
cout<<"Enter coordinates of x1 & y1"<<endl;
cin>>p.x1>>p.y1;
cout<<"Enter coordinates of x2 & y2"<<endl;
cin>>p.x2>>p.y2;
p.x3=p.x1+p.x2;
p.y3=p.y1+p.y2;
cout<<"Coordinates of P1+P2 are "<<"("<<p.x3<<","<<p.y3<<")"<<endl;
}

