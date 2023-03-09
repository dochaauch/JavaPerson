package profJava.cons230210.mochito;

import java.util.Arrays;

public class DataProcessor {
    DataProvider provider;
    public DataProcessor(DataProvider provider) {
        this.provider = provider;
    }

    public Integer getLinesCount()  {
        return provider.getAllData().size();
    }

    public long getWordsCount() {
        return provider.getDataById("words")
                .stream()
                .map(x -> x.split("\\s"))
                .flatMap(x -> Arrays.stream(x))
                .filter(x -> x.length() != 0)
                .count();
    }
}
