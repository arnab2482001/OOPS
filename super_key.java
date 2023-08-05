class parent            //super class
{
    int a=10;       //variable
  /*  void show()     //methods
    {

        System.out.println("Hello world");
    }*/
    /*parent()  // default constructor
    {
        System.out.println("Hello world");
    }

     */
  parent(int a)  // parametrized constructor
  {
      System.out.println("Hello world"+" "+a);
  }

}
class child extends parent      //subclass
{
    int a=20;               //variable

 /*   void show()     //methods
    {
        /*
        System.out.println(a);    //super class is used to differ between super class and subclass
        //to call from subclass we use super
        System.out.println(super.a);  //to print super class we use super for variable.



        System.out.println("Hello girls");
      //  super.show();    // for method from subclass to super class
    }*/
/*    child()  //default constructor
    {
        System.out.println("Hello girls");
        //super is calling by default
    }

 */
    child()
    {
          super(100); //in parametrized constructor we have to pass super
          System.out.println("Hello girls"+ " ");

     }

}
class rain
{
    public static void main(String[] args) {
        child r = new child();
       // r.show();
    }
}