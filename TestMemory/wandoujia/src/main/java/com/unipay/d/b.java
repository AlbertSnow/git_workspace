package com.unipay.d;

import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONObject;

final class b
  implements com.unipay.c.b
{
  b(c paramc)
  {
  }

  public final void a()
  {
  }

  public final void a(InputStream paramInputStream)
  {
    if (paramInputStream == null);
    while (true)
    {
      return;
      try
      {
        ByteArrayOutputStream localByteArrayOutputStream = new ByteArrayOutputStream();
        byte[] arrayOfByte = new byte[1024];
        while (true)
        {
          int i = paramInputStream.read(arrayOfByte);
          if (i == -1)
            break;
          localByteArrayOutputStream.write(arrayOfByte, 0, i);
        }
        localByteArrayOutputStream.flush();
        paramInputStream.close();
        String str = new String(localByteArrayOutputStream.toByteArray());
        localByteArrayOutputStream.close();
        JSONObject localJSONObject1 = new JSONObject(str);
        if ((!localJSONObject1.has("isblank")) || (localJSONObject1.getBoolean("isblank")))
          continue;
        c.a(this.a).clear();
        JSONArray localJSONArray = localJSONObject1.getJSONArray("package");
        for (int j = 0; j < localJSONArray.length(); j++)
        {
          JSONObject localJSONObject2 = localJSONArray.getJSONObject(j);
          c.a(this.a).add(new d(localJSONObject2.getString("package"), localJSONObject2.getString("android_version"), localJSONObject2.getString("software_version"), localJSONObject2.getString("isroot"), String.valueOf(localJSONObject2.getBoolean("isopen"))));
        }
        this.a.c();
        this.a.a(c.a(this.a));
        c.b(this.a);
        this.a.a(String.valueOf(localJSONObject1.getInt("ver")));
        return;
      }
      catch (Exception localException)
      {
      }
    }
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.unipay.d.b
 * JD-Core Version:    0.6.0
 */