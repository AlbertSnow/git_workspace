package com.wandoujia.jupiter.presenter;

import android.content.ClipData;
import android.content.Context;
import android.os.Build.VERSION;
import android.view.View;
import com.wandoujia.api.proto.GiftDetail;
import com.wandoujia.jupiter.view.p;
import com.wandoujia.ripple_framework.log.h;

final class af extends h
{
  af(GiftDetail paramGiftDetail)
  {
  }

  public final boolean a(View paramView)
  {
    if (Build.VERSION.SDK_INT >= 11)
      ((android.content.ClipboardManager)paramView.getContext().getSystemService("clipboard")).setPrimaryClip(ClipData.newPlainText("wdj_gift_code", this.a.cdkey));
    while (true)
    {
      p.a(paramView.getContext(), 2131624862, p.b).a();
      return false;
      ((android.text.ClipboardManager)paramView.getContext().getSystemService("clipboard")).setText(this.a.cdkey);
    }
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.jupiter.presenter.af
 * JD-Core Version:    0.6.0
 */