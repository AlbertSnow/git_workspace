package com.wandoujia.jupiter.subscribe.fragment;

import android.os.Bundle;
import android.support.v7.widget.cc;
import android.view.View;
import android.widget.TextView;
import com.wandoujia.api.proto.PublisherBundleDetail;
import com.wandoujia.api.proto.TemplateTypeEnum.TemplateType;
import com.wandoujia.base.utils.CollectionUtils;
import com.wandoujia.jupiter.homepage.HomeScrollFragment;
import com.wandoujia.nirvana.framework.network.page.DataLoadListener.Op;
import com.wandoujia.nirvana.framework.network.page.g;
import com.wandoujia.ripple_framework.adapter.a;
import com.wandoujia.ripple_framework.adapter.f;
import com.wandoujia.ripple_framework.model.Model;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class SubscribeOnBoardFragment extends HomeScrollFragment
{
  private TextView b;
  private com.wandoujia.p4.subscribe.core.h c = new i(this);

  private static boolean b(Model paramModel)
  {
    boolean bool2;
    if (paramModel.a(1) != null)
      bool2 = ((Boolean)paramModel.a(1)).booleanValue();
    Boolean localBoolean;
    do
    {
      boolean bool1;
      do
      {
        return bool2;
        bool1 = TemplateTypeEnum.TemplateType.ONBOARD_SINGLE_IMAGE.equals(paramModel.g());
        bool2 = false;
      }
      while (bool1);
      localBoolean = paramModel.L().defaultSelected;
      bool2 = false;
    }
    while (localBoolean == null);
    return paramModel.L().defaultSelected.booleanValue();
  }

  private List<PublisherBundleDetail> e()
  {
    if ((this.l == null) || (this.l.f() == null))
      return null;
    ArrayList localArrayList = new ArrayList();
    Iterator localIterator = this.l.f().iterator();
    while (localIterator.hasNext())
    {
      Model localModel = (Model)localIterator.next();
      if (!b(localModel))
        continue;
      localArrayList.add(localModel.L());
    }
    return localArrayList;
  }

  protected final int a()
  {
    return 2130903305;
  }

  public final void a(DataLoadListener.Op paramOp, g<Model> paramg)
  {
    super.a(paramOp, paramg);
    TextView localTextView = this.b;
    if (!CollectionUtils.isEmpty(e()));
    for (boolean bool = true; ; bool = false)
    {
      localTextView.setEnabled(bool);
      return;
    }
  }

  protected final cc b()
  {
    return new l(this, g());
  }

  protected final a g()
  {
    return new k(this, 0);
  }

  public void onViewCreated(View paramView, Bundle paramBundle)
  {
    this.b = ((TextView)paramView.findViewById(2131493668));
    this.b.setOnClickListener(new h(this, paramView));
    super.onViewCreated(paramView, paramBundle);
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.jupiter.subscribe.fragment.SubscribeOnBoardFragment
 * JD-Core Version:    0.6.0
 */