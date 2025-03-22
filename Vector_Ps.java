package collection;

import java.util.Vector;

public class Vector_Ps {
	public static void main(String[] args) {
		Vector v  = new Vector<>();
		System.out.println(v.capacity());//we can check by default size of vector
		
		//if you give any number in constructor of vector then capacity will be asienge
		Vector v2  = new Vector<>(5);
		System.out.println(v2.capacity());
		v2.add(1);
		v2.add(2);
		v2.add(3);
		v2.add(4);
		v2.add(5);
		v2.add(6);
		System.out.println("if size cross tje limit it will be duble : "+v2.capacity());
		
		// in vector you can manage your capacity for Example
		//Ex -  if you set capacity is 5 if cross the limit 5 then capacity will be 7
		//----> by default it's capacity is 2x(Double)
		Vector v3  = new Vector<>( 5 , 2);
		v3.add(1);
		v3.add(2);
		v3.add(3);
		v3.add(4);
		v3.add(5);
		v3.add(6);
		System.out.println(v3.capacity());// here increment capacity only --> 2
		
		// Vector method similar to List Method 


	}

}
