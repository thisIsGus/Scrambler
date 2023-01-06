import java.io.File;
import java.io.IOException;
import java.util.ArrayList; 
import java.util.*;
import java.nio.file.Files;
import java.nio.file.Path;



public class GetAllFiles {

    public static ArrayList< File > files = new ArrayList<File>();
    public static File placeholder1, placeholder2;

    public static void main( String[] args ) 
    {   
        try{
            File thingy = new File( "/Users/augustusmartinez/Desktop/Scrambler part 14/untitled folder");
            getFilesInDir( thingy );

            // for ( int index = 0; index < files.size(); index++ ) {
            //     System.out.println( files.get(index).getName());
            // }
            Collections.shuffle(files);
            for (int index = 0; index < files.size()-1; index+=2) {
                placeholder1 = files.get(index);
                placeholder2 = files.get(index+1);

                Path filePath1 = Path.of(placeholder1.getAbsolutePath());
                Path filePath2 = Path.of(placeholder2.getAbsolutePath());

                byte[] byteF1, byteF2;
                byteF1 = Files.readAllBytes(filePath1);
                byteF2 = Files.readAllBytes(filePath2);

                // FileUtils.writeByteArrayToFile(placeholder2.getAbsolutePath(), byteF1);
                // FileUtils.writeByteArrayToFile(placeholder1.getAbsolutePath(), byteF2);

                Files.write(filePath1, byteF2);
                Files.write(filePath2, byteF1);
            }
        } catch (IOException e){
            System.out.println("Messed up in Main");
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
            System.out.println( "An error occurred in method 'getFilesInDir'" );
            e.printStackTrace();
        }
    }

    public static ArrayList<File> getFiles() {
        return files;
    }

    public static void setFiles(ArrayList<File> files) {
        GetAllFiles.files = files;
    }


    // public static void writeToFile(String content, String fileLocation)
    // {
    //        File file = new File(fileLocation);
    //        FileWriter writer;
    //        try {
    //            writer = new FileWriter(file);
    //            writer.write(content);
    //            writer.close();
    //        }
    //        catch (IOException e) {
    //            System.out.println("ABCDEFG");
    //        }
    // }
}
