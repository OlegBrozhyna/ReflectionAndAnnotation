package ReflectionAndAnnotations;

import java.util.Random;

public class MethodsAndParameters extends FirstClassAnnotate {

    Random random = new Random();

    public String getName (@ParametersAnnotated String name){
        return "Name" +name;
    }
    public void Random(){

    }
    @MethodsAnnotated
    public void getString(){
        System.out.println("name");
    }
    public int randomInt(){
        return randomInt();
    }
    public double  randomDouble
            (@ParametersAnnotated double i){
        return randomDouble(i);
    }
    @MethodsAnnotated
    public long randomLong(long i){
        return random.nextLong(i);
    }
}
