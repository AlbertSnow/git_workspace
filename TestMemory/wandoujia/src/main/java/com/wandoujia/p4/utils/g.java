package com.wandoujia.p4.utils;

import android.content.Context;
import android.os.Environment;
import android.os.Handler;
import android.text.TextUtils;
import com.wandoujia.base.log.Log;
import com.wandoujia.base.utils.SystemUtil;
import com.wandoujia.jupiter.JupiterApplication;
import java.io.File;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public final class g
{
  private static final String[] c = { "/UCDownloads", "/QQBrowser/Download", "/LXDOWNLOAD/DOWNLOAD", "/qihoo_browser/download", "/AnTutuBrowser/download", "/Boat_Browser_Cn/downloads", "/cmsurfclient/downloads", "/MxBrowser/Downloads", "/TTDownload/installapk", "/TDDOWNLOAD", "/DolphinBrowserCN/download", "/Dolphin_Browser_Mini/download", "/ydBrowser/download", "/360Browser/download", "/Download/2345浏览器下载/安装包", "/Download/APK", "/Download/Other", "/MyFavorite", "/QQBrowser/安装包", "/apc/ApcBrowser/downloads", "/baidu/SearchBox/downloads", "/baidu/flyflow/downloads", "/cowry/download", "/data/internal_memory", "/download", "/hao123/down/apk", "/kbrowser/download/App", "/下载/Download", "/下载/Other", "/我的下载", "/我的下载/浏览器/其他", "/话机U盘/Download" };
  private final List<String> a = new ArrayList();
  private final Context b;
  private boolean d = false;
  private String e = "";
  private String f = "";

  public g(Context paramContext)
  {
    this.b = paramContext;
  }

  private void b()
  {
    Iterator localIterator = this.a.iterator();
    label211: 
    while (localIterator.hasNext())
    {
      String str1 = (String)localIterator.next();
      File[] arrayOfFile = new File(str1).listFiles();
      if (arrayOfFile == null)
        continue;
      int i = arrayOfFile.length;
      for (int j = 0; ; j++)
      {
        if (j >= i)
          break label211;
        File localFile = arrayOfFile[j];
        String str2 = localFile.getName();
        if ((TextUtils.isEmpty(str2)) || (!str2.matches("wandoujia-(.*?)___bind___[0-9A-Za-z_\\.]+\\.apk")))
          continue;
        String[] arrayOfString = str2.split("___bind___");
        if ((arrayOfString == null) || (arrayOfString.length != 2))
          continue;
        int k = arrayOfString[1].lastIndexOf('_');
        if (k <= 0)
          continue;
        String str3 = arrayOfString[1].substring(0, k);
        if (TextUtils.isEmpty(str3))
          continue;
        localFile.renameTo(new File(str1, str3 + System.currentTimeMillis() + ".apk"));
        this.d = true;
        this.e = str3;
        this.f = str1;
        break;
      }
    }
  }

  public final void a()
  {
    if ("mounted".equals(Environment.getExternalStorageState()))
    {
      File localFile = Environment.getExternalStorageDirectory();
      if (localFile.exists())
      {
        String str1 = localFile.getAbsolutePath();
        this.a.add(str1);
        if (SystemUtil.aboveApiLevel(8))
          this.a.add(str1 + "/" + Environment.DIRECTORY_DOWNLOADS);
        while (true)
        {
          String[] arrayOfString = c;
          for (int i = 0; i < 32; i++)
          {
            String str2 = arrayOfString[i];
            this.a.add(str1 + str2);
          }
          this.a.add(str1 + "/Download");
        }
      }
    }
    else
    {
      this.a.add("/mnt/internal/download/");
      this.a.add("/mnt/sdcard2/下载/Other");
    }
    b();
    if (this.d)
      JupiterApplication.a().post(new h(this));
    if (this.d)
      Log.d("bindingDownload", this.d + ", " + this.e + ", " + this.f, new Object[0]);
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.p4.utils.g
 * JD-Core Version:    0.6.0
 */