package poly2.instance;

public class instanceMain2 {
    public static void main(String[] args) {
      Parent[] family = {new Parent(), new Child(), new GrandChild()};

      for (Parent p : family) {
          testInstanceOf(p);
      }
    }   
     static void testInstanceOf(Parent p) {
       p.parentMethod();
       
       if (p instanceof Child) {
           System.out.println("매개 변수로 들어온 p가 Child의 인스턴스가 맞음");
           ((Child) p).childMethod();
       }

       if (p instanceof GrandChild) {
           System.out.println("매개 변수로 들어온 p가 Grandchild의 인스턴스가 맞음");
           ((GrandChild) p).greandChildMethod();
       }
    }
}
