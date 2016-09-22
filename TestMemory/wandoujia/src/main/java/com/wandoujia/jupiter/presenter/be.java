package com.wandoujia.jupiter.presenter;

import android.content.Context;
import android.content.res.Resources;
import android.text.SpannableString;
import android.text.style.ForegroundColorSpan;
import com.wandoujia.base.utils.TextUtil;
import com.wandoujia.download2.DownloadInfo2;
import com.wandoujia.ripple_framework.c.c;
import com.wandoujia.ripple_framework.download.DownloadInfo;
import com.wandoujia.ripple_framework.download.DownloadInfo.Status;
import com.wandoujia.ripple_framework.i;
import com.wandoujia.ripple_framework.model.Model;

public final class be extends c
{
  private DownloadInfo a;

  private void a(DownloadInfo paramDownloadInfo)
  {
    int i;
    long l3;
    String str1;
    label107: com.wandoujia.nirvana.framework.ui.a.a locala2;
    long l5;
    long l6;
    if (paramDownloadInfo.d.c > 0)
    {
      i = paramDownloadInfo.d.c;
      d().b().b(2131492945).c(0).d(i);
      com.wandoujia.nirvana.framework.ui.a.a locala1 = d().b().b(2131492947);
      l3 = paramDownloadInfo.d.f;
      if ((float)l3 >= 1024.0F)
        break label210;
      Context localContext3 = i.k().g();
      Object[] arrayOfObject3 = new Object[1];
      arrayOfObject3[0] = Long.valueOf(l3);
      str1 = localContext3.getString(2131624324, arrayOfObject3);
      locala1.a(str1);
      locala2 = d().b().b(2131492946);
      l5 = paramDownloadInfo.d.e;
      l6 = paramDownloadInfo.d.d;
      if (l6 > 0L)
        break label306;
    }
    label306: for (String str2 = ""; ; str2 = TextUtil.formatSizeInfo(l5) + "/" + TextUtil.formatSizeInfo(l6))
    {
      locala2.a(str2);
      return;
      long l1 = paramDownloadInfo.d.e;
      long l2 = paramDownloadInfo.d.d;
      if (l2 <= 0L)
        l2 = 1L + l1;
      i = (int)(l1 * 100L / l2);
      break;
      label210: long l4 = ()((float)l3 / 1024.0F);
      if ((float)l4 < 1024.0F)
      {
        Context localContext2 = i.k().g();
        Object[] arrayOfObject2 = new Object[1];
        arrayOfObject2[0] = Long.valueOf(l4);
        str1 = localContext2.getString(2131623936, arrayOfObject2);
        break label107;
      }
      Context localContext1 = i.k().g();
      Object[] arrayOfObject1 = new Object[1];
      arrayOfObject1[0] = Float.valueOf((float)l4 / 1024.0F);
      str1 = localContext1.getString(2131623937, arrayOfObject1);
      break label107;
    }
  }

  private void a(boolean paramBoolean)
  {
    if (paramBoolean)
    {
      d().b().b(2131492947).f(0).b(2131492946).f(0).b(2131492945).f(0).b(2131492948).f(0).b(2131492972).f(4);
      return;
    }
    d().b().b(2131492947).f(4).b(2131492946).f(4).b(2131492945).f(4).b(2131492948).f(4).b(2131492972).f(0);
  }

  public final void a()
  {
    super.a();
    this.a = null;
  }

  protected final void a(Model paramModel)
  {
    this.a = ((DownloadInfo)paramModel.a(2131492894));
    DownloadInfo localDownloadInfo = this.a;
    if ((localDownloadInfo != null) && ((localDownloadInfo.c.isPaused()) || (localDownloadInfo.c.isDownloading())))
    {
      a(true);
      if ((localDownloadInfo.c.isDownloading()) && (localDownloadInfo.d.e > 0L));
      for (int i = 1; i != 0; i = 0)
      {
        d().b().b(2131492947).f(0).b(2131492946).f(0).b(2131492945).f(0).b(2131492948).f(4);
        a(localDownloadInfo);
        return;
      }
      com.wandoujia.nirvana.framework.ui.a.a locala = d().b().b(2131492947).f(4).b(2131492946).f(4).b(2131492945).f(0).b(2131492948).f(0);
      Context localContext;
      if (localDownloadInfo != null)
        localContext = i.k().g().getApplicationContext();
      Object localObject;
      switch (bf.a[localDownloadInfo.c.ordinal()])
      {
      default:
        localObject = null;
      case 1:
      case 2:
      case 3:
      case 4:
      case 5:
      case 6:
      case 7:
      case 8:
      case 9:
      case 10:
      }
      while (true)
      {
        locala.a((CharSequence)localObject);
        a(localDownloadInfo);
        return;
        localObject = localContext.getString(2131625443);
        continue;
        if (localDownloadInfo.d.e > 0L)
        {
          localObject = localContext.getString(2131625440);
          continue;
        }
        localObject = localContext.getString(2131625443);
        continue;
        localObject = localContext.getString(2131625254);
        continue;
        localObject = localContext.getString(2131624668);
        continue;
        String str = localContext.getString(2131625441);
        int j = localContext.getResources().getColor(2131362193);
        localObject = new SpannableString(str);
        ((SpannableString)localObject).setSpan(new ForegroundColorSpan(j), 0, str.length(), 17);
        continue;
        localObject = localContext.getString(2131625439);
        continue;
        localObject = localContext.getString(2131625444);
      }
    }
    a(false);
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.jupiter.presenter.be
 * JD-Core Version:    0.6.0
 */