public class Main {
    public static void main(String[] args) {

        BST<Integer, String> bst = new BST<Integer, String>();

        bst.put(7, "dayana");
        bst.put(5, "aliya");
        bst.put(13, "saule");
        bst.put(10, "aruzhan");
        bst.put(8, "ayana");

        System.out.println("the size of bst is: "+bst.size());
        System.out.println("value of key 4: "+bst.get(4));
        System.out.println("value of key 1: "+bst.get(1));

        bst.delete(2);
        bst.delete(3);
        System.out.println("size after deletion is: "+bst.size());

        System.out.println("keys in bst in ascending order: ");
        for (Integer key : bst.iterator()) {
            System.out.println(key);
        }

    }
}