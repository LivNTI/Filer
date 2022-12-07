import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Files {

    String fileName = "test.txt";
    /*
    File myFile= new File(fileName);
    */

    public Files(){
        //findFiles();
        //createFile();
        writeToAFile();
        readFromFile();

    }

    /*
    * Find all files in a given directory
     */
    public void findFiles(){
        File myFile= new File("C:\\Windows");
        String[] fileList= myFile.list();

        // loops through a list of strings and prints the content
        for(String aFileName: fileList){
            System.out.println(aFileName);
        }
    }

    /*************************************************************
    * Creates a file if the file does not exist
     *************************************************************/
    public void createFile(){

        File myFile= new File(fileName);

        // Try to create a file
        try {
            //If the file does not exist it will be created
            if(myFile.createNewFile()){
                System.out.println("file already created");
            }else{
                System.out.println("file exists");
            }
        }catch(IOException e){
            System.out.println("NOPE!");
            e.printStackTrace();
        }
    }

    /*
    * Write to a file
     */
    public void writeToAFile(){
        try {
            FileWriter myWriter = new FileWriter(fileName,true);
            myWriter.write("Minecraft 2 \n");
            myWriter.close();
            System.out.println("I have written to file");
        }catch (IOException e){
            System.out.println("NO WRITING!");
            e.printStackTrace();
        }
    }

    /*
    * REad data from file
     */
    public void readFromFile(){

        try {
            File myFile = new File(fileName);
            Scanner myScan = new Scanner(myFile);
            while(myScan.hasNextLine()) {
                String data = myScan.nextLine();
                System.out.println(data);
            }
            myScan.close();
        }catch(FileNotFoundException e){
            System.out.println("No such file");
            e.printStackTrace();
        }
    }

    /*
    * Läsa från En hemsida
     */
    public void readURL(){}


}
