package application.javaRecap.anonymousInnerClass;

public class AnonymousInnerClass {

     void metoda(){
        System.out.println("Metoda din anonym inner class");
    }
}

class Demo{


   static   AnonymousInnerClass anonymousInnerClass = new AnonymousInnerClass(){
        void metoda(){
            super.metoda();
            System.out.println("wtf is happening here");
        }

    };


    public static void main(String[] args) {
        anonymousInnerClass.metoda();

    }

}
