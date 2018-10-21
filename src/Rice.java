import java.util.Scanner;

public class Rice {
    private int shop;
    private int order;

    public void setShop(int shop) {
        this.shop = shop;
    }
    public boolean riceOrder(int shop, int order){
        return shop>order;
    }
    public void riceNewOrder(int shop, int order){
        if (riceOrder(shop, order)) {
            System.out.println("Zamowienie zrealizowane");
        }
    }
    public Rice() {

    }
    public Rice(int shop, int order){
        this.shop=shop;
        this.order=order;
    }

    public static void main(String[] args) {
        System.out.println("Podaj stan magazynu");
        Scanner scanner = new Scanner(System.in);
        int shop = scanner.nextInt();
        Rice rice = new Rice();
        rice.setShop(shop);
        int order;
        do {
            System.out.println("Podaj ilosc ryzu w zamowieniu");
            order = scanner.nextInt();
            rice.riceNewOrder(shop,order);
            shop-=order;
        }while(shop>=order);
        System.out.println("Za malo ryzu w magazynie");
    }
}
