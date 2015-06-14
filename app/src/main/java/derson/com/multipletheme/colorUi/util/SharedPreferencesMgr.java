package derson.com.multipletheme.colorUi.util;

import android.content.Context;
import android.content.SharedPreferences;

/**
 * SharedPreferences管理类
 * */
public class SharedPreferencesMgr {

	private static Context context;
	private static SharedPreferences sPrefs ;
	
	private SharedPreferencesMgr(Context context, String fileName)
	{
		this.context=context;
		sPrefs= context.getSharedPreferences(
				 fileName, Context.MODE_WORLD_READABLE );
	}

	public static void init(Context context,String fileName)
	{
		new SharedPreferencesMgr(context,fileName);
	}
	public   static String fileName ;
	
	public static int getInt(String key,int defaultValue)
	{
		return sPrefs.getInt(key, defaultValue);
	}
	public static void setInt(String key,int value) {
		sPrefs.edit().putInt(key, value).commit();
	}
	public static boolean getBoolean(String key,boolean defaultValue)
	{
		return sPrefs.getBoolean(key, defaultValue);
	}
	public static void setBoolean(String key,boolean value) {
		sPrefs.edit().putBoolean(key, value).commit();
	}
	
	public static String getString(String key,String defaultValue)
	{
		if(sPrefs ==null)
			return defaultValue;
		return sPrefs.getString(key, defaultValue);
	}

	public static void setString(String key,String value) {
		if(sPrefs ==null)
			return ;
		sPrefs.edit().putString(key, value).commit();
	}
	
	public static void clearAll(){
		if(sPrefs ==null)
			return ;
		sPrefs.edit().clear().commit();
	}
}
