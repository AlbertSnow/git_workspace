package com.wandoujia.jupiter.topic;

import android.content.res.Resources;
import android.graphics.Color;
import android.graphics.Rect;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;
import android.support.v7.widget.ce;
import android.support.v7.widget.cf;
import android.text.TextPaint;
import android.view.View;
import android.widget.TextView;
import com.nineoldandroids.view.ViewHelper;
import com.wandoujia.base.utils.ReflectionUtil;
import com.wandoujia.base.utils.SystemUtil;
import com.wandoujia.jupiter.topic.view.TopicHeaderView;

public final class e extends cf
{
  private final View a;
  private final Toolbar b;
  private final TextView c;
  private final View d;
  private final TopicHeaderView e;
  private final TextView f;
  private boolean g;
  private int h;
  private int i;
  private int j;
  private int k;
  private float l;
  private int m = 0;
  private int n;
  private int o;
  private int p;

  public e(TopicHeaderView paramTopicHeaderView, Toolbar paramToolbar, View paramView1, TextView paramTextView, View paramView2)
  {
    this.a = paramView1;
    this.b = paramToolbar;
    this.c = paramTextView;
    this.d = paramView2;
    this.e = paramTopicHeaderView;
    this.f = ((TextView)ReflectionUtil.getField(paramToolbar, "mTitleTextView"));
    this.n = (int)paramTopicHeaderView.getResources().getDimension(2131427446);
    this.o = (int)paramTopicHeaderView.getResources().getDimension(2131427884);
    this.p = (int)android.support.v4.app.i.b(com.wandoujia.ripple_framework.i.k().g());
    a(false, paramTextView.getText().toString());
  }

  public final void a(RecyclerView paramRecyclerView, int paramInt)
  {
    int i1;
    if (paramInt == 0)
    {
      View localView = paramRecyclerView.getLayoutManager().b(0);
      if ((localView == null) && (paramRecyclerView.getLayoutManager().p() > 0))
      {
        this.f.setVisibility(0);
        this.c.setVisibility(4);
        this.e.a.setVisibility(4);
        this.e.b.setVisibility(4);
        this.d.setBackgroundColor(this.b.getResources().getColor(2131362188));
        this.a.setBackgroundColor(this.b.getResources().getColor(2131361989));
        this.b.setBackgroundColor(this.b.getResources().getColor(2131362188));
      }
      if (localView != null)
      {
        i1 = -localView.getTop();
        int i2 = this.e.getHeight() - this.n;
        if (SystemUtil.aboveApiLevel(19))
          i2 -= this.o;
        if ((i1 > 0) && (i1 < i2))
        {
          if (i1 <= i2 / 2)
            break label196;
          paramRecyclerView.a(0, i2 - i1);
        }
      }
    }
    return;
    label196: paramRecyclerView.a(0, -i1);
  }

  public final void a(RecyclerView paramRecyclerView, int paramInt1, int paramInt2)
  {
    View localView = paramRecyclerView.getLayoutManager().b(0);
    if ((localView == null) || (localView.getTop() > 0));
    do
    {
      return;
      this.m = (-localView.getTop());
      int i1 = this.m;
      TextPaint localTextPaint = new TextPaint(this.e.a.getPaintFlags());
      localTextPaint.setTextSize(this.e.getResources().getDimension(2131427929));
      int i2 = (int)localTextPaint.measureText(this.e.a.getText().toString());
      int i3 = (this.p - i2) / 2;
      int[] arrayOfInt1 = new int[2];
      this.f.getLocationOnScreen(arrayOfInt1);
      int[] arrayOfInt2 = new int[2];
      this.e.a.getLocationOnScreen(arrayOfInt2);
      this.k = (i3 - arrayOfInt1[0]);
      this.j = (i1 + arrayOfInt2[1] - arrayOfInt1[1]);
    }
    while ((this.j <= 0) || (this.h <= 0));
    if (this.m >= this.j)
    {
      this.f.setVisibility(0);
      this.c.setVisibility(4);
      this.e.a.setVisibility(4);
      ViewHelper.setAlpha(this.e.b, 0.0F);
    }
    int i5;
    int i6;
    while (true)
    {
      i5 = this.b.getResources().getColor(2131362188);
      i6 = this.b.getResources().getColor(2131362159);
      if (this.m > this.h)
        break label893;
      if (!this.g)
        break;
      this.b.setBackgroundColor(i6);
      this.a.setBackgroundColor(i6);
      if (this.m >= this.h - this.n)
      {
        int i8 = Color.argb((int)(255.0F * (1.0F - (this.h - this.m) / this.n)), Color.red(i5), Color.green(i5), Color.blue(i5));
        this.d.setBackgroundColor(i8);
        return;
        if (this.g)
        {
          if (this.m >= this.h)
          {
            this.e.a.setVisibility(4);
            this.f.setVisibility(4);
            this.c.setVisibility(0);
            int i9 = this.j - this.h;
            float f3 = 1.0F - (this.m - this.h) / i9;
            float f4 = this.f.getTextSize() + f3 * (this.l - this.f.getTextSize());
            this.c.setTextSize(0, f4);
            int[] arrayOfInt3 = new int[2];
            this.e.a.getLocationOnScreen(arrayOfInt3);
            if (!SystemUtil.aboveApiLevel(19))
              arrayOfInt3[1] -= this.o;
            int i10 = this.i + (int)(f3 * this.k);
            this.c.setPadding(i10, arrayOfInt3[1], 0, 0);
            ViewHelper.setAlpha(this.e.b, f3);
            int i11 = this.j - this.h;
            if (i11 <= 0)
              continue;
            int i12 = this.m - this.h;
            if (i12 >= i11)
              continue;
            float f5 = i12 / i11;
            int i13 = Color.argb(255, (int)(f5 * 255.0F), (int)(f5 * 255.0F), (int)(f5 * 255.0F));
            this.c.setTextColor(i13);
            continue;
          }
          this.c.setVisibility(4);
          this.f.setVisibility(4);
          this.e.a.setVisibility(0);
          this.e.b.setVisibility(0);
          ViewHelper.setAlpha(this.e.b, 1.0F);
          continue;
        }
        float f1 = (this.j - this.m) / this.j;
        float f2 = this.f.getTextSize() + f1 * (this.l - this.f.getTextSize());
        this.e.a.setTextSize(0, f2);
        int i4 = this.i + (int)(f1 * this.k);
        this.e.a.setPadding(i4, 0, 0, 0);
        this.e.a.setVisibility(0);
        this.e.b.setVisibility(0);
        ViewHelper.setAlpha(this.e.b, f1);
        this.f.setVisibility(4);
        continue;
      }
      this.d.setBackgroundColor(i6);
      return;
    }
    if (this.m >= this.j)
    {
      int i7 = this.h - this.j;
      if (i7 > 0)
      {
        i5 = Color.argb((int)(255.0F * ((this.m - this.j) / i7)), Color.red(i5), Color.green(i5), Color.blue(i5));
        label893: this.b.setBackgroundColor(i5);
        this.a.setBackgroundColor(i5);
        this.d.setBackgroundColor(i5);
        return;
      }
      this.b.setBackgroundColor(i5);
      this.a.setBackgroundColor(i5);
      this.d.setBackgroundColor(i5);
      return;
    }
    this.b.setBackgroundColor(i6);
    this.a.setBackgroundColor(i6);
    this.d.setBackgroundColor(i6);
  }

  public final void a(boolean paramBoolean, String paramString)
  {
    this.g = paramBoolean;
    this.f.setVisibility(4);
    this.b.setBackgroundColor(this.b.getResources().getColor(2131362159));
    TextPaint localTextPaint = new TextPaint(this.e.a.getPaintFlags());
    localTextPaint.setTextSize(this.e.getResources().getDimension(2131427929));
    int i1 = (int)localTextPaint.measureText(paramString);
    int i2 = (this.p - i1) / 2;
    this.e.a.setPadding(i2, 0, 0, 0);
    Rect localRect = new Rect();
    this.b.getGlobalVisibleRect(localRect);
    this.h = ((int)this.e.getResources().getDimension(2131427945) - localRect.bottom);
    this.f.post(new f(this));
    this.l = this.e.getResources().getDimension(2131427929);
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.jupiter.topic.e
 * JD-Core Version:    0.6.0
 */