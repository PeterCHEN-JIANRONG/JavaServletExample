package a.b;

public class Some implements ContainerListener {
    public void doHello() {
        System.out.println("Some 物件被加入...");
    }
 
    public void doGoodbye() {
        System.out.println("Some 物件被移除...");
    }
}
