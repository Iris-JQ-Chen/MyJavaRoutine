import classes.UserSimple;
import com.google.gson.Gson;

public class MyMain {

    public static void main (String args[]){
        UserSimple userSimple = new UserSimple("Norman","norman@futurestud.io",26,true);
        Gson gson = new Gson();
        String userJson = gson.toJson(userSimple);
        String userJson 0 = "{'age':26,'email':'norman@futurestud.io','isDeveloper':true,'name':'Norman'}";
        UserSimple userSimple1 = gson.fromJson(userJson 0,UserSimple.class);


    }

}
