package main;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import static java.nio.file.Files.lines;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class ReadFileIntoList
{

    public static List<String> readFileInList(String fileName)
    {
        List<String> lines = Collections.emptyList();
        try
        {
            lines = Files.readAllLines(Paths.get(fileName), StandardCharsets.UTF_8);

        } catch (IOException e)
        {
            e.printStackTrace();
        }
        return lines;
    }
    public static void main(String[] args)
    {
        List l = readFileInList("C:\\Users\\m-w-n\\Documents\\NetBeansProjects\\FileHandling3.12\\files\\testFile2.txt");
        
        Iterator<String> itr = l.iterator();
        while (itr.hasNext())
        {
            System.out.println(itr.next());
        }
    }
}
