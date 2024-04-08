#include<iostream>
using namespace std;

class Person
{
    private:
    int age;
    string name;

    public:
    //paremtereised constructor
    Person(int age, string name): age(age), name(name){};
    //getter method
    string getName()
    {
        return name;
    }

    int getAge()
    {
        return age;
    }

    //setter method
    void setname(string n)
    {
        this->name=n;
    }
    void setage(int a)
    {
        this->age=a;
    }
};

int main()
{
    Person p1(23, "pradip");
    cout<<"Age:- "<<p1.getAge()<<endl;
    cout<<"Name:- "<<p1.getName()<<endl;
    p1.setname("Prathmesh");
    cout<<"Name:- "<<p1.getName()<<endl;
    p1.setage(21);
    cout<<"Age:- "<<p1.getAge()<<endl;

}