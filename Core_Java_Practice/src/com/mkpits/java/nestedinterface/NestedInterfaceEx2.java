//Java program Example of nested interface which is declared within the class.

class ANestedInterfaceEx2
{
      interface Message
      {
       void msg();
      }
}

class NestedInterfaceEx2 implements ANestedInterfaceEx2.Message
{
     public void msg()
     {
		 System.out.println("Hello nested interface");
     }
     public static void main(String[] args)
     {
     	 ANestedInterfaceEx2.Message message=new NestedInterfaceEx2();//upcasting here
     	 message.msg();
     }
}
