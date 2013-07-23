//Let's say the interface is Display
interface Display {

   //load a file
   public void load(String fileName);

   //parse the file and make a consistent data type
   public void formatConsistency();

}

//deal with plain text file
class CSVFile implements Display{

    public void load(String textfile) {
        System.out.println("load from a txt file");
    }
    public void formatConsistency() {
        System.out.println("txt file format changed");
    } 
}

//deal with XML format file
class XMLFile implements Display {

    public void load(String xmlfile) {
        System.out.println("load from an xml file");
    }
    public void formatConsistency() {
        System.out.println("xml file format changed");
    } 
}

//deal with binary format file
class DBFile implements Display {

    public  void load(String dbfile) {
        System.out.println("load from a db file");
    }
    public void formatConsistency() {
        System.out.println("db file format changed");
    } 
}

//Test the functionality
class TestFactory {

    public static void main(String[] args) {
        Display display = null;
        
        //use a command line data as a trigger
        if (args[0].equals("1"))
           display = new CSVFile();
        else if (args[0].equals("2"))
           display = new XMLFile();
        else if (args[0].equals("3"))
           display = new DBFile();
        else
           System.exit(1);

        //converging code follows
        display.load("");
        display.formatConsistency();
   }    
}