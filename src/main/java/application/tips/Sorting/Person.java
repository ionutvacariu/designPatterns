package application.tips.Sorting;

public class Person implements Comparable{
    private int varsta;
    private String nume;

    public int getVarsta() {
        return varsta;
    }

    public void setVarsta(int varsta) {
        this.varsta = varsta;
    }

    public String getNume() {
        return nume;
    }

    public void setNume(String nume) {
        this.nume = nume;
    }

    @Override
    public int compareTo(Object o) {
        return 0;
    }
}
