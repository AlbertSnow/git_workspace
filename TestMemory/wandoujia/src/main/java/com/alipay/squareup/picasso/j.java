package com.alipay.squareup.picasso;

import android.graphics.Bitmap;
import android.net.Uri;

public final class j
{
  private final Picasso a;
  private final Uri b;

  j()
  {
    this.a = null;
    this.b = null;
  }

  j(Picasso paramPicasso, Uri paramUri)
  {
    this.a = paramPicasso;
    this.b = paramUri;
  }

  public final void a(Target paramTarget)
  {
    if (paramTarget == null)
      throw new IllegalArgumentException("Target must not be null.");
    if (this.b == null)
    {
      this.a.a(paramTarget);
      return;
    }
    String str = p.a(this.b, 0, null);
    Bitmap localBitmap = this.a.a(paramTarget, this.b, str);
    if (localBitmap != null)
    {
      paramTarget.onSuccess(localBitmap);
      return;
    }
    n localn = new n(this.a, this.b, paramTarget);
    this.a.a(localn);
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.alipay.squareup.picasso.j
 * JD-Core Version:    0.6.0
 */