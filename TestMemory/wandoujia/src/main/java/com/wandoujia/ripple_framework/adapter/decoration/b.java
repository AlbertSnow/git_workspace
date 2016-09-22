package com.wandoujia.ripple_framework.adapter.decoration;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import com.wandoujia.ripple_framework.R.color;
import com.wandoujia.ripple_framework.i;

public final class b extends a
{
  protected final boolean a(int paramInt1, int paramInt2)
  {
    return false;
  }

  protected final BaseItemDecoration.Direction b(int paramInt1, int paramInt2)
  {
    return BaseItemDecoration.Direction.TOP;
  }

  protected final Drawable c(int paramInt1, int paramInt2)
  {
    return i.k().g().getResources().getDrawable(R.color.transparent);
  }

  protected final int d(int paramInt1, int paramInt2)
  {
    return 0;
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou2.jar
 * Qualified Name:     com.wandoujia.ripple_framework.adapter.decoration.b
 * JD-Core Version:    0.6.0
 */