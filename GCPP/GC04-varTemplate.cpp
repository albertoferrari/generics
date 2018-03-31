#include <iostream>
#include <string>

using namespace std;

template<class T>
constexpr T pi = T(3.1415926535897932385);  // variable template
 
template<class T>
T circular_area(T r) // function template
{
    return pi<T> * r * r; // pi<T> is a variable template instantiation
}

int main() {
	double r1 = 10.0;
	cout << circular_area<double>(r1) << endl;
	
	int r2 = 10;
	cout<< circular_area<int>(r2) << endl;
	
}
