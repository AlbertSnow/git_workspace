package com.wandoujia.launcher_base.view.a;

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
import android.view.View.OnClickListener;
import android.view.Window;
import android.view.WindowManager;
import android.view.WindowManager.LayoutParams;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.LinearLayout.LayoutParams;
import android.widget.ScrollView;
import android.widget.TextView;
import com.wandoujia.image.view.AsyncImageView;
import com.wandoujia.launcher_base.R.id;
import com.wandoujia.launcher_base.R.layout;
import com.wandoujia.launcher_base.R.style;

public final class a extends Dialog
  implements DialogInterface
{
  private static final int a = R.style.PhoenixAlertDialog;
  private CharSequence A;
  private View.OnClickListener B = new b(this);
  private Context b;
  private Window c;
  private LinearLayout d;
  private LinearLayout e;
  private AsyncImageView f;
  private TextView g;
  private LinearLayout h;
  private ScrollView i;
  private TextView j;
  private FrameLayout k;
  private LinearLayout l;
  private Button m;
  private Button n;
  private Button o;
  private Message p;
  private Message q;
  private Message r;
  private boolean s = false;
  private boolean t = false;
  private boolean u = false;
  private CharSequence v;
  private CharSequence w;
  private CharSequence x;
  private Handler y;
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
      setContentView(R.layout.aa_phoenix_alert_dialog);
      findViewById(R.id.phoenix_alert_dialog_parentPanel);
      this.y = new h(this);
      this.c = getWindow();
      return;
      this.b = paramContext;
      continue;
      this.b = paramContext;
    }
  }

  private static Display a(Context paramContext)
  {
    return ((Activity)paramContext).getWindow().getWindowManager().getDefaultDisplay();
  }

  private static void a(Button paramButton)
  {
    LinearLayout.LayoutParams localLayoutParams = (LinearLayout.LayoutParams)paramButton.getLayoutParams();
    localLayoutParams.gravity = 1;
    paramButton.setLayoutParams(localLayoutParams);
  }

  protected final void a()
  {
    this.y.obtainMessage(1, this).sendToTarget();
  }

  public final void a(int paramInt, CharSequence paramCharSequence, DialogInterface.OnClickListener paramOnClickListener, Message paramMessage)
  {
    if (paramOnClickListener != null)
      paramMessage = this.y.obtainMessage(paramInt, paramOnClickListener);
    switch (paramInt)
    {
    default:
      throw new IllegalArgumentException("Button does not exist");
    case -1:
      this.v = paramCharSequence;
      this.p = paramMessage;
      this.s = true;
      return;
    case -2:
      this.w = paramCharSequence;
      this.q = paramMessage;
      this.t = true;
      return;
    case -3:
    }
    this.x = paramCharSequence;
    this.r = paramMessage;
    this.u = true;
  }

  public final void a(CharSequence paramCharSequence)
  {
    if (paramCharSequence != null)
      this.A = paramCharSequence;
  }

  protected final void b()
  {
    int i1 = 1;
    this.h = ((LinearLayout)findViewById(R.id.phoenix_alert_dialog_contentPanel));
    WindowManager.LayoutParams localLayoutParams = new WindowManager.LayoutParams();
    localLayoutParams.copyFrom(this.c.getAttributes());
    Context localContext = this.b;
    int i2;
    label152: int i3;
    if (a(localContext).getWidth() > a(localContext).getHeight())
    {
      i2 = 90 * a(localContext).getHeight() / 100;
      localLayoutParams.width = i2;
      this.c.setAttributes(localLayoutParams);
      this.i = ((ScrollView)findViewById(R.id.phoenix_alert_dialog_scrollView));
      this.i.setFocusable(false);
      this.j = ((TextView)findViewById(R.id.phoenix_alert_dialog_message));
      if (this.j != null)
      {
        if (this.z == null)
          break label552;
        this.j.setText(this.z);
      }
      this.m = ((Button)findViewById(R.id.phoenix_alert_dialog_positiveButton));
      this.m.setOnClickListener(new c(this));
      if (!TextUtils.isEmpty(this.v))
        break label564;
      this.m.setVisibility(8);
      i3 = 0;
      label203: this.n = ((Button)findViewById(R.id.phoenix_alert_dialog_negativeButton));
      this.n.setOnClickListener(new d(this));
      if (!TextUtils.isEmpty(this.w))
        break label589;
      this.n.setVisibility(8);
      label251: this.o = ((Button)findViewById(R.id.phoenix_alert_dialog_neutraButton));
      this.o.setOnClickListener(new e(this));
      if (!TextUtils.isEmpty(this.x))
        break label617;
      this.o.setVisibility(8);
      label299: if (!this.s)
        break label736;
    }
    label338: label736: for (int i4 = i1; ; i4 = 0)
    {
      if (this.t)
        i4++;
      if (this.u)
        i4++;
      int i5;
      label356: int i6;
      label364: LinearLayout localLinearLayout;
      if (i4 == i1)
      {
        i5 = i1;
        if (i5 != 0)
        {
          if (i3 != i1)
            break label651;
          a(this.m);
        }
        if (i3 == 0)
          break label683;
        i6 = i1;
        this.d = ((LinearLayout)findViewById(R.id.phoenix_alert_dialog_topPanel));
        localLinearLayout = this.d;
        if (TextUtils.isEmpty(this.A))
          break label689;
        this.f = ((AsyncImageView)findViewById(R.id.phoenix_alert_dialog_icon));
        if (i1 == 0)
          break label694;
        this.g = ((TextView)findViewById(R.id.phoenix_alert_dialog_alertTitle));
        this.g.setText(this.A);
        this.g.setPadding(this.f.getPaddingLeft(), this.f.getPaddingTop(), this.f.getPaddingRight(), this.f.getPaddingBottom());
        this.f.setVisibility(8);
      }
      while (true)
      {
        this.l = ((LinearLayout)findViewById(R.id.phoenix_alert_dialog_buttonPanel));
        if (i6 == 0)
          this.l.setVisibility(8);
        this.k = ((FrameLayout)findViewById(R.id.phoenix_alert_dialog_customPanel));
        this.k.setVisibility(8);
        return;
        i2 = 90 * a(localContext).getWidth() / 100;
        break;
        this.h.setVisibility(8);
        break label152;
        this.m.setText(this.v);
        this.m.setVisibility(0);
        i3 = i1;
        break label203;
        this.n.setText(this.w);
        this.n.setVisibility(0);
        i3 |= 2;
        break label251;
        label617: this.o.setText(this.x);
        this.o.setVisibility(0);
        i3 |= 4;
        break label299;
        i5 = 0;
        break label338;
        if (i3 == 2)
        {
          a(this.n);
          break label356;
        }
        if (i3 != 4)
          break label356;
        a(this.o);
        break label356;
        i6 = 0;
        break label364;
        i1 = 0;
        break label394;
        this.e = ((LinearLayout)findViewById(R.id.phoenix_alert_dialog_title_template));
        this.e.setVisibility(8);
        this.f.setVisibility(8);
        localLinearLayout.setVisibility(8);
      }
    }
  }

  public final void b(CharSequence paramCharSequence)
  {
    if (paramCharSequence != null)
      this.z = paramCharSequence;
  }

  public final void show()
  {
    b();
    super.show();
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.launcher_base.view.a.a
 * JD-Core Version:    0.6.0
 */