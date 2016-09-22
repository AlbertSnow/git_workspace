package com.wandoujia.p4.gift.fragment;

import android.content.Context;
import android.content.res.Resources;
import android.os.Bundle;
import android.os.Parcelable;
import android.view.View;
import com.wandoujia.entities.app.IAppLiteInfo.AppType;
import com.wandoujia.p4.adapter.m;
import com.wandoujia.p4.adapter.p;
import com.wandoujia.p4.c.j;
import com.wandoujia.p4.c.l;
import com.wandoujia.p4.c.o;
import com.wandoujia.p4.fragment.AsyncLoadFragment;
import com.wandoujia.p4.gift.http.model.GiftModel;
import com.wandoujia.p4.gift.http.model.GiftModel.GiftViewType;
import com.wandoujia.p4.gift.views.RecommendGiftCardView;
import com.wandoujia.p4.tips.TipsType;
import com.wandoujia.p4.views.ContentListView;
import com.wandoujia.p4.views.FetchMoreFooterView;

public class MyGiftListFragment extends AsyncLoadFragment
{
  private com.wandoujia.p4.gift.http.b.a a;
  private com.wandoujia.p4.gift.b.a b;
  private ContentListView c;
  private boolean d;
  private l<com.wandoujia.p4.gift.view.model.a> e;
  private m f;
  private FetchMoreFooterView g;
  private Parcelable h;
  private int i;
  private RecommendGiftCardView j;
  private IAppLiteInfo.AppType k;
  private boolean l = true;
  private j<com.wandoujia.p4.gift.view.model.a> m = new c(this);
  private j<GiftModel> n = new d(this);

  private l b()
  {
    if (this.e == null)
      this.e = new l(new o(new com.wandoujia.p4.gift.http.b.c(this.k), new com.wandoujia.p4.gift.view.model.a.a(GiftModel.GiftViewType.MY_GIFT)), this.m);
    return this.e;
  }

  protected final void a()
  {
    View localView = getContentView();
    TipsType[] arrayOfTipsType1 = new TipsType[1];
    arrayOfTipsType1[0] = TipsType.FETCH_FAILED_FLOATING;
    com.wandoujia.p4.tips.a.a(localView, arrayOfTipsType1);
    ContentListView localContentListView = this.c;
    TipsType[] arrayOfTipsType2 = new TipsType[1];
    arrayOfTipsType2[0] = TipsType.LOADING;
    com.wandoujia.p4.tips.a.a(localContentListView, arrayOfTipsType2);
  }

  protected int getLayoutResId()
  {
    return 2130903056;
  }

  public void onCreate(Bundle paramBundle)
  {
    super.onCreate(paramBundle);
    setHasOptionsMenu(true);
    if (getArguments() != null)
    {
      this.k = ((IAppLiteInfo.AppType)getArguments().getSerializable("argumentType"));
      this.l = getArguments().getBoolean("argumentHeaderView", true);
    }
    if (paramBundle != null)
      this.h = paramBundle.getParcelable("phoenix.intent.extra.LIST_STATE");
  }

  protected void onInflated(View paramView, Bundle paramBundle)
  {
    this.c = ((ContentListView)paramView.findViewById(2131493123));
    com.wandoujia.p4.utils.c.a(this.c);
    this.g = FetchMoreFooterView.a(this.c);
    this.c.setOnScrollListener(new e(this));
    this.b = new com.wandoujia.p4.gift.b.a(getActivity());
    ContentListView localContentListView = this.c;
    this.f = new m(this.b);
    int i1 = com.wandoujia.p4.a.a().getResources().getDimensionPixelSize(2131427468);
    localContentListView.setAdapter(new p(this.f, i1, i1));
    this.d = true;
    setTitle(getResources().getString(2131624879));
  }

  protected void onPrepareLoading()
  {
    if (!this.d);
    do
      return;
    while ((this.b == null) || (this.b.getCount() != 0));
    com.wandoujia.p4.tips.a.a(this.c, TipsType.LOADING);
  }

  public void onSaveInstanceState(Bundle paramBundle)
  {
    if ((paramBundle != null) && (this.c != null))
      paramBundle.putParcelable("phoenix.intent.extra.LIST_STATE", this.c.onSaveInstanceState());
    super.onSaveInstanceState(paramBundle);
  }

  protected void onStartLoading()
  {
    if (this.l)
    {
      this.a = new com.wandoujia.p4.gift.http.b.a();
      this.a.a(0, 20, this.n);
    }
    b().a();
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.p4.gift.fragment.MyGiftListFragment
 * JD-Core Version:    0.6.0
 */