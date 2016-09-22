package com.wandoujia.jupiter.share;

import com.tencent.mm.sdk.openapi.WXMediaMessage;
import com.tencent.mm.sdk.openapi.d;
import com.tencent.mm.sdk.openapi.h;
import com.tencent.mm.sdk.openapi.k;
import com.tencent.mm.sdk.openapi.l;
import com.wandoujia.api.proto.SharePlatformEnum.SharePlatform;
import com.wandoujia.base.log.Log;
import com.wandoujia.jupiter.JupiterApplication;

public class e
{
  private static final String a = Log.tag(e.class);
  private d b = k.a(JupiterApplication.d(), "wxed6dfca0ae67f7a3", true);

  public e()
  {
    this.b.a("wxed6dfca0ae67f7a3");
  }

  private static String a(SharePlatformEnum.SharePlatform paramSharePlatform)
  {
    if (paramSharePlatform == SharePlatformEnum.SharePlatform.WECHAT_SESSION);
    for (String str = "session"; ; str = "moment")
    {
      Object[] arrayOfObject = new Object[2];
      arrayOfObject[0] = str;
      arrayOfObject[1] = Long.valueOf(System.currentTimeMillis());
      return String.format("%s:%d", arrayOfObject);
    }
  }

  public final void a(String paramString1, String paramString2, byte[] paramArrayOfByte, l paraml)
  {
    Log.d(a, "share to friend", new Object[0]);
    WXMediaMessage localWXMediaMessage = new WXMediaMessage();
    localWXMediaMessage.mediaObject = paraml;
    localWXMediaMessage.thumbData = paramArrayOfByte;
    localWXMediaMessage.title = paramString1;
    localWXMediaMessage.description = paramString2;
    h localh = new h();
    localh.a = a(SharePlatformEnum.SharePlatform.WECHAT_SESSION);
    localh.b = localWXMediaMessage;
    this.b.a(localh);
  }

  public final boolean a()
  {
    return this.b.a();
  }

  public final void b(String paramString1, String paramString2, byte[] paramArrayOfByte, l paraml)
  {
    Log.d(a, "share to moments", new Object[0]);
    WXMediaMessage localWXMediaMessage = new WXMediaMessage();
    localWXMediaMessage.thumbData = paramArrayOfByte;
    localWXMediaMessage.mediaObject = paraml;
    localWXMediaMessage.title = paramString1;
    localWXMediaMessage.description = paramString2;
    h localh = new h();
    localh.a = a(SharePlatformEnum.SharePlatform.WECHAT_MOMENT);
    localh.b = localWXMediaMessage;
    if (this.b.b() > 553779201)
      localh.c = 1;
    this.b.a(localh);
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.jupiter.share.e
 * JD-Core Version:    0.6.0
 */