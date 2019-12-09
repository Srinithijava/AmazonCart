package DataSetup;


import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

public class ConfigFileReader {
	
	private static Properties properties;
	private final String propertyFilePath= "configs//Configuration.properties";

	public ConfigFileReader() {
		
		BufferedReader reader;
		try {
			reader = new BufferedReader(new FileReader(propertyFilePath));
			properties = new Properties();
			try {
				properties.load(reader);
				reader.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
			throw new RuntimeException("Configuration.properties not found at " + propertyFilePath);
		}		
	}
	
	public static String getDriverPath(){
		String driverPath = properties.getProperty("driverPath");
		if(driverPath!= null) return driverPath;
		else throw new RuntimeException("driverPath not specified in the Configuration.properties file.");		
	}
	public static String getxmlpath(){
		String xmlpath = properties.getProperty("xmlpath");
		if(xmlpath!= null) return xmlpath;
		else throw new RuntimeException("xmlpath not specified in the Configuration.properties file.");		
	}
	public static String getreportpath(){
		String reportpath = properties.getProperty("reportpath");
		if(reportpath!= null) return reportpath;
		else throw new RuntimeException("reportpath not specified in the Configuration.properties file.");		
	}
	
	
	}


