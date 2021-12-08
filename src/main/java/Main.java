import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        CSVReaderLineByLine readerLineByLine = new CSVReaderLineByLine();
        List<Human> collection = new ArrayList<>();
        readerLineByLine.Input(collection);
        readerLineByLine.Output(collection);
    }
}
