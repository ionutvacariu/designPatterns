package application.tips.SameAttributeValueBaseDerived;

import javax.swing.plaf.basic.BasicEditorPaneUI;

public class Main {
    public static void main(String[] args) {
        Derived b = new Derived();

        System.out.println(b.i);

        Base bb = b;


        System.out.println(bb.i);
    }
}
