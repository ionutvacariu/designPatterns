package application.javaRecap.anonymousInnerClass;

public class InnerLocalClass {


    private void getValue() {

    //putem incapsula sa zicem mai multe variabile pe care le facem la nivel de metoda :D...nu am folosit niciodata :-?
        class Clas {
            boolean mm;
            int ccc;
            String ccca;
        }


        Clas cc = new Clas();

        if (cc.mm) {
            System.out.println(cc.ccca);
        }
    }

    public static void main(String[] args) {
        InnerLocalClass innerLocalClass = new InnerLocalClass();
        innerLocalClass.getValue();
    }
}
