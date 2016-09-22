package com.wandoujia.ripple_framework.download;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.text.TextUtils;
import android.widget.Toast;
import com.wandoujia.download2.DownloadInfo2;
import com.wandoujia.download2.DownloadRequestParam;
import com.wandoujia.gamepacket.GamePacketInstaller;
import com.wandoujia.gamepacket.b;
import com.wandoujia.ripple_framework.i;
import com.wandoujia.ripple_framework.installer.install.InstallManager;
import java.io.File;
import java.util.Map;

public class DownloadReceiver extends BroadcastReceiver
{
  private static void a(Context paramContext)
  {
    Class localClass = i.k().d();
    if (localClass == null)
      return;
    Intent localIntent = new Intent(paramContext, localClass);
    localIntent.addFlags(268435456);
    try
    {
      paramContext.startActivity(localIntent);
      return;
    }
    catch (Exception localException)
    {
    }
  }

  public void onReceive(Context paramContext, Intent paramIntent)
  {
    if (paramIntent == null);
    DownloadInfo localDownloadInfo;
    v localv;
    label240: 
    do
    {
      do
        while (true)
        {
          return;
          String str1 = paramIntent.getAction();
          if (!"ripple_framework.intent.action.ACTION_REDIRECT".equalsIgnoreCase(str1))
          {
            if (!"ripple_framework.intent.action.ACTION_OPEN".equalsIgnoreCase(str1))
              continue;
            String str2 = paramIntent.getStringExtra("ripple_framework.intent.extra.DOWNLOAD_IDENTITY");
            if (TextUtils.isEmpty(str2))
            {
              a(paramContext);
              return;
            }
            localDownloadInfo = ((DownloadManager)i.k().a("download")).a(str2);
            if (localDownloadInfo == null)
            {
              a(paramContext);
              return;
            }
            if (!new File(localDownloadInfo.d.a.e).exists())
            {
              Toast.makeText(paramContext, R.string.download_open_file_not_exist, 0).show();
              a(paramContext);
              return;
            }
            localv = ((DownloadManager)i.k().a("download")).b();
          }
          switch (p.a[localDownloadInfo.e.ordinal()])
          {
          default:
            a(paramContext);
            return;
          case 1:
            if ("game_packet".equals(localDownloadInfo.p))
            {
              Map localMap = b.c(localDownloadInfo.q);
              if (localv == null)
                continue;
              String str3 = localDownloadInfo.m;
              String str4 = localDownloadInfo.d.a.e;
              String str5;
              if (localMap != null)
              {
                str5 = (String)localMap.get("src_path");
                if (localMap == null)
                  break label311;
              }
              for (String str6 = (String)localMap.get("dst_path"); ; str6 = "")
              {
                v.a(str3, str4, str5, str6);
                String str7 = localDownloadInfo.m;
                if (!((InstallManager)i.k().a("install")).a().a(str7))
                  break;
                a(paramContext);
                return;
                str5 = "";
                break label240;
              }
            }
          case 2:
          }
        }
      while (localv == null);
      v.a(localDownloadInfo.d.a.e, localDownloadInfo.m);
      return;
    }
    while (localv == null);
    label311: v.b(localDownloadInfo.d.a.e, localDownloadInfo.m);
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.ripple_framework.download.DownloadReceiver
 * JD-Core Version:    0.6.0
 */