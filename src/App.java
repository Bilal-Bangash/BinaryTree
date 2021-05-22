public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");
    }
}

class Node {
    int key;
    String name;
    Node leftChild;
    Node rightChild;

    // constructor
    Node(int key, String name) {

        this.key = key;

    }
}
