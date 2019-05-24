import classes.*;
import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.List;

public class MyMain {

    public static void main (String args[]){
//        java-JSON的序列化和反序列化
//        UserSimple userSimple = new UserSimple("Norman","norman@futurestud.io",26,true);
//        Gson gson = new Gson();
//        String userJson = gson.toJson(userSimple);
//        String userJson 0 = "{'age':26,'email':'norman@futurestud.io','isDeveloper':true,'name':'Norman'}";
//        UserSimple userSimple1 = gson.fromJson(userJson 0,UserSimple.class);


//        嵌套对象的序列化和反序列化
//        UserAddress userAddress = new UserAddress(
//                "Main Street",
//                "42A",
//                "Magdeburg",
//                "Germany"
//        );
//        UserNested userNested = new UserNested(
//                "Norman",
//                "norman@futurestud.io",
//                26,
//                true,
//                userAddress
//        );
//        Gson gson = new Gson();
//        String userWithAddresJson = gson.toJson(userNested);
//        String restaurantJson = "{ 'name':'Future Studio Steak House', 'owner':{ 'name':'Christian', 'address':{ 'city':'Magdeburg', 'country':'Germany', 'houseNumber':'42', 'street':'Main Street'}},'cook':{ 'age':18, 'name': 'Marcus', 'salary': 1500 }, 'waiter':{ 'age':18, 'name': 'Norman', 'salary': 1000}}";
//        Restaurant restaurant = gson.fromJson(restaurantJson, Restaurant.class);



//        Arrays和Lists的映射
        List<RestaurantMenuItem> menuItemList = new ArrayList<RestaurantMenuItem>();
        menuItemList.add(new RestaurantMenuItem("Spaghetti",7.99F));
        menuItemList.add(new RestaurantMenuItem("Steak",12.99f));
        menuItemList.add(new RestaurantMenuItem("Salad",5.99f));

        RestaurantWithMenu menu = new RestaurantWithMenu("Future Studio Steak House",menuItemList);
        Gson gson = new Gson();
        String menoJson = gson.toJson(menu);
        String menoJson1 = gson.toJson(menuItemList);
        String founderJson = "[{'name': 'Christian','flowerCount': 1}, {'name': 'Marcus', 'flowerCount': 3}, {'name': 'Norman', 'flowerCount': 2}]";
        Founder[] founderList = gson.fromJson(founderJson, Founder[].class);
//        Type type = new TypeToken<ArrayList<Founder>>(){}.getType();
//        List<Founder> founderList1 = gson.fromJson(founderJson,type);
        Type type = new TypeToken<ArrayList<Founder>>(){}.getType();
        List<Founder> founderList1 = gson.fromJson(founderJson,type);

    }

}
