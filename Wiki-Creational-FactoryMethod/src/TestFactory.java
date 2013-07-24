//Test the functionality
public class TestFactory {

    public static void main(String[] args) {
        Display display = null;
        
        if(args.length == 0) 
        	args = new String[]{"2"};
        
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