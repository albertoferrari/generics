#include <iostream>

using namespace std;

// Recursive template for general case
template <int N>
struct factorial {
  enum { value = N * factorial<N - 1>::value };
};

// Template specialization for base case
template <>
struct factorial<0> {
  enum { value = 1 };
};

int main() {
    cout << factorial<5>::value;
}

