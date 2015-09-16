package java112.demo;

import java.io.*;

/** A sample class to demonstrate writing a file and related exception handling
 *  @author Paula Waite
 */

 public class WriteDemo {

     /** main method for starting the program
      *  @param args the command line arguments
      **/

    public static void main(String[] args) {
        WriteDemo demo = new WriteDemo();
        demo.run();

    }

    /** The run method will write a file **/
    public void run() {
        // The code below uses try with resources
        try (PrintWriter printWriter = new PrintWriter(new BufferedWriter(new FileWriter("/outputtest/output.txt")))){
             printWriter.println("My first line");

        } catch (IOException ioException) {
            System.out.println("There was problem writing the file");
            ioException.printStackTrace();
        } catch (Exception exception) {
            System.out.println("There was an exception");
            exception.printStackTrace();
        }


    }
 }
