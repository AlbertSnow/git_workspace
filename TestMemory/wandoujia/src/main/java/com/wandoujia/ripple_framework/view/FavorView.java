package com.wandoujia.ripple_framework.view;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.widget.FrameLayout;
import android.widget.ImageView;
import com.wandoujia.ripple_framework.R.drawable;
import com.wandoujia.ripple_framework.R.id;
import com.wandoujia.ripple_framework.R.layout;
import com.wandoujia.ripple_framework.R.styleable;
import com.wandoujia.ripple_framework.i;
import com.wandoujia.ripple_framework.theme.c;

public class FavorView extends FrameLayout
  implements c
{
  private ImageView a;
  private ImageView b;
  private int c;
  private int d;
  private int e;
  private int f = 0;

  public FavorView(Context paramContext)
  {
    super(paramContext);
    a(paramContext, null);
  }

  public FavorView(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
    a(paramContext, paramAttributeSet);
  }

  public FavorView(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet, paramInt);
    a(paramContext, paramAttributeSet);
  }

  private void a(Context paramContext, AttributeSet paramAttributeSet)
  {
    TypedArray localTypedArray = paramContext.obtainStyledAttributes(paramAttributeSet, R.styleable.FavorView, 0, 0);
    this.c = localTypedArray.getResourceId(R.styleable.FavorView_favoredDrawable, R.drawable.icon_favorited_red);
    this.d = localTypedArray.getResourceId(R.styleable.FavorView_unfavoredDrawable, R.drawable.icon_favorite_grey);
    if ("Night".equals(i.k().e()));
    for (this.e = R.drawable.icon_favorite_night; ; this.e = this.d)
    {
      localTypedArray.recycle();
      LayoutInflater.from(paramContext).inflate(R.layout.rip_favor_view, this, true);
      return;
    }
  }

  public final void a()
  {
    if ("Night".equals(i.k().e()))
    {
      this.e = R.drawable.icon_favorite_night;
      this.b.setImageResource(this.e);
      return;
    }
    this.e = this.d;
    this.b.setImageResource(this.e);
    this.b.setImageLevel(this.f);
  }

  protected void onFinishInflate()
  {
    super.onFinishInflate();
    this.a = ((ImageView)findViewById(R.id.favorited));
    this.b = ((ImageView)findViewById(R.id.unfavorited));
    this.a.setImageResource(this.c);
    this.b.setImageResource(this.e);
  }

  public void setLevel(int paramInt)
  {
    this.f = paramInt;
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou2.jar
 * Qualified Name:     com.wandoujia.ripple_framework.view.FavorView
 * JD-Core Version:    0.6.0
 */