package com.alipay.squareup.picasso;

import android.graphics.Bitmap;
import android.net.Uri;
import java.lang.ref.WeakReference;

final class n extends Request
{
  private final WeakReference<Target> m;

  n(Picasso paramPicasso, Uri paramUri, Target paramTarget)
  {
    super(paramPicasso, paramUri, 0);
    this.m = new WeakReference(paramTarget);
  }

  private Target d()
  {
    return (Target)this.m.get();
  }

  final void b()
  {
    if (this.i == null)
      throw new AssertionError(String.format("Attempted to complete request with no result!\n%s", new Object[] { this }));
    Target localTarget = d();
    if (localTarget != null)
    {
      localTarget.onSuccess(this.i);
      if (this.i.isRecycled())
        throw new IllegalStateException("Target callback must not recycle bitmap!");
    }
  }

  final void c()
  {
    Target localTarget = d();
    if (localTarget == null)
      return;
    localTarget.onError();
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.alipay.squareup.picasso.n
 * JD-Core Version:    0.6.0
 */