// Abstraction --> is a process of hiding the implementation details from the user, only the
//                  highlighted set of service provided to the user
// user doesn't get access to the code only the function can access the code is hidden
// advantage --> 1)security 2)enhancement
// types --> abstract class , interface

// abstract class --> a class which contains the abstract keyword in its declaration
//  Rules --> 1) We can't create object for abstract class but we can make reference
//            2) It may or may not contain abstract methods
//            3) It can have abstract and non-abstract methods
//            4) To use an abstract class, you have to inherit from subclass
//            5) If a class contain partial implementation then we should declare a class as abstract

/*


abstract class animal
{
    void animal()  // non-abstract methods //default constructor
    {
        System.out.println("Sound of all animal ..........!!! ");
    }
    public abstract void sound();  //abstract methods
}

class dog extends animal
{
    dog()           //default constructor
    {
        super();    //super is used to call super class
    }
    public void sound()
    {
        System.out.println("Dog is barking");
    }
}
class lion extends animal
{
    lion()          //default constructor
    {
        super();    //super is used to call super class
    }
    public void sound()
    {
        System.out.println("Lion is roar");
    }
}
class z
{
    public static void main(String[] args) {
        animal d = new dog();   // abstract class can be used as object reference
        lion l = new lion();
        d.animal();
        d.sound();
        l.animal();
        l.sound();
    }
}

 */



// abstract methods --> Abstract Method is a method that has just the method definition but does not contain
//                                                                                                 implementation
//Rules --> 1) It can only be used in abstract class
//          2) It doesn't contain any body "{ }" and always ends with ";"
//          3) Abstract method must be overriden in subclasses otherwise it will also become an abstract class
//          4) Whenever the action is common but implementation are different than we should use abstract method


abstract class Programming
{
     public abstract void developer();
    public abstract void rank();
}
class HTML extends Programming
{
        @Override
        public void developer()
        {
            System.out.println("Harry Lee");
        }
        public void rank()
        {
            System.out.println("3rd");
        }
}
 class Java extends HTML
{
    @Override
    public void developer()
    {
        System.out.println("Shraddha Agarwal");
    }
}
class set
{
    public static void main(String[] args) {
            Programming h = new HTML();  // we can't make object but we make object reference
            h.developer();
            Java j = new Java();
            j.developer();
            j.rank();
    }
}