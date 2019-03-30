import com.sun.xml.internal.bind.v2.schemagen.xmlschema.Annotation;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class Main_04 {

    public static void main (String args[]){
       Main_04 main04 = new Main_04();
       main04.onConstructors();
    }

    public void onConstructors() {
        Record record = new Record();
        Class<? extends Record> recordC = record.getClass();

        Constructor[] declaredConstructors = recordC.getDeclaredConstructors();
        for(int i = 0;i < declaredConstructors.length; i++){
            Constructor constructor = declaredConstructors[i];
            if (constructor
                    .isAnnotationPresent(Constructor_Annotation.class)){
                Constructor_Annotation ca = (Constructor_Annotation)constructor
                        .getAnnotation(Constructor_Annotation.class);
                System.out.println(ca.value());
            }
            Annotation[][] parameterAnnotations = (Annotation[][]) constructor
                    .getParameterAnnotations();
            for(int j = 0;j < parameterAnnotations.length; j++){
                int length = parameterAnnotations[j].length;
                if (length == 0){
                    System.out.println("\t未添加Annotation的参数");
                }else {
                    for (int k = 0;k < length;k++){
                        Field_Method_Parameter_Annotation pa =
                                (Field_Method_Parameter_Annotation)
                                        parameterAnnotations[j][k];
                        System.out.print("\t"+pa.describe());
                        System.out.println("\t"+pa.type());
                    }
                }
            }
            System.out.println();
        }
    }

    public void onFields(){

        Record record = new Record();
        Class recordC = record.getClass();

        Field[] declaredFields = recordC.getDeclaredFields();
        for (int i = 0;i < declaredFields.length; i++){
            Field field = declaredFields[i];
            if (field.isAnnotationPresent(
                    Field_Method_Parameter_Annotation.class
            )){
                Field_Method_Parameter_Annotation fa = field
                        .getAnnotation(Field_Method_Parameter_Annotation.class);
                System.out.print("\t"+fa.describe());
                System.out.println("\t"+fa.type());
            }
        }

    }

    public void onMethods(){

        Record record = new Record();
        Class recordC = record.getClass();

        Method[] methods = recordC.getDeclaredMethods();

        for(int i = 0;i < methods.length; i++){
            Method method = methods[i];
            if (method
            .isAnnotationPresent(Field_Method_Parameter_Annotation.class
            )){
                Field_Method_Parameter_Annotation ma = method
                        .getAnnotation(Field_Method_Parameter_Annotation.class);
                System.out.print(ma.describe());
                System.out.println(ma.type());
            }
            java.lang.annotation.Annotation[][] parameterAnnotations = method
                    .getParameterAnnotations();
            for(int j = 0;j < parameterAnnotations.length;j++){
                int length = parameterAnnotations[j].length;
                if (length == 0){
                    System.out.println("\t未添加Annotation的参数");
                }else {
                    for(int k = 0;k < length; k++){
                        Field_Method_Parameter_Annotation pa =
                                (Field_Method_Parameter_Annotation)
                                parameterAnnotations[i][k];
                        System.out.print("\t"+pa.describe());
                        System.out.println("\t"+pa.type());
                    }
                }
            }
        }

    }
}
