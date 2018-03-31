#include <iostream>
#include <string>

using namespace std;

 void my_swap (int &a, int &b ) 
 {    
     int tmp = a;
     a=b;
     b=tmp;
 }
 
 void my_swap (string &a, string &b ) 
 {    
     string tmp = a;
     a=b;
     b=tmp;
 }

int main() 
{
   string a, b;
   a = "hello"; b = "world";
   cout << "before a = " << a << " b = " << b << endl;
   my_swap (a,b);
   cout << "after  a = " << a << " b = " << b << endl; 
   
   int x, y;
   x = 33; y = 44;
   cout << "before x = " << x << " y = " << y << endl;
   my_swap(x,y);
   cout << "before x = " << x << " y = " << y << endl;
   
   double d1, d2;
   d1 = 3.3; d2 = 4.4;
   cout << "before d1 = " << d1 << " d1 = " << d2 << endl;
   // my_swap(d1,d2);  // compile time error "no know conversion from double to &int ...
   cout << "before d1 = " << d1 << " d2 = " << d2 << endl;
   
   return 0;
}
