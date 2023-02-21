package ReflectionAndAnnotation;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Parameter;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class Calculate {



                     //Variant1
    public static void main(String[] args) throws InvocationTargetException, IllegalAccessException {
        Map<Method, Integer> annotatedMethods = new HashMap<>();
        Map<Parameter, Integer> annotatedParameter = new HashMap<>();

        for (Class<?> clazz = MethodAnnotation.class; clazz != null; clazz.getSuperclass()) {
            for (Method method : clazz.getDeclaredMethods()) {
                if (method.isAnnotationPresent(MethodAnnotation.class)) {
                    annotatedMethods.put(method, annotatedMethods.size());

                    System.out.println(method.getName());
                }
            }
        }
        System.out.println();
    }
}
                                   // Variant2
//     public static void main(String[] args) {
//
//        Set<Method> annotatedMethods = new HashSet<>();
//        Set<Parameter> annotatedParameters = new HashSet<>();
//        for (Class<?> clazz = MethodAnnotation.class; clazz != null; clazz.getSuperclass()) {
//            for (Method method : clazz.getDeclaredMethods()) {
//                if (method.isAnnotationPresent(MethodAnnotation.class)) {
//                    annotatedMethods.add(method);
//                }
//                for (Parameter parameter : method.getParameters()) {
//                    if (parameter.isAnnotationPresent(ParameterAnnotation.class)) {
//                        annotatedParameters.add(parameter);
//                    }
//                }
//            }
//            System.out.println("Annotated Parameters : " + annotatedParameters.size());
//            System.out.println("Annotated Methods : " + annotatedMethods.size());
//
//            break;
//        }
//    }
//}
                               //Variant3
//  private final Map<Class<?>, Integer> counts = new HashMap<>();
////
////    public Calculate() {
////        counts.put(MethodAnnotation.class, 0);
////        counts.put(ParameterAnnotation.class, 0);
////    }
////    public Map<Class<?>, Integer> countMethodAndParameters(Class<?> clazz) {
////        if (clazz != Object.class) {
////            for (Method method : clazz.getDeclaredMethods()) {
////                if (method.isAnnotationPresent(MethodAnnotation.class)) {
////                    counts.computeIfPresent(MethodAnnotation.class, (k, v) -> ++v);
////                }
////                for (Parameter parameter : method.getParameters()) {
////                    if (parameter.isAnnotationPresent(ParameterAnnotation.class)) {
////                        counts.computeIfPresent(ParameterAnnotation.class, (k, v) -> ++v);
////                    }
////                }
////            }
////            countMethodAndParameters(clazz.getSuperclass());
////        }
////        return counts;
////    }
////}





