class Demo // class takes no memory
// class is also called collection of object or we can say as a blueprint
    {
        int a=10;  String b = "arnab";
        void show()
        {
            System.out.print(a+" "+b);
        }
    }


class test
{
    public static void main(String args[])
    {
        //class_name obj_name-->obj_reference = new-->dma(dynamic memory allocation) class_name()-->constructor
        Demo r = new Demo(); //method takes memory
// object is instance of a class that execute the class
        r.show();
    }
}
