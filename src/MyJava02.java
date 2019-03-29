import java.io.*;

public class MyJava02 {

    public static void main(String args[]){

    }

    public String fun2 (InputStream inputStream) throws IOException {
        InputStreamReader inputStreamReader = null;
        inputStreamReader = new InputStreamReader(inputStream, "UTF-8");
        BufferedReader reader = new BufferedReader(inputStreamReader);
        StringBuffer sb = new StringBuffer("");
        String line;

        while ((line = reader.readLine()) != null) {
            sb.append(line);
            sb.append("\n");
        }
        String string = sb.toString();
        return string;
    }

    public String fun1 (InputStream inputStream){
        InputStreamReader inputStreamReader = null;
        try {
            inputStreamReader = new InputStreamReader(inputStream, "UTF-8");
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
        }
        BufferedReader reader = new BufferedReader(inputStreamReader);
        StringBuffer sb = new StringBuffer("");
        String line = new String();

        while (true) {
            try {
                if (!((line = reader.readLine()) != null)) break;
            } catch (IOException e) {
                e.printStackTrace();
            }
            sb.append(line);
            sb.append("\n");
        }
        String string = sb.toString();
        return string;
    }

}
