package com.tencent.mm.sdk.channel;

import android.content.Context;
import android.content.Intent;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff.Mode;

public final class MMessage
{
  public ColorStateList a;
  public PorterDuff.Mode b;
  public boolean c;
  public boolean d;

  public static void a(Context paramContext, String paramString1, String paramString2, String paramString3)
  {
    String str1 = paramString1 + ".permission.MM_MESSAGE";
    Intent localIntent = new Intent(paramString2);
    String str2 = paramContext.getPackageName();
    localIntent.putExtra("_mmessage_sdkVersion", 553779201);
    localIntent.putExtra("_mmessage_appPackage", str2);
    localIntent.putExtra("_mmessage_content", paramString3);
    localIntent.putExtra("_mmessage_checksum", a(paramString3, str2));
    paramContext.sendBroadcast(localIntent, str1);
    new StringBuilder("send mm message, intent=").append(localIntent).append(", perm=").append(str1);
    com.tencent.mm.sdk.platformtools.b.c("MicroMsg.SDK.MMessage");
  }

  static byte[] a(String paramString1, String paramString2)
  {
    StringBuffer localStringBuffer = new StringBuffer();
    if (paramString1 != null)
      localStringBuffer.append(paramString1);
    localStringBuffer.append(553779201);
    localStringBuffer.append(paramString2);
    localStringBuffer.append("mMcShCsTr");
    return android.support.v4.app.b.d(localStringBuffer.toString().substring(1, 9).getBytes()).getBytes();
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.tencent.mm.sdk.channel.MMessage
 * JD-Core Version:    0.6.0
 */