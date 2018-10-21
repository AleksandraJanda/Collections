import java.util.Random;

public class Tablice {
    public static void drukowanieTablicy(int[] tab){
        for (int x:tab) {
            System.out.print(x+"\t");
        }
    }
    public static void zadanie1(int[] tab, int element1, int element2){
        int tymczasowy=tab[element1];
        tab[element1]=tab[element2];
        tab[element2]=tymczasowy;
    }
    public static int[] zadanie2(int n){
        int[] tab = new int[n];
        for(int x=0;x<tab.length;x++){
            n--;
            tab[x]=n;
        }
        return tab;
    }
    public static int[] zadanie3(int n){
        int[] tab = new int[n];
        for(int x=0;x<tab.length;x++){
            tab[x]=x;
        }
        return tab;
    }
    public static int[] zadanie4(int n, int a, int b){
        int[] tab = new int[n];
        Random random = new Random();
        int liczba;
        for(int x=0;x<tab.length;x++) {
            do {
                liczba = random.nextInt(b);
            } while (liczba < a);
            tab[x]=liczba;
        }
        return tab;
    }


    public static void main(String[] args) {
        int[] tab = {1,2,3,4};
        zadanie1(tab, 1,3);
        drukowanieTablicy(tab);
        System.out.println();
        drukowanieTablicy(zadanie2(10));
        System.out.println();
        drukowanieTablicy(zadanie3(10));
        System.out.println();
        drukowanieTablicy(zadanie4(10,1,5));
    }
}
