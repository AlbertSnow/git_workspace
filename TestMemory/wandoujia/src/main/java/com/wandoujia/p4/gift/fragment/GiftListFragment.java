package com.wandoujia.p4.gift.fragment;

import android.content.res.Resources;
import android.os.Bundle;
import android.support.v4.app.d;
import android.text.TextUtils;
import android.view.View;
import android.widget.TextView;
import com.wandoujia.entities.app.IAppLiteInfo.AppType;
import com.wandoujia.p4.adapter.h;
import com.wandoujia.p4.c.k;
import com.wandoujia.p4.c.o;
import com.wandoujia.p4.fragment.NetworkListAsyncloadFragment;
import com.wandoujia.p4.gift.http.model.GiftModel.GiftViewType;
import com.wandoujia.p4.views.ContentListView;
import com.wandoujia.ripple_framework.i;
import com.wandoujia.ripple_framework.log.Logger;

public class GiftListFragment extends NetworkListAsyncloadFragment<com.wandoujia.p4.gift.view.model.a>
{
  private IAppLiteInfo.AppType c;
  private String d;

  protected final com.wandoujia.p4.c.a<com.wandoujia.p4.gift.view.model.a> a()
  {
    return new o(new com.wandoujia.p4.gift.http.b.a(this.c), new com.wandoujia.p4.gift.view.model.a.a(GiftModel.GiftViewType.GIFT_LIST));
  }

  protected final ContentListView a(View paramView)
  {
    ContentListView localContentListView = super.a(paramView);
    View localView = d.a(localContentListView, 2130903394);
    ((TextView)localView.findViewById(2131492998)).setText(getString(2131624879));
    localView.setOnClickListener(new b(this));
    localContentListView.addHeaderView(localView);
    return localContentListView;
  }

  protected final void a(int paramInt1, int paramInt2, k<com.wandoujia.p4.gift.view.model.a> paramk)
  {
    if (isAdded())
      super.a(paramInt1, paramInt2, paramk);
  }

  protected final h<com.wandoujia.p4.gift.view.model.a> b()
  {
    return new a();
  }

  protected final void c()
  {
  }

  protected final boolean o()
  {
    return true;
  }

  public void onCreate(Bundle paramBundle)
  {
    super.onCreate(paramBundle);
    Bundle localBundle = getArguments();
    if (localBundle != null)
    {
      this.c = ((IAppLiteInfo.AppType)localBundle.getSerializable("contentType"));
      this.d = localBundle.getString("giftType");
      if ((this.c == null) && (!TextUtils.isEmpty(this.d)) && (this.d.equalsIgnoreCase("game")))
        this.c = IAppLiteInfo.AppType.GAME;
    }
  }

  protected void onInflated(View paramView, Bundle paramBundle)
  {
    super.onInflated(paramView, paramBundle);
    setTitle(getResources().getString(2131625219));
    if ((this.c == null) || (this.c == IAppLiteInfo.AppType.APP));
    for (String str = "wdj://apps/gifts"; ; str = "wdj://games/gifts")
    {
      i.k().h().a(paramView, str).a(getActivity());
      return;
    }
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.p4.gift.fragment.GiftListFragment
 * JD-Core Version:    0.6.0
 */