import java.util.*;

public class Main {
    public static void main(String[] args) {

        String nameSearch = "Термостат";
        ZipHolod zip1 = new ZipHolod("Термостат", "Danfoss", 350, false);
        ZipHolod zip2 = new ZipHolod("Термостат", "Danfoss", 350, true);
        ZipHolod zip3 = new ZipHolod("Термостат", "Atea", 400, true);
        ZipHolod zip4 = new ZipHolod("Термостат", "Atea", 250, true);
        ZipHolod zip5 = new ZipHolod("Компрессор", "Secop", 3600, true);
        ZipHolod zip6 = new ZipHolod("Компрессор", "Secop", 3600, false);
        ZipHolod zip7 = new ZipHolod("Компрессор", "Danfoss", 3100, true);
        ZipHolod zip8 = new ZipHolod("Компрессор", "Danfoss", 2800, false);
        ZipHolod zip9 = new ZipHolod("Компрессор", "Danfoss", 4500, true);
        ZipHolod zip10 = new ZipHolod("Таймер", "Paragon", 700, true);
        ZipHolod zip11 = new ZipHolod("Таймер", "Samsung", 480, true);
        ArrayList<ZipHolod> zipList = new ArrayList<>();
        zipList.add(zip1);
        zipList.add(zip2);
        zipList.add(zip3);
        zipList.add(zip4);
        zipList.add(zip5);
        zipList.add(zip6);
        zipList.add(zip7);
        zipList.add(zip8);
        zipList.add(zip9);
        zipList.add(zip10);
        zipList.add(zip11);

        for (ZipHolod a : zipList) {
            System.out.println(a);
        }

        System.out.println("\n\n  Вывод сортированного массива по полю производитель  \n\n");
     //   PriceComparator priceComparator = new PriceComparator();

        zipList.sort(new ManufacturerComparator());
        for (ZipHolod a : zipList) {
            System.out.println(a);
        }
        Iterator<ZipHolod> iterator = zipList.iterator();
        while (iterator.hasNext()) {
            ZipHolod zip = iterator.next();
            if (!zip.getName().equals(nameSearch) || !zip.isАvailability()) {
           //     !zip.getName().equals(nameSearch)  &&
                iterator.remove();
            }
        }

        System.out.println("\n\n\n");


        zipList.sort(new PriceComparator());
        Collections.sort(zipList,new PriceComparator());
        for (ZipHolod a : zipList) {
            System.out.println(a);
        }

    }
}
