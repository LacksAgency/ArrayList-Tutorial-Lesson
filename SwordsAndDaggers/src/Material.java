import java.util.ArrayList;
import java.util.Random;

public class Material {

    private ArrayList<String> materialList; //Declare the list!
    private Random rand = new Random();

    public Material(){
        materialList = new ArrayList<>(); //Make the list exist!
        setItemList();
    }

    //Actually set the items in the list!
    private void setItemList(){
        materialList.add("Wood");
        materialList.add("Iron");
        materialList.add("Steel");
        materialList.add("Bronze");
    }

    public String getMaterial(){
        int randomItem = rand.nextInt(materialList.size());
        String material = materialList.get(randomItem);
        return  material;
    }
}