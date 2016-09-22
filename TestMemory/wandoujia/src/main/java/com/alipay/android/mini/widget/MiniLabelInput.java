package com.alipay.android.mini.widget;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.support.v4.app.d;
import android.text.Editable;
import android.text.InputFilter;
import android.text.InputFilter.LengthFilter;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.widget.LinearLayout;
import android.widget.TextView;

public class MiniLabelInput extends LinearLayout
{
  private LinearLayout a;
  private CustomEditText b;
  private TextView c;
  private Drawable d;
  private String e;
  private CustomEditText.c f;
  private String g;
  private boolean h;
  private int i;

  public MiniLabelInput(Context paramContext)
  {
    this(paramContext, null);
  }

  public MiniLabelInput(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
    LayoutInflater.from(paramContext).inflate(d.f("mini_widget_label_input"), this, true);
  }

  private void i()
  {
    this.b.a();
    if (this.d != null)
      this.b.a(this.d, this.f);
  }

  public final void a()
  {
    this.h = true;
  }

  public final void a(int paramInt)
  {
    this.i = paramInt;
  }

  public final void a(Drawable paramDrawable)
  {
    this.d = paramDrawable;
  }

  public final void a(TextWatcher paramTextWatcher)
  {
    this.b.addTextChangedListener(paramTextWatcher);
  }

  public final void a(CustomEditText.c paramc)
  {
    this.f = paramc;
    i();
  }

  public final void a(String paramString)
  {
    this.e = paramString;
  }

  public final void b()
  {
    this.f = null;
    this.a = ((LinearLayout)findViewById(d.a("mini_widget_label_input")));
    this.c = ((TextView)findViewById(d.a("mini_widget_label_input_label")));
    this.b = ((CustomEditText)findViewById(d.a("mini_widget_label_input_input")));
    if (!TextUtils.isEmpty(this.e))
      this.c.setText(this.e);
    if (this.d != null)
      i();
    if (!TextUtils.isEmpty(this.g))
      this.b.setHint(this.g);
    if (this.h)
    {
      this.b.setInputType(128);
      this.b.setInputType(129);
    }
    if (this.i > 0)
    {
      CustomEditText localCustomEditText = this.b;
      InputFilter[] arrayOfInputFilter = new InputFilter[1];
      arrayOfInputFilter[0] = new InputFilter.LengthFilter(this.i);
      localCustomEditText.setFilters(arrayOfInputFilter);
    }
    this.a.setOnClickListener(new n(this));
    this.b.addTextChangedListener(new o(this));
    this.b.setOnFocusChangeListener(new p(this));
  }

  public final void b(int paramInt)
  {
    this.b.setInputType(paramInt);
  }

  public final void b(String paramString)
  {
    this.g = paramString;
  }

  public final void c()
  {
    this.d = null;
  }

  public final void c(int paramInt)
  {
    if (paramInt > 0)
    {
      CustomEditText localCustomEditText = this.b;
      InputFilter[] arrayOfInputFilter = new InputFilter[1];
      arrayOfInputFilter[0] = new InputFilter.LengthFilter(paramInt);
      localCustomEditText.setFilters(arrayOfInputFilter);
    }
  }

  public final void c(String paramString)
  {
    this.c.setText(paramString);
  }

  public final void d()
  {
    Drawable localDrawable = this.b.getContext().getResources().getDrawable(d.e("mini_icon_clean"));
    this.b.b(localDrawable, new q(this));
  }

  public final void d(String paramString)
  {
    this.b.setText(paramString);
  }

  public final CustomEditText e()
  {
    return this.b;
  }

  public final void e(String paramString)
  {
    this.b.setHint(paramString);
  }

  public final TextView f()
  {
    return this.c;
  }

  public final String g()
  {
    Editable localEditable = this.b.getText();
    if (localEditable.length() == 0)
      return "";
    return localEditable.toString().replaceAll(" ", "");
  }

  public final void h()
  {
    this.b.setEnabled(false);
  }

  protected void onFinishInflate()
  {
    super.onFinishInflate();
    b();
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.alipay.android.mini.widget.MiniLabelInput
 * JD-Core Version:    0.6.0
 */