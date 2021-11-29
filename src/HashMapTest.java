import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class HashMapTest {
    public static void main(String[] args) {
        Product p1 = new Product("11111","Kitkat",39);
        Product p2 = new Product("22222","Snickers",40);
        Product p3 = new Product("33333","Hersheys",60);
        Product p4 = new Product("44444","Butterfinger",80);
        Product p5 = new Product("11111","Coffee",80);

        HashMap<String, Product> list = new HashMap<>();
        Product p  = list.putIfAbsent(p1.getBarcode(),p1);
        System.out.println(p);
        System.out.println(list);
        Product q = list.putIfAbsent(p5.getBarcode(),p5);
        System.out.println(q);
        System.out.println(list);
        list.replace(p5.getBarcode(), p5);
        System.out.println(list);

        System.out.println(list.containsValue(p5));

//        list.putIfAbsent(p2.getBarcode(),p2);



//        list.put(p3.getBarcode(),p3);
//        list.put(p4.getBarcode(),p4);
//        list.put(p5.getBarcode(), p5);
//        System.out.println(list);




        Scanner input = new Scanner(System.in);

//        System.out.print("Enter a barcode : ");
//        String barcode = input.nextLine();
//
//        Product p = list.get(barcode);
//
//        if ( p == null ) {
//            System.out.println("Barcode not found");
//        } else {
//            System.out.println("Name : " + p.getName() );
//            System.out.println("Price : " + p.getPrice() );
//        }

//        for ( String key : list.keySet() ) {
//            System.out.println(key);
//        }
//
//        for ( Product p : list.values() ) {
//            System.out.println(p);
//        }
//
//        for (Map.Entry<String, Product> entry : list.entrySet()) {
//            Product p = entry.getValue();
////            System.out.println(entry.getKey()  + " "  + entry.getValue().getName());
//            System.out.println(entry.getKey()  + " "  + p.getName());
//        }


    }
}
