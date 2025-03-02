package javaLogicalprog;

public class countCapitalsmalllatter 
{
public static void main(String[] args) 
{
	String s="Welcome to pune";
	int lower=0;
	int cap=0;
	
	for (int i = 0; i < s.length(); i++)
	{
		char ch = s.charAt(i);
		if(ch>=65 && ch<=90)
		{
			cap++;
		}
		else
		{
			lower++;
		}
		
	}
	
	System.out.println("Lower apf count:"+lower);
	System.out.println("Cap apf count:"+cap);
}
}
