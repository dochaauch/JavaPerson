package profJava.cons230210.mochito.test;

import org.junit.jupiter.api.Test;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.MockitoAnnotations;
import org.mockito.invocation.InvocationOnMock;
import profJava.cons230210.mochito.DataProcessor;
import profJava.cons230210.mochito.DataProvider;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.*;

public class TestDataProcessor {

    @Mock
    DataProvider provider;

    public TestDataProcessor() {
        MockitoAnnotations.initMocks(this); //инициализация всех мок объектов
    }

    @Test
    public void testGetLinesCount(){

        List<String> data = new ArrayList();
        data.add("test string 1");
        data.add("test string 2");
        data.add("test string 3");
        data.add("test string 4");

        //DataProvider provider = Mockito.mock(DataProvider.class);
        //here we do not call function getAllData, but
        //we are defining what result it will return
        when(provider.getAllData()).thenReturn(data);

        DataProcessor processor = new DataProcessor(provider);
        //System.out.println(provider.getAllData());

        assertEquals(4,processor.getLinesCount());
        verify(provider, times(1)).getAllData();
    }

    @Test
    public void testGetWordsCount(){


        DataProvider provider = Mockito.mock(DataProvider.class);

        when(provider.getDataById(any())).thenAnswer(
                (InvocationOnMock inv) -> {
                    String id =
                        inv.getArgument(0, String.class); //аргумент в нашей функции getDataById
                    switch (id) {
                        case "words":
                            List<String> data = new ArrayList();
                                    data.add("aa aa");
                                    data.add("bb bb");
                                    data.add("cc cc");
                                    data.add("ff ff");
                                    return data;
                        case "word1":
                            List<String> data1 = new ArrayList();
                                data1.add("aa1 aa1");
                                return data1;
                        default:
                            return null;
                    }
                }
        );
        DataProcessor processor = new DataProcessor(provider);
        assertEquals(8L, processor.getWordsCount());
        verify(provider, times(1)).getDataById("words");
    }
}