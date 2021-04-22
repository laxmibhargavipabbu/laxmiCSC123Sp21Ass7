package laxmiCSC123Sp21Ass7;

public class Divider2 
{
	public int divideA(int num, int den)
	{
		return divideB(num,den);
	}
	
	public int divideB(int num, int den)
	{
		return divideC(num,den);
	}
	
	public int divideC(int num, int den)
	{
		return num/den;
	}
}
