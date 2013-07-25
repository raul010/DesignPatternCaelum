package wiki;
/**
 * Client code
 */
public class PrototypeTest {
        public static void main(String args[]) throws CloneNotSupportedException {
                Prototype prototype = new PrototypeImpl(1000);
 
                for (int i = 1; i < 10; i++) {
                        Prototype tempotype =  prototype.clone();
                        System.out.println(tempotype.toString());
 
                        // Usage of values in protOtype to derive a new value.
                        tempotype.setX( tempotype.getX() * i);
                        tempotype.printX();
                }
        }
}
 