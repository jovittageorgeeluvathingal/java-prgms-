//Using file.createfiles(path)
import java.io.*;
import java.nio.file.*;

class FCMethod3
{
    public static void main(String args[])
    {
        try
        {
            Path pf=Paths.get("D:\\java\\programs\\FCMethod3File.txt"); //get path
            Path p=Files.createFile(pf);
        }
        catch(IOException e)
        {
            System.out.println(e);
        }
    }
}
