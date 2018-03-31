#include <iostream>

template <unsigned int n>
struct factorial {
	const static int value = n * factorial<n - 1>::value ;
};

template <>
struct factorial<0> {
	const static int value = 1;
};

int main() {
  std::cout << "5! = " << factorial<5>::value << std::endl;
  std::cout << "0! = " << factorial<0>::value << std::endl;
  return 0;
}
