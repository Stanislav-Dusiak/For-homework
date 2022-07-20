package homework;


import java.util.AbstractMap;
import java.util.Map;
import java.util.TreeMap;

public class CustomerService {

    TreeMap<Customer, String> treeMap = new TreeMap<>();
    TreeMap<Customer, String> treeMapCopy = new TreeMap<>();

    public Map.Entry<Customer, String> getSmallest() {
        treeMapCopy.putAll(treeMap);
        Map.Entry<Customer, String> customerStringEntry = treeMapCopy.firstEntry();
        Customer customer = new Customer(customerStringEntry.getKey().getId(), customerStringEntry.getKey().getName(), customerStringEntry.getKey().getScores());
        String value = customerStringEntry.getValue();
        treeMap.remove(customer, value);
        return new AbstractMap.SimpleEntry<>(customer, value);
    }

    public Map.Entry<Customer, String> getNext(Customer customer) {
        return treeMap.pollFirstEntry();
    }

    public void add(Customer customer, String data) {
        treeMap.put(customer, data);
    }
}
