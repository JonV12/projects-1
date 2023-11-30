import java.util.ArrayList;

public class Playlist {
    public static void main(String[] args){
        ArrayList<String> desertIslandplaylist = new ArrayList<String>();

        desertIslandplaylist.add("I Can't See");
        desertIslandplaylist.add("DEVOTION");
        desertIslandplaylist.add("505");
        desertIslandplaylist.add("Hot Air Balloon");
        desertIslandplaylist.add("The Less I Know The Better");
        desertIslandplaylist.add("Sleepless");
        desertIslandplaylist.add("KICK BACK");

        System.out.println(desertIslandplaylist);

        System.out.println(desertIslandplaylist.size());

        desertIslandplaylist.remove(5);
        desertIslandplaylist.remove(5);
        System.out.println(desertIslandplaylist);
        System.out.println(desertIslandplaylist.size());

        int a = desertIslandplaylist.indexOf("505");
        int b = desertIslandplaylist.indexOf("The Less I Know The Better");

        String tempA = "505";
        desertIslandplaylist.set(a, "The Less I Know The Better");
        System.out.println(desertIslandplaylist);

        desertIslandplaylist.set(b, tempA);
        System.out.println(desertIslandplaylist);
    }
}
