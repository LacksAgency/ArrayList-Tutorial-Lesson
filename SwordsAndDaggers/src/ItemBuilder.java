public class ItemBuilder {
    public String itemType;
    public String materialType;
    public String swordType;
    public String daggerType;
    public String axeType;
    public String finishedItem;
    public String finalDescription;
    Items myItem = new Items();
    Material myMaterial = new Material();
    SwordDescription mySwordDescription = new SwordDescription();
    DaggerDescription myDaggerDescription = new DaggerDescription();
    AxeDescription myAxeDescription = new AxeDescription();

    public ItemBuilder(){
        finishItem();
    }

    public void finishItem(){
        itemType = myItem.getItems();
        materialType = myMaterial.getMaterial();
        swordType = mySwordDescription.getSwordDescription();
        daggerType = myDaggerDescription.getDaggerDescription();
        axeType = myAxeDescription.getAxeDescription();

        if (itemType.equals("Sword")){
            finalDescription = swordType;
        } else if (itemType.equals("Dagger")){
            finalDescription = daggerType;
        } else if (itemType.equals("Axe")){
            finalDescription = axeType;
        }

        finishedItem = "You've been given a " + itemType + " made of " + materialType + "! It is " + finalDescription;
    }

}