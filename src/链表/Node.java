package 链表;

/**
 * projectName：test
 * name：链表.Node
 * description：todo
 * date：2020/3/14 10:01 上午
 * auther：nidingbo
 */
public class Node {
    //键
    Object key;
    //值
    Object value;
    //上一个节点
    Node pre;
    //下一个节点
    Node next;

    public Node(Object key, Object value) {
        this.key = key;
        this.value = value;
    }
}
