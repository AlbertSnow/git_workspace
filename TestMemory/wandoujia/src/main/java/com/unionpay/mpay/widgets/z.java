package com.unionpay.mpay.widgets;

import android.content.Context;
import android.os.Handler;
import android.os.Handler.Callback;
import android.os.Message;
import android.text.InputFilter.LengthFilter;
import android.widget.RelativeLayout;
import android.widget.RelativeLayout.LayoutParams;
import android.widget.TextView;
import com.unionpay.mpay.a.a;
import org.json.JSONObject;

public final class z extends n
  implements Handler.Callback
{
  private z.a g = null;
  private TextView h = null;
  private Handler i = null;

  public z(Context paramContext, int paramInt, JSONObject paramJSONObject)
  {
    super(paramContext, paramInt, paramJSONObject, 1021);
    e();
    this.g = null;
  }

  public z(Context paramContext, int paramInt, JSONObject paramJSONObject, byte paramByte)
  {
    super(paramContext, paramInt, paramJSONObject, 1021);
    e();
  }

  private void a(boolean paramBoolean, String paramString)
  {
    if (paramBoolean)
      this.h.setTextColor(-1);
    while (true)
    {
      this.h.setText(paramString);
      this.h.setEnabled(paramBoolean);
      return;
      this.h.setTextColor(-6710887);
    }
  }

  private void e()
  {
    int j = 2 * ((this.e - a.a) / 3);
    this.f.a(new InputFilter.LengthFilter(6));
    this.f.a(2);
    RelativeLayout.LayoutParams localLayoutParams1 = new RelativeLayout.LayoutParams(j, -2);
    localLayoutParams1.addRule(9, -1);
    localLayoutParams1.addRule(15, -1);
    this.f.setLayoutParams(localLayoutParams1);
    this.h = new TextView(getContext());
    this.h.setBackgroundDrawable(com.unionpay.mpay.c.c.a(getContext()).a(2008, -1, -1));
    this.h.setGravity(17);
    this.h.setText(com.unionpay.mpay.b.c.ab.o);
    this.h.setTextColor(-1);
    this.h.setTextSize(16.0F);
    this.h.setShadowLayer(1.0F, 0.0F, -2.0F, 1711276032);
    this.h.setOnClickListener(new d(this));
    RelativeLayout.LayoutParams localLayoutParams2 = new RelativeLayout.LayoutParams(this.e - j, a.r);
    localLayoutParams2.addRule(11, -1);
    localLayoutParams2.addRule(15, -1);
    this.d.addView(this.h, localLayoutParams2);
  }

  public final void a(z.a parama)
  {
    this.g = parama;
  }

  public final boolean a()
  {
    if (this.b);
    do
      return true;
    while (6 == b().length());
    return false;
  }

  public final void d()
  {
    this.i = new Handler(this);
    e locale = new e(this);
    String str = com.unionpay.mpay.b.c.ab.p;
    Object[] arrayOfObject = new Object[1];
    arrayOfObject[0] = Integer.valueOf(60);
    a(false, String.format(str, arrayOfObject));
    locale.start();
  }

  public final boolean handleMessage(Message paramMessage)
  {
    switch (paramMessage.what)
    {
    default:
      return false;
    case 1:
      a(true, com.unionpay.mpay.b.c.ab.o);
      this.i = null;
      return true;
    case 0:
    }
    String str = com.unionpay.mpay.b.c.ab.p;
    Object[] arrayOfObject = new Object[1];
    arrayOfObject[0] = Integer.valueOf(paramMessage.arg1);
    a(false, String.format(str, arrayOfObject));
    return true;
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.unionpay.mpay.widgets.z
 * JD-Core Version:    0.6.0
 */