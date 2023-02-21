package ReflectionAndAnnotations;


import java.lang.reflect.Method;
import java.lang.reflect.Parameter;
import java.util.HashMap;
import java.util.Map;

public class CalculateAnnotation extends MethodsAndParameters {
    private static Map<Class<?>, Integer> analize = new HashMap<>();

    public void DoJob(){

    }

    @MethodsAnnotated
    public String HelloMyAnnotate(){
        return "Hello annotate";
    }

    @MethodsAnnotated
    public void setInt(@ParametersAnnotated int i){
        System.out.println(i);
    }


    public static void main(String[] args) throws NoSuchFieldException, InstantiationException, IllegalAccessException {
        Class<?> clazz = CalculateAnnotation.class;

        int methodCounts = 0;
        int parameterCounts = 0;

        for (Method method : clazz.getMethods()) {
            if (method.isAnnotationPresent(MethodsAnnotated.class)) {
                analize.put(MethodsAnnotated.class, ++methodCounts);
            }
            for (Parameter parameter : method.getParameters()) {
                if (parameter.isAnnotationPresent(ParametersAnnotated.class)) {
                    analize.put(ParametersAnnotated.class, ++parameterCounts);

                }
            }
        }

        System.out.println(analize.toString());
        System.out.println(analize);
        System.out.println(clazz.getSuperclass());
        System.out.println(clazz.getName());


    }

}