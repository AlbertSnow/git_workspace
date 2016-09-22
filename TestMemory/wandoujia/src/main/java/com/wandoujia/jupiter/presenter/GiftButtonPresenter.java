package com.wandoujia.jupiter.presenter;

import android.content.res.Resources;
import android.text.TextUtils;
import com.wandoujia.api.proto.GiftDetail;
import com.wandoujia.ripple_framework.c.c;
import com.wandoujia.ripple_framework.model.Model;
import com.wandoujia.ripple_framework.view.StatefulButton;

public final class GiftButtonPresenter extends c
{
  private static final int j = "wdj_gift_state".hashCode();
  private static final int k = "wdj_gift_cd_key".hashCode();
  private StatefulButton a;
  private Model g;
  private GiftDetail h;
  private boolean i = true;
  private GiftButtonPresenter.GiftState l;
  private String m = "";

  public GiftButtonPresenter()
  {
  }

  public GiftButtonPresenter(StatefulButton paramStatefulButton)
  {
    this.a = paramStatefulButton;
    this.i = false;
  }

  public static GiftButtonPresenter.GiftState a(Model paramModel, GiftDetail paramGiftDetail)
  {
    GiftButtonPresenter.GiftState localGiftState;
    if (paramModel.a(j) != null)
    {
      localGiftState = (GiftButtonPresenter.GiftState)paramModel.a(j);
      return localGiftState;
    }
    GiftButtonPresenter.GiftState[] arrayOfGiftState = GiftButtonPresenter.GiftState.values();
    int n = arrayOfGiftState.length;
    for (int i1 = 0; ; i1++)
    {
      if (i1 >= n)
        break label68;
      localGiftState = arrayOfGiftState[i1];
      if (localGiftState.name().equalsIgnoreCase(paramGiftDetail.status))
        break;
    }
    label68: return null;
  }

  private static String b(Model paramModel, GiftDetail paramGiftDetail)
  {
    if (paramModel.a(k) != null)
      return (String)paramModel.a(k);
    return paramGiftDetail.cdkey;
  }

  private void b()
  {
    if ((this.h.is_received != null) && (this.h.is_received.booleanValue()) && (this.i) && (this.l != GiftButtonPresenter.GiftState.EXPIRED))
    {
      this.a.setEnabled(true);
      this.a.setBackgroundResource(2130838378);
      this.a.setText(2131625306);
      this.a.setTextColor(this.a.getResources().getColor(2131362131));
      return;
    }
    this.a.setEnabled(GiftButtonPresenter.GiftState.access$600(this.l));
    this.a.setBackgroundResource(GiftButtonPresenter.GiftState.access$700(this.l));
    this.a.setText(this.a.getResources().getString(GiftButtonPresenter.GiftState.access$800(this.l)));
    this.a.setTextColor(this.a.getResources().getColor(GiftButtonPresenter.GiftState.access$900(this.l)));
  }

  public final void a()
  {
    if (!this.f)
      return;
    this.g.a(j, this.l);
    if (!TextUtils.isEmpty(this.m))
      this.g.a(k, this.m);
    this.g = null;
    super.a();
  }

  protected final void a(Model paramModel)
  {
    if (this.f)
      return;
    if (this.a == null)
      this.a = ((StatefulButton)e());
    if (i() == null);
    for (this.g = paramModel; ; this.g = i())
    {
      this.h = this.g.E();
      this.m = b(this.g, this.h);
      this.l = a(this.g, this.h);
      if (this.l == null)
        this.l = GiftButtonPresenter.GiftState.START_RECEIVE;
      b();
      this.a.setOnClickListener(new bs(this));
      this.f = true;
      return;
    }
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.jupiter.presenter.GiftButtonPresenter
 * JD-Core Version:    0.6.0
 */