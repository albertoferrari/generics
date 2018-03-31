/*
 * funTemplateExplicitOverloading.cpp
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

template<class T>
T square(T b)
{
      return b * b;
}

template<>
string square(string b)
{
	return b + b;
}	

int main( )
{
    int i = 5;
    cout << "square "<< i << " = " << square(i) << endl;

    double j = 5.5;
    cout << "square "<< j << " = " << square(j) << endl;

	string s = "hello";
	cout << "square "<< s << " = " << square(s) << endl;
	
	char c = 'h';
	cout << "square "<< c << " = " << square(c) << endl;
}
