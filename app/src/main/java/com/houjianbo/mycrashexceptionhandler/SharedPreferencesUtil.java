package com.houjianbo.mycrashexceptionhandler;

import android.content.Context;
import android.content.SharedPreferences;

/**
 * 配置参数工具类
 */
public class SharedPreferencesUtil {

	public static void putString(Context context, String provider, String key, String value) {
		getEditor(context, provider).putString(key, value).commit();
	}

	public static void putBoolean(Context context, String provider, String key, boolean value) {
		getEditor(context, provider).putBoolean(key, value).commit();
	}

	public static void removeObject(Context context, String provider, String key) {
		getEditor(context, provider).remove(key).commit();
	}

	public static String getString(Context context, String provider, String key) {
		return getString(context, provider, key, null);
	}

	public static boolean getBoolean(Context context, String provider, String key, boolean defValue) {
		return getPref(context, provider).getBoolean(key, defValue);
	}

	public static String getString(Context context, String provider, String key, String defValue) {
		SharedPreferences prefs = getPref(context, provider);
		return prefs.getString(key, defValue);
	}

	private static SharedPreferences.Editor getEditor(Context context, String provider) {
		return context.getSharedPreferences(provider, 0).edit();
	}

	private static SharedPreferences getPref(Context context, String provider) {
		return context.getSharedPreferences(provider, 0);
	}

	public static long getLong(Context context, String provider, String key, long defValue) {
		return getPref(context, provider).getLong(key, defValue);
	}

	public static void putLong(Context context, String provider, String key, long value) {
		getEditor(context, provider).putLong(key, value).commit();
	}

	public static int getInt(Context context, String provider, String key, int defValue) {
		return getPref(context, provider).getInt(key, defValue);
	}

	public static void putInt(Context context, String provider, String key, int value) {
		getEditor(context, provider).putInt(key, value).commit();
	}

}
