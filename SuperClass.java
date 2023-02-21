package ReflectionAndAnnotation;

public class SuperClass {

  public  void SuperClassMethod(int a, long b, float f){}

  @MethodAnnotation
  public void Meth(){}
    private void SuperPrivatMethod(){}
    protected void SuperProtoctedMethod(){}
    void SuperDefaultMethod(){}
}
