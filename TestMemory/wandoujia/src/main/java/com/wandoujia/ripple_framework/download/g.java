package com.wandoujia.ripple_framework.download;

import android.content.Context;
import android.text.TextUtils;
import android.widget.Toast;
import com.wandoujia.base.config.GlobalConfig;
import com.wandoujia.download2.DownloadInfo2;
import com.wandoujia.download2.DownloadRequestParam;
import com.wandoujia.download2.DownloadRequestParam.Type;
import com.wandoujia.download2.j;
import com.wandoujia.logv3.model.packages.ContentPackage.Builder;
import com.wandoujia.logv3.model.packages.ContentPackage.Type;
import com.wandoujia.logv3.model.packages.DownloadPackage.Builder;
import com.wandoujia.logv3.model.packages.ExtraPackage.Builder;
import com.wandoujia.logv3.model.packages.TaskEvent.Action;
import com.wandoujia.logv3.model.packages.TaskEvent.Builder;
import com.wandoujia.logv3.model.packages.TaskEvent.Result;
import com.wandoujia.logv3.model.packages.TaskEvent.Status;
import com.wandoujia.net.HttpException;
import com.wandoujia.ripple_framework.event.DownloadEvent.Type;
import com.wandoujia.ripple_framework.i;
import com.wandoujia.ripple_framework.log.Logger;
import java.io.UnsupportedEncodingException;
import java.net.URLDecoder;
import java.util.Iterator;
import java.util.List;

final class g
  implements j
{
  g(DownloadManager paramDownloadManager)
  {
  }

  private boolean a(String paramString)
  {
    if (!DownloadManager.b(this.a).d(paramString))
    {
      DownloadManager.d(this.a).a(paramString);
      DownloadManager.d(this.a).b(paramString);
      return false;
    }
    return true;
  }

  public final void a(DownloadInfo2 paramDownloadInfo2)
  {
    if (a(paramDownloadInfo2.a.b))
    {
      DownloadInfo localDownloadInfo1 = DownloadManager.b(this.a).b(paramDownloadInfo2.a.b);
      if ((localDownloadInfo1 == null) || (localDownloadInfo1.d.b == paramDownloadInfo2.b))
        break label57;
    }
    label57: for (int i = 1; i == 0; i = 0)
      return;
    if ((paramDownloadInfo2.a.a == DownloadRequestParam.Type.APPV2) && (paramDownloadInfo2.g != null) && ((paramDownloadInfo2.g instanceof HttpException)))
    {
      DownloadManager.a(this.a, DownloadManager.b(this.a).b(paramDownloadInfo2.a.b), (HttpException)paramDownloadInfo2.g);
      return;
    }
    DownloadInfo localDownloadInfo2 = DownloadManager.b(this.a).a(paramDownloadInfo2);
    TaskEvent.Builder localBuilder;
    ContentPackage.Builder localBuilder1;
    if (localDownloadInfo2.c == DownloadInfo.Status.SUCCESS)
    {
      localBuilder = new TaskEvent.Builder();
      localBuilder.action(TaskEvent.Action.DOWNLOAD).result(TaskEvent.Result.SUCCESS).status(TaskEvent.Status.TRIGGER);
      localBuilder1 = new ContentPackage.Builder();
      localBuilder1.identity(localDownloadInfo2.m).title(localDownloadInfo2.f);
      switch (j.a[localDownloadInfo2.e.ordinal()])
      {
      default:
      case 1:
      case 2:
      }
    }
    while (true)
    {
      ExtraPackage.Builder localBuilder2 = new ExtraPackage.Builder();
      localBuilder2.content_package(localBuilder1.build());
      localBuilder2.download_package(new DownloadPackage.Builder().url(localDownloadInfo2.d.a.b).build());
      i.k().h().a(localBuilder, localBuilder2);
      DownloadManager.a(this.a, DownloadEvent.Type.DOWNLOAD_STATE_CHANGE, localDownloadInfo2);
      DownloadManager.c(this.a).a(localDownloadInfo2);
      return;
      localBuilder1.type(ContentPackage.Type.APP);
      continue;
      localBuilder1.type(ContentPackage.Type.GAME);
    }
  }

  public final void a(List<DownloadInfo2> paramList)
  {
    Iterator localIterator = paramList.iterator();
    while (true)
    {
      int i;
      label112: DownloadInfo localDownloadInfo2;
      int j;
      label174: Context localContext;
      String str1;
      if (localIterator.hasNext())
      {
        DownloadInfo2 localDownloadInfo21 = (DownloadInfo2)localIterator.next();
        if (!a(localDownloadInfo21.a.b))
          continue;
        DownloadInfo localDownloadInfo1 = DownloadManager.b(this.a).b(localDownloadInfo21.a.b);
        if (localDownloadInfo1 != null)
        {
          DownloadInfo2 localDownloadInfo22 = localDownloadInfo1.d;
          if ((localDownloadInfo22.c != localDownloadInfo21.c) || (localDownloadInfo22.e != localDownloadInfo21.e) || (localDownloadInfo22.d != localDownloadInfo21.d))
          {
            i = 1;
            if (i == 0)
              continue;
            DownloadInfo.Status localStatus = DownloadManager.b(this.a).b(localDownloadInfo21.a.b).c;
            localDownloadInfo2 = DownloadManager.b(this.a).b(localDownloadInfo21);
            if ((localStatus == DownloadInfo.Status.DOWNLOADING) || (localDownloadInfo2.c != DownloadInfo.Status.DOWNLOADING))
              break label428;
            j = 1;
            if (j != 0)
            {
              DownloadManager.a(this.a, DownloadEvent.Type.DOWNLOAD_STATE_CHANGE, localDownloadInfo2);
              if ((localStatus == DownloadInfo.Status.CREATED) && (localDownloadInfo2.h))
              {
                localContext = GlobalConfig.getAppContext();
                str1 = localDownloadInfo2.d.a.b;
                if ((str1 != null) && (str1.contains("url=")))
                  str1 = str1.substring(4 + str1.indexOf("url="));
              }
            }
          }
        }
      }
      try
      {
        String str2 = URLDecoder.decode(str1, "UTF-8");
        String str3 = str2;
        if (!TextUtils.isEmpty(str3))
        {
          if (str3.length() > 25)
            str3 = str3.substring(0, 25) + "...";
          StringBuilder localStringBuilder = new StringBuilder();
          localStringBuilder.append(localContext.getText(R.string.app_downloading));
          localStringBuilder.append("\n");
          localStringBuilder.append(localContext.getString(R.string.download_from)).append(str3);
          Toast.makeText(localContext, localStringBuilder.toString(), 0).show();
        }
        label384: if (localDownloadInfo2.c == DownloadInfo.Status.SUCCESS)
          continue;
        DownloadManager.a(this.a, DownloadEvent.Type.DOWNLOAD_PROGRESS_CHANGE, localDownloadInfo2);
        DownloadManager.c(this.a).a(localDownloadInfo2);
        continue;
        i = 0;
        break label112;
        label428: j = 0;
        break label174;
        return;
      }
      catch (Throwable localThrowable)
      {
        break label384;
      }
      catch (UnsupportedEncodingException localUnsupportedEncodingException)
      {
        break label384;
      }
    }
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou2.jar
 * Qualified Name:     com.wandoujia.ripple_framework.download.g
 * JD-Core Version:    0.6.0
 */