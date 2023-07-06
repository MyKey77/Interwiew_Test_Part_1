package Task;

public class SingleLinkedListNode implements Node {
    private String value;
    private SingleLinkedListNode next;

    public SingleLinkedListNode(String value) {
        this.value = value;
        this.next = null;
    }


    @Override
    public String getvalue() {
        //TODO : IMPLEMENT
        return value;
    }

    public SingleLinkedListNode getNext() {
        return next;
    }

    public void setNext(SingleLinkedListNode next) {
        this.next = next;
    }
}
