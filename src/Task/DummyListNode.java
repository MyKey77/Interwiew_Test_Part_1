package Task;

public class DummyListNode implements Node{

    private final String value;

    public DummyListNode(String value) {
        this.value = value;
    }

    @Override
    public String getvalue() {
        return value;
    }
}
