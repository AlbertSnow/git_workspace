package com.wandoujia.jupiter.onboard;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.os.Bundle;
import android.os.Parcelable;
import android.support.v4.app.Fragment;
import android.support.v4.app.q;
import com.wandoujia.api.proto.Action;
import com.wandoujia.base.utils.CollectionUtils;
import com.wandoujia.jupiter.JupiterApplication;
import com.wandoujia.ripple_framework.adapter.k;
import com.wandoujia.ripple_framework.log.Logger.PageParameter;
import com.wandoujia.ripple_framework.model.Model;
import com.wandoujia.ripple_framework.view.CustomViewPager;
import java.util.ArrayList;
import java.util.List;

public final class u extends k
{
  private List<Model> a;
  private boolean b;
  private CustomViewPager c;

  public u(q paramq)
  {
    super(paramq);
    if ((0xF & JupiterApplication.e().getResources().getConfiguration().screenLayout) >= 3);
    for (boolean bool = true; ; bool = false)
    {
      this.b = bool;
      return;
    }
  }

  public final int a()
  {
    if (CollectionUtils.isEmpty(this.a))
      return 0;
    return this.a.size();
  }

  public final void a(CustomViewPager paramCustomViewPager)
  {
    this.c = paramCustomViewPager;
  }

  public final void a(List<Model> paramList)
  {
    this.a = paramList;
    d();
  }

  public final Fragment b(int paramInt)
  {
    if ((this.a == null) || (paramInt < 0) || (paramInt >= this.a.size()))
      return null;
    StoryItemFragment localStoryItemFragment = new StoryItemFragment();
    Bundle localBundle = new Bundle();
    localBundle.putParcelable("MODEL_ARGUMENT", (Parcelable)this.a.get(paramInt));
    localBundle.putBoolean("IS_TABLET_ARGUMENT", this.b);
    localBundle.putInt("POSITION_ARGUMENT", paramInt);
    if (this.c != null)
      localBundle.putInt("PAGER_POSITION_ARGUMENT", this.c.getCurrentItem());
    localBundle.putString("page_api_url", ((Model)this.a.get(paramInt)).t().url);
    localBundle.putString("page_intent_uri", ((Model)this.a.get(paramInt)).t().intent);
    ArrayList localArrayList = new ArrayList();
    localArrayList.add(new Logger.PageParameter("id", String.valueOf(((Model)this.a.get(paramInt)).e())));
    localBundle.putParcelableArrayList("page_uri_param", localArrayList);
    localStoryItemFragment.setArguments(localBundle);
    return localStoryItemFragment;
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.jupiter.onboard.u
 * JD-Core Version:    0.6.0
 */