package nested.anonymous;

public class AnonymousOuter {
   private String outerInstsance = "outerInstance";

   public void outerMethod() {
       String methodString = "methodString";

       class LocalInner implements Print {
           @Override
           public void printlocal() {
               System.out.println(outerInstsance);
               System.out.println(methodString);

           }
       }

       LocalInner localInner = new LocalInner();
       localInner.printlocal();

   }

    public static void main(String[] args) {
      AnonymousOuter anonymousOuter = new AnonymousOuter();
      anonymousOuter.outerMethod();
    }
}
