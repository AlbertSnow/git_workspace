package com.wandoujia.p4.pay;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import org.json.JSONObject;

class PayImpl$JsonUtil
{
  public static Map<String, Object> json2map(String paramString)
  {
    HashMap localHashMap = new HashMap();
    JSONObject localJSONObject = new JSONObject(paramString);
    Iterator localIterator = localJSONObject.keys();
    while (localIterator.hasNext())
    {
      String str = (String)localIterator.next();
      localHashMap.put(str, localJSONObject.get(str));
    }
    return localHashMap;
  }

  public static String map2json(Map<String, Object> paramMap)
  {
    JSONObject localJSONObject = new JSONObject();
    Iterator localIterator = paramMap.keySet().iterator();
    while (localIterator.hasNext())
    {
      String str = (String)localIterator.next();
      localJSONObject.put(str, paramMap.get(str));
    }
    return localJSONObject.toString();
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.p4.pay.PayImpl.JsonUtil
 * JD-Core Version:    0.6.0
 */