package com.wandoujia.p4.community.fragmant;

import android.app.Activity;
import android.os.Bundle;
import android.support.v4.app.b;
import android.view.MenuItem;
import android.view.View;
import com.wandoujia.account.a;
import com.wandoujia.p4.community.eventbus.CommunityEvent;
import com.wandoujia.p4.community.views.e;
import com.wandoujia.p4.fragment.TabHostFragment;
import com.wandoujia.p4.fragment.k;
import java.util.ArrayList;
import java.util.List;
import java.util.List<Lcom.wandoujia.p4.fragment.k;>;

public class CommunityHomePageTabFragment extends TabHostFragment
{
  private List<k> a;

  protected final int a()
  {
    return 2130903507;
  }

  public final String b()
  {
    return "topic_feed";
  }

  public final List<k> c()
  {
    this.a = new ArrayList();
    CommunityHomePageTabFragment.HomePageTab[] arrayOfHomePageTab = CommunityHomePageTabFragment.HomePageTab.values();
    int i = arrayOfHomePageTab.length;
    int j = 0;
    if (j < i)
    {
      CommunityHomePageTabFragment.HomePageTab localHomePageTab = arrayOfHomePageTab[j];
      Bundle localBundle;
      Object localObject;
      if ((a.z()) || (!CommunityHomePageTabFragment.HomePageTab.access$100(localHomePageTab)))
      {
        localBundle = new Bundle();
        switch (n.a[localHomePageTab.ordinal()])
        {
        default:
          localObject = null;
        case 1:
        case 2:
        case 3:
        case 4:
        }
      }
      while (true)
      {
        ((k)localObject).a(localBundle);
        this.a.add(localObject);
        j++;
        break;
        localObject = new k(new com.wandoujia.p4.community.views.c(CommunityHomePageTabFragment.HomePageTab.access$200(localHomePageTab), CommunityHomePageTabFragment.HomePageTab.access$300(localHomePageTab)), CommunityUserTopicListFragment.class, null);
        localBundle.putSerializable("topics_type", CommunityUserTopicListFragment.TopicType.NEWEST);
        continue;
        localObject = new k(new com.wandoujia.p4.community.views.c(CommunityHomePageTabFragment.HomePageTab.access$200(localHomePageTab), CommunityHomePageTabFragment.HomePageTab.access$300(localHomePageTab)), CommunityGroupListFragment.class, null);
        localBundle.putBoolean("filter_joined_groups", true);
        continue;
        localBundle.putBoolean("force_close_toolbar", true);
        localObject = new k(new com.wandoujia.p4.community.views.c(CommunityHomePageTabFragment.HomePageTab.access$200(localHomePageTab), CommunityHomePageTabFragment.HomePageTab.access$300(localHomePageTab)), CommunityUserInfoListFragment.class, null);
        continue;
        localBundle.putBoolean("force_close_toolbar", true);
        localObject = new k(new e(CommunityHomePageTabFragment.HomePageTab.access$200(localHomePageTab), CommunityHomePageTabFragment.HomePageTab.access$300(localHomePageTab)), CommunityNotificationListFragment.class, null);
      }
    }
    return (List<k>)this.a;
  }

  public void onAttach(Activity paramActivity)
  {
    super.onAttach(paramActivity);
    b.O().a(this);
  }

  public void onCreate(Bundle paramBundle)
  {
    super.onCreate(paramBundle);
    a(new m(this));
  }

  public void onDetach()
  {
    super.onDetach();
    b.O().c(this);
  }

  public void onEventMainThread(CommunityEvent paramCommunityEvent)
  {
    if (!isAdded());
    do
    {
      return;
      switch (n.b[paramCommunityEvent.a.ordinal()])
      {
      default:
        return;
      case 1:
        a((String)paramCommunityEvent.c, getArguments());
        return;
      case 2:
      }
    }
    while (!paramCommunityEvent.b);
    a(c());
    a("message", getArguments());
    a("my_group", getArguments());
  }

  public boolean onOptionsItemSelected(MenuItem paramMenuItem)
  {
    return super.onOptionsItemSelected(paramMenuItem);
  }

  public void onViewCreated(View paramView, Bundle paramBundle)
  {
    super.onViewCreated(paramView, paramBundle);
    setTitle(getString(2131624550));
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.p4.community.fragmant.CommunityHomePageTabFragment
 * JD-Core Version:    0.6.0
 */