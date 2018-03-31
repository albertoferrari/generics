#include <iostream>

template <typename RT, typename T1, typename T2>
RT min (T1 a, T2 b) 
{
	return static_cast<RT>(a < b ? a : b);
}

int main() 
{
	std::cout << min<int>(3,4) << std::endl; // output 3 : 'int', 'int' -> 'int'
	
	std::cout << min<double>(3.3,4) << std::endl; // output 3.3 'double', 'int' -> 'double'	
	
	std::cout << min<double>(4, 3.3) << std::endl; // output 3.3 'int', 'double' -> 'double'	
}
