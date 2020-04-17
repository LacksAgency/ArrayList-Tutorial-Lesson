import java.util.ArrayList;
import java.util.Random;

public class DaggerDescription {
    private ArrayList<String> daggerList; //Declare the list
    private Random rand = new Random();

    public DaggerDescription(){
        daggerList = new ArrayList<>(); //Makes the list
        setItemList();
    }

    private void setItemList(){
        daggerList.add("a thin icepick of a dagger.");
        daggerList.add("a wide rondel.");
        daggerList.add("a steak knife?");
    }

    public String getDaggerDescription(){
        int randomItem = rand.nextInt(daggerList.size());
        String DaggerDescription = daggerList.get(randomItem);
        return DaggerDescription;
    }
}
