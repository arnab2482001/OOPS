//Interface --> just like class which contains only abstract methods .
//              to achieve interface java provides a keyword called implements
//Rules --> 1)Interface methods are by default public and abstract
//          2)Interface variables are by default public+static+final
//          3)Interface methods must be overriden inside the implementing classes
//          4)Interface just act as a medium between client and the developer
//          5)Through interface developer gives a setup files not the source code

/*
import java.util.Scanner;
interface client
{
    void input();  //public + abstract
    void output(); //public + abstract
}
class Jack implements client
{
    String name; double sal;
    public void input()
    {
        Scanner r = new Scanner(System.in);
        System.out.println("Enter username");
        name = r.nextLine();
        System.out.println("Enter salary");
          sal = r.nextDouble();
    }
    public void output()   //we have to assign public as interface always in public
    {
        System.out.println(name+" "+sal);
    }

    public static void main(String[] args) {
        client c = new Jack();
        c.input();c.output();
    }
}

 */

// Why interface variables are public static and final in Java -->
interface customerRaj
{
    int amt=5; //public + static + final
    //amt is public that's why it can be used anywhere
    void purchase();  //public +abstract
    // public can be accessed globally and abstract proves by ";"
}
class sellerSanju implements customerRaj {
    @Override
    public void purchase() {
       // amt = 20;  // java: cannot assign a value to final variable amt --> error
        //amt=5 final can't be changed
        System.out.println("Raj needs " + amt + " kg rice");
    }
}
class Jack
{
    public static void main(String[] args) {
        customerRaj c = new sellerSanju();
        c.purchase();
        System.out.println(customerRaj.amt); //static --> amt is static as static variable directly
                                            // call by class name or interface name

    }
}
