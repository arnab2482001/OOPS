class first          //super class
{
    int a,b,c;

    void add()
    {
        a=10; b=20;
        c=a+b;
        System.out.println("Sum of two numbers"+" "+c);
    }
    void sub()
    {
        a=30; b=10;
        c=a-b;
        System.out.println("Subtraction of two number"+" "+c);
    }
}


class second extends first          //sub1 extend super
{                                   //sub1 have all the feature of super + its own
                                    //additional class feauture of sub1

    void mult()
    {
        a=50;b=10;
        c=a*b;
        System.out.println("Multiplication of two numbers"+" "+c);
    }
    void div()
    {
        a=50;b=10;
        c=a/b;
        System.out.println("Division of two numbers"+" "+c);
    }
}

class third extends second          //sub2 extend sub1
{
                    //sub2 have all the feature of sub1 + its own
                    //additional class feauture of sub2
    //means it has the feature of super + sub1+ sub2 --> multi_level_inheritance
    void rem()
    {
        a=50;b=10;
        c=a%b;
        System.out.println("Remainder of two numbers"+" "+c);
    }
    void pow()
    {
        a=4;b=2;
        double power =Math.pow(a,b);
        System.out.println("power"+" "+power);
    }

    public static void main(String[] args) {
        third r = new third();  //we have to make an object where every feature inherit in
                                                                              //that class
        r.add();r.sub();r.mult();r.div();r.rem();r.pow();
    }
}

