package poly2.instance;

public class instanceMain {
    public static void main(String[] args) {
        Parent parent = new Parent();
        Child child = new Child();
        GrandChild grandChild = new GrandChild();

        System.out.println(parent instanceof Parent);
        System.out.println(child instanceof Parent);
        System.out.println(grandChild instanceof Parent);
        // instancof의 왼쪽이 오른쪽에 담길 수 있나?

        System.out.println(parent instanceof Child);
        System.out.println(child instanceof Child);
        System.out.println(grandChild instanceof Child);

        System.out.println(parent instanceof GrandChild);
        System.out.println(child instanceof GrandChild);
        System.out.println(grandChild instanceof GrandChild );
    }
}
