import java.util.ArrayList;
import java.util.Random;

public class AxeDescription {
    private ArrayList<String> axeList;
    private Random rand = new Random();

    public AxeDescription(){
        axeList = new ArrayList<>();
        setItemList();
    }

    private void setItemList(){
        axeList.add("a short, well balanced throwing axe.");
        axeList.add("a double bladed war axe.");
        axeList.add("a simple woodsman axe.");
    }

    public String getAxeDescription(){
        int randomItem = rand.nextInt(axeList.size());
        String AxeDescription = axeList.get(randomItem);
        return AxeDescription;
    }
}
