package com.wandoujia.account.h;

import android.graphics.Bitmap;
import android.graphics.Bitmap.CompressFormat;
import android.os.Handler;
import android.support.v4.app.b;
import android.text.TextUtils;
import com.wandoujia.account.a;
import com.wandoujia.base.storage.StorageManager;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONObject;

final class g
  implements Runnable
{
  g(String paramString, Bitmap paramBitmap, k paramk)
  {
  }

  public final void run()
  {
    HashMap localHashMap1 = new HashMap();
    HashMap localHashMap2 = new HashMap();
    localHashMap1.put("Cookie", "wdj_auth=" + a.i());
    File localFile = null;
    if (!TextUtils.isEmpty(this.c))
      localHashMap2.put("platform", this.c);
    while (true)
      try
      {
        String str = b.a("https://account.wandoujia.com/v4/api/avatar", localHashMap2, localHashMap1, localFile, "image/jpeg", "file", 30000);
        if (str == null)
          continue;
        JSONObject localJSONObject1 = new JSONObject(str);
        localJSONObject1.toString();
        if (localJSONObject1.getInt("error") != 0)
          continue;
        JSONObject localJSONObject2 = localJSONObject1.getJSONObject("member");
        if (localJSONObject2 == null)
          continue;
        a.e(localJSONObject2.getString("avatar"));
        if (this.b == null)
          continue;
        f.a().post(new h(this));
        if (localFile == null)
          continue;
        localFile.delete();
        if (localFile == null)
          continue;
        localFile.delete();
        return;
        localFile = new File(b.w(StorageManager.getInstance().getExternalStorageDirectory()), "croped_avatar.jpg");
      }
      catch (Exception localException)
      {
        try
        {
          if (this.a == null)
            continue;
          FileOutputStream localFileOutputStream = new FileOutputStream(localFile);
          this.a.compress(Bitmap.CompressFormat.JPEG, 95, localFileOutputStream);
          localFileOutputStream.flush();
          localFileOutputStream.close();
        }
        catch (FileNotFoundException localFileNotFoundException)
        {
          continue;
          if (this.b == null)
            continue;
          f.a().post(new i(this));
          continue;
          localException = localException;
          if (this.b == null)
            continue;
          f.a().post(new j(this));
          continue;
        }
        catch (IOException localIOException)
        {
        }
      }
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.account.h.g
 * JD-Core Version:    0.6.0
 */