package com.wandoujia.jupiter.category.a;

import android.support.v4.app.b;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import com.wandoujia.jupiter.presenter.aa;
import com.wandoujia.ripple_framework.k;
import com.wandoujia.ripple_framework.model.Model;
import java.util.List;

public final class a extends BaseAdapter
{
  private List<Model> a;
  private k b = new k();

  public final void a(List<Model> paramList)
  {
    this.a = paramList;
  }

  public final boolean a(int paramInt)
  {
    Model localModel = (Model)this.a.get(paramInt);
    return (localModel != null) && (localModel.a(0) != null);
  }

  public final int getCount()
  {
    return this.a.size();
  }

  public final Object getItem(int paramInt)
  {
    return this.a.get(paramInt);
  }

  public final long getItemId(int paramInt)
  {
    return paramInt;
  }

  public final View getView(int paramInt, View paramView, ViewGroup paramViewGroup)
  {
    Model localModel = (Model)this.a.get(paramInt);
    ViewGroup localViewGroup = (ViewGroup)b.a(paramViewGroup, 2130903188);
    localViewGroup.findViewById(2131492866).setVisibility(8);
    localViewGroup.findViewById(2131493413).setVisibility(8);
    com.wandoujia.nirvana.framework.ui.a locala = aa.c(localViewGroup, this.b);
    locala.a(localModel);
    return locala.a;
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.jupiter.category.a.a
 * JD-Core Version:    0.6.0
 */