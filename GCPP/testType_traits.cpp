/*
 * testIsIntegral.cpp
 * 
 * alberto.ferrari@unipr.it
 * 
 * Example: 
 * 
 */

#include <iostream>
#include <type_traits>
#include <complex>

int main() {
  std::cout << std::boolalpha;
  std::cout << "is_integral:" << std::endl;
  std::cout << "char: " << std::is_integral<char>::value << std::endl;
  std::cout << "int: " << std::is_integral<int>::value << std::endl;
  std::cout << "float: " << std::is_integral<float>::value << std::endl;
  std::cout << "bool: " << std::is_integral<bool>::value << std::endl;

  std::cout << "is_arithmetic:" << std::endl;
  std::cout << "char: " << std::is_arithmetic<char>::value << std::endl;
  std::cout << "float: " << std::is_arithmetic<float>::value << std::endl;
  std::cout << "float*: " << std::is_arithmetic<float*>::value << std::endl;
  std::cout << "complex<double>: " << std::is_arithmetic<std::complex<double>>::value << std::endl;
  return 0;
}
