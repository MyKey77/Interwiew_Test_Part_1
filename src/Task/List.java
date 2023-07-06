package Task;

public interface List {
    Node find(String value);

    void add(String value);

    void delete(Node element);

    String[] getValues();
}
