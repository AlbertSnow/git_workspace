package com.tencent.connect.avatar;

import android.graphics.Bitmap;
import android.graphics.Bitmap.CompressFormat;
import android.os.Bundle;
import com.tencent.open.b.d;
import com.tencent.open.utils.a;
import java.io.ByteArrayOutputStream;

final class k extends com.tencent.connect.common.b
{
  public k(com.tencent.connect.b.c paramc)
  {
    super(paramc, 0);
  }

  public final void a(Bitmap paramBitmap, com.tencent.tauth.b paramb)
  {
    Bundle localBundle = a();
    ByteArrayOutputStream localByteArrayOutputStream = new ByteArrayOutputStream();
    paramBitmap.compress(Bitmap.CompressFormat.JPEG, 40, localByteArrayOutputStream);
    byte[] arrayOfByte = localByteArrayOutputStream.toByteArray();
    paramBitmap.recycle();
    com.tencent.connect.common.c localc = new com.tencent.connect.common.c(paramb);
    localBundle.putByteArray("picture", arrayOfByte);
    a.a(this.a, android.support.v4.app.b.t(), "user/set_user_face", localBundle, "POST", localc);
    d.a();
    d.a(this.a.d(), this.a.b(), "ANDROIDSDK.SETAVATAR.SUCCEED", "12", "19", "0");
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.tencent.connect.avatar.k
 * JD-Core Version:    0.6.0
 */