#include <iostream>

template <typename T1, typename T2, typename T3>
T3 min (T1 a, T2 b) 
{
	return static_cast<T3>(a < b ? a : b);
}

int main() 
{
	std::cout << min<int,int,int>(3,4) << std::endl; // output 3 : 'int', 'int' -> 'int'
	
	std::cout << min<double,int,double>(3.3,4) << std::endl; // output 3.3 'double', 'int' -> 'double'	
	
	std::cout << min<int,double,double>(4, 3.3) << std::endl; // output 3.3 'int', 'double' -> 'double'	
}
