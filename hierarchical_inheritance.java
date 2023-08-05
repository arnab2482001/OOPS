import java.awt.*;

class Super              //super class
{
    void input()
    {
        System.out.println("Enter your name : ");
    }
}
class sub1 extends Super{                           //sub1
    void display()
    {
        System.out.println("Arnab");
    }
}
class sub2 extends Super{                       //sub2
    void output()
    {
        System.out.println("Baptu");
    }
}

// one super class multiple subclass is called hierarchical inheritance


class Main {

    public static void main(String[] args) {
        sub2 r = new sub2();
        sub1 r2 = new sub1();
        r.input();r.output();
        r2.input();r2.display();
    }
}

