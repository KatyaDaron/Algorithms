import java.util.HashSet;
import java.util.Set;

public class PathCrossing {

    static boolean isPathCrossing(String path) {
        Set coordinates = new HashSet<>();
        int x = 0;
        int y = 0;
        coordinates.add("0, 0");

        for (int i = 0; i < path.length(); i++) {
            if (path.substring(i, i + 1).equals("N")) {
                x++;
                if (coordinates.contains(String.valueOf(x + ", " + y))) {
                    return true;
                } else {
                    coordinates.add(String.valueOf(x + ", " + y));
                }
            }
            if (path.substring(i, i + 1).equals("S")) {
                x--;
                if (coordinates.contains(String.valueOf(x + ", " + y))) {
                    return true;
                } else {
                    coordinates.add(String.valueOf(x + ", " + y));
                }
            }
            if (path.substring(i, i + 1).equals("W")) {
                y--;
                if (coordinates.contains(String.valueOf(x + ", " + y))) {
                    return true;
                } else {
                    coordinates.add(String.valueOf(x + ", " + y));
                }
            }
            if (path.substring(i, i + 1).equals("E")) {
                y++;
                if (coordinates.contains(String.valueOf(x + ", " + y))) {
                    return true;
                } else {
                    coordinates.add(String.valueOf(x + ", " + y));
                }
            }
        }
        return false;
    }

    public static void main(String[] args) {

        System.out.println(isPathCrossing("NEEEEEEEEEENNNNNNNNNNWWWWWWWWWW"));
    }
}
