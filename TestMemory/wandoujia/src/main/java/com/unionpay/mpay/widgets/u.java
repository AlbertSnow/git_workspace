package com.unionpay.mpay.widgets;

import android.content.Context;
import android.text.InputFilter.LengthFilter;
import android.widget.RelativeLayout;
import android.widget.RelativeLayout.LayoutParams;
import android.widget.TextView;
import com.unionpay.mpay.a.a;
import com.unionpay.mpay.c.c;
import com.unionpay.mpay.utils.e;
import org.json.JSONObject;

public final class u extends n
{
  private u.a g = null;
  private String h = null;
  private String i = null;

  public u(Context paramContext, int paramInt, JSONObject paramJSONObject)
  {
    this(paramContext, paramInt, paramJSONObject, 0);
  }

  private u(Context paramContext, int paramInt, JSONObject paramJSONObject, byte paramByte)
  {
    super(paramContext, paramInt, paramJSONObject, 1018);
    this.h = e.a(paramJSONObject, "button_label");
    this.i = e.a(paramJSONObject, "button_action");
    this.f.a(new InputFilter.LengthFilter(11));
    this.f.a(2);
    if ((this.h == null) || (this.h.length() <= 0))
      return;
    int j = 2 * ((this.e - a.a) / 3);
    RelativeLayout.LayoutParams localLayoutParams1 = new RelativeLayout.LayoutParams(j, -2);
    localLayoutParams1.addRule(9, -1);
    localLayoutParams1.addRule(15, -1);
    this.f.setLayoutParams(localLayoutParams1);
    TextView localTextView = new TextView(getContext());
    localTextView.setBackgroundDrawable(c.a(getContext()).a(2008, -1, -1));
    localTextView.setGravity(17);
    localTextView.setText(this.h);
    localTextView.setTextColor(-1);
    localTextView.setTextSize(16.0F);
    localTextView.setShadowLayer(1.0F, 0.0F, -2.0F, 1711276032);
    localTextView.setOnClickListener(new ab(this));
    RelativeLayout.LayoutParams localLayoutParams2 = new RelativeLayout.LayoutParams(this.e - j, a.r);
    localLayoutParams2.addRule(11, -1);
    localLayoutParams2.addRule(15, -1);
    this.d.addView(localTextView, localLayoutParams2);
  }

  public final void a(u.a parama)
  {
    this.g = parama;
  }

  public final boolean a()
  {
    if (this.b);
    do
      return true;
    while (11 == this.f.b().length());
    return false;
  }

  public final String b()
  {
    return this.f.b();
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.unionpay.mpay.widgets.u
 * JD-Core Version:    0.6.0
 */