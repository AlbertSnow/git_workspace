package com.google.android.gms.internal;

import android.content.Context;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import org.json.JSONObject;

@zzhb
public class zzga extends Handler
{
  private final zzfz zzFq;

  public zzga(Context paramContext)
  {
    this(new zzgb(paramContext.getApplicationContext() != null ? paramContext.getApplicationContext() : paramContext));
  }

  public zzga(zzfz paramzzfz)
  {
    this.zzFq = paramzzfz;
  }

  public void handleMessage(Message msg)
  {
    try
    {
      Bundle localBundle = msg.getData();
      if (localBundle == null)
        return;
      JSONObject localJSONObject = new JSONObject(localBundle.getString("data"));
      if ("fetch_html".equals(localJSONObject.getString("message_name")))
        zzd(localJSONObject);
    }
    catch (Exception localException1)
    {
    }
  }

  private void zzd(JSONObject paramJSONObject)
  {
    try
    {
      this.zzFq.zza(paramJSONObject.getString("request_id"), paramJSONObject.getString("base_url"), paramJSONObject.getString("html"));
    }
    catch (Exception localException)
    {
    }
  }
}

/* Location:           C:\Users\Administrator\Downloads\classes.jar
 * Qualified Name:     com.google.android.gms.internal.zzga
 * JD-Core Version:    0.6.0
 */