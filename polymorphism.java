// Polymorphism --> Same object have different meaning
//Poly --> many        ||      morphism --> form
// Types --> Compile time polymorphism , Run time polymorphism
//compile time polymorphism --> a polymorphism which exits at the time of compilation is called
                                // compile time or early binding or static polymorphism
//compile time polymorphism --> method overloading --> whenever a class contain more than one method with same name
                                                    // and different types of parameters
/*
class method_overloading
{
    int add()
    {
        int a=10,b=20,c;
        c=a+b;
        return c;
    }
    void add(int a,int b)
    {
        int c;
        c=a+b;
        System.out.println(c);
    }
    void add(int x,double y)
    {
        double c;
        c=x+y;
        System.out.println(c);
    }

    public static void main(String[] args) {
        method_overloading r = new method_overloading();
        r.add(40,60); int b= r.add(); r.add(10,40.50);
        System.out.println(b);
    }

}

 */





// Runtime polymorphism -->     A  polymorphism which exhibit at the time of execution of prg
// Runtime polymorphism --> method overriding --> whenever we write method in super and subclasses in such a way
//                                                that method name and parameter name must be same
//                                              Rules 1)--> method -->yes-->overriding or not ||method-->no-->compilation
                                                                                                        //error
                                                    // 2) --> if overriding --> yes --> call subclass method ||
                                                    //                          no  --> call super class method
// In Runtime polymorphism --> method overriding --> we need inheritance



class method_overriding
{
   void draw()
    {
        System.out.println("Can't determine shape");
    }
}

class square extends method_overriding
{
    @Override // for programmer understand this method is override
    void draw()
    {
        super.draw();  // super --> it calls the superclass from subclass
        System.out.println("Square");
    }
}
class shape
{

    public static void main(String[] args) {
        method_overriding r = new square();
        r.draw();
    }
}