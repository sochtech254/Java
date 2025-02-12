package org.sochcode.Part2.ch23exploringNIO;

// A simple example that uses walkFileTree() to display a directory tree.
import java.io.*;
import java.nio.file.*;
import java.nio.file.attribute.*;

// Create a custom version of SimpleFileVisitor that overrides
// the visitFile() method.
class MyFileVisitor extends SimpleFileVisitor<Path>
{
    @Override
    public FileVisitResult visitFile(Path path, BasicFileAttributes attribs) throws IOException
    {
        System.out.println(path);
        return FileVisitResult.CONTINUE;
    }
}
class DirectoryTreeList
{
    public static void main(String[] args)
    {
        String dirname = "\\examples";

        System.out.println("Directory tree starting with " + dirname + ":\n");

        try
        {
            Files.walkFileTree(Path.of(dirname), new MyFileVisitor());
        } catch (IOException exc) {
            System.out.println("I/O Error");
        }
    }
}
