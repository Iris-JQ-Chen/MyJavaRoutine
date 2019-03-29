import java.util.Scanner;

public class MyJava01 {

    public static void main (String args[]){
        Button btn1 = new Button();
        btn1.setOnClickListener(new OnClickListener() {
            @Override
            public boolean onClick() {
                Scanner scanner = new Scanner(System.in);
                if (scanner.next().equals("ok")){
                    return true;
                }else {
                    return false;
                }
            }
        });
    }

}

abstract class OnClickListener{
    public OnClickListener(){}
    public abstract boolean onClick();
}

class Button{
    public Button(){}
    public void setOnClickListener(OnClickListener onClickListener){
        if (onClickListener.onClick()){
            System.out.println("真");
        }else {
            System.out.println("假");
        }
    }
}
