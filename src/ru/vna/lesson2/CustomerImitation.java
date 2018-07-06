package ru.vna.lesson2;

import ru.vna.order.Item;
import ru.vna.order.Order;

public class CustomerImitation {

    public static void main(String[] args) {

        Order order = new Order(
                new Item("item1"),
                new Item("item2"),
                null,
                new Item("item3")
        );

      order.addItem(null);
      order.addItem(new Item("iphone"));
      order.addItem(new Item("ipad"));
      order.printItems();
    }
}
