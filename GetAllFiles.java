import java.io.File;  // Import the File class
//import java.io.IOException;  // Import the IOException class to handle errors
import java.util.ArrayList; 
import java.io.FileWriter;



public class GetAllFiles {

    public static ArrayList< File > files = new ArrayList<File>();
    public static File placeholder1, placeholder2;

    public static void main( String[] args ) 
    {
        File thingy = new File( ".");
        getFilesInDir( thingy );

        // for ( int index = 0; index < files.size(); index++ ) {
        //     System.out.println( files.get(index).getName());
        // }
        
        for (int index = 0; index < files.size()-1; index++) {
            
        }
    }

    public static void getFilesInDir( File dir ) {
        //ArrayList< File > fileStorage = new ArrayList< File >();
        try {
            File here = new File( dir.getAbsolutePath() );
            File[] contents = here.listFiles();

            for( File f : contents ) {
                if(f.isFile() && !f.isHidden()) {
                    files.add( f );
                }
                else if (f.isDirectory() && !f.isHidden()){
                    getFilesInDir( f );
                }
                //System.out.println(f.getName());
            }
        } catch ( Exception e ) {
            System.out.println( "An error occurred." );
            e.printStackTrace();
        }
    }

    public static ArrayList<File> getFiles() {
        return files;
    }

    public static void setFiles(ArrayList<File> files) {
        GetAllFiles.files = files;
    }


    public static void writeToFile(String content, String fileLocation)
    {
           File file = new File(fileLocation);
           FileWriter writer;
           try {
               writer = new FileWriter(file);
               writer.write(content);
               writer.close();
           }
           catch (IOException e) {
               System.out.println("ABCDEFG");
           }
    }
}
