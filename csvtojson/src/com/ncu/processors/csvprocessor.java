package com.ncu.processors;
import java.io.*;
import org.json.simple.*;
public class csvprocessor
{
	public boolean processorCsv(String csvFileName,String jsonFileName)
	{
		String csvFilePath="/Users/apple/Desktop/csvtojson/csvs";
		String jsonFilePath="/Users/apple/Desktop/csvtojson/jsons";

	
	try
	{
		FileReader fr= new FileReader(csvFilePath+"/"+csvFileName);
		BufferedReader br=new BufferedReader(fr);

		String headerLine=br.readLine();
		String[] keyNames=headerLine.split(",");

		int i=0;

		String line;

		JSONArray jsonArry= new JSONArray();
		FileWriter fw=new FileWriter(jsonFilePath+"/"+jsonFileName);
		BufferedWriter bw= new BufferedWriter(fw);

		while((line=br.readLine())!=null)
		{
			JSONObject jobj =new JSONObject();
			String[] dataline =line.split(",");
			for (i=0;i<dataline.length ;i++ ) {
				jobj.put(keyNames[i],dataline[i]);
				
			}
			jsonArry.add(jobj);
		}
		bw.write(jsonArry.toJSONString());
		bw.flush();

	}
	catch(Exception e)
	{
    System.out.println(e);
    return(false);
	}
	return (true);
}
}

class testprocessor
{
	public static void main(String[] args) {
		csvprocessor cv=new csvprocessor();
		try
		{
			System.out.println(cv.processorCsv("example.csv","jsonfile.json"));
		}
		catch(Exception e)
		{
      System.out.println(e);
		}
	}
}