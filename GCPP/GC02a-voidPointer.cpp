#include <iostream>
#include <string>

using namespace std;

 void my_swap (void* &a, void* &b ) 
 {    
     void* tmp = a;
     a=b;
     b=tmp;
 }

int main() 
{
   void* a; void* b;
   a = new std::string("hello"); b = new std::string("world");
   cout << "before a = " << *((string*) a) << " b = " << *((string*) b) << endl;
   my_swap (a,b);
   cout << "after  a = " << *((string*) a) << " b = " << *((string*) b) << endl; 
   
   void* x; void* y;
   x = new int(33); y = new int(44);
   cout << "before x = " << *((int*) x) << " y = " << *((int*) y) << endl;
   my_swap(x,y);
   cout << "after x = " << *((int*) x) << " y = " << *((int*) y) << endl;
   
   cout << "a = " << *((int*) a) << endl; // no compile time error, no runtime error
										  // output a = 1919907594   :(
   
   return 0;
}
