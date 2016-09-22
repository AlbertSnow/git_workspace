package com.wandoujia.jupiter.fragment;

import android.widget.TextView;
import com.wandoujia.api.proto.AppDetail;
import com.wandoujia.ripple_framework.c.c;
import com.wandoujia.ripple_framework.model.Model;

final class ax extends c
{
  protected final void a(Model paramModel)
  {
    if ((e() instanceof TextView))
      ((TextView)e()).setText(paramModel.F().title);
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.jupiter.fragment.ax
 * JD-Core Version:    0.6.0
 */