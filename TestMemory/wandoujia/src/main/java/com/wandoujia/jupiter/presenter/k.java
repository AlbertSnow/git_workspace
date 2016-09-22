package com.wandoujia.jupiter.presenter;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import com.wandoujia.api.proto.Detail;
import com.wandoujia.api.proto.MorphData;
import com.wandoujia.api.proto.MorphDataProperty;
import com.wandoujia.api.proto.MorphDetail;
import com.wandoujia.base.utils.CollectionUtils;
import com.wandoujia.image.view.AutoFitImageView;
import com.wandoujia.jupiter.morph.MorphLoadingView;
import com.wandoujia.logv3.model.packages.ViewLogPackage.Action;
import com.wandoujia.logv3.model.packages.ViewLogPackage.Element;
import com.wandoujia.nirvana.framework.ui.a.a;
import com.wandoujia.ripple_framework.c.c;
import com.wandoujia.ripple_framework.i;
import com.wandoujia.ripple_framework.log.Logger;
import com.wandoujia.ripple_framework.log.Logger.Module;
import com.wandoujia.ripple_framework.log.h;
import com.wandoujia.ripple_framework.model.Model;
import com.wandoujia.ripple_framework.view.e;
import java.text.SimpleDateFormat;
import java.util.Iterator;
import java.util.List;

public final class k extends c
{
  private int a = 2131361863;

  static
  {
    new SimpleDateFormat("MM/dd");
  }

  private k()
  {
  }

  public k(byte paramByte)
  {
    this();
  }

  protected final void a(Model paramModel)
  {
    MorphDetail localMorphDetail = paramModel.C().morph_detail;
    if ((localMorphDetail != null) && (!CollectionUtils.isEmpty(localMorphDetail.elements)))
    {
      Iterator localIterator = localMorphDetail.elements.iterator();
      while (localIterator.hasNext())
      {
        MorphData localMorphData = (MorphData)localIterator.next();
        View localView = h().a(localMorphData.key).a();
        if (localView == null)
          continue;
        if (localView != null)
        {
          if (localMorphData.action == null)
          {
            i.k().h().a(localView, Logger.Module.UI, ViewLogPackage.Element.BUTTON, ViewLogPackage.Action.REDIRECT, null, null).a(localView, paramModel);
            localView.setOnClickListener(null);
            localView.setClickable(false);
          }
        }
        else
        {
          label128: if ((localMorphData.property == null) || (localMorphData.property.is_visible == null) || (localMorphData.property.is_visible.booleanValue()))
            break label244;
          localView.setVisibility(8);
        }
        while (true)
        {
          if (!(localView instanceof TextView))
            break label253;
          ((TextView)localView).setText(localMorphData.value);
          break;
          l locall = new l(paramModel, paramModel, localMorphData);
          locall.a(localView, Logger.Module.UI, ViewLogPackage.Element.BUTTON, ViewLogPackage.Action.REDIRECT, localMorphData.key, null);
          localView.setOnClickListener(locall);
          localView.setClickable(true);
          break label128;
          label244: localView.setVisibility(0);
        }
        label253: if ((localView instanceof ImageView))
        {
          ImageView localImageView = (ImageView)localView;
          if ((localMorphData.property != null) && (localMorphData.property.width != null) && (localMorphData.property.height != null) && (localMorphData.property.width.intValue() > 0) && (localMorphData.property.height.intValue() > 0))
          {
            if ((localImageView instanceof AutoFitImageView))
              ((AutoFitImageView)localImageView).b(false);
            localImageView.post(new m(this, localImageView, localMorphData));
            continue;
          }
          if ((localImageView instanceof AutoFitImageView))
            ((AutoFitImageView)localImageView).b(true);
          i.k().f();
          new e(0);
          e.a(localImageView, localMorphData.value, this.a);
          continue;
        }
        if (!(localView instanceof MorphLoadingView))
          continue;
        ((MorphLoadingView)localView).setModel(paramModel);
      }
    }
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.jupiter.presenter.k
 * JD-Core Version:    0.6.0
 */