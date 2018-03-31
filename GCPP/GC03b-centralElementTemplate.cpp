/*
 * centralElementTemplate.cpp
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
T centralElement(T data[], int cont)
{
    return data[cont/2];
}

int main( )
{
	int i[] = {10,20,30,40,50};
	int ci = centralElement(i,5);
	cout<< ci << endl;

	string s[] = {"alpha","beta","gamma"};
	string cs = centralElement(s,3);
	cout<< cs << endl;

	float f[] = {2.2,3.3,4.4};
	float cf = centralElement<float>(f,3);
	cout<< cf << endl;
}
