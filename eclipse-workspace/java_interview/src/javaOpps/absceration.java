package javaOpps;

public class absceration 
{
public static void main(String[] args)
{
	
	student s1=new student();
	
	s1.setname("Askash");
	s1.setmarks(56.55);
	s1.setrollno(21);
	System.out.println(s1.getname());
	System.out.println(s1.getrollno());
	System.out.println(s1.getmarks());
	
}
}

class student
{
	int rollno;
	double marks;
	String name;
	
	public void setrollno(int rollno)
	{
		this.rollno=rollno;
	}
	public void setmarks(double marks)
	{
		this.marks=marks;
		
	}
	public void setname(String name)
	{
		this.name=name;
	}
	
	public int getrollno()
	{
		return rollno;
		
	}
	public double getmarks()
	{
		return marks;
		
	}
	public String getname()
	{
		return name;
		
	}
	
	
	
	
}