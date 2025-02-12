package org.sochcode.Part2.ch22inputOutputExploringJavaDotInputOutput;

// Directory of .txt files
import java.io.*;

class OnlyExt implements FilenameFilter
{
    String ext;

    public OnlyExt(String ext)
    {
        this.ext = "." + ext;
    }

    @Override
    public boolean accept(File dir, String name) {
        return name.endsWith(ext);
    }
}

class DirectoryListOnly
{
    public static void main(String[] args)
    {
        String dirname = "/home/sochtech/Documents";
        File f1 = new File(dirname);
        FilenameFilter only = new OnlyExt("txt");
        String[] s = f1.list(only);

        for (int i = 0; i < s.length; i++)
            System.out.println(s[i]);
    }
}
