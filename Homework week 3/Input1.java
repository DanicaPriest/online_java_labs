import java.io.*;

public class Input1 {
    /**
     * Input/Output Exercise 1: File input/output
     *
     *      Using the BufferedInputStream, read a file byte by byte and write each byte to a new file.
     *      Make sure you close the connections to both files.
     *
     *
     */
    public static void main(String[] args) throws Exception {
        InputStream iS = null;
        BufferedInputStream bis = null;
        OutputStream oS = null;

        try {


            iS = new FileInputStream("C:/Users/Danica/Documents/CodingNomads/input1.txt" );


            bis = new BufferedInputStream(iS);
            oS = new FileOutputStream("C:/Users/Danica/Documents/CodingNomads/output1.txt");


            while(bis.available()>0) {


                char c = (char)bis.read();


                System.out.println(c);
                oS.write(c);
            }
        } catch(IOException e) {

            e.toString();
        } finally {

            if(iS!=null)
                iS.close();
            if(bis!=null)
                bis.close();
        }
    }
}
