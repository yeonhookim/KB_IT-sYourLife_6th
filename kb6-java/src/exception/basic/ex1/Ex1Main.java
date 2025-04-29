package exception.basic.ex1;

public class Ex1Main {
    static class Parent{}
    static class Child extends Parent{
        void childMethod(){
            System.out.println("자식 메소드");
        }
    }

    public static void main(String[] args) {
        try{
            Parent p = new Parent();
            Child c = (Child)p;
            c.childMethod();
        }
        catch (ClassCastException e){
            System.out.println("예외처리 완료!");
            e.printStackTrace();
        }
    }
}