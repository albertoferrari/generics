#include <iostream>
#include <string>

using std::cout;
using std::endl;
using std::string;

template <typename F, typename S>
class Pair
{
public:
    Pair(const F& f, const S& s);
    F get_first() const;
    S get_second() const;
private:
    F first;
    S second;
};

template <typename F, typename S>
Pair<F,S>::Pair(const F& f, const S& s)
{
    first = f;
    second = s;
};

template <typename F, typename S>
F Pair<F,S>::get_first() const
{
    return first;
};

template <typename F, typename S>
S Pair<F,S>::get_second() const
{
    return second;
};

int main( )
{
	Pair<int,double> p1(2,3.4);
	int p1_first = p1.get_first();
	double p1_second = p1.get_second();
	cout<<p1_first<<" "<<p1_second<<endl;


	Pair<string,int> p2("alpha",5);
	string p2_first = p2.get_first();
	int p2_second = p2.get_second();
	cout<<p2_first<<" "<<p2_second<<endl;
	
	Pair<string,string> p3("hello","world");
	string p3_first = p3.get_first();
	string p3_second = p3.get_second();
	cout<<p3_first<<" "<<p3_second<<endl;
	
}
