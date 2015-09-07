package java112.labs1;

/** This is the first lab for Advanced Java
 *  @author Paula Waite
 */

 public class MysteryClassOne {

     /** Call mysteryMethodOne() and output its result
      *  @param args the command line arguments
      */
     public static void main(String[] args) {

         // We must instantiate an MysteryClassOne object so that we can call
         // the non-static method mysteryMethodOne()
         MysteryClassOne classOne = new MysteryClassOne();

         // Write out the value returned by mysteryMethodOne
         System.out.println(classOne.mysteryMethodOne());

     }

     /** A method built to demonstrate TDD (Test Driven Development)
      *  @return the value prescribed by the tests
      */
     public int mysteryMethodOne() {
         return 1;

     }

 }
