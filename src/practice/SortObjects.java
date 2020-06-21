package practice;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

class Student implements Comparable<Student>
{
	private int Age;
	private String Name;
	
	public Student(int Age,String Name)
	{
		this.Age = Age;
		this.Name=Name;
	}
	
	public String StudentName()
	{
		return Name;
	}
	public Integer StudentAge()
	{
		return Age;
	}
	public int compareTo(Student s)
	{
		return this.StudentAge().compareTo(s.StudentAge());
	}
}

public class SortObjects {

	public static void main(String[] args) {
		
		Student s1 = new Student(118,"Giri");
		Student s2 = new Student(24,"Babu");
		ArrayList<Student> al = new ArrayList<Student>();
		al.add(s1);
		al.add(s2);
		Collections.sort(al);
		
		for ( Student sl: al)
		System.out.println("Age "+sl.StudentAge()+"Name:"+sl.StudentName());
		
	}

}
