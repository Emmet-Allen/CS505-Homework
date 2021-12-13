public class Person{
    private String firstName;
    private String lastName;
    private int postalCode; 

    Person(){};

    Person(String _firstName, String _lastName, int _postalCode){
        firstName = _firstName;
        lastName = _lastName;
        postalCode = _postalCode; 
    };

    public void setFirstName(String _firstName){
        firstName = _firstName;
    }

    public void setLastName(String _lastName){
        lastName = _lastName;
    }

    public void setpostalCode(int _postalCode){
        postalCode = _postalCode;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName(){
        return lastName; 
    }

    public int getPostalCode(){
        return postalCode; 
    }

    @Override
    public String toString(){
        return this.firstName + "\t" + this.lastName + "\t" + this.postalCode;
    }
}