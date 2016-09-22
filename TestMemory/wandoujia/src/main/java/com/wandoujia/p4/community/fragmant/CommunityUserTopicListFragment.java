package com.wandoujia.p4.community.fragmant;

import android.app.Activity;
import android.os.Bundle;
import android.support.v4.app.FragmentActivity;
import android.support.v4.app.b;
import android.text.TextUtils;
import android.view.View;
import com.wandoujia.p4.adapter.h;
import com.wandoujia.p4.c.o;
import com.wandoujia.p4.community.card.b.n;
import com.wandoujia.p4.community.eventbus.CommunityEvent;
import com.wandoujia.p4.community.http.b.d;
import com.wandoujia.p4.community.http.b.f;
import com.wandoujia.p4.community.http.b.i;
import com.wandoujia.p4.community.http.b.j;
import com.wandoujia.p4.tips.TipsType;

public class CommunityUserTopicListFragment extends CommunityNetworkListAsyncloadFragment<n>
{
  private i c;
  private CommunityUserTopicListFragment.TopicType d = CommunityUserTopicListFragment.TopicType.NEWEST;

  private void r()
  {
    if ((getActivity() == null) || (getActivity().isFinishing()))
      return;
    g();
  }

  protected final com.wandoujia.p4.c.a<n> a()
  {
    if (this.c == null)
      this.c = new j();
    return new o(this.c, new com.wandoujia.p4.community.card.b.a.c());
  }

  protected final h<n> b()
  {
    return new be(this, 0);
  }

  protected final void c()
  {
    switch (bd.a[this.d.ordinal()])
    {
    default:
      return;
    case 1:
      com.wandoujia.p4.tips.a.a(m(), TipsType.COMMUNITY_NO_TOPIC_FEED).setOnClickListener(new bc(this));
      return;
    case 2:
      com.wandoujia.p4.tips.a.a(m(), TipsType.COMMUNITY_NO_PUBLISHED_TOPIC);
      return;
    case 3:
    }
    com.wandoujia.p4.tips.a.a(m(), TipsType.COMMUNITY_NO_REPLIED_TOPIC);
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
      this.d = ((CommunityUserTopicListFragment.TopicType)localBundle.getSerializable("topics_type"));
    switch (bd.a[this.d.ordinal()])
    {
    default:
      return;
    case 1:
      this.c = new j();
      return;
    case 2:
      this.c = new d();
      return;
    case 3:
    }
    this.c = new f();
  }

  public void onDestroy()
  {
    super.onDestroy();
    if (this.c != null)
      this.c.d();
  }

  public void onDetach()
  {
    super.onDetach();
    b.O().c(this);
  }

  public void onEventMainThread(CommunityEvent paramCommunityEvent)
  {
    if (!isAdded());
    while (true)
    {
      return;
      switch (bd.b[paramCommunityEvent.a.ordinal()])
      {
      default:
        return;
      case 1:
      case 2:
      case 3:
      case 4:
      case 5:
        if (!paramCommunityEvent.b)
          continue;
        r();
        return;
      case 6:
        int i = ((Integer)paramCommunityEvent.c).intValue();
        if ((!isAdded()) || (this.d == CommunityUserTopicListFragment.TopicType.NEWEST))
          continue;
        String str;
        if (this.d == CommunityUserTopicListFragment.TopicType.PUBLISHED)
        {
          FragmentActivity localFragmentActivity2 = getActivity();
          Object[] arrayOfObject2 = new Object[1];
          arrayOfObject2[0] = Integer.valueOf(i);
          str = localFragmentActivity2.getString(2131624506, arrayOfObject2);
        }
        while (!TextUtils.isEmpty(str))
        {
          setTitle(str);
          return;
          CommunityUserTopicListFragment.TopicType localTopicType1 = this.d;
          CommunityUserTopicListFragment.TopicType localTopicType2 = CommunityUserTopicListFragment.TopicType.REPLIED;
          str = null;
          if (localTopicType1 != localTopicType2)
            continue;
          FragmentActivity localFragmentActivity1 = getActivity();
          Object[] arrayOfObject1 = new Object[1];
          arrayOfObject1[0] = Integer.valueOf(i);
          str = localFragmentActivity1.getString(2131624515, arrayOfObject1);
        }
      }
    }
  }

  protected void onInflated(View paramView, Bundle paramBundle)
  {
    super.onInflated(paramView, paramBundle);
    View localView1 = paramView.findViewById(2131493500);
    if (localView1 != null)
      localView1.setVisibility(8);
    View localView2 = paramView.findViewById(2131493121);
    if ((this.d == CommunityUserTopicListFragment.TopicType.NEWEST) && (localView2 != null))
      localView2.setVisibility(8);
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.p4.community.fragmant.CommunityUserTopicListFragment
 * JD-Core Version:    0.6.0
 */