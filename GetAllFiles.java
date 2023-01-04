import java.io.File;  // Import the File class
import java.io.IOException;  // Import the IOException class to handle errors
import java.util.ArrayList; 



public class GetAllFiles {

    public ArrayList<File> Files = new ArrayList<File>();
    public static void main( String[] args ) {
        System.out.println("sgresd");
    }

    public static void getFilesInDir(File dir) {
        try {
            File here = new File(".");
            File[] contents = here.listFiles();

            for(File f : contents) {
                if(f.isDirectory()) {
                    getFilesInDir(f);
                }
                else {
                    
                }
                System.out.println(f.getName());
            }
        } catch (Exception e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
    }
}
