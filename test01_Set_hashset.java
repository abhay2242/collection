import java.util.HashSet;

class test01_Set_hashset {
	public static void main(String[] args) 
	{
	
        HashSet<Object> hs = new HashSet<>();
		
		System.out.println(hs);
System.out.println(hs.add("a")); System.out.println(hs);
	       // e1.hashCode() -> 97%16 = 1;
		   // new bucket will create  
		   // element  added  successfully
System.out.println(hs.add(5)); System.out.println(hs);
	   	   //e2.hashCode() ->5%16 = 5
		   //bucket not found 
		   //new bucket created and element added succesfully
System.out.println(hs.add(21.23)); System.out.println(hs);System.out.println(((Double)6.7).hashCode());
    		//e3.hashCode() ->negetiveval%16 = -15 = ~-15 = 14
		   //bucket not found 
		   //new bucket created and element added succesfully
System.out.println(hs.add('p')); System.out.println(hs);
           //e4.hashCode() ->112%16 = 0
		   //bucket not found 
		   //new bucket created and element added succesfully
System.out.println(hs.add('p')); System.out.println(hs);
            //e5.hashCode() ->112%16 = 50
		   //bucket  found
		   //first e5('p') equals(e4('p'))-> return true(match found)
		   // here the equals method will execute from  curr obj class = char class the equals method will overrin from this  class
		   //new bucket not created and element  not added succesfully
System.out.println(hs.add(true)); System.out.println(hs); 	//	System.out.println(((Boolean)true).hashCode());
           //e6.hashCode() ->1231%16 = 15
		   //bucket not found
		   //new bucket created and element added succesfully
System.out.println(hs.add(false)); System.out.println(hs);//	System.out.println(((Boolean)false).hashCode());
           //e7.hashCode() ->1237%16 = 5
		   //bucket  found 
		   // comapre e7(false)equals(e2(5))  return false match not found ;
		   //add element to the bucket next to the last element		
		System.out.println(hs.add("abhay")); System.out.println(hs);	System.out.println(((String)"abhay").hashCode());


	
	
	
	
	
	
	
	}
}
