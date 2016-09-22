package com.wandoujia.ripple_framework.view.a;

import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.os.Handler;
import android.os.Message;
import android.text.TextUtils;
import android.view.ContextThemeWrapper;
import android.view.Display;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.Window;
import android.view.WindowManager;
import android.view.WindowManager.LayoutParams;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.FrameLayout.LayoutParams;
import android.widget.LinearLayout;
import android.widget.LinearLayout.LayoutParams;
import android.widget.ScrollView;
import android.widget.TextView;
import com.wandoujia.image.view.AsyncImageView;
import com.wandoujia.ripple_framework.R.id;
import com.wandoujia.ripple_framework.R.layout;
import com.wandoujia.ripple_framework.R.style;

public final class a extends Dialog
  implements DialogInterface
{
  private static final int a = R.style.JupiterAlertDialog;
  private View A;
  private Handler B;
  private CharSequence C;
  private CharSequence D;
  private View.OnClickListener E = new b(this);
  private Context b;
  private Window c;
  private LinearLayout d;
  private LinearLayout e;
  private TextView f;
  private LinearLayout g;
  private AsyncImageView h;
  private ScrollView i;
  private TextView j;
  private FrameLayout k;
  private FrameLayout l;
  private LinearLayout m;
  private View n;
  private Button o;
  private Button p;
  private Button q;
  private Message r;
  private Message s;
  private Message t;
  private boolean u = false;
  private boolean v = false;
  private boolean w = false;
  private CharSequence x;
  private CharSequence y;
  private CharSequence z;

  protected a(Context paramContext)
  {
    super(paramContext, a);
    if ((!(paramContext instanceof Activity)) && ((paramContext instanceof ContextThemeWrapper)))
    {
      ContextThemeWrapper localContextThemeWrapper = (ContextThemeWrapper)paramContext;
      if ((localContextThemeWrapper.getBaseContext() instanceof Activity))
        this.b = localContextThemeWrapper.getBaseContext();
    }
    while (true)
    {
      setContentView(R.layout.rip_alert_dialog);
      findViewById(R.id.phoenix_alert_dialog_parentPanel);
      this.B = new i(this);
      this.c = getWindow();
      setCanceledOnTouchOutside(true);
      return;
      this.b = paramContext;
      continue;
      this.b = paramContext;
    }
  }

  public static int a(Context paramContext)
  {
    return c(paramContext);
  }

  private static void a(Button paramButton)
  {
    LinearLayout.LayoutParams localLayoutParams = (LinearLayout.LayoutParams)paramButton.getLayoutParams();
    localLayoutParams.gravity = 1;
    paramButton.setLayoutParams(localLayoutParams);
  }

  private static Display b(Context paramContext)
  {
    return ((Activity)paramContext).getWindow().getWindowManager().getDefaultDisplay();
  }

  private static int c(Context paramContext)
  {
    if (b(paramContext).getWidth() > b(paramContext).getHeight())
      return 90 * b(paramContext).getHeight() / 100;
    return 90 * b(paramContext).getWidth() / 100;
  }

  protected final void a()
  {
    this.B.obtainMessage(1, this).sendToTarget();
  }

  public final void a(int paramInt, CharSequence paramCharSequence, DialogInterface.OnClickListener paramOnClickListener, Message paramMessage)
  {
    if (paramOnClickListener != null)
      paramMessage = this.B.obtainMessage(paramInt, paramOnClickListener);
    switch (paramInt)
    {
    default:
      throw new IllegalArgumentException("Button does not exist");
    case -1:
      this.x = paramCharSequence;
      this.r = paramMessage;
      this.u = true;
      return;
    case -2:
      this.y = paramCharSequence;
      this.s = paramMessage;
      this.v = true;
      return;
    case -3:
    }
    this.z = paramCharSequence;
    this.t = paramMessage;
    this.w = true;
  }

  public final void a(View paramView)
  {
    this.A = paramView;
  }

  public final void a(CharSequence paramCharSequence)
  {
    if (paramCharSequence != null)
      this.D = paramCharSequence;
  }

  protected final void b()
  {
    int i1 = 1;
    this.g = ((LinearLayout)findViewById(R.id.phoenix_alert_dialog_contentPanel));
    WindowManager.LayoutParams localLayoutParams = new WindowManager.LayoutParams();
    localLayoutParams.copyFrom(this.c.getAttributes());
    localLayoutParams.width = c(this.b);
    this.c.setAttributes(localLayoutParams);
    this.i = ((ScrollView)findViewById(R.id.phoenix_alert_dialog_scrollView));
    this.i.setFocusable(false);
    this.j = ((TextView)findViewById(R.id.phoenix_alert_dialog_message));
    int i2;
    if (this.j != null)
    {
      if (this.C != null)
        this.j.setText(this.C);
    }
    else
    {
      this.o = ((Button)findViewById(R.id.phoenix_alert_dialog_positiveButton));
      this.o.setOnClickListener(new c(this));
      if (!TextUtils.isEmpty(this.x))
        break label591;
      this.o.setVisibility(8);
      i2 = 0;
      label167: this.p = ((Button)findViewById(R.id.phoenix_alert_dialog_negativeButton));
      this.p.setOnClickListener(new d(this));
      if (!TextUtils.isEmpty(this.y))
        break label616;
      this.p.setVisibility(8);
      label215: this.q = ((Button)findViewById(R.id.phoenix_alert_dialog_neutraButton));
      this.q.setOnClickListener(new e(this));
      if (!TextUtils.isEmpty(this.z))
        break label644;
      this.q.setVisibility(8);
      label263: this.n = findViewById(R.id.close);
      if (this.n != null)
      {
        this.n.setVisibility(8);
        this.n.setOnClickListener(new f(this));
      }
      if (!this.u)
        break label787;
    }
    label400: label787: for (int i3 = i1; ; i3 = 0)
    {
      if (this.v)
        i3++;
      if (this.w)
        i3++;
      int i4;
      label344: label362: int i5;
      label370: LinearLayout localLinearLayout;
      if (i3 == i1)
      {
        i4 = i1;
        if (i4 != 0)
        {
          if (i2 != i1)
            break label678;
          a(this.o);
        }
        if (i2 == 0)
          break label710;
        i5 = i1;
        this.d = ((LinearLayout)findViewById(R.id.phoenix_alert_dialog_topPanel));
        localLinearLayout = this.d;
        if (TextUtils.isEmpty(this.D))
          break label716;
        this.h = ((AsyncImageView)findViewById(R.id.phoenix_alert_dialog_icon));
        if (i1 == 0)
          break label721;
        this.f = ((TextView)findViewById(R.id.phoenix_alert_dialog_alertTitle));
        this.f.setText(this.D);
        this.f.setPadding(this.h.getPaddingLeft(), this.h.getPaddingTop(), this.h.getPaddingRight(), this.h.getPaddingBottom());
        this.h.setVisibility(8);
      }
      while (true)
      {
        this.m = ((LinearLayout)findViewById(R.id.phoenix_alert_dialog_buttonPanel));
        if (i5 == 0)
          this.m.setVisibility(8);
        if (this.A == null)
          break label763;
        this.k = ((FrameLayout)findViewById(R.id.phoenix_alert_dialog_customPanel));
        this.l = ((FrameLayout)findViewById(R.id.phoenix_alert_dialog_custom));
        this.l.removeAllViews();
        this.l.addView(this.A, new FrameLayout.LayoutParams(-1, -2));
        return;
        this.g.setVisibility(8);
        break;
        label591: this.o.setText(this.x);
        this.o.setVisibility(0);
        i2 = i1;
        break label167;
        label616: this.p.setText(this.y);
        this.p.setVisibility(0);
        i2 |= 2;
        break label215;
        this.q.setText(this.z);
        this.q.setVisibility(0);
        i2 |= 4;
        break label263;
        i4 = 0;
        break label344;
        label678: if (i2 == 2)
        {
          a(this.p);
          break label362;
        }
        if (i2 != 4)
          break label362;
        a(this.q);
        break label362;
        label710: i5 = 0;
        break label370;
        label716: i1 = 0;
        break label400;
        label721: this.e = ((LinearLayout)findViewById(R.id.phoenix_alert_dialog_title_template));
        this.e.setVisibility(8);
        this.h.setVisibility(8);
        localLinearLayout.setVisibility(8);
      }
      label763: this.k = ((FrameLayout)findViewById(R.id.phoenix_alert_dialog_customPanel));
      this.k.setVisibility(8);
      return;
    }
  }

  public final void b(CharSequence paramCharSequence)
  {
    if (paramCharSequence != null)
      this.C = paramCharSequence;
  }

  public final void show()
  {
    b();
    super.show();
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.ripple_framework.view.a.a
 * JD-Core Version:    0.6.0
 */