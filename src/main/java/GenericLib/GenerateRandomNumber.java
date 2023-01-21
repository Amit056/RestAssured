package GenericLib;

import java.util.Random;

import org.testng.annotations.Test;

public class GenerateRandomNumber {
	@Test
	public int generateRandomNum()
	{
		
		Random ran=new Random();
		int num = ran.nextInt();
		return num;
	}

}
