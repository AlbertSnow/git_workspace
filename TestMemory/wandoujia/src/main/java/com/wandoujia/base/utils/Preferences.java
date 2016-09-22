package com.wandoujia.base.utils;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.SharedPreferences.OnSharedPreferenceChangeListener;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.wandoujia.gson.c;
import java.lang.reflect.Type;
import java.util.Map;
import java.util.Set;

public class Preferences
  implements SharedPreferences
{
  public static final String PREFERENCE_PREFIX = "pref_id_";
  private SharedPreferences mPreference;

  public Preferences(SharedPreferences paramSharedPreferences)
  {
    this.mPreference = paramSharedPreferences;
  }

  private static String bundleToString(Bundle paramBundle)
  {
    if (paramBundle == null)
      return null;
    Parcel localParcel = Parcel.obtain();
    try
    {
      paramBundle.writeToParcel(localParcel, 0);
      String str = Base64.encodeToString(localParcel.marshall(), 0);
      return str;
    }
    finally
    {
      localParcel.recycle();
    }
    throw localObject;
  }

  public static Preferences getById(Context paramContext, String paramString)
  {
    return new Preferences(paramContext.getSharedPreferences("pref_id_" + paramString, 0));
  }

  private static String objectToString(Object paramObject)
  {
    if (paramObject == null)
      return null;
    return new c().a(paramObject);
  }

  private static Bundle stringToBundle(String paramString)
  {
    byte[] arrayOfByte = Base64.decode(paramString, 0);
    Parcel localParcel = Parcel.obtain();
    try
    {
      localParcel.unmarshall(arrayOfByte, 0, arrayOfByte.length);
      localParcel.setDataPosition(0);
      Bundle localBundle = (Bundle)Bundle.CREATOR.createFromParcel(localParcel);
      return localBundle;
    }
    finally
    {
      localParcel.recycle();
    }
    throw localObject;
  }

  private static <T> T stringToObject(String paramString, Class<T> paramClass)
  {
    return new c().a(paramString, paramClass);
  }

  private static <T> T stringToObject(String paramString, Type paramType)
  {
    return new c().a(paramString, paramType);
  }

  public boolean contains(String paramString)
  {
    return this.mPreference.contains(paramString);
  }

  public Preferences.CustomEditor edit()
  {
    return new Preferences.CustomEditor(this.mPreference.edit());
  }

  public Map<String, ?> getAll()
  {
    return this.mPreference.getAll();
  }

  public boolean getBoolean(String paramString, boolean paramBoolean)
  {
    return this.mPreference.getBoolean(paramString, paramBoolean);
  }

  public Bundle getBundle(String paramString, Bundle paramBundle)
  {
    String str = this.mPreference.getString(paramString, null);
    if (str == null)
      return paramBundle;
    return stringToBundle(str);
  }

  public float getFloat(String paramString, float paramFloat)
  {
    return this.mPreference.getFloat(paramString, paramFloat);
  }

  public int getInt(String paramString, int paramInt)
  {
    return this.mPreference.getInt(paramString, paramInt);
  }

  public long getLong(String paramString, long paramLong)
  {
    return this.mPreference.getLong(paramString, paramLong);
  }

  public <T> T getObject(String paramString, Class<T> paramClass, T paramT)
  {
    String str = this.mPreference.getString(paramString, null);
    if (str == null)
      return paramT;
    return stringToObject(str, paramClass);
  }

  public <T> T getObject(String paramString, Type paramType, T paramT)
  {
    String str = this.mPreference.getString(paramString, null);
    if (str == null)
      return paramT;
    return stringToObject(str, paramType);
  }

  public String getString(String paramString1, String paramString2)
  {
    return this.mPreference.getString(paramString1, paramString2);
  }

  public Set<String> getStringSet(String paramString, Set<String> paramSet)
  {
    return this.mPreference.getStringSet(paramString, paramSet);
  }

  public void registerOnSharedPreferenceChangeListener(SharedPreferences.OnSharedPreferenceChangeListener paramOnSharedPreferenceChangeListener)
  {
    this.mPreference.registerOnSharedPreferenceChangeListener(paramOnSharedPreferenceChangeListener);
  }

  public void unregisterOnSharedPreferenceChangeListener(SharedPreferences.OnSharedPreferenceChangeListener paramOnSharedPreferenceChangeListener)
  {
    this.mPreference.unregisterOnSharedPreferenceChangeListener(paramOnSharedPreferenceChangeListener);
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.base.utils.Preferences
 * JD-Core Version:    0.6.0
 */