package com.wandoujia.push2;

import android.os.AsyncTask;
import com.wandoujia.gson.JsonSyntaxException;
import com.wandoujia.gson.c;
import com.wandoujia.push2.protocol.Download;

final class r extends AsyncTask<String, Void, Download>
{
  private static Download a(String[] paramArrayOfString)
  {
    c localc = new c();
    try
    {
      Download localDownload = (Download)localc.a(paramArrayOfString[0], Download.class);
      return localDownload;
    }
    catch (JsonSyntaxException localJsonSyntaxException)
    {
    }
    return null;
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.push2.r
 * JD-Core Version:    0.6.0
 */