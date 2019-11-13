package 实验四;
import 实验四.*;
public class Test {
	public static void main(String args[]) throws NewException
	{
		Changhenge changhenge;

		String write;
		write = "不";
		try {
		changhenge = new Changhenge(write);
		if(write == "") 
		{
			throw new NewException("不能输入空字符");
		}
		else 
		
			System.out.print(changhenge);
		}
		catch (NewException e) 
		{
			e.printStackTrace();
		}

		finally 
		{
			System.out.print("程序运行结束");
		}

	}

}
