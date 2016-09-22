package com.wandoujia.jupiter.subscribe.fragment;

import android.os.Bundle;
import android.support.v7.widget.cc;
import android.view.View;
import com.wandoujia.api.proto.TemplateTypeEnum.TemplateType;
import com.wandoujia.jupiter.homepage.HomeScrollFragment;
import com.wandoujia.jupiter.subscribe.n;
import com.wandoujia.p4.subscribe.SubscribeRefreshFlagChecker;
import com.wandoujia.ripple_framework.EventBusManager.Type;
import com.wandoujia.ripple_framework.i;
import com.wandoujia.ripple_framework.j;
import com.wandoujia.ripple_framework.model.Model;
import com.wandoujia.ripple_framework.model.g;
import com.wandoujia.ripple_framework.view.RecyclerViewAutoLoadingLayout;
import de.greenrobot.event.c;

public class SubscribeTimeLineFragment extends HomeScrollFragment
{
  private static final TemplateTypeEnum.TemplateType[] b;

  static
  {
    TemplateTypeEnum.TemplateType[] arrayOfTemplateType = new TemplateTypeEnum.TemplateType[3];
    arrayOfTemplateType[0] = TemplateTypeEnum.TemplateType.CATEGORY;
    arrayOfTemplateType[1] = TemplateTypeEnum.TemplateType.SECTION_PORTRAIT_HEADER_BOTTOM;
    arrayOfTemplateType[2] = TemplateTypeEnum.TemplateType.TIME_SPLITTER_CARD;
    b = arrayOfTemplateType;
  }

  protected final com.wandoujia.nirvana.framework.network.page.a<Model> a(String paramString)
  {
    return new n(paramString, 0);
  }

  protected final cc b()
  {
    return new u(this, this.a);
  }

  protected final com.wandoujia.ripple_framework.adapter.a g()
  {
    return new t(this, 0);
  }

  public void onDestroyView()
  {
    super.onDestroyView();
    ((c)i.k().a("event_bus")).c(this);
  }

  public void onEventMainThread(j paramj)
  {
    if (EventBusManager.Type.SUBSCRIBE_STATUS_CHANGE.equals(paramj.a))
      this.j.j();
  }

  public void onResume()
  {
    super.onResume();
    SubscribeRefreshFlagChecker.a(getActivity());
    if (SubscribeRefreshFlagChecker.a(SubscribeTimeLineFragment.class.getSimpleName()))
      this.j.j();
  }

  public void onViewCreated(View paramView, Bundle paramBundle)
  {
    super.onViewCreated(paramView, paramBundle);
    if ((this.j instanceof g))
      ((g)this.j).a(false);
    this.h.setEmptyLayout(2130903418);
    this.h.setEmptyViewRender(new o(this));
    this.h.setEmptyDataChecker(new q());
    ((c)i.k().a("event_bus")).a(this);
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.jupiter.subscribe.fragment.SubscribeTimeLineFragment
 * JD-Core Version:    0.6.0
 */