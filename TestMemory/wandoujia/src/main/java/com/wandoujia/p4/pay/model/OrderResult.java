package com.wandoujia.p4.pay.model;

import com.wandoujia.p4.pay.utils.SLog;
import java.io.Serializable;
import org.json.JSONException;
import org.json.JSONObject;

public class OrderResult
  implements Serializable
{
  public String message;
  public Integer status;
  public String title;

  public void fromJSON(String paramString)
  {
    try
    {
      JSONObject localJSONObject = new JSONObject(paramString);
      this.status = Integer.valueOf(localJSONObject.getInt("status"));
      this.title = localJSONObject.getString("title");
      this.message = localJSONObject.getString("message");
      return;
    }
    catch (JSONException localJSONException)
    {
      SLog.e("OrderResult", localJSONException);
    }
  }

  public String toString()
  {
    JSONObject localJSONObject = new JSONObject();
    try
    {
      localJSONObject.put("status", this.status);
      localJSONObject.put("title", this.title);
      localJSONObject.put("message", this.message);
      return localJSONObject.toString();
    }
    catch (JSONException localJSONException)
    {
      while (true)
        SLog.e("OrderResult", localJSONException);
    }
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.p4.pay.model.OrderResult
 * JD-Core Version:    0.6.0
 */