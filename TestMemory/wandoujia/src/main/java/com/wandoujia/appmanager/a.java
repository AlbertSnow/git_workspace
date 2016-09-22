package com.wandoujia.appmanager;

import com.alipay.mobilesecuritysdk.deviceID.i;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import org.json.JSONException;
import org.json.JSONObject;

public final class a
{
  private static com.wandoujia.appmanager.config.a a;

  public static com.wandoujia.account.h.a a(String paramString)
  {
    com.wandoujia.account.h.a locala;
    if (paramString == null)
      locala = null;
    while (true)
    {
      return locala;
      locala = new com.wandoujia.account.h.a();
      try
      {
        JSONObject localJSONObject1 = new JSONObject(paramString);
        locala.a(localJSONObject1.getBoolean("success"));
        if (!locala.c())
          continue;
        JSONObject localJSONObject2 = localJSONObject1.getJSONObject("data");
        if (localJSONObject2 == null)
          continue;
        localJSONObject2.getString("version");
        locala.c(localJSONObject2.getString("apdid"));
        locala.d(localJSONObject2.getString("apdtk"));
        JSONObject localJSONObject3 = localJSONObject2.getJSONObject("rule");
        if (localJSONObject3 != null)
          localJSONObject3.getString("function");
        locala.e(localJSONObject3.toString());
        locala.b(localJSONObject2.getString("time"));
        locala.a(localJSONObject2.getString("checkcode"));
        return locala;
      }
      catch (JSONException localJSONException)
      {
        ArrayList localArrayList = new ArrayList();
        localArrayList.add("");
        localArrayList.add("");
        localArrayList.add("");
        localArrayList.add(i.a(localJSONException));
        i.a(localArrayList);
      }
    }
    return locala;
  }

  public static com.wandoujia.appmanager.config.a a()
  {
    return a;
  }

  public static String a(Map<String, String> paramMap)
  {
    return c(paramMap);
  }

  static void a(com.wandoujia.appmanager.config.a parama)
  {
    a = parama;
  }

  public static String b(Map<String, Object> paramMap)
  {
    JSONObject localJSONObject1 = new JSONObject();
    JSONObject localJSONObject2 = new JSONObject();
    JSONObject localJSONObject3 = new JSONObject();
    try
    {
      Iterator localIterator;
      if (paramMap.size() > 0)
        localIterator = paramMap.entrySet().iterator();
      while (true)
      {
        if (!localIterator.hasNext())
        {
          localJSONObject2.put("os", "android");
          localJSONObject2.put("data", localJSONObject3);
          localJSONObject1.put("type", "deviceinfo");
          localJSONObject1.put("model", localJSONObject2);
          label90: return localJSONObject1.toString();
        }
        Map.Entry localEntry = (Map.Entry)localIterator.next();
        String str = (String)localEntry.getKey();
        if (str.equals("deviceInfo"))
        {
          localJSONObject3.put(str, new JSONObject(c((Map)localEntry.getValue())));
          continue;
        }
        localJSONObject3.put(str, (String)localEntry.getValue());
      }
    }
    catch (JSONException localJSONException)
    {
      break label90;
    }
  }

  public static Map<String, String> b(String paramString)
  {
    try
    {
      JSONObject localJSONObject = new JSONObject(paramString);
      Iterator localIterator = localJSONObject.keys();
      HashMap localHashMap = new HashMap();
      while (true)
      {
        if (!localIterator.hasNext())
          return localHashMap;
        String str = (String)localIterator.next();
        localHashMap.put(str, (String)localJSONObject.get(str));
      }
    }
    catch (JSONException localJSONException)
    {
    }
    return null;
  }

  private static String c(Map<String, String> paramMap)
  {
    if ((paramMap != null) && (paramMap.size() > 0))
    {
      Iterator localIterator = paramMap.entrySet().iterator();
      JSONObject localJSONObject = new JSONObject();
      while (true)
      {
        if (!localIterator.hasNext())
          return localJSONObject.toString();
        Map.Entry localEntry = (Map.Entry)localIterator.next();
        String str1 = (String)localEntry.getKey();
        String str2 = (String)localEntry.getValue();
        try
        {
          localJSONObject.put(str1, str2);
        }
        catch (JSONException localJSONException)
        {
        }
      }
    }
    return null;
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.appmanager.a
 * JD-Core Version:    0.6.0
 */