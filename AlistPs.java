package collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;

import javax.print.attribute.standard.MediaSize.Other;

class Student  implements Comparable<Student> {
	int id;
	String name;
	String pho;
	int age;

	public Student(int id, String name, String pho, int age) {
		super();
		this.id = id;
		this.name = name;
		this.pho = pho;
		this.age = age;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPho() {
		return pho;
	}

	public void setPho(String pho) {
		this.pho = pho;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", pho=" + pho + ", age=" + age + "]";
	}

	@Override
	public int compareTo(Student o) {
		// TODO Auto-generated method stub
		return this.name.compareTo(o.name);
	}
	
	

}

public class AlistPs {

	public static void main(String[] args) {

//		StringBuilder sb = new StringBuilder("Vishesh");
//		//System.out.println(sb.capacity());// By defult capacity is 16
//		sb.trimToSize();
//		System.out.println(sb.capacity());

		Student std = new Student(5, "vishesh", "8579819058", 22);
		ArrayList<Student> aListStd = new ArrayList<Student>();
		aListStd.add(std);
		aListStd.add(new Student(2, "Manish", "9878459854", 22));
		aListStd.add(new Student(3, "Alok", "8231065489", 24));
		aListStd.add(new Student(4, "Rohit", "9570673895", 23));
		aListStd.add(new Student(1, "Diksha", "5678459854", 22));
		aListStd.add(new Student(6, "Robin", "7789544785", 22));
		// System.out.println(aListStd);


		Collections.sort(aListStd);

//		Iterator<Student> it = aListStd.iterator();
//		while (it.hasNext()) {
//			System.out.println(it.next());
//		}
		
		for(Student s : aListStd) {
			System.out.println(s);
		}

		
		System.out.println("Sorting By Id");
		Collections.sort(aListStd , Comparator.comparing(i -> i.id));
		for(Student e :aListStd) {
			System.out.println(e);
		}
		
		System.out.println("Sorting By Age");
		Collections.sort(aListStd , Comparator.comparing(i -> i.age));
		for(Student e :aListStd) {
			System.out.println(e);
		}
		
		System.out.println("Sort by Number");
		Collections.sort(aListStd , Comparator.comparing(i->i.pho));
		for(Student e :aListStd) {
			System.out.println(e);
		}
		
//		 Collections.sort(aListStd, (s1, s2) -> {
//	            int nameComp = s1.name.compareTo(s2.name);
//	            if (nameComp != 0) return nameComp;
//
//	            int ageComp = Integer.compare(s1.age, s2.age);
//	            if (ageComp != 0) return ageComp;
//
//	            int idComp = Integer.compare(s1.id, s2.id);
//	            if (idComp != 0) return idComp;
//
//	            return s1.pho.compareTo(s2.pho);
//	        });
		
//		Collections.sort(aListStd , (s1,s2) ->{
//			int namecomp = s1.name.compareTo(s2.name);
//			if(namecomp!=0) return namecomp;
//			int idComp  = s1.id.compareTo(s2.id);
//			if(idComp!=0) return idComp;
//			
//		});
		
	       List a = new ArrayList(8);
	      
	       System.out.println(a.size());
		
	}

}
