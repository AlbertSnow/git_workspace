package com.alipay.android.mini.widget;

import android.app.Dialog;
import android.content.Context;
import android.os.Bundle;
import android.support.v4.app.d;
import android.text.TextUtils;
import android.widget.TextView;

public final class s extends Dialog
{
  private static boolean c = true;
  private TextView a;
  private CharSequence b;

  public s(Context paramContext)
  {
    super(paramContext, d.a(paramContext, "ProgressDialog", "style"));
  }

  public static void a()
  {
    c = true;
  }

  public final void dismiss()
  {
    if (super.isShowing())
      super.dismiss();
    this.a = null;
  }

  protected final void onCreate(Bundle paramBundle)
  {
    super.onCreate(paramBundle);
    Context localContext1 = getContext();
    setContentView(d.a(localContext1, "msp_dialog_progress", "layout"));
    this.a = ((TextView)findViewById(d.a(localContext1, "text", "id")));
    Context localContext2;
    if (TextUtils.isEmpty(this.b))
    {
      localContext2 = getContext();
      if (!c)
        break label98;
    }
    label98: for (int i = d.a(localContext1, "mini_loading_1", "string"); ; i = d.a(localContext1, "mini_loading", "string"))
    {
      this.b = localContext2.getText(i);
      c = false;
      this.a.setText(this.b);
      return;
    }
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.alipay.android.mini.widget.s
 * JD-Core Version:    0.6.0
 */