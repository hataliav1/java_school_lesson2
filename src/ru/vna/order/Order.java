package ru.vna.order;

import ru.vna.order.Item;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Voronina2-na on 06.07.2018.
 */
public class Order {

    private List <Item> itemList = new ArrayList<>();

    public Order(Item ... items){
        for (Item item: items) {
            addItem(item);
        }
    }

    public boolean addItem(Item item){
        if (item != null){
            itemList.add(item);
            return true;
        }
        return false;
    }

    public void printItems(){
        for (Item item : itemList){
            System.out.println(item.getName() + "\n");
        }
    }
}
