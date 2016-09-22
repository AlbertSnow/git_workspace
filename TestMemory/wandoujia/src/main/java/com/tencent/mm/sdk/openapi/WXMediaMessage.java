package com.tencent.mm.sdk.openapi;

import android.graphics.Bitmap;
import android.graphics.Bitmap.CompressFormat;
import com.tencent.mm.sdk.platformtools.b;
import java.io.ByteArrayOutputStream;

public final class WXMediaMessage
{
  public static final String ACTION_WXAPPMESSAGE = "com.tencent.mm.sdk.openapi.Intent.ACTION_WXAPPMESSAGE";
  public String description;
  public l mediaObject;
  public int sdkVer;
  public byte[] thumbData;
  public String title;

  public WXMediaMessage()
  {
    this(null);
  }

  public WXMediaMessage(l paraml)
  {
    this.mediaObject = paraml;
  }

  final boolean a()
  {
    if ((this.thumbData != null) && (this.thumbData.length > 32768))
    {
      b.a("MicroMsg.SDK.WXMediaMessage");
      return false;
    }
    if ((this.title != null) && (this.title.length() > 512))
    {
      b.a("MicroMsg.SDK.WXMediaMessage");
      return false;
    }
    if ((this.description != null) && (this.description.length() > 1024))
    {
      b.a("MicroMsg.SDK.WXMediaMessage");
      return false;
    }
    if (this.mediaObject == null)
    {
      b.a("MicroMsg.SDK.WXMediaMessage");
      return false;
    }
    return this.mediaObject.checkArgs();
  }

  public final int getType()
  {
    if (this.mediaObject == null)
      return 0;
    return this.mediaObject.type();
  }

  public final void setThumbImage(Bitmap paramBitmap)
  {
    try
    {
      ByteArrayOutputStream localByteArrayOutputStream = new ByteArrayOutputStream();
      paramBitmap.compress(Bitmap.CompressFormat.JPEG, 85, localByteArrayOutputStream);
      this.thumbData = localByteArrayOutputStream.toByteArray();
      localByteArrayOutputStream.close();
      return;
    }
    catch (Exception localException)
    {
      b.a("MicroMsg.SDK.WXMediaMessage");
    }
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.tencent.mm.sdk.openapi.WXMediaMessage
 * JD-Core Version:    0.6.0
 */