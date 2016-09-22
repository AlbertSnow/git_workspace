package com.unionpay.mpay.utils;

import java.util.ArrayList;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public final class e
{
  public static String a(JSONArray paramJSONArray, int paramInt)
  {
    Object localObject = "";
    if ((paramJSONArray != null) && (paramInt >= 0) && (paramInt < paramJSONArray.length()));
    try
    {
      String str = paramJSONArray.getString(paramInt);
      localObject = str;
      return localObject;
    }
    catch (JSONException localJSONException)
    {
    }
    return (String)localObject;
  }

  public static String a(JSONObject paramJSONObject, String paramString)
  {
    Object localObject = "";
    if (e(paramJSONObject, paramString));
    try
    {
      String str = paramJSONObject.getString(paramString);
      localObject = str;
      return localObject;
    }
    catch (JSONException localJSONException)
    {
      new StringBuilder().append(e.class.toString()).append(" get ").append(paramString).append(" failed!!");
    }
    return (String)localObject;
  }

  public static Object b(JSONArray paramJSONArray, int paramInt)
  {
    Object localObject1 = null;
    if (paramJSONArray != null)
    {
      int i = paramJSONArray.length();
      localObject1 = null;
      if (paramInt < i)
      {
        localObject1 = null;
        if (paramInt < 0);
      }
    }
    try
    {
      Object localObject2 = paramJSONArray.get(paramInt);
      localObject1 = localObject2;
      return localObject1;
    }
    catch (JSONException localJSONException)
    {
    }
    return null;
  }

  public static JSONObject b(JSONObject paramJSONObject, String paramString)
  {
    boolean bool = e(paramJSONObject, paramString);
    Object localObject = null;
    if (bool);
    try
    {
      JSONObject localJSONObject = paramJSONObject.getJSONObject(paramString);
      localObject = localJSONObject;
      return localObject;
    }
    catch (JSONException localJSONException)
    {
      new StringBuilder().append(e.class.toString()).append(" get ").append(paramString).append(" failed!!");
    }
    return null;
  }

  public static JSONArray c(JSONObject paramJSONObject, String paramString)
  {
    boolean bool = e(paramJSONObject, paramString);
    Object localObject = null;
    if (bool);
    try
    {
      JSONArray localJSONArray = paramJSONObject.getJSONArray(paramString);
      localObject = localJSONArray;
      return localObject;
    }
    catch (JSONException localJSONException)
    {
      new StringBuilder().append(e.class.toString()).append(" get ").append(paramString).append(" failed!!");
    }
    return null;
  }

  public static List<JSONArray> d(JSONObject paramJSONObject, String paramString)
  {
    ArrayList localArrayList = new ArrayList(1);
    JSONArray localJSONArray = c(paramJSONObject, paramString);
    for (int i = 0; (localJSONArray != null) && (i < localJSONArray.length()); i++)
      localArrayList.add((JSONArray)b(localJSONArray, i));
    return localArrayList;
  }

  private static boolean e(JSONObject paramJSONObject, String paramString)
  {
    int i = 0;
    if (paramJSONObject != null)
    {
      boolean bool = paramJSONObject.has(paramString);
      i = 0;
      if (bool)
        i = 1;
    }
    return i;
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.unionpay.mpay.utils.e
 * JD-Core Version:    0.6.0
 */