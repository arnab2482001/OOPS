class C{
    int a ; double b; String c;
    private C()            //private and default both the constructor are created at the time of compilation
    {                                                                      // and compiler confused
        a=400; b=21.22; c="ab";
    }
   /* C()
    {
        a=100; b=45.32; c="arnab";
    }*/
    C(int x)
    {
        a=x;
    }
    C(double y,String z)
    {
        b=y;  c=z;
    }


    public static void main(String args[]) {
        C r = new C();                                  //Whenever more than one constructor in our class then it is
        C r2 = new C(10);                               // called constructor overloading
        C r3 = new C(23.39, "ABC");
        System.out.println(r.a + " " + r.b + " " + r.c);       //we have to print by object reference for default constructor
        System.out.println(r2.a);                    //we have to print by object reference for parametrized constructor
        System.out.println(r3.b + " " + r3.c);        //we have to print by object reference for parametrized constructor
    }
}
