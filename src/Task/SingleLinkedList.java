package Task;


public class SingleLinkedList implements List {
private SingleLinkedListNode head;

    public SingleLinkedList() {
        this.head = null;
    }

    @Override
    public Node find(String value) {
       SingleLinkedListNode currect=head;
       while (currect!=null){
           if(currect.getvalue().equals(value)){
               return currect;
           }
           currect=currect.getNext();
       }
        //TODO : IMPLEMENT
        return null;
    }

    @Override
    public void add(String value) {
        SingleLinkedListNode newNode =new SingleLinkedListNode(value);
        if(head==null){
            head=newNode;
        }else {
            SingleLinkedListNode current=head;
            while (current.getNext() !=null){
                current=current.getNext();
            }
            current.setNext(newNode);
        }
        //TODO : IMPLEMENT
    }

    @Override
    public void delete(Node element) {
        if (head == null) {
            return;
        }
        if (head == element) {
            head = head.getNext();
            return;
        }
        SingleLinkedListNode current = head;
        while (current.getNext() != null) {
            if (current.getNext() == element) {
                current.setNext(current.getNext().getNext());
                return;
            }
            current = current.getNext();
        }
        //TODO : IMPLEMENT
    }

    @Override
    public String[] getValues() {
        //TODO : IMPLEMENT
        int size = getSize();
        String[] values = new String[size];
        SingleLinkedListNode current = head;
        int index = 0;
        while (current != null) {
            values[index] = current.getvalue();
            current = current.getNext();
            index++;
        }
        return values;
    }

    private int getSize() {
        int size = 0;
        SingleLinkedListNode current = head;
        while (current != null) {
            size++;
            current = current.getNext();
        }
        return size;
    }
}
