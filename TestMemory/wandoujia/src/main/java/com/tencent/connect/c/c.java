package com.tencent.connect.c;

import android.app.Activity;
import android.os.Bundle;
import android.os.SystemClock;
import android.text.TextUtils;
import com.tencent.open.a.f;
import com.tencent.tauth.b;
import java.util.ArrayList;

final class c
  implements com.tencent.open.utils.d
{
  c(a parama, Bundle paramBundle, String paramString1, String paramString2, b paramb, Activity paramActivity)
  {
  }

  public final void a(int paramInt, String paramString)
  {
    if (paramInt == 0)
      this.a.putString("imageLocalUrl", paramString);
    do
    {
      a.a(this.f, this.e, this.a, this.d);
      return;
    }
    while ((!TextUtils.isEmpty(this.b)) || (!TextUtils.isEmpty(this.c)));
    if (this.d != null)
    {
      this.d.a(new com.tencent.tauth.d(-6, "获取分享图片失败!"));
      f.e("openSDK_LOG.QQShare", "shareToMobileQQ -- error: 获取分享图片失败!");
    }
    com.tencent.open.b.d.a();
    com.tencent.open.b.d.a(1, "SHARE_CHECK_SDK", "1000", a.b(this.f).b(), "0", Long.valueOf(SystemClock.elapsedRealtime()), "获取分享图片失败!");
  }

  public final void a(ArrayList<String> paramArrayList)
  {
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.tencent.connect.c.c
 * JD-Core Version:    0.6.0
 */