package com.wandoujia.p4.pay.model;

import com.wandoujia.p4.pay.utils.ExternUtil;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public class PayChannel
{
  public static String methodList;
  private static List<PayChannel> payChannels = new ArrayList();
  private String alias;
  private String name;
  private List<PayChannel.RechargeItem> rechargeItemList = new ArrayList();

  static
  {
    methodList = null;
  }

  public static String fromList(List<String> paramList)
  {
    StringBuilder localStringBuilder = new StringBuilder();
    for (int i = 0; i < paramList.size(); i++)
    {
      if (localStringBuilder.length() != 0)
        localStringBuilder.append(",");
      localStringBuilder.append((String)paramList.get(i));
    }
    return localStringBuilder.toString();
  }

  public static String[] getChannelNameList()
  {
    return methodList.split(",");
  }

  public static List<PayChannel> getChannels()
  {
    return payChannels;
  }

  public static List<PayChannel.RechargeItem> getRechargeMoneyList(String paramString)
  {
    Iterator localIterator = payChannels.iterator();
    PayChannel localPayChannel;
    do
    {
      if (!localIterator.hasNext())
        break;
      localPayChannel = (PayChannel)localIterator.next();
    }
    while (!localPayChannel.name.equals(paramString));
    while (true)
    {
      if (localPayChannel != null)
        return localPayChannel.rechargeItemList;
      return null;
      localPayChannel = null;
    }
  }

  public static void load(String paramString)
  {
    payChannels.clear();
    HashMap localHashMap = new HashMap();
    try
    {
      JSONObject localJSONObject = new JSONObject(paramString);
      Iterator localIterator1 = localJSONObject.keys();
      localJSONObject.names();
      ArrayList localArrayList1 = new ArrayList();
      while (localIterator1.hasNext())
      {
        String str2 = (String)localIterator1.next();
        localArrayList1.add(str2);
        ArrayList localArrayList2 = new ArrayList();
        JSONArray localJSONArray = localJSONObject.getJSONArray(str2);
        for (int i = 0; i < localJSONArray.length(); i++)
          localArrayList2.add((PayChannel.RechargeItem)ExternUtil.fromJson(localJSONArray.getJSONObject(i).toString(), PayChannel.RechargeItem.class));
        localHashMap.put(str2, localArrayList2);
      }
      Collections.sort(localArrayList1, new PayChannel.1(paramString));
      methodList = fromList(localArrayList1);
      if (!localHashMap.isEmpty())
      {
        Iterator localIterator2 = localHashMap.entrySet().iterator();
        while (localIterator2.hasNext())
        {
          Map.Entry localEntry = (Map.Entry)localIterator2.next();
          if (localEntry == null)
            continue;
          PayChannel localPayChannel = new PayChannel();
          localPayChannel.alias = ((String)localEntry.getKey());
          PayMethod localPayMethod = PayMethod.getByName(localPayChannel.alias);
          if (localPayMethod == null);
          for (String str1 = null; ; str1 = localPayMethod.title())
          {
            localPayChannel.name = str1;
            List localList = localPayChannel.rechargeItemList;
            Iterator localIterator3 = ((List)localEntry.getValue()).iterator();
            while (localIterator3.hasNext())
            {
              PayChannel.RechargeItem localRechargeItem = (PayChannel.RechargeItem)localIterator3.next();
              if (localRechargeItem == null)
                continue;
              localList.add(localRechargeItem);
            }
          }
          payChannels.add(localPayChannel);
        }
      }
    }
    catch (JSONException localJSONException)
    {
    }
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.p4.pay.model.PayChannel
 * JD-Core Version:    0.6.0
 */