package com.cisdi.base.common;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Properties;

public class GlobalConfigHolder
{
    private static Map<String, String> propertiesMap =
            new HashMap<String, String>();
    
    public static void init() throws IOException
    {
        InputStream inputStream =
                GlobalConfigHolder.class.getClassLoader()
                        .getResourceAsStream("sysConfig.properties");
        Properties p = new Properties();
        p.load(inputStream);
        for (Object key : p.keySet())
        {
            GlobalConfigHolder.setProperty((String) key, (String) p.get(key));
        }
    }
    
    public static Map<String, String> getPropertiesMap()
    {
        return propertiesMap;
    }
    
    public static void setPropertiesMap(Map<String, String> propertiesMap)
    {
        GlobalConfigHolder.propertiesMap = propertiesMap;
    }
    
    public static void setProperty(String name, String object)
    {
        propertiesMap.put(name, object);
    }
    
    public static String getProperty(String name)
    {
        return propertiesMap.get(name);
    }
    
    public static boolean write(String name, String value) {
    	try {
    		Properties prop = new Properties();  
    		//读取属性文件a.properties
    		InputStream in = GlobalConfigHolder.class.getClassLoader()
                    .getResourceAsStream("sysConfig.properties");
    		prop.load(in);     ///加载属性列表
    		
    		///保存属性到b.properties文件
    		FileOutputStream oFile = new FileOutputStream(GlobalConfigHolder.class.getClassLoader()
                    .getResource("sysConfig.properties").getFile());
    		prop.put(name, value);
    		prop.store(oFile, name);
    		oFile.flush();
    		oFile.close();
    		propertiesMap.put(name, value); //刷新缓存
    		return true;
		} catch (Exception e) {
			e.printStackTrace();
			return false;
		}
    }
}
