/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

import java.io.IOException;
import java.nio.file.DirectoryNotEmptyException;
import java.nio.file.Files;
import java.nio.file.NoSuchFileException;
import java.nio.file.Paths;

/**
 *
 * @author m-w-n
 */
public class Test
{
    public static void main(String[] args)
    {
        try
        {
            Files.deleteIfExists(Paths.get("C:\\Users\\m-w-n\\Documents\\NetBeansProjects\\FileHandling3.12\\files\\testFile2.txt"));
        }catch(NoSuchFileException e)
        {
            System.out.println("No such file/directory exists");
        }catch(DirectoryNotEmptyException e)
        {
            System.out.println("Directory is not empty.");
        }catch(IOException e)
        {
            System.out.println("Invalid permissions.");
        }
        System.out.println("Deletion successful.");
    }
}
