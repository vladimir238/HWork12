import java.util.Comparator;

public class PriceComparator implements Comparator<ZipHolod> {


        @Override
        public int compare(ZipHolod zip1,ZipHolod zip2){

            return zip1.getPrice()-zip2.getPrice();
        }
    }

