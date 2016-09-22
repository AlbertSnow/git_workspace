package com.wandoujia.ripple_framework.view;

import android.graphics.Bitmap;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.p;
import com.android.volley.toolbox.q;

final class ao
  implements q
{
  ao(SmartImageView paramSmartImageView, boolean paramBoolean, long paramLong)
  {
  }

  private void a(int paramInt)
  {
    if ((SmartImageView.c(this.c) == null) || (SmartImageView.d(this.c).equals(SmartImageView.c(this.c))))
    {
      if (SmartImageView.d(this.c).equals(SmartImageView.c(this.c)));
      b(paramInt);
      return;
    }
    String str = SmartImageView.c(this.c);
    SmartImageView.e(this.c);
    SmartImageView.a(this.c, str, this.a);
  }

  private void b(int paramInt)
  {
    if (paramInt != 0)
      this.c.setImageResource(paramInt);
  }

  public final void a(p paramp, boolean paramBoolean)
  {
    if ((paramBoolean) && (this.a))
    {
      this.c.post(new ap(this, paramp));
      return;
    }
    if (paramp.b() != null)
    {
      Bitmap localBitmap = paramp.b();
      if (SmartImageView.f(this.c) != null)
        SmartImageView.f(this.c).a(this.c, localBitmap);
      if (SmartImageView.a(this.c, this.b))
        this.c.startAnimation(SmartImageView.g(this.c));
      this.c.setImageBitmap(localBitmap);
      return;
    }
    if (paramBoolean)
    {
      b(SmartImageView.b(this.c));
      return;
    }
    a(SmartImageView.b(this.c));
  }

  public final void onErrorResponse(VolleyError paramVolleyError)
  {
    a(SmartImageView.a(this.c));
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou2.jar
 * Qualified Name:     com.wandoujia.ripple_framework.view.ao
 * JD-Core Version:    0.6.0
 */