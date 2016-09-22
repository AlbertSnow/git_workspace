package com.wandoujia.jupiter.topic.a;

import android.content.res.Resources;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup.LayoutParams;
import android.widget.TextView;
import com.wandoujia.api.proto.Entity;
import com.wandoujia.api.proto.Image;
import com.wandoujia.api.proto.PublisherDetail;
import com.wandoujia.base.utils.CollectionUtils;
import com.wandoujia.nirvana.framework.ui.a.a;
import com.wandoujia.ripple_framework.c.c;
import com.wandoujia.ripple_framework.model.Model;
import java.util.List;

public final class b extends c
{
  private int a;

  private int a(int paramInt)
  {
    if (e().getResources() == null)
      return 0;
    return e().getResources().getDimensionPixelSize(paramInt);
  }

  protected final void a(Model paramModel)
  {
    if (paramModel == null)
      return;
    View localView = e().findViewById(2131492889);
    if ((!CollectionUtils.isEmpty(paramModel.w())) && (paramModel.w().get(0) != null) && (!TextUtils.isEmpty(((Image)paramModel.w().get(0)).url)))
    {
      h().a(2131493761).f(0);
      h().a(2131493527).a().setBackgroundColor(e().getResources().getColor(2131362219));
      h().a(2131492998).j().setTextColor(e().getResources().getColor(2131361992));
      h().a(2131493413).j().setTextColor(e().getResources().getColor(2131361913));
      h().a(2131493760).f(0);
      e().setBackgroundColor(e().getResources().getColor(2131362159));
      if ((paramModel.b().sub_entity == null) || (paramModel.b().sub_entity.isEmpty()))
      {
        h().a(2131493605).f(8);
        h().a(2131493174).f(8);
        return;
      }
    }
    else
    {
      label264: ViewGroup.LayoutParams localLayoutParams1;
      if (paramModel.I().subscribed != null)
      {
        this.a = a(2131427946);
        localLayoutParams1 = localView.getLayoutParams();
        if (localLayoutParams1.height <= this.a)
          break label474;
      }
      label474: for (int i = localLayoutParams1.height; ; i = this.a)
      {
        localLayoutParams1.height = i;
        localView.setLayoutParams(localLayoutParams1);
        if (e().getLayoutParams() == null)
        {
          ViewGroup.LayoutParams localLayoutParams2 = new ViewGroup.LayoutParams(-1, -2);
          e().setLayoutParams(localLayoutParams2);
        }
        h().a(2131493761).f(8);
        h().a(2131493760).f(8);
        h().a(2131493527).a().setBackgroundColor(e().getResources().getColor(2131362159));
        h().a(2131492998).j().setTextColor(e().getResources().getColor(2131362219));
        h().a(2131493413).j().setTextColor(e().getResources().getColor(2131362229));
        e().setBackgroundColor(e().getResources().getColor(2131362188));
        break;
        this.a = a(2131427945);
        break label264;
      }
    }
    h().a(2131493605).f(0);
    h().a(2131493174).f(0);
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.jupiter.topic.a.b
 * JD-Core Version:    0.6.0
 */