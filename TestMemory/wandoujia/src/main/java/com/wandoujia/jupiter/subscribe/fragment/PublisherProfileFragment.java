package com.wandoujia.jupiter.subscribe.fragment;

import android.os.Bundle;
import android.support.v7.widget.cc;
import android.view.View;
import com.wandoujia.api.proto.PublisherDetail;
import com.wandoujia.api.proto.TemplateTypeEnum.TemplateType;
import com.wandoujia.base.utils.CollectionUtils;
import com.wandoujia.jupiter.subscribe.n;
import com.wandoujia.nirvana.framework.network.page.DataLoadListener.Op;
import com.wandoujia.nirvana.framework.network.page.g;
import com.wandoujia.ripple_framework.model.Model;
import java.util.List;

public class PublisherProfileFragment extends SubscribeListFragment
{
  TemplateTypeEnum.TemplateType[] b;
  TemplateTypeEnum.TemplateType[] c;
  private String m;
  private boolean n;

  public PublisherProfileFragment()
  {
    TemplateTypeEnum.TemplateType[] arrayOfTemplateType1 = new TemplateTypeEnum.TemplateType[2];
    arrayOfTemplateType1[0] = TemplateTypeEnum.TemplateType.SINGLE_MICRO;
    arrayOfTemplateType1[1] = TemplateTypeEnum.TemplateType.TIME_SPLITTER_CARD;
    this.b = arrayOfTemplateType1;
    TemplateTypeEnum.TemplateType[] arrayOfTemplateType2 = new TemplateTypeEnum.TemplateType[2];
    arrayOfTemplateType2[0] = TemplateTypeEnum.TemplateType.GROUP;
    arrayOfTemplateType2[1] = TemplateTypeEnum.TemplateType.TIME_SPLITTER_CARD;
    this.c = arrayOfTemplateType2;
  }

  protected final com.wandoujia.nirvana.framework.network.page.a<Model> a(String paramString)
  {
    Object[] arrayOfObject = new Object[1];
    arrayOfObject[0] = this.m;
    return new n(String.format("http://apis.wandoujia.com/five/v1/follow/publishers/%s/feeds?format=proto", arrayOfObject), 0);
  }

  public final void a(DataLoadListener.Op paramOp, g<Model> paramg)
  {
    super.a(paramOp, paramg);
    if (!this.n)
    {
      if ((!CollectionUtils.isEmpty(this.j.c())) && (this.j.c().size() >= 0) && ((this.j.a(0) instanceof Model)))
        setTitle(((Model)this.j.a(0)).I().nick);
      this.n = true;
    }
  }

  protected final cc b()
  {
    return new c(this, this.a);
  }

  public final int c()
  {
    return 0;
  }

  protected final com.wandoujia.ripple_framework.adapter.a g()
  {
    return new b(this, 0);
  }

  public void onViewCreated(View paramView, Bundle paramBundle)
  {
    this.m = getArguments().getString("argu_publisher_id");
    super.onViewCreated(paramView, paramBundle);
    setTitle("");
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.jupiter.subscribe.fragment.PublisherProfileFragment
 * JD-Core Version:    0.6.0
 */