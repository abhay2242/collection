TreeSet

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
*       Its compareTo is implemented for sorting objects in ASC order. 
*  8) For storing our own class objects in Treeset, we also must implement Comparable interface 
*       compareTo method.
*  
*  9) Inside comapareTo() method we must compare the data objects current object
*      and argument object by using  - operator, because we must return 0/-ve/+ve number to
*      tell to TS.add() weather the adding object is equal, or smaller or bigger than already added object 
*         -> if compareTo() return 0     = TS.add() do not store e2
*         -> if compareTo() return -ve  = TS.add() store e2 LEFT to e1
*	  -> if compareTo() return +ve = TS.add() store e2 RIGHT to e1
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
*

=================================================================================================================================


Enumset

  EnumSet is an collection framework collection 
     -> It is available from Java 5v
     -> It is an implementation of set interface 
  *-> When we need to store one particular enum named constant as one group we use enumset.
     -> It is not syncronined means it is not thread safe.
  * -> It is an ordered collection
           it store names constants in the order exactly they are declared in enum.
  * -> The internal data structure is fixed array
  * -> The length is enum size, means number of named constants.
     -> It allow us to store only the given name constants.
  * -> It does not allow null.
     -> In adding searching and removing opertions, internally 
      equals() method is called and those executed from enum.
