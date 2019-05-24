package classes;

import java.util.List;

public class RestaurantWithMenu {

    String name;
    List<RestaurantMenuItem> menuItemList;

    public RestaurantWithMenu(String name, List<RestaurantMenuItem> menuItemList){
        this.name = name;
        this.menuItemList = menuItemList;
    }

}
