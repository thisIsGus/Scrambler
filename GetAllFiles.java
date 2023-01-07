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
        new GUI(); 
    }

    public static void getFilesInDir( File dir ) {
        try {

            File here = new File( dir.getAbsolutePath() );
            File[] contents = here.listFiles();

            for( File f : contents ) {
                if(f.isFile() && !f.isHidden() && f.getName().indexOf(".mcmeta") == -1) {
                    files.add( f );
                }
                else if (f.isDirectory() && !f.isHidden()){
                    getFilesInDir( f );
                }
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

    public void compileResourcePack(){
        try{
            File thingy = new File( "textures");
            getFilesInDir( thingy );

            Collections.shuffle(files);
            for (int index = 0; index < files.size()-1; index+=2) {
                placeholder1 = files.get(index);
                placeholder2 = files.get(index+1);

                Path filePath1 = Path.of(placeholder1.getAbsolutePath());
                Path filePath2 = Path.of(placeholder2.getAbsolutePath());

                byte[] byteF1, byteF2;
                byteF1 = Files.readAllBytes(filePath1);
                byteF2 = Files.readAllBytes(filePath2);
                
                Files.write(filePath1, byteF2);
                Files.write(filePath2, byteF1);
            }
        } catch (IOException e){
            System.out.println("Messed up in Main");
        }
    }
}
