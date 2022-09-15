import java.io.File;
import java.io.FileInputStream;

public class FileRead {
    public static void main(String[] args) {
        FileRead fileRead = new FileRead();
        fileRead.readFile();
    }

    public void readFile(){
        long size=10;
        File file = new File("hello.txt");
        FileInputStream fileInputStream = null;
        byte[] bFile = new byte[(int) file.length()];


        try
        {
            //Read bytes with InputStream
            fileInputStream = new FileInputStream(file);
            fileInputStream.read(bFile);
            fileInputStream.close();

            for (int i = 0; i < bFile.length; i++)
            {
                System.out.print((char) bFile[i]);
            }
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }
    }
}
