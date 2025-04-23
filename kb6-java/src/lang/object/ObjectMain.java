package lang.object;

import java.sql.SQLOutput;

public class ObjectMain {
    public static void main(String[] args) {
        Child child = new Child();

        child.parentMethod(); //상속 받은 메서드
        child.childMethod(); //본인

        System.out.println(child.toString());
        System.out.println(Integer.toHexString(child.hashCode()));
         }}
