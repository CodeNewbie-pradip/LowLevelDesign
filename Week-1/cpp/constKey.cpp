#include<iostream>
using namespace std;

int main()
{
// 1) CONST with pointer
    int x=15;
    //const int *ptr=10; //*ptr = 10; // Error: assignment of read-only location
    const int *ptr=&x; // Pointer to constant integer
    // Attempting to modify the data through the pointer will result in a compilation error
    // *ptr = 10; // Error: cannot assign a value to final variable 'ptr'
    cout<<"value pointed by ptr: "<<*ptr<<endl;

// 2) CONST pointer, but NON-CONST data
    int y=15;
    int *const ptr2=&y; // Constant pointer to non-constant integer
    *ptr2=25;  // Allowed, modifying the data through the pointer
    cout<<"value pointed by ptr: "<<*ptr2<<endl;

// 3) CONST pointer, CONST data
    int z=35;
    const int *const ptr3=&z; //constant pointer to constant integer
    //*ptr3=10; // Error: assignment of read-only location
    // ptr3++;   // Error: increment of read-only variable 'ptr'
    cout<<"value is pointed by ptr: "<<*ptr3<<endl;
}