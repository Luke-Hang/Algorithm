package algorithm.algorithm.hashtable;

/**
 * @author xiehang
 * @date 2023/4/13 22:27
 */
public class Student {

    private Integer id;
    private String name;

    Student(Integer id, String name) {
        this.id = id;
        this.name = name;
    }

    public String toString() {
        return "[id=" + id + ", name=" + name + "]";
    }
}
