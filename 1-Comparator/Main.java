package comparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;


public class Main {
	public static void main(String args[]){  
		  
		ArrayList<Student> listStudent =new ArrayList<Student>();  
		
		listStudent.add(new Student("nikk", 25));
		listStudent.add(new Student("vivian", 26));
		listStudent.add(new Student("Amy", 24));
		listStudent.add(new Student("Nhu Nguyen", 25));
		
		
		  
		System.out.println("Sorting by Name...");  
		  
		Collections.sort(listStudent,new NameComparator());  
		for(Student st: listStudent){  
		System.out.println(st.getName()+" "+st.getAge());  
		}  
		
		System.out.println("---------------------"); 
		System.out.println("Sorting by age...");  
		  
		Collections.sort(listStudent,new AgeComparator());  
		for(Student st: listStudent){  
		System.out.println(st.getAge()+" "+st.getName());  
		}  
		  
		}  
}  