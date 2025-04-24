package nested.anonymous;

public class AnonymousOuter2 {
   private String outerInstsance = "outerInstance";

   public void outerMethod() {
       String methodString = "methodString";

       Print print = new Print() {
           @Override
           public void printlocal() {
               System.out.println(outerInstsance);
               System.out.println(methodString);

           }
       };

      print.printlocal();

   }

    public static void main(String[] args) {
      AnonymousOuter2 anonymousOuter = new AnonymousOuter2();
      anonymousOuter.outerMethod();
    }
}
