package org.array;
//Start of the program
    //public class Array {
	
	
	//public static void main(String args[]) {
		//int b=0;
		//int a[]= {1,2,3,4,5,6,7,8,9,10,11,12,13,14,15};
		//for(int i=0;i<a.length;i++) {
			
			//b=b+a[i];
		//}
			//System.out.println(b);
		
	
//	}

//}

//Example for Array
public class Array {
	
	
	public static void main(String args[]) {
		int b=0;  double c=0.0;
		int a[]= {1,2,3,4,5,6,7,8,9,10};
		for(int i=0;i<a.length;i++) {
			
			b=b+a[i];// Adding array values
			
		}
		
		    c=b/a.length;
			System.out.println(" Average is:"+c);// finding average for array values
		
	
	}

}
