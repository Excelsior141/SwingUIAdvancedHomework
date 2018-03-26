package homeworkAdvanced;

import java.time.LocalDate;

public class Human implements ISerializable
{
    private static final String serializationDelimiter = "<arg>";
    private static final String emptyArg = "null";
    
    public static enum Gender
    {
        Male,
        Female
    };
    
    public static enum Variables
    {
        FirstName,
        LastName,
        BirthDate,
        Money,
        Gender
    }

    private String firstName;
    private String lastName;
    private LocalDate birthDate;
    private double money;
    private Gender gender;

    public Human(String firstName, String lastName, LocalDate birthDate, double money, Gender gender)
    {
        this.firstName = firstName;
        this.lastName = lastName;
        this.birthDate = birthDate;
        this.money = money;
        this.gender = gender;
    }
    
    public Human(String serializedObject)
    {
        Deserialize(serializedObject);
    }

    @Override
    public void Deserialize(String serializedObject)
    {
        String[] args = serializedObject.split(serializationDelimiter);

        this.firstName = args[Variables.FirstName.ordinal()].compareTo(emptyArg) != 0 ? args[Variables.FirstName.ordinal()] : null;
        this.lastName = args[Variables.LastName.ordinal()].compareTo(emptyArg) != 0 ? args[Variables.LastName.ordinal()] : null;
        this.birthDate = args[Variables.BirthDate.ordinal()].compareTo(emptyArg) != 0 ? LocalDate.parse(args[Variables.BirthDate.ordinal()]) : null;
        this.money = args[Variables.Money.ordinal()].compareTo(emptyArg) != 0 ? Double.parseDouble(args[Variables.Money.ordinal()]) : 0.0;
        this.gender = args[Variables.Gender.ordinal()].compareTo(emptyArg) != 0 ? Gender.valueOf(args[Variables.Gender.ordinal()]) : null;
    }

    @Override
    public String Serialize()
    {
        String[] args = new String[Variables.values().length];

        args[Variables.FirstName.ordinal()] = (this.firstName != null ? this.firstName : emptyArg);
        args[Variables.LastName.ordinal()] = (this.lastName != null ? this.lastName : emptyArg);
        args[Variables.BirthDate.ordinal()] = (this.birthDate != null ? this.birthDate.toString() : emptyArg);
        args[Variables.Money.ordinal()] = Double.toString(this.money);
        args[Variables.Gender.ordinal()] = (this.gender != null ? this.gender.toString() : emptyArg);
        
        return String.join(serializationDelimiter, args);
    }
    
    public static String getSerializedStringWithArgs(Object[] args)
    {
        if (args.length != Variables.values().length)
            return null;
        
        String[] stringArgs = new String[args.length];

        for (int i = 0; i < args.length; ++i)
        {
            if (args[i] != null)
                stringArgs[i] = args[i].toString();
            else
                stringArgs[i] = emptyArg;
        }

        return String.join(serializationDelimiter, stringArgs);
    }
    
    public void setMoney(double money) {
        this.money = money;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public LocalDate getBirthDate() {
        return birthDate;
    }

    public double getMoney() {
        return money;
    }

    public Gender getGender() {
        return gender;
    }
}
