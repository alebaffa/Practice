import java.util.*;

public class BFS {
    /*
    * How many steps to go from x --> y using only two allowed operations:
    *   multiply * 2
    *   subtract -1
    * */
    public static void main(String[] args) {
        int x = 2, y = 5; // distance = 4
        System.out.println(calculateSteps(x, y));
    }

    private static int calculateSteps(int x, int y) {
        int result = 0;
        List<Integer> visited = new ArrayList<>();

        Node first = new Node(x, 0);

        visited.add(x);
        Queue<Node> queue = new ArrayDeque<>();
        queue.add(first);

        while (!queue.isEmpty()) {
            Node node = queue.poll();

            if (node.value == y)
                return node.level;
            if (node.value * 2 == y || node.value - 1 == y)
                return node.level + 1;
            if (!visited.contains(node.value * 2))
                queue.add(new Node(node.value * 2, node.level + 1));
            if (!visited.contains(node.value - 1) && node.value - 1 > 0)
                queue.add(new Node(node.value - 1, node.level + 1));
        }

        return result;
    }

    static class Node {
        int value = 0, level = 0;

        public Node(int value, int level) {
            this.value = value;
            this.level = level;
        }
    }
}