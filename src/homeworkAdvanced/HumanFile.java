package homeworkAdvanced;

import java.io.*;
import java.util.*;

public class HumanFile extends FileString implements ISerializable
{
    private static final String serializationDelimiter = "\n";
    private Vector<Human> humans;
    
    public HumanFile(File file)
    {
        super(file);
        Deserialize(fileString);
    }

    public Vector<Human> getHumans() 
    {
        return humans;
    }
    
    public void addHuman(Human human) 
    {
        this.humans.add(human);
    }
    
    public void removeHuman(Human human) 
    {
        humans.removeElement(human);
    }
    
    public void clear()
    {
        humans.removeAllElements();
    }
    
    @Override
    public void Deserialize(String serializedObject)
    {
        humans = new Vector<>();
        
        if (serializedObject.length() > 0)
        {
            String[] args = serializedObject.split(serializationDelimiter);
        
            for (int i = 0; i < args.length; ++i)
                humans.add(new Human(args[i]));
        }
    }
    
    @Override
    public String Serialize()
    {
        String[] args = new String[humans.size()];
        
        for (int i = 0; i < args.length; ++i)
            args[i] = humans.get(i).Serialize();
        
        this.fileString = String.join(serializationDelimiter, args);
        
        return fileString;
    }
    
    @Override
    public void Save()
    {
        Serialize();
        super.Save();
    }
}
