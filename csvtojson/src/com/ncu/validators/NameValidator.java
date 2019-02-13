package com.ncu.validators;
import java.io.*;
import com.ncu.exceptions.*;
import java.util.regex.Pattern;
import java.util.regex.Matcher;
import java.util.*;
import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;


public class NameValidator{
	public boolean nameValidator(String filename, String filetype){
		System.out.println("File name is: " +filename+  " and its type is " +filetype);
		boolean b;


		Properties prop = new Properties();
		FileInputStream input=null;
		String csvfilepath = "/Users/apple/Desktop/csvtojson/csvs";
		String jsonfilepath = "/Users/apple/Desktop/csvtojson/jsons";

		Logger logger = Logger.getLogger(NameValidator.class);
		PropertyConfigurator.configure("/Users/apple/Desktop/csvtojson/configs/logger/logger.properties");

		try{
			input = new FileInputStream("/Users/apple/Desktop/csvtojson/configs/constants/exception.properties");	
			prop.load(input);
			emptyFileName(filename);
			missingDot(filename);
			fileFormat(filename);
			fileLength(filename);
			specialCharacter(filename);
			if(filetype=="csv")
			{
				csvOnly(filename);
				fileNotAvailable(csvfilepath+"/"+filename);

			}
			else{
				jsonOnly(filename);
				fileExist(jsonfilepath+"/"+filename);
			}

		}
		catch(EmptyFileNameException e){
			logger.error("\n \n"+e+prop.getProperty("emptyNameMessage")+"\n");
            return false; 
			
		}
		catch(MissingExtensionException e){
			logger.error("\n \n"+e+prop.getProperty("extensionMessage")+"\n");
			return false;
		}
		catch(InvalidExtensionException e)
		{
		  logger.error("\n \n"+e+prop.getProperty("invalidException")+"\n");
			return false;	
		}
		catch(FileNameLengthException e)
		{
			logger.error("\n \n"+e+prop.getProperty("longFileNameMessage")+"\n");
			return false;
		}
		catch(SpecialCharacterException e)
		{
			logger.error("\n \n"+e+prop.getProperty("specialCharacterMessage")+"\n");
			return false;
		}
		catch(FileNotAvailable e)
		{
			logger.error("\n \n"+e+prop.getProperty("notAvailableMessage")+"\n");
			return false;
		}
		catch(FileAlreadyExists e)
		{
			logger.error("\n \n"+e+prop.getProperty("fileExistsMessage")+"\n");
			return false;
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
			return true;
    }

	private void emptyFileName(String filename)throws EmptyFileNameException{
		if(filename== " ")
			throw new EmptyFileNameException("Empty file");
	}

	private void missingDot(String filename)throws MissingExtensionException{
		Pattern costPattern = Pattern.compile("[.]");
		Matcher costMatcher=costPattern.matcher(filename);
		boolean value=costMatcher.find();
				if(!(value==true))
			throw new MissingExtensionException("Missing Dot"); 

	}

	private void fileFormat(String filename)throws InvalidExtensionException{
		String [] extn = filename.split("\\.");
		if(extn.length<=1)
			throw new InvalidExtensionException("Extension of file is wrong");

	}

	 private void fileLength(String filename)throws FileNameLengthException{
		int fileLength=25;
		String namelength=filename.split("\\.")[0];
		if(namelength.length()>fileLength)
			throw new FileNameLengthException("Filename length is more than 25");
		
	}

	private void specialCharacter(String filename)throws SpecialCharacterException{
        filename=filename.split("\\.")[0];
		Pattern patternGet =Pattern.compile("[@#$%&^(<)]");
		Matcher check =patternGet.matcher(filename);	
		boolean finalvalue=check.find();	
		if(finalvalue==true)
			throw new SpecialCharacterException("Cannot use special characters");
	}

	private void csvOnly(String filename) throws InvalidExtensionException{
		String [] name = filename.split("\\.");
		if(!name[1].equals("csv")==true)
			throw new InvalidExtensionException("Invalid extension is used");
	}

	private void jsonOnly(String filename)throws InvalidExtensionException{
		String [] name = filename.split("\\.");
			if(!name[1].equals("json")==true)
			throw new InvalidExtensionException("Invalid Extension is used");
	}

	private void fileNotAvailable(String filename)throws FileNotAvailable{
		File f= new File(filename);
		if(f.exists()==false)
	    throw new FileNotAvailable("File is not available");

	}


	private void fileExist(String filename)throws FileAlreadyExists{
		File f=new File("./"+filename);
		if(f.exists()==true)
			throw new FileAlreadyExists("This file already exists");
	}
}





class testnamevalidator{
	public static void main(String[] args) {
		NameValidator csvObject = new NameValidator();

		boolean checkValidator = csvObject.nameValidator(" ","");
		System.out.println(checkValidator);

        checkValidator = csvObject.nameValidator(" ","csv");
        System.out.println(checkValidator);
	}
	
}