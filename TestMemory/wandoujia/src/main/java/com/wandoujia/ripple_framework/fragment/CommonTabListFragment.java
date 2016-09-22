package com.wandoujia.ripple_framework.fragment;

import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import com.wandoujia.api.proto.ContentTypeEnum.ContentType;
import com.wandoujia.api.proto.TemplateTypeEnum.TemplateType;
import com.wandoujia.base.utils.CollectionUtils;
import com.wandoujia.nirvana.framework.network.page.DataLoadListener.Op;
import com.wandoujia.nirvana.framework.network.page.a;
import com.wandoujia.ripple_framework.activity.BaseActivity;
import com.wandoujia.ripple_framework.adapter.m;
import com.wandoujia.ripple_framework.model.Model;
import com.wandoujia.ripple_framework.model.g;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public abstract class CommonTabListFragment extends TabFragment
{
  protected a a;
  private List<Model> b;
  private boolean c;

  protected a a(String paramString)
  {
    return new g(paramString, null);
  }

  protected abstract m a(Model paramModel);

  protected String a()
  {
    return getArguments().getString("page_api_url");
  }

  protected void a(DataLoadListener.Op paramOp, Exception paramException)
  {
  }

  protected void a(List<Model> paramList)
  {
    if (getView() == null)
      return;
    ArrayList localArrayList = new ArrayList();
    this.b = paramList;
    Iterator localIterator = paramList.iterator();
    while (localIterator.hasNext())
      localArrayList.add(a((Model)localIterator.next()));
    b(localArrayList);
  }

  protected void a(List<Model> paramList, String paramString)
  {
    if (!isAdded())
      return;
    boolean bool;
    if ((paramList.size() > 0) && (((Model)paramList.get(0)).f() == ContentTypeEnum.ContentType.TAB))
    {
      bool = true;
      label38: this.c = bool;
      if (!this.c)
        break label112;
    }
    label112: for (Object localObject = this.a; ; localObject = new j(Arrays.asList(new Model[] { new Model(com.wandoujia.ripple_framework.util.i.a(getArguments().getString("title"), paramString, getArguments().getString("page_intent_uri"))) })))
    {
      if (!this.c)
      {
        ((BaseActivity)getActivity()).removeList(paramString);
        pageLoaded();
      }
      View localView = getView();
      if (localView == null)
        break;
      localView.post(new h(this, (a)localObject));
      return;
      bool = false;
      break label38;
    }
  }

  protected int d()
  {
    if ((this.b == null) || (CollectionUtils.isEmpty(this.b)))
    {
      i = 0;
      return i;
    }
    for (int i = 0; ; i++)
    {
      if (i >= this.g.size())
        break label64;
      if (((Model)this.b.get(i)).g() == TemplateTypeEnum.TemplateType.DEFAULT_TAB)
        break;
    }
    label64: return 0;
  }

  protected boolean initializePageUri(View paramView)
  {
    if (this.c)
      return false;
    return super.initializePageUri(paramView);
  }

  public void onActivityCreated(Bundle paramBundle)
  {
    super.onActivityCreated(paramBundle);
    if (this.h != null)
      this.h.setVisibility(8);
    this.c = true;
    String str = a();
    if (!TextUtils.isEmpty(str))
    {
      this.a = ((BaseActivity)getActivity()).addList(a(str));
      if (!CollectionUtils.isEmpty(this.a.c()))
      {
        g();
        a(this.a.c(), str);
      }
    }
    else
    {
      return;
    }
    this.a.a(new i(this, str));
    this.a.i();
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.ripple_framework.fragment.CommonTabListFragment
 * JD-Core Version:    0.6.0
 */