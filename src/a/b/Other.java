package a.b;

public class Other implements ContainerListener{
    public void doHello() {
        System.out.println("Other 物件被加入...");
    }
 
    public void doGoodbye() {
        System.out.println("Other 物件被移除...");
    }
}