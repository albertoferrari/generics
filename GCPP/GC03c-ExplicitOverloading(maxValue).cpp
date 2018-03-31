#include <iostream>

using namespace std;

int maxValue (int a[], int n) {
    cout << "maxValue int: ";
    int max = a[0];
    for(int i=0;i<n;++i) {
        if (a[i]>max)
            max = a[i];
    }
    return max;
}

double maxValue (double a[], int n) {
    cout << "maxValue double: ";
    double max = a[0];
    for(int i=0;i<n;++i) {
        if (a[i]>max)
            max = a[i];
    }
    return max;
}

int main() {
    int v1[] = {3,2,5,8,2};
    cout << maxValue(v1,5) << endl;
    double v2[] = {3.3,2.8,5.0,8.5,2.8};
    cout << maxValue(v2,5) << endl;
}

