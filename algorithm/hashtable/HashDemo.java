package algorithm.algorithm.hashtable;

import static java.util.Objects.hash;

/**
 * @author xiehang
 * @date 2024/8/10 11:33
 */
public class HashDemo {
    public static void main(String[] args) {
        int[] capacity = new int[100];
        int key1 = 11;
        int key2 = 12;
        int key3 = 18;




/*        int hash = hash(key3);
        int index = hash % (capacity.length);
        System.out.println(index);*/

        System.out.println("key1 index" + hash(key1) % capacity.length);
        System.out.println("key2 index" + hash(key2) % capacity.length);
        System.out.println("key3 index" + hash(key3) % capacity.length);


        int key4 = 12836;
        int key5 = 20336;
        System.out.println("============================================");
        System.out.println("hash碰撞 index="+hash(key4)%capacity.length);
        System.out.println("hash碰撞 index="+hash(key5)%capacity.length);
    }
}
