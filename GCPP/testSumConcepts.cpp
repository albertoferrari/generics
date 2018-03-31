/*
 * testSumconcepts.cpp
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
concept bool AdmitsSum() 
{ 
    return requires(T a, T b) {
		{a + b} -> T;
	};
}

template <AdmitsSum T>
T mySum(T v1, T v2)
{
    return v1+v2;
}

int main( )
{

	int mi = mySum(3,3);	//(int int) OK
	cout<<mi<<endl;
	
	float mf1 = mySum(9.2,6.1); // (float float) OK
	cout<<mf1<<endl;
	
	float mf3 = mySum<float>(9.2,6); //explicit provide type parameter OK  
	cout<<mf3<<endl;
	
	// string s1 = mySum("alpha","beta");
	// cout<<s1<<endl;
	// error: cannot call function ‘T mySum(T, T) [with T = const char*]’
	// string s1 = mySum("alpha","beta");
	//                                 ^
	// note:   constraints not satisfied
	// T mySum(T v1, T v2)
	// ^~~~~
	// note: within ‘template<class T> concept bool AdmitsSum() [with T = const char*]’
	// concept bool AdmitsSum() 
	//              ^~~~~~~~~~
	// note:     with ‘const char* a’
	// note:     with ‘const char* b’
	// note: the required expression ‘(a + b)’ would be ill-formed
}
