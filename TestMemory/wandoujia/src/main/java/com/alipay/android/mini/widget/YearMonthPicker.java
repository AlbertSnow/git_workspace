package com.alipay.android.mini.widget;

import android.content.Context;
import android.os.Handler;
import android.support.v4.app.d;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.widget.Button;
import android.widget.RelativeLayout;
import android.widget.TextView;
import java.util.Calendar;

public class YearMonthPicker extends RelativeLayout
{
  protected Handler a = new Handler();
  private Button b;
  private Button c;
  private TextView d;
  private TextView e;
  private Button f;
  private Button g;
  private int h;
  private int i;
  private boolean j = false;
  private boolean k = false;
  private boolean l = false;
  private boolean m = false;
  private int n;

  public YearMonthPicker(Context paramContext)
  {
    super(paramContext);
  }

  public YearMonthPicker(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
    LayoutInflater.from(paramContext).inflate(d.f("mini_year_month_picker"), this, true);
  }

  private static String a(int paramInt)
  {
    String str = String.valueOf(paramInt);
    if (paramInt > 9)
      return str;
    return "0" + str;
  }

  private void a(Button paramButton, boolean paramBoolean1, boolean paramBoolean2)
  {
    paramButton.setOnClickListener(new t(this, paramBoolean2, paramBoolean1));
    paramButton.setOnLongClickListener(new u(this, paramBoolean1, paramBoolean2));
    paramButton.setOnTouchListener(new v(this));
  }

  public final void a()
  {
    Calendar localCalendar = Calendar.getInstance();
    a(localCalendar.get(1), 1 + localCalendar.get(2));
  }

  public final void a(int paramInt1, int paramInt2)
  {
    int i1 = Math.min(this.h, Math.max(paramInt1, this.i));
    this.d.setText(String.valueOf(i1));
    this.e.setText(a(paramInt2));
  }

  protected final void a(boolean paramBoolean)
  {
    if (paramBoolean)
    {
      e();
      return;
    }
    f();
  }

  public final void b()
  {
    if (this.i < this.n);
    for (int i1 = this.n; ; i1 = this.i)
    {
      this.i = i1;
      return;
    }
  }

  public final void b(boolean paramBoolean)
  {
    if (paramBoolean)
    {
      g();
      return;
    }
    h();
  }

  public final int c()
  {
    return Integer.valueOf(this.d.getText().toString()).intValue();
  }

  public final String d()
  {
    return this.e.getText().toString();
  }

  protected final void e()
  {
    int i1 = 1 + Integer.valueOf(this.d.getText().toString()).intValue();
    if (i1 > this.h)
      i1 = this.i;
    this.d.setText(String.valueOf(i1));
  }

  protected final void f()
  {
    int i1 = 1 + Integer.valueOf(this.e.getText().toString()).intValue();
    if (i1 > 12)
      i1 = 1;
    this.e.setText(a(i1));
  }

  protected final void g()
  {
    int i1 = -1 + Integer.valueOf(this.d.getText().toString()).intValue();
    if (i1 < this.i)
      i1 = this.h;
    this.d.setText(String.valueOf(i1));
  }

  protected final void h()
  {
    int i1 = -1 + Integer.valueOf(this.e.getText().toString()).intValue();
    if (i1 <= 0)
      i1 = 12;
    this.e.setText(a(i1));
  }

  protected void onFinishInflate()
  {
    super.onFinishInflate();
    this.b = ((Button)findViewById(d.a("year_up_btn")));
    this.c = ((Button)findViewById(d.a("year_down_btn")));
    this.d = ((TextView)findViewById(d.a("year_text")));
    this.f = ((Button)findViewById(d.a("month_up_btn")));
    this.g = ((Button)findViewById(d.a("month_down_btn")));
    this.e = ((TextView)findViewById(d.a("month_text")));
    a(this.b, true, true);
    a(this.c, true, false);
    a(this.f, false, true);
    a(this.g, false, false);
    this.n = Calendar.getInstance().get(1);
    int i1 = 100 * (this.n / 100);
    this.i = Math.max(0, i1 - 100);
    this.h = (i1 + 100);
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.alipay.android.mini.widget.YearMonthPicker
 * JD-Core Version:    0.6.0
 */