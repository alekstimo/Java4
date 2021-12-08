import com.opencsv.*;
import com.opencsv.exceptions.CsvValidationException;
import java.io.*;
import java.util.Collection;
import java.util.List;


public class CSVReaderLineByLine {
    /**
     * this function adds items to the collection
     * @param collection means the collection to be filled
     */
    public void Input(Collection<Human> collection) {
        try (InputStream in = getClass().getClassLoader().getResourceAsStream("foreign_names.csv")) {
            CSVParser csvParser = new CSVParserBuilder().withSeparator(';').build();
            CSVReader reader = in == null ? null : new CSVReaderBuilder(new InputStreamReader(in)).withCSVParser(csvParser).build();
            if (reader == null) {
                throw new FileNotFoundException("foreign_names.csv");
            }
            String[] nextLine;
            while ((nextLine = reader.readNext()) != null) {
               Human human=new Human();
               human.setID(Integer.parseInt(nextLine[0].trim()));
               human.setName(nextLine[1]);
               human.setGender(nextLine[2]);
               human.setDateBirthday(nextLine[3]);
               human.setDivision(nextLine[4]);
               human.setSalary(Integer.parseInt(nextLine[5].trim()));
               collection.add(human);
            }
        } catch (IOException e) {
            e.printStackTrace();
        } catch (CsvValidationException e) {
            e.printStackTrace();
        }

    }

    /**
     * this function print collection to the console
     * @param collection means the collection which will be printed
     */
    public void Output(List<Human> collection){
        System.out.println("ID        Name        Gender    BirhDate   DivID     DivName   Salary ");
       for(int i=0;i< collection.size();i++){
            Human man = collection.get(i);
            System.out.println(man.toString());
        }
    }
}
