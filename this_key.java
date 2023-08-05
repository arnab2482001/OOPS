    class this_key
    {
           /* void show()
            {
                System.out.println(this); //this --> refers to current object inside a method or constructor
            }
                                       //output --> this_key@4dd8dc3
            */


        /*  int a;        //instance variable
          this_key(int a) //local  variable
          {
            //  a=a;  //compiler gets confused which is local which is instance variable so it ignore the current value
                    //of constructor and print the default value = 0
              this.a=a; //here compiler print the current value of constructor as this-->current object inside a
                                                                                        // method or constructor
          }
          void show()
          {
              System.out.println(a);
          }

         */


        /*
        this_key()
        {
            System.out.print("August"+ " ");
        }
        int a;
        this_key(int a)
        {
            this();  //it calls the default constructor and print August
            System.out.print(a); //it print 24
        }           //output --> August  24

         */

        this_key()
        {
            this(20);  //from default constructor we can assign value of parameterized constructor of its own class
        }
        this_key(int a)
        {
            System.out.println(a);
        }
        public static void main(String[] args) {
           // this_key r = new this_key(24);
          //  System.out.println(r);  //object in constructor //output --> this_key@4dd8dc3
           // r.show();
            this_key r = new this_key(); //calling default constructor

        }
    }
