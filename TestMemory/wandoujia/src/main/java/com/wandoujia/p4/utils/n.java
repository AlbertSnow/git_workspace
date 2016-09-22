package com.wandoujia.p4.utils;

import android.content.Context;
import android.graphics.Bitmap;
import android.os.Handler;
import com.wandoujia.image.ae;
import com.wandoujia.jupiter.JupiterApplication;
import com.wandoujia.p4.model.a;

final class n
  implements ae
{
  n(Context paramContext, a parama)
  {
  }

  public final void a(Bitmap paramBitmap, boolean paramBoolean)
  {
    JupiterApplication.a().post(new o(this, paramBitmap));
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.p4.utils.n
 * JD-Core Version:    0.6.0
 */