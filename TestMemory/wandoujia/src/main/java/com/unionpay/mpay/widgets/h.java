package com.unionpay.mpay.widgets;

import android.content.Context;
import android.graphics.Paint;
import android.graphics.Paint.Style;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.support.v4.app.d;
import android.text.InputFilter;
import android.text.TextWatcher;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.View.OnFocusChangeListener;
import android.view.View.OnTouchListener;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.LinearLayout.LayoutParams;
import android.widget.RelativeLayout;
import android.widget.RelativeLayout.LayoutParams;
import android.widget.TextView.OnEditorActionListener;
import com.unionpay.mpay.a.a;
import com.unionpay.mpay.c.c;

public final class h extends RelativeLayout
  implements View.OnClickListener
{
  private Context a = null;
  private EditText b = null;
  private ImageView c = null;
  private boolean d = true;
  private h.a e = null;
  private c f = null;
  private Paint g = null;
  private Drawable h = null;
  private View.OnClickListener i = new p(this);
  private TextWatcher j = new t(this);
  private View.OnFocusChangeListener k = new v(this);

  public h(Context paramContext, Drawable paramDrawable)
  {
    super(paramContext);
    this.a = paramContext;
    this.h = paramDrawable;
    this.f = c.a(this.a);
    RelativeLayout.LayoutParams localLayoutParams1 = new RelativeLayout.LayoutParams(-1, a.q);
    int m = a.b;
    localLayoutParams1.setMargins(m, m, m, m);
    setBackgroundColor(0);
    setBackgroundDrawable(this.f.a(1012, -1, -1));
    setLayoutParams(localLayoutParams1);
    setFocusable(true);
    this.c = new ImageView(this.a);
    this.c.setBackgroundDrawable(this.f.a(2000, -1, a.o));
    this.c.setOnClickListener(this.i);
    this.c.setVisibility(8);
    this.c.setId(this.c.hashCode());
    this.c.setAdjustViewBounds(true);
    this.c.setVisibility(4);
    int n = d.a(this.a, 30.0F);
    RelativeLayout.LayoutParams localLayoutParams2 = new RelativeLayout.LayoutParams(n, n);
    localLayoutParams2.addRule(15, -1);
    localLayoutParams2.addRule(11, -1);
    localLayoutParams2.rightMargin = d.a(this.a, 4.0F);
    addView(this.c, localLayoutParams2);
    LinearLayout localLinearLayout;
    if (this.h != null)
    {
      localLinearLayout = new LinearLayout(this.a);
      localLinearLayout.setId(localLinearLayout.hashCode());
      localLinearLayout.setGravity(16);
      localLinearLayout.setOrientation(0);
      ImageView localImageView1 = new ImageView(this.a);
      localImageView1.setBackgroundDrawable(this.h);
      localImageView1.setAdjustViewBounds(true);
      int i1 = a.x;
      localLinearLayout.addView(localImageView1, new RelativeLayout.LayoutParams(i1, i1));
      ImageView localImageView2 = new ImageView(this.a);
      localImageView2.setBackgroundDrawable(this.f.a(1011, -1, -1));
      LinearLayout.LayoutParams localLayoutParams = new LinearLayout.LayoutParams(-2, a.t);
      localLayoutParams.leftMargin = a.g;
      localLayoutParams.gravity = 16;
      localLinearLayout.addView(localImageView2, localLayoutParams);
      RelativeLayout.LayoutParams localLayoutParams3 = new RelativeLayout.LayoutParams(-2, -2);
      localLayoutParams3.addRule(15, -1);
      localLayoutParams3.addRule(9, -1);
      localLayoutParams3.leftMargin = d.a(this.a, 4.0F);
      addView(localLinearLayout, localLayoutParams3);
    }
    while (true)
    {
      this.b = new EditText(this.a);
      this.b.setSingleLine();
      this.b.setHintTextColor(-14842175);
      this.b.setTextSize(16.0F);
      this.b.setBackgroundDrawable(null);
      this.b.setGravity(16);
      this.b.addTextChangedListener(this.j);
      this.b.setPadding(m / 2, 0, 0, 0);
      this.b.setTextColor(-16758391);
      if (this.d)
        this.b.setOnFocusChangeListener(this.k);
      RelativeLayout.LayoutParams localLayoutParams4 = new RelativeLayout.LayoutParams(-1, a.s);
      localLayoutParams4.addRule(0, this.c.getId());
      localLayoutParams4.addRule(15, -1);
      if (localLinearLayout != null)
        localLayoutParams4.addRule(1, localLinearLayout.getId());
      localLayoutParams4.rightMargin = d.a(this.a, 8.0F);
      localLayoutParams4.leftMargin = localLayoutParams4.rightMargin;
      localLayoutParams4.bottomMargin = m;
      localLayoutParams4.topMargin = m;
      addView(this.b, localLayoutParams4);
      this.g = new Paint();
      this.g.setStyle(Paint.Style.STROKE);
      this.g.setAntiAlias(true);
      this.g.setStrokeWidth(1.0F);
      this.g.setColor(-4731932);
      new RectF();
      return;
      localLinearLayout = null;
    }
  }

  public final void a()
  {
    this.d = false;
    if (this.b != null)
    {
      this.b.setKeyListener(null);
      this.b.setFocusable(false);
      if ((this.c != null) && (this.c.getVisibility() == 0))
        this.c.setVisibility(4);
    }
  }

  public final void a(int paramInt)
  {
    if (this.b != null)
      this.b.setInputType(paramInt);
  }

  public final void a(InputFilter paramInputFilter)
  {
    InputFilter[] arrayOfInputFilter1 = { paramInputFilter };
    if (this.b == null)
      return;
    InputFilter[] arrayOfInputFilter2 = this.b.getFilters();
    if (arrayOfInputFilter2 == null)
    {
      this.b.setFilters(arrayOfInputFilter1);
      return;
    }
    InputFilter[] arrayOfInputFilter3 = new InputFilter[1 + arrayOfInputFilter2.length];
    System.arraycopy(arrayOfInputFilter2, 0, arrayOfInputFilter3, 0, arrayOfInputFilter2.length);
    System.arraycopy(arrayOfInputFilter1, 0, arrayOfInputFilter3, arrayOfInputFilter2.length, 1);
    this.b.setFilters(arrayOfInputFilter3);
  }

  public final void a(TextWatcher paramTextWatcher)
  {
    if ((this.b != null) && (paramTextWatcher != null))
      this.b.addTextChangedListener(paramTextWatcher);
  }

  public final void a(TextView.OnEditorActionListener paramOnEditorActionListener)
  {
    if ((this.b != null) && (this.d))
      this.b.setOnEditorActionListener(paramOnEditorActionListener);
  }

  public final void a(h.a parama)
  {
    this.e = parama;
    if (this.b != null)
      this.b.setOnClickListener(this);
  }

  public final void a(String paramString)
  {
    if ((this.b != null) && (paramString != null))
      this.b.setHint(paramString);
  }

  public final String b()
  {
    EditText localEditText = this.b;
    String str = null;
    if (localEditText != null)
      str = this.b.getText().toString();
    return str;
  }

  public final void b(int paramInt)
  {
    if (this.b != null)
      this.b.setSelection(paramInt);
  }

  public final void b(String paramString)
  {
    if ((this.b != null) && (paramString != null))
      this.b.setText(paramString);
  }

  public final void c()
  {
    if (this.b != null)
      this.b.setLongClickable(false);
  }

  public final void d()
  {
    if (this.b == null);
    do
    {
      return;
      this.b.setText("");
    }
    while (this.e == null);
    this.e.d();
  }

  public final void onClick(View paramView)
  {
    if (this.e != null)
      this.e.e();
  }

  public final void setOnTouchListener(View.OnTouchListener paramOnTouchListener)
  {
    if (this.b != null)
      this.b.setOnTouchListener(paramOnTouchListener);
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.unionpay.mpay.widgets.h
 * JD-Core Version:    0.6.0
 */