package week1.day1;

public class PrimeNumber {

	public static void main(String[] args) {
		int enter = 15;
		boolean flag = false;
		
		for(int i =2; i<=7;i++)
		{
			if(enter % 1== 0)
			{
				{
					flag=true;
				}
				break;
			}

			if(flag == true)
			{
				System.out.println("It is prime number");
			}
			else
			{
				System.out.println("It is not prime number");
			}
			

}
}
}