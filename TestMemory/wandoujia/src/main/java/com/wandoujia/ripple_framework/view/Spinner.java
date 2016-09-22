package com.wandoujia.ripple_framework.view;

import android.annotation.TargetApi;
import android.content.Context;
import android.content.res.Resources;
import android.support.v4.app.b;
import android.support.v7.app.f;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewGroup.LayoutParams;
import android.widget.FrameLayout.LayoutParams;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.PopupWindow;
import android.widget.ScrollView;
import android.widget.TextView;
import com.wandoujia.ripple_framework.R.color;
import com.wandoujia.ripple_framework.R.id;
import com.wandoujia.ripple_framework.R.style;
import java.util.ArrayList;
import java.util.List;

public class Spinner extends LinearLayout
{
  private View a;
  private View b;
  private boolean c;
  private PopupWindow d;
  private LinearLayout e;
  private View f;
  private ax g;
  private aw h;
  private az i;
  private List<View> j;
  private ViewGroup k;
  private boolean l;
  private int m = R.color.black_60_transparency;
  private int n = 180;
  private String o = "spinner";

  public Spinner(Context paramContext)
  {
    super(paramContext);
  }

  public Spinner(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
  }

  public Spinner(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet, paramInt);
  }

  private void a(int paramInt, View paramView, boolean paramBoolean)
  {
    ay localay = this.g.a(paramInt);
    if (localay == null);
    while (true)
    {
      return;
      int i1;
      int i2;
      label35: View localView2;
      if (this.f != paramView)
      {
        i1 = 1;
        if (i1 == 0)
          break label104;
        i2 = 0;
        if (i2 >= this.j.size())
          break label99;
        localView2 = (View)this.j.get(i2);
        if (localView2 != paramView)
          break label93;
      }
      label93: for (boolean bool = true; ; bool = false)
      {
        localView2.setSelected(bool);
        i2++;
        break label35;
        i1 = 0;
        break;
      }
      label99: this.f = paramView;
      label104: View localView1;
      if (i1 != 0)
      {
        if (this.i == null)
          this.i = new az();
        localView1 = this.a;
        if (!(localView1 instanceof TextView))
          break label171;
        a(localay, (TextView)localView1);
      }
      while (this.h != null)
      {
        this.h.a(paramView, paramInt, paramBoolean);
        return;
        label171: if (!(localView1 instanceof ImageView))
          continue;
        ((ImageView)localView1).setImageResource(0);
      }
    }
  }

  private void b()
  {
    if (this.e == null)
    {
      this.e = new LinearLayout(getContext());
      this.e.setOrientation(1);
      this.e.setOnClickListener(new as(this));
    }
    Object localObject;
    if (this.d == null)
    {
      if (this.k == null)
        break label164;
      this.k.addView(this.e, new ViewGroup.LayoutParams(-1, -2));
      localObject = this.k;
    }
    while (true)
    {
      this.d = new PopupWindow((View)localObject, b.x(getContext()), b.y(getContext()), true);
      this.d.setBackgroundDrawable(getResources().getDrawable(this.m));
      this.d.setOutsideTouchable(true);
      this.d.setAnimationStyle(R.style.SpinnerAnim);
      this.d.setOnDismissListener(new at(this));
      return;
      label164: if (this.l)
      {
        localObject = new ScrollView(getContext());
        ((ScrollView)localObject).addView(this.e, new FrameLayout.LayoutParams(-1, -2));
        continue;
      }
      localObject = this.e;
    }
  }

  @TargetApi(14)
  public final void a()
  {
    if (!this.c)
      return;
    this.c = false;
    b();
    this.d.dismiss();
  }

  public final void a(int paramInt)
  {
    if ((this.j != null) && (paramInt >= 0) && (paramInt < this.j.size()));
    for (View localView = (View)this.j.get(paramInt); ; localView = null)
    {
      a(paramInt, localView, false);
      return;
    }
  }

  public ax getAdapter()
  {
    return this.g;
  }

  protected void onFinishInflate()
  {
    super.onFinishInflate();
    this.a = findViewById(R.id.title);
    this.b = findViewById(R.id.indicator);
    setOnClickListener(new ar(this));
  }

  public void setAdapter(ax paramax)
  {
    b();
    this.g = paramax;
    this.e.removeAllViews();
    this.j = new ArrayList();
    for (int i1 = 0; i1 < paramax.getCount(); i1++)
    {
      paramax.a(i1);
      View localView1 = paramax.a(this.e);
      if (localView1 != null)
        this.e.addView(localView1);
      View localView2 = paramax.getView(i1, null, this.e);
      localView2.setOnClickListener(new au(this));
      this.j.add(localView2);
      this.e.addView(localView2);
    }
  }

  public void setContentContainer(ViewGroup paramViewGroup)
  {
    this.k = paramViewGroup;
  }

  public void setIndicatorRotation(int paramInt)
  {
    this.n = paramInt;
  }

  public void setName(String paramString)
  {
    this.o = paramString;
  }

  public void setOnMenuSelectListener(aw paramaw)
  {
    this.h = paramaw;
  }

  public void setScrollable(boolean paramBoolean)
  {
    this.l = paramBoolean;
  }

  public void setSpinnerListener$4cf41f8b(f paramf)
  {
  }

  public void setTitleRender(az paramaz)
  {
    this.i = paramaz;
  }

  public void setWindowBackgroundResource(int paramInt)
  {
    this.m = paramInt;
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou2.jar
 * Qualified Name:     com.wandoujia.ripple_framework.view.Spinner
 * JD-Core Version:    0.6.0
 */