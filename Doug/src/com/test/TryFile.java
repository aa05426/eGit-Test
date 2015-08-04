package com.test;

import java.io.File;

public class TryFile {
  public static void main(String[] args) {

    // Create an object that is a directory
    File myDir = new File("C:/0");
    
    System.out.println(myDir + (myDir.isDirectory() ? " is" : " is not") + " a directory.");
    if (myDir.isDirectory())
    {
    	System.out.println("Here is the contentes of "  + myDir);
    	System.out.println();
    	
    	//Use list() method
    	String[] dirList = myDir.list();
    	System.out.println("Using the FILE.list() method");
    	for(int i=0;i < dirList.length; i++)
    	{
    		System.out.println("Item: " + i + " " + dirList[i]);
    	}
    	
    	System.out.println();
    	
    	//Use listFiles() method
    	File [] fileDirList = myDir.listFiles();
    	System.out.println("Using the FILE.listFiles() method");
    	int iDirCount = 0, iFileCount = 0;
    	
    	for(int i=0;i < dirList.length; i++)
    	{
    		System.out.println("Item: " + i + " " + fileDirList[i]);
    		
    		if (fileDirList[i].isFile())
    		{
    			iFileCount++;
    		}
    		else if (fileDirList[i].isDirectory())
    		{
    			iDirCount++;
    		}
    	}
    	
    	System.out.println("There are " + iFileCount + " Files");
    	System.out.println("There are " + iDirCount + " Directories");
    }
    
    

    // Create an object that is a file
    File myFile = new File(myDir, "pubring.pkr");
    
    System.out.println("");
    System.out.println(myFile + (myFile.exists() ? " does" : " does not") + " exist");
    System.out.println(myFile + (myFile.isFile() ? " is" : " is not") + " a file.");
    System.out.println(myFile + (myFile.isHidden() ? " is" : " is not") + " hidden");
    System.out.println("You can" + (myFile.canRead() ? " " : "not ") + "read " + myFile);
    System.out.println("You can" + (myFile.canWrite() ? " " : "not ") + "write " + myFile);
    return;
  }
}
