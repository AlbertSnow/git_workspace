package com.alipay.android.mini.widget;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.support.v4.app.d;
import android.text.Editable;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.widget.EditText;
import com.alipay.wandoujia.ic;

public class CustomEditText extends EditText
  implements ic
{
  private boolean a = false;
  private Drawable b;
  private CustomEditText.c c;
  private int d = 0;
  private int e = 0;
  private int f = 0;
  private int g = 0;
  private int h;
  private int i;
  private CustomEditText.a j;

  public CustomEditText(Context paramContext)
  {
    super(paramContext);
  }

  public CustomEditText(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
  }

  public CustomEditText(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet, paramInt);
  }

  private void b()
  {
    if (!this.a)
    {
      i();
      return;
    }
    if (this.a)
    {
      int k = getWidth();
      int m = getHeight();
      int n = this.b.getIntrinsicWidth();
      int i1 = this.b.getIntrinsicHeight();
      this.d = (k - n - n / 4);
      this.e = ((m - i1) / 2);
      this.f = (n + this.d);
      this.g = (i1 + this.e);
      setCompoundDrawablesWithIntrinsicBounds(null, null, this.b, null);
      return;
    }
    setCompoundDrawablesWithIntrinsicBounds(null, null, null, null);
    getCompoundPaddingTop();
  }

  public final void a()
  {
    super.setCompoundDrawablesWithIntrinsicBounds(null, null, null, null);
    this.a = false;
  }

  public final void a(Drawable paramDrawable, CustomEditText.c paramc)
  {
    if (paramDrawable == null)
      i();
    this.a = true;
    this.c = paramc;
    this.b = paramDrawable;
    b();
    super.invalidate();
  }

  final void a(View paramView, boolean paramBoolean)
  {
    CustomEditText localCustomEditText = (CustomEditText)paramView;
    if ((paramBoolean) && (localCustomEditText.getText().toString().length() > 0))
    {
      if (localCustomEditText.b == null)
        localCustomEditText.b = localCustomEditText.getResources().getDrawable(d.e("mini_icon_clean"));
      localCustomEditText.a = true;
      localCustomEditText.b();
    }
    while (true)
    {
      if (this.j != null)
        this.j.a(this, paramBoolean);
      return;
      localCustomEditText.a();
    }
  }

  public final void a(CustomEditText.a parama)
  {
    this.j = parama;
  }

  public final void b(Drawable paramDrawable, CustomEditText.c paramc)
  {
    if (paramDrawable == null)
      i();
    this.a = true;
    this.c = paramc;
    this.b = paramDrawable;
  }

  public void i()
  {
    this.b = null;
    this.a = false;
    this.c = null;
  }

  public void onEditorAction(int paramInt)
  {
    super.onEditorAction(paramInt);
  }

  protected void onLayout(boolean paramBoolean, int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    super.onLayout(paramBoolean, paramInt1, paramInt2, paramInt3, paramInt4);
  }

  protected void onMeasure(int paramInt1, int paramInt2)
  {
    super.onMeasure(paramInt1, paramInt2);
    if ((this.h != paramInt1) || (this.i != paramInt2))
    {
      this.h = paramInt1;
      this.i = paramInt2;
      b();
    }
  }

  public boolean onTouchEvent(MotionEvent paramMotionEvent)
  {
    if ((this.d > 0) && (this.a))
    {
      float f1 = paramMotionEvent.getX();
      float f2 = paramMotionEvent.getY();
      if ((f1 >= this.d) && (f1 <= this.f) && (f2 >= this.e) && (f2 <= this.g) && (this.c != null))
      {
        if (paramMotionEvent.getAction() == 1)
          this.c.a(this.b);
        return true;
      }
    }
    return super.onTouchEvent(paramMotionEvent);
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.alipay.android.mini.widget.CustomEditText
 * JD-Core Version:    0.6.0
 */