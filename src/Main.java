import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<ZipHolod> zip = new ArrayList<>();
        zip.add(new ZipHolod("Термостат","Danfoss",592534,false));
        zip.add(new ZipHolod("Термостат","Danfoss",591345,false));
        zip.add(new ZipHolod("Термостат","Atea",500644,false));
        zip.add(new ZipHolod("Термостат","Atea",592587,false));
        zip.add(new ZipHolod("Компрессор","Secop",60014056,false));
        zip.add(new ZipHolod("Компрессор","Secop",60009089,false));
        zip.add(new ZipHolod("Компрессор","Danfoss",13416067,false));
        zip.add(new ZipHolod("Компрессор","Danfoss",60014089,false));
        zip.add(new ZipHolod("Компрессор","Danfoss",60020087,false));
        zip.add(new ZipHolod("Таймер","Paragon",12387,false));
        zip.add(new ZipHolod("Таймер","Samsung",13498,false));
        for (ZipHolod a: zip){
            System.out.println(a);
        }


    }
}
