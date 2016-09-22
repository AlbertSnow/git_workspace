package com.wandoujia.jupiter.presenter;

import android.content.Context;
import android.content.Intent;
import android.support.v4.app.b;
import android.text.TextUtils;
import android.view.View;
import android.widget.ImageView;
import com.wandoujia.api.proto.Image;
import com.wandoujia.base.utils.CollectionUtils;
import com.wandoujia.jupiter.imageviewer.activity.ImageViewerActivity;
import com.wandoujia.logv3.model.packages.ViewLogPackage.Action;
import com.wandoujia.logv3.model.packages.ViewLogPackage.Element;
import com.wandoujia.ripple_framework.i;
import com.wandoujia.ripple_framework.log.Logger.Module;
import com.wandoujia.ripple_framework.log.h;
import com.wandoujia.ripple_framework.model.Model;
import com.wandoujia.ripple_framework.navigation.a;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

final class ah extends h
{
  ah(ag paramag, Model paramModel1, ImageView paramImageView, Image paramImage, Model paramModel2)
  {
    super(paramModel1);
  }

  public final boolean a(View paramView)
  {
    if (!ag.a(this.d))
    {
      ag.a(this.d, this.a, this.b);
      return false;
    }
    Model localModel = this.c.c();
    if ((localModel == null) || (CollectionUtils.isEmpty(localModel.v())))
      return false;
    Integer localInteger1 = (Integer)this.c.a(2131492935);
    if ((localInteger1 == null) || (localInteger1.intValue() < 0));
    for (Integer localInteger2 = Integer.valueOf(0); ; localInteger2 = localInteger1)
    {
      if (!CollectionUtils.isEmpty(localModel.v()))
      {
        ArrayList localArrayList = new ArrayList();
        Iterator localIterator = localModel.v().iterator();
        while (localIterator.hasNext())
        {
          Image localImage = (Image)localIterator.next();
          if (TextUtils.isEmpty(localImage.url))
            continue;
          String str2 = localImage.url;
          if (b.C(str2))
            str2 = b.D(str2);
          localArrayList.add(str2);
        }
        if (!CollectionUtils.isEmpty(localArrayList))
        {
          String str1 = ImageViewerActivity.a(localArrayList, localInteger2.intValue());
          Intent localIntent = ((a)i.k().a("navigation")).b(this.d.f(), str1, null);
          this.d.f().startActivity(localIntent);
          a(paramView, Logger.Module.ITEM, ViewLogPackage.Element.ICON, ViewLogPackage.Action.REDIRECT, "gallery", null);
        }
      }
      return true;
    }
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.jupiter.presenter.ah
 * JD-Core Version:    0.6.0
 */