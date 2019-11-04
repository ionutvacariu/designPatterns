package application;

public class Main {
    public static void main(String[] args) {
        int v[] = {0, 1, 2, 0, 0, 3, 4};

        int i = 0;
        int sw = 0;
        int n = 6;


        for (i = 0; i <= n; i++) {
            if (v[i] == 0) {
                sw = v[i];
                v[i] = v[n - 1];
                v[n - 1] = sw;

                n--;
            }
        }
        n = v.length;
        for (i = 0; i <= n-1; i++) {
            System.out.print(v[i] + " ");
        }
    }
}
