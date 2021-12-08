


public class Human {
   private int ID;
   private String Name;
   private String Gender;
   public class Division {
        int ID;
        String Name;

       /**
        * setting name of division and ID
        * @param name string
        */
       public void setName(String name) {
           this.Name = name;
           this.ID=Name.hashCode(); //setID
       }

       /**
        *
        * @return name of division in string
        */
       public String getName() {
           return Name;
       }

       /**
        *
        * @return ID in int
        */
       public int getID() {
           return ID;
       }

   }
   private Division division=new Division();
    private int Salary;
    private String DateBirthday;

    /**
     * return ID of human
     * @return ID in int
     */
    public int getID(){
        return ID;
    }

    /**
     *
     * @param ID int
     */
    public void setID(int ID) {
        this.ID = ID;
    }

    /**
     *
     * @return Name string
     */
    public String getName() {
        return Name;
    }

    /**
     *
     * @param name of Human
     */
    public void setName(String name) {
        this.Name = name;
    }

    /**
     *
     * @return gender in string
     */
    public String getGender() {
        return Gender;
    }

    /**
     *
     * @param gender in string
     */
    public void setGender(String gender) {
        this.Gender = gender;
    }

    /**
     *
     * @return salary in int
     */
    public int getSalary() {
        return Salary;
    }

    /**
     *
     * @param salary in int
     */
    public void setSalary(int salary) {
        this.Salary = salary;
    }

    /**
     *
     * @return date Birthday in string
     */
    public String getDateBirthday() {
        return DateBirthday;
    }

    /**
     *
     * @param dateBirthday in string
     */
    public void setDateBirthday(String dateBirthday) {
        this.DateBirthday = dateBirthday;
    }

    /**
     *
     * @return Name of Division in string
     */
    public String getDivisionName(){
        return division.getName();
    }

    /**
     *
     * @return ID of division in int
     */
    public int getDivisionId(){
        return division.getID();
    }

    /**
     *
     * @param name of Division in string
     */
    public void setDivision(String name) {
        this.division.setName(name);
    }
    @Override
    public String toString() {
    return String.format("%-10d",ID)+String.format("%-12s",Name)+String.format("%-10s",Gender)+String.format("%-11s",DateBirthday)+String.format("%-10d",getDivisionId())+String.format("%-10s",getDivisionName())+String.format("%-10d",Salary);
    }
}
