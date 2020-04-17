public class Main {
    public static void main(String[] args) {
        System.out.println("Item 1 is:");
        ItemBuilder item1 = new ItemBuilder();
        System.out.println(item1.finishedItem);

        System.out.println("Item 2 is:");
        ItemBuilder item2 = new ItemBuilder();
        System.out.println(item2.finishedItem);

    }
}