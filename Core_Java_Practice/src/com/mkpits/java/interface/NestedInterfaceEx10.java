//Java program to demonstrate Nested Interface.
//An interface can have another interface which is known as a nested interface.

interface printable {
     void print();
     interface MessagePrintable {
       	void msg();
     }
}

class example implements printable.MessagePrintable {
	public void print() {
		System.out.println("print");
	}

	public void msg() {
		System.out.println("msg");
	}
}

class NestedInterfaceEx10 {
	public static void main(String[] arg) {
		example e=new example();
		e.msg();
		e.print();
	}
}
