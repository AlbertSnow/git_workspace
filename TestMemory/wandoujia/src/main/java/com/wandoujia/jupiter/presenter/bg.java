package com.wandoujia.jupiter.presenter;

import android.content.Context;
import android.content.res.Resources;
import android.text.TextUtils;
import android.widget.TextView;
import com.wandoujia.download2.DownloadInfo2;
import com.wandoujia.gamepacket.GamePacketInstaller;
import com.wandoujia.jupiter.JupiterApplication;
import com.wandoujia.ripple_framework.c.c;
import com.wandoujia.ripple_framework.download.DownloadInfo;
import com.wandoujia.ripple_framework.download.b;
import com.wandoujia.ripple_framework.i;
import com.wandoujia.ripple_framework.installer.install.InstallManager;
import com.wandoujia.ripple_framework.model.Model;

public final class bg extends c
{
  private DownloadInfo a;

  private void a(int paramInt1, int paramInt2)
  {
    if (paramInt2 != 0)
      ((TextView)e()).setText(paramInt2);
    if (paramInt1 != 0)
      ((TextView)e()).setTextColor(f().getResources().getColor(paramInt1));
  }

  public final void a()
  {
    super.a();
    a(0, 0);
    this.a = null;
  }

  protected final void a(Model paramModel)
  {
    this.a = ((DownloadInfo)paramModel.a(2131492894));
    DownloadInfo localDownloadInfo = this.a;
    int j;
    int i;
    switch (bh.a[localDownloadInfo.c.ordinal()])
    {
    default:
      j = 0;
      i = 0;
    case 1:
    case 2:
    case 3:
    case 4:
    }
    while (((InstallManager)i.k().a("install")).a().a(localDownloadInfo.m))
    {
      String str = localDownloadInfo.m;
      if (j != 0)
        ((TextView)e()).setTextColor(f().getResources().getColor(j));
      if (!TextUtils.isEmpty(str))
      {
        int k = ((InstallManager)i.k().a("install")).a().c(str);
        TextView localTextView = (TextView)e();
        Context localContext = JupiterApplication.e();
        Object[] arrayOfObject = new Object[1];
        arrayOfObject[0] = Integer.valueOf(k);
        localTextView.setText(localContext.getString(2131625543, arrayOfObject));
      }
      return;
      if (b.b(localDownloadInfo))
      {
        if (b.a(localDownloadInfo))
        {
          i = 2131624976;
          j = 2131361998;
          continue;
        }
        i = 2131625703;
        j = 2131361998;
        continue;
      }
      i = 2131625444;
      j = 2131361998;
      continue;
      int m = 2131625441;
      if ((localDownloadInfo.d != null) && (localDownloadInfo.d.g != null) && (!TextUtils.isEmpty(localDownloadInfo.d.g.getMessage())) && (localDownloadInfo.d.g.getMessage().contains("Certificate not valid until")))
        m = 2131625442;
      j = 2131362194;
      i = m;
      continue;
      i = 2131625443;
      j = 2131361998;
    }
    a(j, i);
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.jupiter.presenter.bg
 * JD-Core Version:    0.6.0
 */