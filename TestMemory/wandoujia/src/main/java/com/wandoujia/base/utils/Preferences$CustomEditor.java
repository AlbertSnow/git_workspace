package com.wandoujia.base.utils;

import android.content.SharedPreferences.Editor;
import android.os.Bundle;
import java.util.Set;

public class Preferences$CustomEditor
  implements SharedPreferences.Editor
{
  private SharedPreferences.Editor mEditor;

  public Preferences$CustomEditor(SharedPreferences.Editor paramEditor)
  {
    this.mEditor = paramEditor;
  }

  public void apply()
  {
    this.mEditor.apply();
  }

  public SharedPreferences.Editor clear()
  {
    this.mEditor.clear();
    return this;
  }

  public boolean commit()
  {
    return this.mEditor.commit();
  }

  public SharedPreferences.Editor putBoolean(String paramString, boolean paramBoolean)
  {
    this.mEditor.putBoolean(paramString, paramBoolean);
    return this;
  }

  public SharedPreferences.Editor putBundle(String paramString, Bundle paramBundle)
  {
    this.mEditor.putString(paramString, Preferences.access$000(paramBundle));
    return this;
  }

  public SharedPreferences.Editor putFloat(String paramString, float paramFloat)
  {
    this.mEditor.putFloat(paramString, paramFloat);
    return this;
  }

  public SharedPreferences.Editor putInt(String paramString, int paramInt)
  {
    this.mEditor.putInt(paramString, paramInt);
    return this;
  }

  public SharedPreferences.Editor putLong(String paramString, long paramLong)
  {
    this.mEditor.putLong(paramString, paramLong);
    return this;
  }

  public SharedPreferences.Editor putObject(String paramString, Object paramObject)
  {
    this.mEditor.putString(paramString, Preferences.access$100(paramObject));
    return this;
  }

  public SharedPreferences.Editor putString(String paramString1, String paramString2)
  {
    this.mEditor.putString(paramString1, paramString2);
    return this;
  }

  public SharedPreferences.Editor putStringSet(String paramString, Set<String> paramSet)
  {
    if (SystemUtil.aboveApiLevel(11))
      this.mEditor.putStringSet(paramString, paramSet);
    return this;
  }

  public SharedPreferences.Editor remove(String paramString)
  {
    this.mEditor.remove(paramString);
    return this;
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.base.utils.Preferences.CustomEditor
 * JD-Core Version:    0.6.0
 */