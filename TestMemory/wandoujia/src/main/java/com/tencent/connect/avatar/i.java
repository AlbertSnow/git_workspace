package com.tencent.connect.avatar;

import android.os.Handler;
import com.tencent.tauth.b;
import com.tencent.tauth.d;
import org.json.JSONException;
import org.json.JSONObject;

final class i
  implements b
{
  i(ImageActivity paramImageActivity)
  {
  }

  private void a()
  {
    if (ImageActivity.o(this.a) < 2)
      ImageActivity.p(this.a);
  }

  public final void a(d paramd)
  {
    a();
  }

  public final void a(Object paramObject)
  {
    JSONObject localJSONObject = (JSONObject)paramObject;
    int i = -1;
    try
    {
      i = localJSONObject.getInt("ret");
      if (i == 0)
      {
        String str = localJSONObject.getString("nickname");
        ImageActivity.n(this.a).post(new j(this, str));
        this.a.a("10659", 0L);
      }
      while (true)
      {
        label57: if (i != 0)
          a();
        return;
        this.a.a("10661", 0L);
      }
    }
    catch (JSONException localJSONException)
    {
      break label57;
    }
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.tencent.connect.avatar.i
 * JD-Core Version:    0.6.0
 */