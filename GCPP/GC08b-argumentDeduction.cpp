#include <iostream>

template <typename T1, typename T2>
T1 min (T1 a, T2 b) 
{
	return a < b ? a : b;
}

int main() 
{
	std::cout << min(3,4) << std::endl; // output 3 : 'int', 'int' -> 'int'
	
	std::cout << min(3.3,4) << std::endl; // output 3.3 'double', 'int' -> 'double'	
	
	std::cout << min(4, 3.3) << std::endl; // output 3 'int', 'double' -> 'int'	
}
