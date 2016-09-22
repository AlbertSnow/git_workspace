package com.wandoujia.account.widget;

import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface.OnClickListener;
import android.os.Handler;
import android.os.Message;
import android.text.TextUtils;
import android.view.Display;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.Window;
import android.view.WindowManager;
import android.view.WindowManager.LayoutParams;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.FrameLayout.LayoutParams;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.LinearLayout.LayoutParams;
import android.widget.ScrollView;
import android.widget.TextView;
import com.wandoujia.account.R.id;
import com.wandoujia.account.R.layout;
import com.wandoujia.account.R.style;

public final class a extends Dialog
{
  private CharSequence A;
  private CharSequence B;
  private View.OnClickListener C = new b(this);
  private Context a;
  private Window b;
  private LinearLayout c;
  private LinearLayout d;
  private ImageView e;
  private TextView f;
  private LinearLayout g;
  private ScrollView h;
  private TextView i;
  private FrameLayout j;
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
  private View y;
  private Handler z;

  protected a(Context paramContext)
  {
    super(paramContext, R.style.account_base_alertDialog);
    this.a = paramContext;
    setContentView(R.layout.account_base_alert_dialog);
    findViewById(R.id.base_alert_dialog_parentPanel);
    this.z = new e(this);
    this.b = getWindow();
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
    int i1 = 1;
    this.g = ((LinearLayout)findViewById(R.id.base_alert_dialog_contentPanel));
    WindowManager.LayoutParams localLayoutParams = new WindowManager.LayoutParams();
    localLayoutParams.copyFrom(this.b.getAttributes());
    Context localContext = this.a;
    int i2;
    label152: int i3;
    if (a(localContext).getWidth() > a(localContext).getHeight())
    {
      i2 = 90 * a(localContext).getHeight() / 100;
      localLayoutParams.width = i2;
      this.b.setAttributes(localLayoutParams);
      this.h = ((ScrollView)findViewById(R.id.base_alert_dialog_scrollView));
      this.h.setFocusable(false);
      this.i = ((TextView)findViewById(R.id.base_alert_dialog_message));
      if (this.i != null)
      {
        if (this.A == null)
          break label580;
        this.i.setText(this.A);
      }
      this.m = ((Button)findViewById(R.id.base_alert_dialog_positiveButton));
      this.m.setOnClickListener(this.C);
      if (!TextUtils.isEmpty(this.v))
        break label592;
      this.m.setVisibility(8);
      i3 = 0;
      label199: this.n = ((Button)findViewById(R.id.base_alert_dialog_negativeButton));
      this.n.setOnClickListener(this.C);
      if (!TextUtils.isEmpty(this.w))
        break label617;
      this.n.setVisibility(8);
      label243: this.o = ((Button)findViewById(R.id.base_alert_dialog_neutraButton));
      this.o.setOnClickListener(this.C);
      if (!TextUtils.isEmpty(this.x))
        break label645;
      this.o.setVisibility(8);
      label287: if (!this.s)
        break label788;
    }
    label645: label788: for (int i4 = i1; ; i4 = 0)
    {
      if (this.t)
        i4++;
      if (this.u)
        i4++;
      int i5;
      label326: label344: int i6;
      label352: LinearLayout localLinearLayout;
      if (i4 == i1)
      {
        i5 = i1;
        if (i5 != 0)
        {
          if (i3 != i1)
            break label679;
          a(this.m);
        }
        if (i3 == 0)
          break label711;
        i6 = i1;
        this.c = ((LinearLayout)findViewById(R.id.base_alert_dialog_topPanel));
        localLinearLayout = this.c;
        if (TextUtils.isEmpty(this.B))
          break label717;
        label382: this.e = ((ImageView)findViewById(R.id.base_alert_dialog_icon));
        if (i1 == 0)
          break label722;
        this.f = ((TextView)findViewById(R.id.base_alert_dialog_alertTitle));
        this.f.setText(this.B);
        this.f.setPadding(this.e.getPaddingLeft(), this.e.getPaddingTop(), this.e.getPaddingRight(), this.e.getPaddingBottom());
        this.e.setVisibility(8);
      }
      while (true)
      {
        this.l = ((LinearLayout)findViewById(R.id.base_alert_dialog_buttonPanel));
        if (i6 == 0)
          this.l.setVisibility(8);
        if (this.y == null)
          break label764;
        this.j = ((FrameLayout)findViewById(R.id.base_alert_dialog_customPanel));
        this.k = ((FrameLayout)findViewById(R.id.base_alert_dialog_custom));
        this.k.removeAllViews();
        this.k.addView(this.y, new FrameLayout.LayoutParams(-1, -2));
        return;
        i2 = 90 * a(localContext).getWidth() / 100;
        break;
        label580: this.g.setVisibility(8);
        break label152;
        label592: this.m.setText(this.v);
        this.m.setVisibility(0);
        i3 = i1;
        break label199;
        label617: this.n.setText(this.w);
        this.n.setVisibility(0);
        i3 |= 2;
        break label243;
        this.o.setText(this.x);
        this.o.setVisibility(0);
        i3 |= 4;
        break label287;
        i5 = 0;
        break label326;
        label679: if (i3 == 2)
        {
          a(this.n);
          break label344;
        }
        if (i3 != 4)
          break label344;
        a(this.o);
        break label344;
        label711: i6 = 0;
        break label352;
        label717: i1 = 0;
        break label382;
        label722: this.d = ((LinearLayout)findViewById(R.id.base_alert_dialog_title_template));
        this.d.setVisibility(8);
        this.e.setVisibility(8);
        localLinearLayout.setVisibility(8);
      }
      label764: this.j = ((FrameLayout)findViewById(R.id.base_alert_dialog_customPanel));
      this.j.setVisibility(8);
      return;
    }
  }

  public final void a(int paramInt, CharSequence paramCharSequence, DialogInterface.OnClickListener paramOnClickListener, Message paramMessage)
  {
    if (paramOnClickListener != null)
      paramMessage = this.z.obtainMessage(paramInt, paramOnClickListener);
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

  public final void a(View paramView)
  {
    this.y = paramView;
  }

  public final void a(CharSequence paramCharSequence)
  {
    if (paramCharSequence != null)
      this.B = paramCharSequence;
  }

  public final void b(CharSequence paramCharSequence)
  {
    if (paramCharSequence != null)
      this.A = paramCharSequence;
  }

  public final void show()
  {
    a();
    super.show();
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.account.widget.a
 * JD-Core Version:    0.6.0
 */