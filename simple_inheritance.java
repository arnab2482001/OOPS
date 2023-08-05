class Student                       //super class also called as parent class
{
     int roll,marks;        //Inheritance -->  When we construct a new class from existing class in such a way
                            //that the new class access all the feature and properties of existing class.
    String name;
    //private int roll,name or private void input() --> doesn't allow in inheritance as it restrict
    // the other class access
    //Instead of private we can use protected
    protected void input()
    {
        System.out.println("Enter roll name and marks");
    }

}
//extend keyword use to perform inheritance so that it can reuse the super class code

class Arnab extends Student {                   //sub class also called as child class as it extends
    void output() {                              //the feature of parent class and also can add feautere in his class
        roll = 60;
        name = "Arnab";
        marks = 80;
        String college ="BIT";
        System.out.println(roll + " " + name + " " + marks+ " "+"College"+" "+college);
    }


    public static void main(String[] args) {
            Arnab r = new Arnab();      //in object we made for sub class not super as sub class has all
            r.input(); r.output();      // the feauture of super + sub class has its own additional feauture
    }
}
