package ibf2022.ssf.day12.repository;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import ibf2022.ssf.day12.model.Item;

@Repository
public class ItemRepo {

    private List<Item> itemList = new ArrayList<Item>();

    public List<Item> getCartItems() {

        itemList.clear();

        Item itm = new Item();
        itm.setItemName("Louis Vuitton");
        itm.setQuantity(5);
        itemList.add(itm);

        itm = new Item();
        itm.setItemName("Chanel");
        itm.setQuantity(6);
        itemList.add(itm);

        itm = new Item();
        itm.setItemName("Prada");
        itm.setQuantity(10);
        itemList.add(itm);

        itm = new Item();
        itm.setItemName("Hermes");
        itm.setQuantity(15);
        itemList.add(itm);

        itm = new Item();
        itm.setItemName("Bottega");
        itm.setQuantity(5);
        itemList.add(itm);

        return itemList;

    }
    
}
