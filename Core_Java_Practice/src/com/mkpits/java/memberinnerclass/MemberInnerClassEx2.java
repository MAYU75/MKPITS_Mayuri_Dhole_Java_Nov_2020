//Java program example for Member inner class.
class studentMemberInnerClassEx2
{
	private int rno=22;
	class address
	{
		public void showdata()
		{
			System.out.println("Roll number " + rno);
		}
	}
}

class MemberInnerClassEx2
{
	public static void main(String[] arg)
	{
		studentMemberInnerClassEx2 s=new studentMemberInnerClassEx2();
		studentMemberInnerClassEx2.address sa=s.new address();
		sa.showdata();
	}
}
