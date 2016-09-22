package com.wandoujia.p4.card.views;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.wandoujia.image.view.AsyncImageView;
import com.wandoujia.p4.button.views.StatefulButton;
import com.wandoujia.p4.button.views.SubActionButton;
import com.wandoujia.phoenix2.R.styleable;

public class ContentCardView extends RelativeLayout
  implements b
{
  protected TextView a;
  protected TextView b;
  protected AsyncImageView c;
  protected TextView d;
  protected TextView e;
  protected ImageView f;
  protected StatefulButton g;
  protected SubActionButton h;
  private a i;
  private com.wandoujia.p4.button.views.a j;

  public ContentCardView(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
    TypedArray localTypedArray = paramContext.obtainStyledAttributes(paramAttributeSet, R.styleable.DownloadableProgressView, 0, 0);
    localTypedArray.getResourceId(0, 0);
    localTypedArray.recycle();
  }

  protected void dispatchSetPressed(boolean paramBoolean)
  {
    int k = getChildCount();
    for (int m = 0; m < k; m++)
    {
      View localView = getChildAt(m);
      if ((paramBoolean) && ((localView.isClickable()) || (localView.isLongClickable())))
        continue;
      localView.setPressed(paramBoolean);
    }
  }

  public com.wandoujia.p4.button.views.a getButton()
  {
    if (this.g == null)
      return null;
    if (this.j == null)
      this.j = new c(this);
    return this.j;
  }

  public a getCardView()
  {
    if (this.i == null)
      this.i = new a(this);
    return this.i;
  }

  public View getView()
  {
    return this;
  }

  protected void onFinishInflate()
  {
    super.onFinishInflate();
    this.a = ((TextView)findViewById(2131492998));
    this.b = ((TextView)findViewById(2131492972));
    this.c = ((AsyncImageView)findViewById(2131492903));
    this.d = ((TextView)findViewById(2131493413));
    this.e = ((TextView)findViewById(2131492977));
    this.f = ((ImageView)findViewById(2131492876));
    this.g = ((StatefulButton)findViewById(2131492866));
    this.h = ((SubActionButton)findViewById(2131493449));
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.p4.card.views.ContentCardView
 * JD-Core Version:    0.6.0
 */