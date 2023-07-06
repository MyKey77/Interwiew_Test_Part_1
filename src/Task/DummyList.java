package Task;

import java.util.ArrayList;

public class DummyList implements List {

    private final ArrayList<String> list = new ArrayList<>();

    @Override
    public Node find(String value) {
        return list.contains(value) ? new DummyListNode(value) : null;
    }

    @Override
    public void add(String value) {
        list.add(value);
    }

    @Override
    public void delete(Node element) {
        list.remove(element == null ? null : element.getvalue());
    }

    @Override
    public String[] getValues() {
        return list.toArray(new String[0]);
    }
}
