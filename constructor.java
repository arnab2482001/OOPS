class A {
    //   int x; int y;
//    int a; String b;
    //  int x; String y;
    /* ......................................Default constructor..............................*/
    /*   int a; String name; boolean f;
     */

    /*.....................................Paramtrized constructor...........................*/

   /* A() { //constructor --> constructor same as class name is used to initialize a object
         a = 1;
         name = "bull";
    }

    void show()
    {     // if constructor is not defined then default constructor has been defined
            System.out.print(a+" "+name+" "+f);  // output --> 0 null false
    }
    A(int a,int b)  //paraemtrized constructor where we can pass multiple or single
                      parameter
    {
         x=a; y=b;
    }
    A(int a, String b) //multiple parameter can be passed but differ the variable
    {
        System.out.println(a+" "+b);
    }
      void show()
    {
        System.out.println(x+" "+y);
    }
*/

    /*................................Copy Constructor....................................*/

 /*   A(int a,String b)
    {
     //   a=10; b="Lorem";
        System.out.println(a+" "+b);
        x=a; y=b;
    }

    A(A ref)                //in copy constructor with the help of ref we can copy the
                            // content of one object into another object
    {
        x=ref.x;
        y=ref.y;
        System.out.println(x+" "+y);
    }

}
*/
    /* .....................................Private Constructor.........................*/

    int a;
    double b;
    String c;

    private A() {     //private constructor does not give access outside the class we
                     // can't modify or change from other class
        a = 10;
        b = 20.36;
        c = "arnab";
        System.out.println(a + " " + b + " " + c);  // 10 20.36 arnab
    }
            //here we can use static methhod which doesn't required object

    /*class obj{
        public static void main(String args[])
        {
          /*  A ref=  new A(10,20); //object created with the help of constructor
            ref.show();
            A r= new A(10,"arnab"); //object created with the help of constructor

           */
      /*  A r = new A(10,"lorem");
        A r2= new A(r)       */
    /*

        A r = new A()  ;  //java: A() has private access in A

    }
}
*/
    public static void main(String args[]) {
    A r = new A();
    }
}
