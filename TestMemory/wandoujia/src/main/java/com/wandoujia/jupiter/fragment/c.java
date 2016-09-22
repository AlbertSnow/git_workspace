package com.wandoujia.jupiter.fragment;

import android.view.KeyEvent;
import android.view.View;
import android.view.View.OnKeyListener;

final class c
  implements View.OnKeyListener
{
  c(DetailExpandInfoFragment paramDetailExpandInfoFragment)
  {
  }

  public final boolean onKey(View paramView, int paramInt, KeyEvent paramKeyEvent)
  {
    if ((paramKeyEvent.getAction() == 1) && (paramInt == 4))
    {
      this.a.finish();
      return true;
    }
    return false;
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.jupiter.fragment.c
 * JD-Core Version:    0.6.0
 */