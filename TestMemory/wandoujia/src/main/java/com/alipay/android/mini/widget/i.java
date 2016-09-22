package com.alipay.android.mini.widget;

import android.app.Dialog;
import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.support.v4.app.d;
import android.text.TextUtils;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;

public final class i extends Dialog
  implements DialogInterface
{
  private l a;
  private DialogInterface b;
  private Handler c;
  private Button d;
  private Button e;
  private View f;
  private TextView g;
  private TextView h;
  private ImageView i;
  private FrameLayout j;
  private View k;
  private boolean l;
  private View.OnClickListener m;

  public i(l paraml)
  {
    super(paraml.c, d.h("AlertDialog"));
    if (Build.VERSION.SDK_INT >= 11);
    for (boolean bool = true; ; bool = false)
    {
      this.l = bool;
      this.m = new m(this);
      this.a = paraml;
      this.b = this;
      this.c = new k(this.b);
      return;
    }
  }

  public final void a(int paramInt, CharSequence paramCharSequence, DialogInterface.OnClickListener paramOnClickListener, Message paramMessage)
  {
    if (paramOnClickListener != null)
      paramMessage = this.c.obtainMessage(paramInt, paramOnClickListener);
    switch (paramInt)
    {
    default:
      throw new IllegalArgumentException("Button does not exist");
    case -1:
      this.a.e = paramCharSequence;
      this.a.i = paramMessage;
      return;
    case -2:
    }
    this.a.f = paramCharSequence;
    this.a.j = paramMessage;
  }

  protected final void onCreate(Bundle paramBundle)
  {
    int n = 8;
    super.onCreate(paramBundle);
    setContentView(d.f("msp_dialog_alert"));
    this.d = ((Button)findViewById(d.a("left_button")));
    this.e = ((Button)findViewById(d.a("right_button")));
    this.f = findViewById(d.a("dialog_split_v"));
    this.g = ((TextView)findViewById(d.a("dialog_title")));
    this.h = ((TextView)findViewById(d.a("dialog_message")));
    this.i = ((ImageView)findViewById(d.a("dialog_divider")));
    this.j = ((FrameLayout)findViewById(d.a("dialog_content_view")));
    this.k = findViewById(d.a("dialog_button_group"));
    int i1;
    label193: label219: Button localButton1;
    label263: Button localButton2;
    label276: int i2;
    label298: label317: int i3;
    label332: View localView2;
    if (TextUtils.isEmpty(this.a.a))
    {
      this.g.setVisibility(n);
      this.i.setVisibility(n);
      if ((TextUtils.isEmpty(this.a.b)) || (this.a.d != null))
        break label390;
      i1 = 1;
      if (i1 == 0)
        break label395;
      this.h.setVisibility(0);
      this.h.setText(this.a.b);
      if (this.a.d != null)
      {
        this.j.removeAllViews();
        this.j.addView(this.a.d);
      }
      if (!this.l)
        break label406;
      localButton1 = this.e;
      if (!this.l)
        break label415;
      localButton2 = this.d;
      if (!TextUtils.isEmpty(this.a.e))
        break label424;
      localButton1.setVisibility(n);
      i2 = 0;
      if (!TextUtils.isEmpty(this.a.f))
        break label469;
      localButton2.setVisibility(n);
      View localView1 = this.f;
      if (i2 <= 1)
        break label514;
      i3 = 0;
      localView1.setVisibility(i3);
      localView2 = this.k;
      if (i2 != 0)
        break label520;
    }
    while (true)
    {
      localView2.setVisibility(n);
      return;
      this.g.setVisibility(0);
      this.i.setVisibility(0);
      this.g.setText(this.a.a);
      break;
      label390: i1 = 0;
      break label193;
      label395: this.h.setVisibility(n);
      break label219;
      label406: localButton1 = this.d;
      break label263;
      label415: localButton2 = this.e;
      break label276;
      label424: localButton1.setVisibility(0);
      localButton1.setText(this.a.e);
      localButton1.setOnClickListener(this.m);
      localButton1.setTag(this.a.i);
      i2 = 1;
      break label298;
      label469: localButton2.setVisibility(0);
      localButton2.setText(this.a.f);
      localButton2.setOnClickListener(this.m);
      localButton2.setTag(this.a.j);
      i2++;
      break label317;
      label514: i3 = n;
      break label332;
      label520: n = 0;
    }
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.alipay.android.mini.widget.i
 * JD-Core Version:    0.6.0
 */