import java.util.List;
import java.util.ArrayList;

//http://en.wikipedia.org/wiki/Composite_pattern
/** "Component" */
interface Graphic {
    public void print();
}
 
/** "Composite" */
class CompositeGraphic implements Graphic {
    private List<Graphic> childGraphics = new ArrayList<Graphic>();
    //imprime cada elemento e seus sub-elementos e assim por diante
    @Override
	public void print() {
        for (Graphic graphic : childGraphics) {
            graphic.print();
        }
    }
    //Adds the graphic to the composition.
    public void add(Graphic graphic) {
        childGraphics.add(graphic);
    }
    //Removes the graphic from the composition.
    public void remove(Graphic graphic) {
        childGraphics.remove(graphic);
    }
}
//Aqui é onde fica o conteúdo importante que serão imprimidos
/** "Leaf" */
class Ellipse implements Graphic {
    //Prints the graphic.
    @Override
	public void print() {
        System.out.println("Ellipse");
    }
}

/** Client */
public class Teste {
    public static void main(String[] args) {
        //Initialize four ellipses
        Ellipse ellipse1 = new Ellipse();
        Ellipse ellipse2 = new Ellipse();
        Ellipse ellipse3 = new Ellipse();
        Ellipse ellipse4 = new Ellipse();
 
        //Initialize three composite graphics
        CompositeGraphic graphic = new CompositeGraphic();
        CompositeGraphic graphic1 = new CompositeGraphic();
        CompositeGraphic graphic2 = new CompositeGraphic();
 
        //Composes the graphics
        graphic1.add(ellipse1);
        graphic1.add(ellipse2);
        graphic1.add(ellipse3);
 
        graphic2.add(ellipse4);
        
        //uso o proprio objeto para incluir os elementos que desejo imprimir
        graphic.add(graphic1);
        graphic.add(graphic2);
 
        //Prints the complete graphic (four times the string "Ellipse").
        graphic.print();
        
    }
}