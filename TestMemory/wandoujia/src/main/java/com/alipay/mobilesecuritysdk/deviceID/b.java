package com.alipay.mobilesecuritysdk.deviceID;

import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public final class b
{
  static void a(SharedPreferences paramSharedPreferences, Map<String, String> paramMap)
  {
    SharedPreferences.Editor localEditor;
    Iterator localIterator;
    if (paramSharedPreferences != null)
    {
      localEditor = paramSharedPreferences.edit();
      if (localEditor != null)
      {
        localEditor.clear();
        localIterator = paramMap.entrySet().iterator();
      }
    }
    while (true)
    {
      if (!localIterator.hasNext())
      {
        localEditor.commit();
        return;
      }
      Map.Entry localEntry = (Map.Entry)localIterator.next();
      String str = (String)localEntry.getKey();
      Object localObject = localEntry.getValue();
      if ((localObject instanceof String))
      {
        localEditor.putString(str, (String)localObject);
        continue;
      }
      if ((localObject instanceof Integer))
      {
        localEditor.putInt(str, ((Integer)localObject).intValue());
        continue;
      }
      if ((localObject instanceof Long))
      {
        localEditor.putLong(str, ((Long)localObject).longValue());
        continue;
      }
      if ((localObject instanceof Float))
      {
        localEditor.putFloat(str, ((Float)localObject).floatValue());
        continue;
      }
      if (!(localObject instanceof Boolean))
        continue;
      localEditor.putBoolean(str, ((Boolean)localObject).booleanValue());
    }
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.alipay.mobilesecuritysdk.deviceID.b
 * JD-Core Version:    0.6.0
 */