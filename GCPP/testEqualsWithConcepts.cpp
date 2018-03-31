/*
 * minValueTemplate.cpp
 * 
 * alberto.ferrari@unipr.it
 * 
 * Example: function with template
 * 
 */
 
#include <iostream>
#include <string>
using std::cout;
using std::endl;
using std::string;

class Point 
{
public:   
   Point();
   Point(int, int);		
   ~Point();				
   void setX(int);
   int getX();    
   void setY(int);
   int getY();  
   void display();   
private:
   int x;
   int y;
};

template <typename T>
concept bool Equality_Comparable() 
{ 
    return requires(T a, T b) {
        {a == b} -> bool;
        {a != b} -> bool;
    };
}

template <Equality_Comparable T>
bool twoEquals(T v1, T v2, T v3)
{
    if (v1==v2 || v1==v3 || v2==v3)
        return true;
    return false;
}

int main( )
{
	cout<<twoEquals(2,3,2)<<endl;			//(int int int) OK
	cout<<twoEquals(9.2,6.1,5.8)<<endl; 	//(float float) OK
	cout<<twoEquals(2,3.1,2)<<endl;			//(int float int) ERROR
	cout<<twoEquals<float>(9.2,6,6)<<endl; 	//explicit provide type parameter OK  
	cout<<twoEquals("alpha","beta","beta")<<endl;	//(string string string) OK
	Point p1(3,4);
	Point p2(5,2);
	Point p3(3,4);
	cout<<twoEquals(p1,p2,p3)<<endl; 
	// error: cannot call function ‘bool twoEquals(T, T, T) [with T = Point]’
	//error no match for 'operator<' (operand types are 'Point' and 'Point')
	// note:   constraints not satisfied
	// bool twoEquals(T v1, T v2, T v3)
	// ^~~~~~~~~~~~~
	// note: within ‘template<class T> concept bool Equality_Comparable() [with T = Point]’
	// concept bool Equality_Comparable() 
	//              ^~~~~~~~~~~~~~~~~~~
	// note:     with ‘Point a’
	// note:     with ‘Point b’
	// note: the required expression ‘(a == b)’ would be ill-formed
	// note: the required expression ‘(a != b)’ would be ill-formed
}

Point::Point ()
{
	 x = 0;
	 y = 0;
}

Point::Point (int vx, int vy)
{
	x = vx;
	y = vy;
}
Point::~Point()
{
}

void Point::setX (int vx)
{
	x=vx;
}  
int Point::getX() 
{
   return x;
}    
void Point::setY (int vy)
{
	y=vy;
}  
int Point::getY() 
{
   return y;
}         
void Point::display() 
{
	cout<<"("<<x<<","<<y<<")"<<endl;
} 

