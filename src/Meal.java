import java.util.ArrayList;

public class Meal {
    private ArrayList items = new ArrayList<Item>();

    public void addItem(Item item){
        items.add(item);
    }

    public float getCost(){
        float cost = 0;
        for (int i = 0; i < items.size(); i++) {
            Item item_object = (Item) items.get(i);
            cost += item_object.price();
        }
        return cost;
    }

    public void showItems() {
        for (int i = 0; i < items.size(); i++) {
            Item item_object = (Item) items.get(i);
            System.out.print(item_object.name() + " will be packed with " + item_object.packing().name() + ". Price: " + item_object.price() + '\n');
        }
        System.out.println("Total:" + getCost());
    }
}