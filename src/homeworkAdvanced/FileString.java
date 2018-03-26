package homeworkAdvanced;

import java.io.*;

public class FileString 
{
    protected File file;
    protected String fileString;

    public FileString(File file) 
    {
        try
        {
            FileReader reader = new FileReader(file);

            int fileSize = 0;
            while(reader.read() != - 1)
                fileSize++;

            reader = new FileReader(file);
            char[] temporaryBuffer = new char[fileSize];
            int readStuff = reader.read(temporaryBuffer);
            
            if (readStuff != fileSize)
                throw new IOException("Nesutampa nuskaitytu ir numatytu simboliu skaicius");
            
            this.fileString = new String(temporaryBuffer);
            this.file = file;
        }
        catch(IOException e)
        {
            System.out.println(e);
        }
    };

    public String getFileString() {
        return fileString;
    }
    
    public void setFileString(String fileString) {
        this.fileString = fileString;
    }

    public File getFile() {
        return file;
    }
    
    public void Save()
    {
        try
        {
            FileWriter writer = new FileWriter(file);
            writer.write(fileString);
            writer.close();
        }
        catch(IOException e)
        {
            System.out.println(e);
        }
    }

    @Override
    public String toString()
    {
        return fileString;
    }
}