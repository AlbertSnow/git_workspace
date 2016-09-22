package com.wandoujia.p4.views.a;

import android.app.AlertDialog;
import android.app.AlertDialog.Builder;
import android.app.Dialog;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;

public final class f extends Dialog
{
  private final AlertDialog.Builder a;
  private AlertDialog b;
  private final Context c;

  public f(Context paramContext)
  {
    super(paramContext);
    this.c = paramContext;
    this.a = new AlertDialog.Builder(paramContext);
  }

  public final void dismiss()
  {
    this.b.dismiss();
  }

  public final void setContentView(int paramInt)
  {
    View localView = ((LayoutInflater)this.c.getSystemService("layout_inflater")).inflate(paramInt, null);
    this.a.setView(localView);
    this.b = this.a.create();
    this.b.requestWindowFeature(1);
  }

  public final void setContentView(View paramView)
  {
    this.a.setView(paramView);
    this.b = this.a.create();
    this.b.requestWindowFeature(1);
  }

  public final void show()
  {
    if (this.b == null)
      return;
    this.b.show();
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.p4.views.a.f
 * JD-Core Version:    0.6.0
 */