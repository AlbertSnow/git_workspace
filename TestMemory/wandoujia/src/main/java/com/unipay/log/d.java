package com.unipay.log;

import android.os.Bundle;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONObject;

public final class d
{
  private Bundle a = new Bundle();
  private List<String> b = new ArrayList();

  public final String a()
  {
    while (true)
    {
      try
      {
        JSONObject localJSONObject = new JSONObject();
        int i = 0;
        if (i >= this.b.size())
          continue;
        if ((i >= 0) && (i < this.b.size()))
        {
          str1 = (String)this.b.get(i);
          String str2 = (String)this.b.get(i);
          localJSONObject.put(str1, this.a.getString(str2));
          i++;
          continue;
          String str3 = localJSONObject.toString();
          return str3;
        }
      }
      catch (Exception localException)
      {
        return "";
      }
      String str1 = "";
    }
  }

  public final void a(String paramString1, String paramString2)
  {
    if (this.b.contains(paramString1))
    {
      this.a.putString(paramString1, paramString2);
      return;
    }
    this.b.add(paramString1);
    this.a.putString(paramString1, paramString2);
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.unipay.log.d
 * JD-Core Version:    0.6.0
 */