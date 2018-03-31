/*
 * minValueTemplate.cpp
 * 
 * alberto.ferrari@unipr.it
 * 
 * Example: function with template
 * 
 */
 
#include <iostream>
using std::cout;
using std::endl;

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

template <typename T>
T minValue(T v1, T v2)
{
    if (v1<v2)
        return v1;
    return v2;
}

int main( )
{
	int mi = minValue(3,6);	//(int int) OK
	cout<<mi<<endl;

	float mf1 = minValue(9.2,6.1); // (float float) OK
	cout<<mf1<<endl;
	
	//float mf2 = minValue(9.2,6); // (float int) template argument deduction/substitution failed
	//cout<<mf2<<endl;
	
	float mf3 = minValue<float>(9.2,6); //explicit provide type parameter OK  
	cout<<mf3<<endl;
	
	Point p1(3,4);
	p1.display();
	Point p2(5,2);
	p2.display();
	// Point p3 = minValue(p1,p2); //error no match for 'operator<' (operand types are 'Point' and 'Point')
	
}
