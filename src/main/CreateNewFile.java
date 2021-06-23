/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

import java.io.File;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.Arrays;
import java.util.List;


public class CreateNewFile
{
    public static void main(String[] args) throws IOException
    {
        createFileUsingFileClass();
        createFileUsingFileOutputStreamClass();
        createFileIn_NIO();
    }
    private static void createFileUsingFileClass() throws IOException
    {
        File file = new File("C:\\Users\\m-w-n\\Documents\\NetBeansProjects\\FileHandling3.12\\files\\testFile1.txt");
        
        //Create the file
        if(file.createNewFile())
        {
            System.out.println("File is create!");
        }else
        {
            System.out.println("File already exists.");
        }
        
        //Write content
        FileWriter writer = new FileWriter(file);
        writer.write("Test data");
        writer.close();
    }
    
    private static void createFileUsingFileOutputStreamClass() throws IOException
    {
        String data = "Test data";
        FileOutputStream out = new FileOutputStream("C:\\Users\\m-w-n\\Documents\\NetBeansProjects\\FileHandling3.12\\files\\testFile2.txt");
        out.write(data.getBytes());
        out.close();
    }
    private static void createFileIn_NIO() throws IOException
    {
        String data = "Test data";
        Files.write(Paths.get("C:\\Users\\m-w-n\\Documents\\NetBeansProjects\\FileHandling3.12\\files\\testFile3.txt"), data.getBytes());
        List<String> lines = Arrays.asList("1st line", "2nd line");
        Files.write(Paths.get("file6.txt"), lines, StandardCharsets.UTF_8, StandardOpenOption.CREATE, StandardOpenOption.APPEND);
    }
}
