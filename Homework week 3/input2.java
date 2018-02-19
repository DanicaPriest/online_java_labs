import java.io.*;

public class input2 {
    public static void main(String[] args) throws IOException {
        InputStream is = null;
        BufferedInputStream bis = null;
        FileOutputStream os = null;

        try {
            is = new FileInputStream("C:/Users/Danica/Documents/original.txt");
            bis = new BufferedInputStream(is);
            os = new FileOutputStream("C:/Users/Danica/Documents/secret.txt");

            for (int i = bis.available(); i > 0; i--) {
                char c = (char) bis.read();
                int x = c + 1;
                char y = (char) x;
                System.out.print(y);
                os.write(y);

            }
            //check coded message
            System.out.println();
            InputStream nis = new FileInputStream("C:/Users/Danica/Documents/secret.txt");
            BufferedInputStream nbis = new BufferedInputStream(nis);
            for (int i = nbis.available(); i > 0; i--) {
                char c = (char) nbis.read();
                int x = c - 1;
                char y = (char) x;
                System.out.print(y);


            }


        } catch (IOException exc) {
            exc.printStackTrace();

        } finally {
            if (is != null) {
                is.close();
            }
            if (bis != null) {
                bis.close();
            }
            if (os != null) {
                os.close();
            }

        }
    }
}
