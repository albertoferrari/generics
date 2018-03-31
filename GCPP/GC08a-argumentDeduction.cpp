#include <iostream>

template <typename T>
T min (T a, T b) 
{
	return a < b ? a : b;
}

int main() 
{
	std::cout << min(3,4) << std::endl; // OK 'int', 'int'
	
	// std::cout << min(3.3,4);
	// template argument deduction/substitution failed:
	// deduced conflicting types for parameter ‘T’ (‘double’ and ‘int’)
	
	std::cout << min(3.3,(double)(4)) << std::endl;
	std::cout << min(3.3,static_cast<double>(4)) << std::endl;
	std::cout << min<double>(3.3,4) << std::endl;
}
