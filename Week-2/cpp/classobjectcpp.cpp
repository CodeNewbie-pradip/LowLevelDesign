#include<iostream>
using namespace std;

class Student
{
    public:
    int roll_no;
    string name;
    int height;
    int age;
    //Default constructor 
    Student()
    {
        cout<<"It is Default Constructor"<<endl;
    }

    //default constructor
    Student(int roll_no, string name, int height, int age)
    {
        cout<<"It is Paremeterised"<<endl;
        this->roll_no=roll_no;
        this->name=name;
        this->height=height;
        this->age=age;
    }
    //copy constructor
    Student(const Student& t)
    {
        roll_no=t.roll_no;
        name=t.name;
        height=t.height;
        

    }
    void sleep()
    {
        cout<<this->name<<" student is sleeping"<<endl;
    }
    void bunk()
    {
        cout<<this->roll_no<<" Student bunking lecture"<<endl;
    }
    void study()
    {
        cout<<this->height<<" student is studying regularly"<<endl;
    }
};

int main()
{
    // Student s1;
    // s1.roll_no=6501;
    // s1.name="Pradip";
    // s1.age=23;
    // s1.height=72;
    // s1.study();
    // s1.bunk();
    // s1.sleep();

    Student s2(65, "prathamesh", 76, 21);
    s2.sleep();
    s2.bunk();
    s2.study();

    return 0;
}