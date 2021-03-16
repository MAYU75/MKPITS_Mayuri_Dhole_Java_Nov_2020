//Java program Example for Downcasting without the use of java instanceof operator.

class AnimalDowncastingEx2 { }

class DogDowncastingEx2 extends AnimalDowncastingEx2
{
      static void method(AnimalDowncastingEx2 a)
      {
           DogDowncastingEx2 d=(DogDowncastingEx2)a;//downcasting
           System.out.println("ok downcasting performed");
      }
      public static void main (String [] args)
      {
      	  AnimalDowncastingEx2 a=new DogDowncastingEx2();
      	  DogDowncastingEx2.method(a);
      }
}
