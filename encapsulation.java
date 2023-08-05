// encapsulation -->  through which we are wrapping the data members & members method of class
//                    in a single unit. It is also implementing as data hiding
//                    Rule --> 1) Declare the class variable as private
//                             2) Declare the class method as public

// def --> when we wrap the data and methods in a single entity in a capsule is called encapsulation

// encapsulation --> data hiding(hiding of data) + data abstraction( displays basic information about a device while
                                                                   // hiding its internal functions )

public class encapsulation {
    private int value;  //data hiding
    public void setValue(int x) // data abstraction
    {
        value = x;
    }

    public int getValue() {
        return ++value;
    }
}
class rea
{
    public static void main(String[] args) {
        encapsulation j = new encapsulation();
        j.setValue(100) ;
        System.out.println(j.getValue());

    }
}
