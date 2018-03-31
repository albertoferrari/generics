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

template <typename T>
concept bool Arithmetic() 
{ 
    return requires(T a, T b) {
		{a + b} -> T;
	};
}

template <Arithmetic T>
T mySum(T v1, T v2)
{
    return v2+v2;
}

int main( )
{

	int mi = mySum(3,3);	//(int int) OK
	cout<<mi<<endl;
	
	float mf1 = mySum(9.2,6.1); // (float float) OK
	cout<<mf1<<endl;
	
	//float mf2 = mySum(9.2,6);
	//note:   template argument deduction/substitution failed:
	//note:   deduced conflicting types for parameter ‘T’ (‘double’ and ‘int’)
	//cout<<mf2<<endl;
	
	float mf3 = mySum<float>(9.2,6); //explicit provide type parameter OK  
	cout<<mf3<<endl;
	
	string s1 = mySum("alpha","beta");
	cout<<s1<<endl;
	/*
	Point p1(3,4);
	p1.display();
	Point p2(5,2);
	p2.display();
	// Point p3 = firstOrSecond(p1,p2); //error no match for 'operator<' (operand types are 'Point' and 'Point')
	// note:   constraints not satisfied
	// T firstOrSecond(T v1, T v2)
	// ^~~~~~~~~~~~~
	// note: within ‘template<class T> concept bool Equality_Comparable() [with T = Point]’
	// concept bool Equality_Comparable() 
	//              ^~~~~~~~~~~~~~~~~~~
	// note:     with ‘Point a’
	// note:     with ‘Point b’
	// note: the required expression ‘(a == b)’ would be ill-formed
	// note: the required expression ‘(a != b)’ would be ill-formed
	// p3.display();
	* */
}
