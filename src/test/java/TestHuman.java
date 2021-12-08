import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class TestHuman {
    @Test
    public void testSetID(){
        Human man=new Human();
        man.setID(1234);
        assertEquals(man.getID(), 1234);
    }
    @Test
    public void testSetName(){
        Human man=new Human();
        man.setName("Sasha");
        assertEquals(man.getName(), "Sasha");
    }
    @Test
    public void testSetGender(){
        Human man=new Human();
        man.setGender("Female");
        assertEquals(man.getGender(), "Female");
    }
    @Test
    public void testSetDivision(){
        Human man=new Human();
        man.setDivision("OOO++");
        assertEquals(man.getDivisionName(), "OOO++");
    }
    @Test
    public void testSetBirthdayDate(){
        Human man=new Human();
        man.setDateBirthday("14.08.2001");
        assertEquals(man.getDateBirthday(), "14.08.2001");
    }
    @Test
    public void testSetSalary(){
        Human man=new Human();
        man.setSalary(10000000);
        assertEquals(man.getSalary(), 10000000);
    }
}