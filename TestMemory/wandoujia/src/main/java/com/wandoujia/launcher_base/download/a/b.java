package com.wandoujia.launcher_base.download.a;

import android.content.Context;
import android.content.SharedPreferences;
import android.widget.Toast;
import com.wandoujia.base.utils.NetworkUtil;
import com.wandoujia.download2.DownloadInfo2;
import com.wandoujia.launcher_base.R.string;
import com.wandoujia.launcher_base.view.a.g;
import com.wandoujia.mvc.Action;
import com.wandoujia.ripple_framework.download.DownloadInfo;
import com.wandoujia.ripple_framework.download.DownloadManager;
import java.util.HashMap;
import java.util.Map;

public final class b
  implements Action
{
  private Context a;
  private DownloadInfo b;

  public b(Context paramContext, DownloadInfo paramDownloadInfo)
  {
    this.b = paramDownloadInfo;
    this.a = paramContext;
  }

  private static void a(boolean paramBoolean)
  {
    new HashMap().put("resume_in_3g", String.valueOf(paramBoolean));
  }

  public final void execute()
  {
    if (this.b != null)
    {
      if (NetworkUtil.isNetworkConnected(this.a))
        break label32;
      Toast.makeText(this.a, R.string.open_network_connect, 0).show();
    }
    label32: 
    do
    {
      return;
      Context localContext = this.a;
      int i;
      long l;
      if ((NetworkUtil.isMobileNetworkConnected(localContext)) || ((NetworkUtil.isWifiConnected(localContext)) && (NetworkUtil.checkWifiIsHotSpot(localContext))))
      {
        i = 1;
        if (i == 0)
          continue;
        if (!com.wandoujia.launcher_base.b.a.c())
          break label129;
        l = android.support.v4.app.i.b().getLong("zero_flow_download_lower_limit", 15728640L);
      }
      while (true)
      {
        if ((l <= this.b.d.d) && (com.wandoujia.launcher_base.b.a.c()))
          break label136;
        ((DownloadManager)com.wandoujia.ripple_framework.i.k().a("download")).b(this.b);
        return;
        i = 0;
        break;
        l = 9223372036854775807L;
      }
      g localg = new g(this.a).a(R.string.tips);
      String str = this.a.getString(R.string.download_3g_confirm);
      Object[] arrayOfObject1 = new Object[1];
      Object[] arrayOfObject2 = new Object[1];
      arrayOfObject2[0] = Float.valueOf((float)(this.b.d.d - this.b.d.e) / 1048576.0F);
      arrayOfObject1[0] = String.format("%.1f", arrayOfObject2);
      localg.b(String.format(str, arrayOfObject1)).b(R.string.cancel).a(R.string.continue_download, new c(this)).a().show();
      return;
    }
    while (!NetworkUtil.isWifiConnected(this.a));
    label129: label136: ((DownloadManager)com.wandoujia.ripple_framework.i.k().a("download")).b(this.b);
    a(false);
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.launcher_base.download.a.b
 * JD-Core Version:    0.6.0
 */