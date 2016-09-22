package com.wandoujia.p4.community.c;

import android.app.Activity;
import android.support.v4.app.b;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AbsListView.LayoutParams;
import android.widget.BaseAdapter;
import android.widget.GridView;
import android.widget.ImageView;
import android.widget.ImageView.ScaleType;
import com.wandoujia.image.view.AsyncImageView;
import java.util.List;

public final class e extends BaseAdapter
{
  private Activity a;
  private List<String> b;
  private GridView c;

  public e(Activity paramActivity, List<String> paramList, GridView paramGridView)
  {
    this.a = paramActivity;
    this.b = paramList;
    this.c = paramGridView;
  }

  public final void a(List<String> paramList)
  {
    this.b = paramList;
    notifyDataSetChanged();
  }

  public final int getCount()
  {
    return this.b.size();
  }

  public final Object getItem(int paramInt)
  {
    return this.b.get(paramInt);
  }

  public final long getItemId(int paramInt)
  {
    return paramInt;
  }

  public final View getView(int paramInt, View paramView, ViewGroup paramViewGroup)
  {
    if (TextUtils.isEmpty((String)this.b.get(paramInt)))
    {
      ImageView localImageView;
      if ((paramView == null) || (!(paramView instanceof ImageView)))
      {
        localImageView = new ImageView(this.a);
        localImageView.setScaleType(ImageView.ScaleType.CENTER_CROP);
        localImageView.setLayoutParams(new AbsListView.LayoutParams(b.a(this.c), b.a(this.c)));
      }
      while (true)
      {
        localImageView.setImageResource(2130838027);
        return localImageView;
        localImageView = (ImageView)paramView;
      }
    }
    AsyncImageView localAsyncImageView;
    if ((paramView == null) || (!(paramView instanceof AsyncImageView)))
    {
      localAsyncImageView = new AsyncImageView(this.a);
      localAsyncImageView.setScaleType(ImageView.ScaleType.CENTER_CROP);
      localAsyncImageView.setLayoutParams(new AbsListView.LayoutParams(b.a(this.c), b.a(this.c)));
    }
    while (true)
    {
      localAsyncImageView.e((String)this.b.get(paramInt), 0);
      return localAsyncImageView;
      localAsyncImageView = (AsyncImageView)paramView;
    }
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.p4.community.c.e
 * JD-Core Version:    0.6.0
 */