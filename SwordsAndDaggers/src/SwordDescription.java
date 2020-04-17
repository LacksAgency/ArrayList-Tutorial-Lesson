import java.util.ArrayList;
import java.util.Random;

public class SwordDescription {

    private ArrayList<String> swordDescription; //Declare the list!
    private Random rand = new Random();

    public SwordDescription(){
        swordDescription = new ArrayList<>(); //Make the list exist!
        setItemList();
    }

    //Actually set the items in the list!
    private void setItemList(){
        swordDescription.add("a nice shiny sword.");
        swordDescription.add("a dull, but serviceable sword.");
        swordDescription.add("a rusty jump of metal that was once a sword.");
    }

    public String getSwordDescription(){
        int randomItem = rand.nextInt(swordDescription.size());
        String SwordDescription = swordDescription.get(randomItem);
        return SwordDescription;
    }
}
