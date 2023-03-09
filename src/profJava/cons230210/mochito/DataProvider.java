package profJava.cons230210.mochito;

import java.util.List;

public interface DataProvider {
    public List<String> getDataById(String id);
    public List<String> getAllData();
}
