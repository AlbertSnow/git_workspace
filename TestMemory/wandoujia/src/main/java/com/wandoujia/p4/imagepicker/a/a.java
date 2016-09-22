package com.wandoujia.p4.imagepicker.a;

import android.app.Activity;
import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout.LayoutParams;
import com.wandoujia.base.utils.SystemUtil;
import com.wandoujia.mvc.BaseModel;
import com.wandoujia.mvc.BaseView;
import com.wandoujia.p4.adapter.BaseCardSelectableAdapter;
import com.wandoujia.p4.adapter.BaseCardSelectableAdapter.ContainerView;
import com.wandoujia.p4.imagepicker.view.ImageFolderView;
import java.util.ArrayList;

public abstract class a<M extends BaseModel> extends BaseCardSelectableAdapter<M>
{
  protected Activity b;
  protected final int c;
  private int d;
  private int e;
  private int f;
  private c g;

  public a(Context paramContext, int paramInt, c paramc)
  {
    super(paramContext);
    this.b = ((Activity)paramContext);
    this.c = paramInt;
    this.g = paramc;
    b(paramContext.getResources().getConfiguration().orientation);
  }

  protected final BaseView a(ViewGroup paramViewGroup)
  {
    return ImageFolderView.a(paramViewGroup);
  }

  public final void b(int paramInt)
  {
    this.f = paramInt;
    Activity localActivity = this.b;
    if (this.f == 2);
    for (this.d = 4; ; this.d = 3)
    {
      this.e = (SystemUtil.getScreenWidth(localActivity.getWindowManager()) / this.d);
      return;
    }
  }

  protected final View f()
  {
    View localView = super.f();
    localView.setBackgroundColor(this.a.getResources().getColor(2131362104));
    return localView;
  }

  public View getView(int paramInt, View paramView, ViewGroup paramViewGroup)
  {
    BaseCardSelectableAdapter.ContainerView localContainerView = (BaseCardSelectableAdapter.ContainerView)super.getView(paramInt, paramView, paramViewGroup);
    FrameLayout.LayoutParams localLayoutParams = new FrameLayout.LayoutParams(this.e, this.e);
    ImageFolderView localImageFolderView = (ImageFolderView)localContainerView.getOriginView();
    localImageFolderView.setImageLayoutParams(localLayoutParams);
    localImageFolderView.setOnClickListener(new b(this, paramInt));
    localContainerView.getCoverView().setLayoutParams(localLayoutParams);
    return localContainerView;
  }

  public ArrayList<String> m()
  {
    return null;
  }

  public void notifyDataSetChanged()
  {
    super.notifyDataSetChanged();
    if (this.g != null)
    {
      int i = c();
      this.g.a(c());
      if ((i > 0) && (i <= this.c))
        this.g.a();
    }
    else
    {
      return;
    }
    this.g.b();
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.p4.imagepicker.a.a
 * JD-Core Version:    0.6.0
 */