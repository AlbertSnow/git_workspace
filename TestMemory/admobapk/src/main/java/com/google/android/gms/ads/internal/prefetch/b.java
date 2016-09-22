package com.google.android.gms.ads.internal.prefetch;

import android.content.Context;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import org.json.JSONObject;

@com.google.android.gms.ads.internal.report.client.a
public final class b extends Handler
{
  private final a a;

  public b(Context paramContext)
  {
    this(new c(paramContext));
  }

  private b(a parama)
  {
    this.a = parama;
  }

  public final void handleMessage(Message paramMessage)
  {
    try
    {
      Bundle localBundle = paramMessage.getData();
      if (localBundle == null)
        return;
      JSONObject localJSONObject = new JSONObject(localBundle.getString("data"));
      boolean bool = "fetch_html".equals(localJSONObject.getString("message_name"));
      if (bool)
        try
        {
          a locala = this.a;
          localJSONObject.getString("request_id");
          locala.a(localJSONObject.getString("base_url"), localJSONObject.getString("html"));
          return;
        }
        catch (Exception localException2)
        {
          return;
        }
    }
    catch (Exception localException1)
    {
    }
  }
}

/* Location:           C:\Program Files\APK反编译\classes_dex2jar.jar
 * Qualified Name:     com.google.android.gms.ads.internal.prefetch.b
 * JD-Core Version:    0.6.0
 */