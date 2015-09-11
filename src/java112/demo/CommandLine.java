package java112.demo;

/** This is a demo of the command line to pass arguments to a program
 *  @author Paula Waite
 */

 public class CommandLine {

 /** Demonstrate writing out the args that are passed in via the command line
  * @param args the command line arguments
  */

  public static void main(String[] args) {
      System.out.println("The size of args is " + args.length);

      for (int loop = 0; loop < args.length; loop++) {
          System.out.println(args[loop]);

      }


  }

 }
