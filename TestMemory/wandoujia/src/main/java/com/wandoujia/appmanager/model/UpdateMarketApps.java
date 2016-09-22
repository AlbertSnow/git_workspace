package com.wandoujia.appmanager.model;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public class UpdateMarketApps
  implements Serializable
{
  public float importantPushFrequency = 0.0F;
  public float pushFrequency = 0.0F;
  public List<MarketAppInfo> sysApps = null;
  public List<MarketAppInfo> userApps = null;

  public static UpdateMarketApps parseFromJson(String paramString)
  {
    int i = 0;
    try
    {
      UpdateMarketApps localUpdateMarketApps = new UpdateMarketApps();
      JSONObject localJSONObject1 = new JSONObject(paramString);
      if ((localJSONObject1.has("userApps")) && (!localJSONObject1.isNull("userApps")))
      {
        JSONArray localJSONArray2 = localJSONObject1.getJSONArray("userApps");
        ArrayList localArrayList2 = new ArrayList(localJSONArray2.length());
        for (int j = 0; j < localJSONArray2.length(); j++)
          localArrayList2.add(MarketAppInfo.parseFromJsonObj(localJSONArray2.getJSONObject(j)));
        localUpdateMarketApps.setUserApps(localArrayList2);
      }
      if ((localJSONObject1.has("sysApps")) && (!localJSONObject1.isNull("sysApps")))
      {
        JSONArray localJSONArray1 = localJSONObject1.getJSONArray("sysApps");
        ArrayList localArrayList1 = new ArrayList(localJSONArray1.length());
        while (i < localJSONArray1.length())
        {
          localArrayList1.add(MarketAppInfo.parseFromJsonObj(localJSONArray1.getJSONObject(i)));
          i++;
        }
        localUpdateMarketApps.setSysApps(localArrayList1);
      }
      if ((localJSONObject1.has("pushFrequency")) && (!localJSONObject1.isNull("pushFrequency")))
      {
        JSONObject localJSONObject2 = localJSONObject1.getJSONObject("pushFrequency");
        localUpdateMarketApps.pushFrequency = Float.parseFloat(localJSONObject2.getString("normal"));
        localUpdateMarketApps.importantPushFrequency = Float.parseFloat(localJSONObject2.getString("important"));
      }
      return localUpdateMarketApps;
    }
    catch (JSONException localJSONException)
    {
    }
    return null;
  }

  public List<MarketAppInfo> getSysApps()
  {
    return this.sysApps;
  }

  public List<MarketAppInfo> getUserApps()
  {
    return this.userApps;
  }

  public void setSysApps(List<MarketAppInfo> paramList)
  {
    this.sysApps = paramList;
  }

  public void setUserApps(List<MarketAppInfo> paramList)
  {
    this.userApps = paramList;
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.appmanager.model.UpdateMarketApps
 * JD-Core Version:    0.6.0
 */