import java.util.ArrayList;
import java.util.Random;

public class Items {
    private ArrayList<String> itemList; //Declare the list!
    private Random rand = new Random();



    public Items(){
        itemList = new ArrayList<>(); //Make the list exist!
        setItemList();
        getItems();
    }

    //Actually set the items in the list!
    public void setItemList(){
        itemList.add("Sword");
        itemList.add("Spear");
        itemList.add("Axe");
    }

    public String getItems(){
        int randomItem = rand.nextInt(itemList.size());
        String Items = itemList.get(randomItem);
        return Items;
    }
}