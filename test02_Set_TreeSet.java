import java.util.TreeSet;

/*
*  1) Treeset is using to store the object in sorted order
*  2) The sorting order can be either ascending or descending
*  3) TreeSet does not have its own defaut sorting order
*  4) The default sorting order is decided by the adding object class developer by using
 *      Comparable.compareTo(-) method; 
*  5) IT means the default sorting order of Treeset is the default sorting order supplier by the adding 
*       object class by implement comparable interface compare(-) method
*  6) The rule in storing objects in treeset collection is, the adding object class must be Comparable
*      interface  type and must implement its method compareTo(-), else Ts.add() method throws
*      ClassCastException and object is not store
*  7) The string class and all wrapper class are implemented from Comparable interface.
*       Its compareTo is implemented for sorting objects inASC order. 
*  8) For storing our own class objects in Treeset, we also must implement Comparable interface 
*       compareTo method.
*  
*  9) Inside comapareTo() method we must compare the data objects current object
*      and argument object by using  - operator, because we must return 0/-ve/+ve number to
*      tell to TS.add() weather the adding object is equal, or smaller or bigger than already added object 
*         -> if compareTo() return 0     = TS.add() do not store e2
*         -> if compareTo() return -ve  = TS.add() store e2 LEFT to e1
*			-> if compareTo() return +ve = TS.add() store e2 RIGHT to e1
*
* 10) For storing obj in ASC or DSC in comapareTo() method we must follow below algo
*       -> for sorting in ASC = [ CO - AO]
*       -> for sorting in DSC = [ AO - CO]
*
* 11)  Their are two types of sorting
*        -> Default sorting order
*        -> Custom sorting order
*
*12)  A class can supply onlt one sorting order. If other developer wants to sort our class
*         objects in diffrent sorting order either in DESC order or sorting based order on 
*        different property, he has supply that diffrent sorting order logic to TS.
*13)  For supply custom sorting logic, the other develop must implemented
*        Comparator interface method compare( o1, o2)
*14) Comparator is a functional interface it can be implemented in 4 ways
*        1> by using outer class 
*        2> by using anuymous inner class
*        3> by using lambda expression 
*        4> by using method reference
*/

// outer class
/*class mericlass implements Comparator<Integer>{
        
		    @override
				public int compare( Integer e1, Integer e1){
				      return e2 - e1;
			}
}
*/

class test02_Set_TreeSet {
	public static void main(String[] args) 
	{
           
			TreeSet <Object> st = new TreeSet<> ();
			st.add("z");
			st.add("f");
			st.add("e");
			//st.add(6);
			st.add("abhay");
			//st.add('d');
			System.out.println( st);
	
	        TreeSet <Integer> st2 = new TreeSet<> ( ( e1 ,  e2) ->  ( e2 - e1) );
			st2.add(1);
			st2.add(3);
			st2.add(2);
			st2.add(4);
			System.out.println( st2);
	
	/*      TreeSet <Integer> st3 = new TreeSet<> (new Comparator<Integer>(){
			                                                                        @override
																						public int compare( int e1, int e2){
																						     return e2 - e1;
																					}
		                                                                          }  
																				 );
			st3.add(1);
			st3.add(3);
			st3.add(2);
			st3.add(4);
			System.out.println( st);
	*/
	        TreeSet <ex> st4 = new TreeSet<> ((s1, s2) -> (s1.getterx() - s2.getterx()));
			st4.add(new ex(5, 6));
			st4.add(new ex(1,24));
			st4.add(new ex(6,3));
			st4.add(new ex(6,4));
			System.out.println( st4);
	// throwing erroe because the ex class is not the sub of Comparator interface

	
	
	
	
	
	
	
	}
}
