package org.sochcode.Part2.ch23exploringNIO;

// Display a directory of only those files that are writable.
import java.io.*;
import java.nio.file.*;
import java.nio.file.attribute.*;

class OnlyWritableDirectoryList
{
    public static void main(String[] args)
    {
        String dirname = "\\examples";

        // Create a filter that returns true only for writable files.
        DirectoryStream.Filter<Path> how = new DirectoryStream.Filter<Path>() {
            @Override
            public boolean accept(Path filename) throws IOException
            {
                return Files.isWritable(filename);
            }
        };

        // Obtain and mange a directory stream of writable files.
        try (DirectoryStream<Path> dirstrm = Files.newDirectoryStream(Path.of(dirname), how))
        {
            System.out.println("Directory of " + dirname);

            for (Path entry : dirstrm)
            {
                BasicFileAttributes attribs = Files.readAttributes(entry, BasicFileAttributes.class);

                if (attribs.isDirectory())
                    System.out.print("<DIR>");
                else
                    System.out.print("        ");

                System.out.println(entry.getName(1));
            }
        } catch (InvalidPathException e)
        {
            System.out.println("Path Error " + e);
        } catch (NotDirectoryException e)
        {
            System.out.println(dirname + " is not a directory.");
        } catch (IOException e)
        {
            System.out.println("I/O Error: " + e);
        }
    }
}
