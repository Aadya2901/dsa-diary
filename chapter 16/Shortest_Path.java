public class Shortest_Path {
    public static float getShortestPath(String path) {
        int x = 0;
        int y = 0;

        for (int i = 0; i < path.length(); i++) {
            char dir = path.charAt(i);

            if (dir == 'N') {
                y++;
            }

            else if (dir == 'S') {
                y--;
            }

            else if (dir == 'E') {
                x++;
            }

            else if (dir == 'W') {
                x--;
            }
        }

        int X2 = x * x;
        int Y2 = y * y;
        return (float) Math.sqrt(X2 + Y2);
    }

    public static void main(String[] args) {
        String path = "WNEENESENNN";

        float shortestDist = getShortestPath(path);
        System.out.println("Shortest distance: " + shortestDist);
    }

}

/*
 * function getShortestPath(path):
 * initialize x = 0, y = 0
 * for each character dir in path:
 * if dir is 'N': y++
 * if dir is 'S': y--
 * if dir is 'E': x++
 * if dir is 'W': x--
 * return sqrt(x^2 + y^2)
 * 
 * Time Complexity (TC):
 * Time: O(n), where n = length of path
 * 
 * Space: O(1), only x and y are used
 */