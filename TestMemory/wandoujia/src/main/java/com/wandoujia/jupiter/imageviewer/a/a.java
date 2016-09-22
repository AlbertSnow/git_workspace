package com.wandoujia.jupiter.imageviewer.a;

import android.content.Context;
import android.os.Parcelable;
import android.support.v4.view.at;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.view.ViewGroup.LayoutParams;
import com.wandoujia.jupiter.imageviewer.views.GalleryImageView;
import com.wandoujia.jupiter.imageviewer.views.GalleryViewPager;
import com.wandoujia.jupiter.imageviewer.views.TouchImageView;
import java.util.List;

public final class a extends at
{
  protected final Context a;
  private List<String> b;
  private View.OnClickListener c = new b(this);

  public a(Context paramContext, List<String> paramList)
  {
    this.b = paramList;
    this.a = paramContext;
  }

  public final int a()
  {
    return this.b.size();
  }

  public final Object a(ViewGroup paramViewGroup, int paramInt)
  {
    String str = (String)this.b.get(paramInt);
    GalleryImageView localGalleryImageView = new GalleryImageView(this.a);
    localGalleryImageView.setOnClickListener(this.c);
    localGalleryImageView.setUrl(str);
    localGalleryImageView.setTag(str);
    localGalleryImageView.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
    paramViewGroup.addView(localGalleryImageView, 0);
    return localGalleryImageView;
  }

  public final void a(Parcelable paramParcelable, ClassLoader paramClassLoader)
  {
  }

  public final void a(ViewGroup paramViewGroup, int paramInt, Object paramObject)
  {
    paramViewGroup.removeView((View)paramObject);
  }

  public final boolean a(View paramView, Object paramObject)
  {
    return paramView.equals(paramObject);
  }

  public final void b()
  {
  }

  public final void b(ViewGroup paramViewGroup, int paramInt, Object paramObject)
  {
    super.b(paramViewGroup, paramInt, paramObject);
    ((GalleryViewPager)paramViewGroup).a = ((TouchImageView)paramObject);
  }

  public final Parcelable c()
  {
    return null;
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.jupiter.imageviewer.a.a
 * JD-Core Version:    0.6.0
 */