package com.wandoujia.jupiter.presenter;

import android.content.Context;
import android.content.res.Resources;
import android.widget.GridView;
import com.wandoujia.jupiter.JupiterApplication;
import com.wandoujia.jupiter.a.d;
import com.wandoujia.jupiter.a.i;
import com.wandoujia.ripple_framework.c.c;
import com.wandoujia.ripple_framework.model.Model;
import java.util.List;

public final class bv extends c
{
  protected final void a(Model paramModel)
  {
    if (paramModel == null)
      return;
    GridView localGridView = (GridView)e();
    d locald = new d();
    locald.a(paramModel.B());
    localGridView.setNumColumns(paramModel.B().size());
    localGridView.setAdapter(new i(locald));
    localGridView.setHorizontalSpacing(JupiterApplication.e().getResources().getDimensionPixelSize(2131427722));
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.jupiter.presenter.bv
 * JD-Core Version:    0.6.0
 */