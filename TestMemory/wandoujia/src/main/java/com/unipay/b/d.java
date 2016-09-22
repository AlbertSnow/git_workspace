package com.unipay.b;

import java.io.UnsupportedEncodingException;
import java.net.URLDecoder;
import java.util.ArrayList;
import org.json.JSONException;
import org.json.JSONObject;

final class d extends Thread
{
  d(b paramb)
  {
  }

  public final void run()
  {
    try
    {
      String str2 = URLDecoder.decode(b.a("http://uniview.wostore.cn/log-app/updateErrorMsg"), "UTF-8");
      str1 = str2;
      if (str1 != null);
      try
      {
        if (b.a(this.a) == null)
          b.a(this.a, new JSONObject(str1));
        label45: if (!b.a(this.a, "version").equals(b.b(this.a)))
        {
          b.b(this.a, b.a(this.a, "version"));
          ArrayList localArrayList = b.b(b.a(this.a, "MENO"));
          if (localArrayList.size() > 0)
          {
            e locale = new e(b.c(this.a));
            locale.a(false);
            locale.a();
            locale.a(localArrayList);
          }
        }
        return;
      }
      catch (JSONException localJSONException)
      {
        break label45;
      }
    }
    catch (UnsupportedEncodingException localUnsupportedEncodingException)
    {
      while (true)
        String str1 = null;
    }
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.unipay.b.d
 * JD-Core Version:    0.6.0
 */