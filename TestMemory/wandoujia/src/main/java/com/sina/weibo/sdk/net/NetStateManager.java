package com.sina.weibo.sdk.net;

import android.content.ContentResolver;
import android.content.Context;
import android.database.Cursor;
import android.net.Uri;
import org.apache.http.HttpHost;

public final class NetStateManager
{
  public static NetStateManager.NetState a;
  private static Context b;

  public static HttpHost a()
  {
    Uri localUri = Uri.parse("content://telephony/carriers/preferapn");
    if (b != null);
    for (Cursor localCursor = b.getContentResolver().query(localUri, null, null, null, null); ; localCursor = null)
    {
      HttpHost localHttpHost = null;
      if (localCursor != null)
      {
        boolean bool = localCursor.moveToFirst();
        localHttpHost = null;
        if (bool)
        {
          String str = localCursor.getString(localCursor.getColumnIndex("proxy"));
          localHttpHost = null;
          if (str != null)
          {
            int i = str.trim().length();
            localHttpHost = null;
            if (i > 0)
              localHttpHost = new HttpHost(str, 80);
          }
          localCursor.close();
        }
      }
      return localHttpHost;
    }
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.sina.weibo.sdk.net.NetStateManager
 * JD-Core Version:    0.6.0
 */