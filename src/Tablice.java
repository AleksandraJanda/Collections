import java.util.Arrays;
import java.util.Random;

public class Tablice {
    public static void drukowanieTablicy(int[] tab){
        for (int x:tab) {
            System.out.print(x+"\t");
        }
        System.out.println();
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
    } //zadanie3 = zadanie5a
    public static int[] zadanie4(int n, int a, int b){
        int[] tab = new int[n];
        Random random = new Random();
        for(int x=0;x<tab.length;x++) {
            tab[x]=random.nextInt(b-a+1)+a;
        }
        return tab;
    }
    public static int[] zadanie5b(int[] tab){
        int nieparzysty=0;
        for(int x=0;x<tab.length;x++){
            if(tab[x]%2!=0){
                tab[x]+=nieparzysty;
                nieparzysty=tab[x]-nieparzysty;
            }else if(tab[x]>0&&tab[x]%2==0){
                tab[x]/=2;
            }
        }
        return tab;
    } //5b i c
    public static int zadanie5d(int[] tab){
        return Arrays.stream(tab)
                .reduce((a,a2)->a+a2).getAsInt();
    }
    public static int[] zadanie6(int[] tab1, int[] tab2){
        int[] tab = new int[tab1.length];
        for(int x=0;x<tab.length;x++){
            tab[x]=tab1[x]+tab2[x];
        }
        return tab;
    }
    public static int[] zadanie7(int[] tab1, int[] tab2){
        int length = tab1.length;
        if(tab2.length>length){
            length=tab2.length;
        }
        int[] tab_przepisana = new int[length];
        int[] tab_nie = new int[length];
        if(tab1.length!=length){
            for(int x=0;x<tab1.length;x++){
                tab_przepisana[x]=tab1[x];
            }
        }else{
            tab_nie = tab1;
        }
        if(tab2.length!=length){
            for(int x=0;x<tab2.length;x++){
                tab_przepisana[x]=tab2[x];
            }
        }else{
            tab_nie = tab2;
        }
        int[] tab = new int[length];
        for(int x=0;x<tab.length;x++){
            tab[x]=tab_przepisana[x]+tab_nie[x];
        }
        return tab;
    }

    public static void main(String[] args) {
        System.out.println("zadanie1");
        int[] tab = {1,2,3,4};
        zadanie1(tab, 1,3);
        drukowanieTablicy(tab);

        System.out.println("zadanie2");
        drukowanieTablicy(zadanie2(10));

        System.out.println("zadanie3");
        int[] tab3 = zadanie3(10);
        drukowanieTablicy(tab3);
        System.out.println("zadanie4");
        drukowanieTablicy(zadanie4(10,1,9));

        System.out.println("Zadanie 5");
        drukowanieTablicy(tab3);
        int[] tab4 = zadanie5b(tab3);
        drukowanieTablicy(tab4);
        System.out.println("wynik: "+zadanie5d(tab4));

        System.out.println("zadanie6");
        int[] tab6a = zadanie4(5,1,9);
        int[] tab6b = zadanie4(5,1,9);
        drukowanieTablicy(tab6a);
        drukowanieTablicy(tab6b);
        System.out.println("suma tablic");
        drukowanieTablicy(zadanie6(tab6a,tab6b));

        System.out.println("zadanie7");
        int[] tab7a = zadanie4(8,1,9);
        int[] tab7b = zadanie4(2,1,9);
        drukowanieTablicy(tab7a);
        drukowanieTablicy(tab7b);
        System.out.println("suma tablic");
        drukowanieTablicy(zadanie7(tab7a,tab7b));

    }
}
