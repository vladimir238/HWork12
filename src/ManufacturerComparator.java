import java.util.Comparator;

public class ManufacturerComparator implements Comparator<ZipHolod> {


    public int compare(ZipHolod zip1,ZipHolod zip2){
        return zip1.getManufacturer().compareTo(zip2.getManufacturer());
    }

}
