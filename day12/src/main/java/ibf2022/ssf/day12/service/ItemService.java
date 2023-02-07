package ibf2022.ssf.day12.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ibf2022.ssf.day12.model.Item;
import ibf2022.ssf.day12.repository.ItemRepo;

@Service
public class ItemService {

    //no need to instantitate object manually (no need to create constructors)
    //only used with components
    @Autowired 
    ItemRepo itmRepo;

    public List<Item> retrieveItemList() {
        return itmRepo.getCartItems();
    }
    
    
}
