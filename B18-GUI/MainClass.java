class A
{
     int nonStaticVariable;    // non static field
     static int staticVariable; // static field
 
     static void staticMethod()   // static method
     {
          System.out.println(staticVariable);  //printing static variable
     //   System.out.println(nonStaticVariable);
     }
 
     void nonStaticMethod()   // nonstatic method
     {
          System.out.println(staticVariable);  //trying to print static variable in nonstatic method
          System.out.println(nonStaticVariable); // trying to print nonstatic variable
     }
}
 
class MainClass
{
     public static void main(String[] args)
     {
          A.staticVariable = 10;
     //   A.nonStaticVariable = 10;
          A.staticMethod();
    //    A.nonStaticMethod();
 
          A a1 = new A();
          A a2 = new A();
 
          System.out.println(a1.nonStaticVariable);
          System.out.println(a1.staticVariable);
          a1.nonStaticMethod();
          a1.staticMethod();
 
          System.out.println(a2.staticVariable);
          a1.staticVariable = 20;
          System.out.println(a2.staticVariable);
     }
}