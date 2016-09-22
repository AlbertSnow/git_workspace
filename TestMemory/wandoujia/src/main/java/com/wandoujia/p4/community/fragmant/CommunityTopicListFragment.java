package com.wandoujia.p4.community.fragmant;

import android.app.Activity;
import android.os.Bundle;
import android.support.v4.app.b;
import android.text.TextUtils;
import android.view.View;
import com.wandoujia.jupiter.view.p;
import com.wandoujia.p4.adapter.h;
import com.wandoujia.p4.c.o;
import com.wandoujia.p4.community.card.b.a.d;
import com.wandoujia.p4.community.eventbus.CommunityEvent;
import com.wandoujia.p4.community.http.b.k;
import com.wandoujia.p4.tips.TipsType;
import com.wandoujia.p4.views.ContentListView;
import de.greenrobot.event.c;
import java.util.concurrent.ExecutionException;

public class CommunityTopicListFragment extends CommunityNetworkListAsyncloadFragment<com.wandoujia.p4.community.card.b.l>
{
  private String c;
  private String d;
  private k e;

  private void r()
  {
    if (!isAdded())
      return;
    if ("normal".equals(this.c))
    {
      ContentListView localContentListView2 = m();
      TipsType[] arrayOfTipsType2 = new TipsType[1];
      arrayOfTipsType2[0] = TipsType.COMMUNITY_NO_TOPIC;
      com.wandoujia.p4.tips.a.a(localContentListView2, arrayOfTipsType2);
    }
    while (true)
    {
      if (i() != null)
        i().c();
      g();
      return;
      ContentListView localContentListView1 = m();
      TipsType[] arrayOfTipsType1 = new TipsType[1];
      arrayOfTipsType1[0] = TipsType.COMMUNITY_NO_FEATURE_TOPIC;
      com.wandoujia.p4.tips.a.a(localContentListView1, arrayOfTipsType1);
    }
  }

  protected final com.wandoujia.p4.c.a<com.wandoujia.p4.community.card.b.l> a()
  {
    if (this.e == null)
      if (!"feature".equals(this.c))
        break label54;
    label54: for (this.e = new k(this.d, 1); ; this.e = new k(this.d, 0))
      return new o(this.e, new d());
  }

  protected final void a(int paramInt, ExecutionException paramExecutionException)
  {
    super.a(paramInt, paramExecutionException);
    if (getActivity() != null)
      p.a(getActivity(), 2131625287, p.a).a();
  }

  protected final h<com.wandoujia.p4.community.card.b.l> b()
  {
    return new ap(this, 0);
  }

  protected final void c()
  {
    if ("normal".equals(this.c))
    {
      com.wandoujia.p4.tips.a.a(m(), TipsType.COMMUNITY_NO_TOPIC);
      return;
    }
    com.wandoujia.p4.tips.a.a(m(), TipsType.COMMUNITY_NO_FEATURE_TOPIC);
  }

  protected final boolean d()
  {
    return true;
  }

  protected final void e()
  {
    super.e();
    r();
  }

  protected int getLayoutResId()
  {
    return 2130903209;
  }

  public void onAttach(Activity paramActivity)
  {
    super.onAttach(paramActivity);
    b.O().a(this);
  }

  public void onCreate(Bundle paramBundle)
  {
    super.onCreate(paramBundle);
    Bundle localBundle = getArguments();
    if (localBundle != null)
    {
      this.d = localBundle.getString("group_id");
      this.c = localBundle.getString("scope");
      if (TextUtils.isEmpty(this.c))
        this.c = "normal";
    }
  }

  public void onDestroy()
  {
    super.onDestroy();
    com.wandoujia.p4.c.a locala = i().d();
    if (locala != null)
      locala.d();
  }

  public void onDetach()
  {
    super.onDetach();
    b.O().c(this);
  }

  public void onEventMainThread(CommunityEvent paramCommunityEvent)
  {
    if (!isAdded())
      return;
    switch (ao.a[paramCommunityEvent.a.ordinal()])
    {
    default:
      return;
    case 1:
    case 2:
    case 3:
    case 4:
    case 5:
    }
    r();
  }

  protected void onInflated(View paramView, Bundle paramBundle)
  {
    super.onInflated(paramView, paramBundle);
    View localView = paramView.findViewById(2131493121);
    if (localView != null)
      localView.setVisibility(8);
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.p4.community.fragmant.CommunityTopicListFragment
 * JD-Core Version:    0.6.0
 */