package org.scoula.app;

public class Main2 {
    public static void main(String[] args) {
        var context = new AnnotationConfigApplicationContext(ProjectConfig2.class);
        Parrot p = context.getBean(Parrot.class); // 예외 발생 !!!
        System.out.println(p.getName());
    }
}