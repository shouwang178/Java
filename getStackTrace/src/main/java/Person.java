public class Person {
    private int age;

    public void setAge(int age) {
        this.age = age;
        StackTraceElement[] stack = Thread.currentThread().getStackTrace();
        for(int i=0; i<stack.length; i++){
            System.out.print(stack[i].getClassName()+" 。"+stack[i].getMethodName()+"-----");
        }
    }
}
