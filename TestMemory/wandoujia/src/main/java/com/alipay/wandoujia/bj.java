package com.alipay.wandoujia;

import android.view.View;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import java.util.List;

final class bj
  implements AdapterView.OnItemClickListener
{
  bj(bg parambg)
  {
  }

  public final void onItemClick(AdapterView paramAdapterView, View paramView, int paramInt, long paramLong)
  {
    bg.a(this.a, (String)bg.b(this.a).get(paramInt));
    this.a.a(this.a, new am(ra.a$65b37f89(this.a.r())));
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.alipay.wandoujia.bj
 * JD-Core Version:    0.6.0
 */