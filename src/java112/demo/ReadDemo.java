package java112.demo;

import java.io.*;

/** A sample class to demonstrate reading a file and related exception handling
 *  @author Paula Waite
 */

 public class ReadDemo {

     /** main method for starting the program
      *  @param args the command line arguments
      **/

    public static void main(String[] args) throws IOException {
        ReadDemo demo = new ReadDemo();
        demo.run();

    }

    /** The run method will read a file, line by line and write out each
     *  line to the console.
     * @throws IOException
    **/
    public void run() throws IOException {
        String line = null;
        // Question: why did we need to create in here, outside of the try?
        BufferedReader in = null;

        try {
            // FileReader reader = new FileReader("input.txt");
            // in = new BufferedReader(reader);
            // the previous two lines and the following line accomplish
            // the same thing: creating a BufferedReader object.

            // TODO: research try-with-resources to discover how to
            // significantly shorten up this try/catch/finally block
            in = new BufferedReader(new FileReader("input2.txt"));// input2.txt does not exist - we will see an exception thrown!
            while (in.ready()) {
                line = in.readLine();
                System.out.println(line);
            }

        } catch (FileNotFoundException fileNotFoundEx) {
            System.out.println("There was a problem opening the file");
            fileNotFoundEx.printStackTrace();
        } finally {
            try {
                if (in != null) {
                    in.close();
                }
            } catch (IOException ioEx2) {
                System.out.println("There was a problem closing the file");
                ioEx2.printStackTrace();
            }
        }
    }
 }
