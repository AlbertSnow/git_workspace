package com.wandoujia.p4.community.fragmant;

import android.app.Activity;
import android.os.Bundle;
import android.support.v4.app.b;
import android.support.v7.widget.Toolbar;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import com.wandoujia.p4.button.a.a;
import com.wandoujia.p4.button.views.StatefulButton;
import com.wandoujia.p4.community.activity.CommunityTopicDetailActivity;
import com.wandoujia.p4.community.b.x;
import com.wandoujia.p4.community.card.view.CommunityCampaignItemView;
import com.wandoujia.p4.community.eventbus.CommunityEvent;
import com.wandoujia.p4.community.http.model.CommunityGroupModel;
import com.wandoujia.p4.community.http.model.CommunityTopicModel;
import com.wandoujia.p4.community.views.CommunityTopicListBannerView;
import com.wandoujia.p4.fragment.TabHostFragment;
import com.wandoujia.p4.fragment.k;
import com.wandoujia.phoenix2.av.view.ScrollDownLayout;
import de.greenrobot.event.c;
import java.util.ArrayList;
import java.util.List;

public class CommunityTopicListTabFragment extends TabHostFragment
{
  private View a;
  private StatefulButton b;
  private ScrollDownLayout c;
  private CommunityTopicListBannerView d;
  private CommunityCampaignItemView e;
  private String f;
  private CommunityGroupModel g;
  private a h;
  private a i;
  private a j;

  private void e()
  {
    if (this.g != null)
    {
      if (TextUtils.isEmpty(this.g.getCurUserRole()))
        this.b.setState(this.h);
    }
    else
      return;
    if ("anime".equalsIgnoreCase(this.g.getSubjectType()))
    {
      this.b.setState(this.j);
      return;
    }
    this.b.setState(this.i);
  }

  protected final int a()
  {
    return 2130903210;
  }

  public final List<k> c()
  {
    ArrayList localArrayList = new ArrayList();
    CommunityTopicListTabFragment.TopicListTab[] arrayOfTopicListTab = CommunityTopicListTabFragment.TopicListTab.values();
    int k = arrayOfTopicListTab.length;
    int m = 0;
    if (m < k)
    {
      CommunityTopicListTabFragment.TopicListTab localTopicListTab = arrayOfTopicListTab[m];
      k localk = CommunityTopicListTabFragment.TopicListTab.access$800(localTopicListTab);
      Bundle localBundle = new Bundle();
      localBundle.putString("group_id", this.f);
      if (localTopicListTab == CommunityTopicListTabFragment.TopicListTab.NORMAL)
        localBundle.putString("scope", "normal");
      while (true)
      {
        localk.a(localBundle);
        localArrayList.add(localk);
        m++;
        break;
        if (localTopicListTab != CommunityTopicListTabFragment.TopicListTab.FEATURED)
          continue;
        localBundle.putString("scope", "feature");
      }
    }
    return localArrayList;
  }

  public void onActivityCreated(Bundle paramBundle)
  {
    super.onActivityCreated(paramBundle);
    if (getView() != null)
    {
      Toolbar localToolbar = (Toolbar)getView().findViewById(2131493121).findViewById(2131492999);
      localToolbar.inflateMenu(2131755011);
      localToolbar.setOnMenuItemClickListener$486aeec7(new aq(this));
    }
    this.a.getViewTreeObserver().addOnGlobalLayoutListener(new ar(this));
    this.c.setEnable(true);
    this.c.setOnScrollChangedListener$130f2e40(new as(this));
    b.a(new ax(this, 0), new String[0]);
    b.a(new aw(this, 0), new Void[0]);
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
      this.f = localBundle.getString("group_id");
  }

  public View onCreateView(LayoutInflater paramLayoutInflater, ViewGroup paramViewGroup, Bundle paramBundle)
  {
    View localView = super.onCreateView(paramLayoutInflater, paramViewGroup, paramBundle);
    this.a = localView.findViewById(2131493457);
    this.d = ((CommunityTopicListBannerView)localView.findViewById(2131493441));
    this.b = ((StatefulButton)localView.findViewById(2131492866));
    this.c = ((ScrollDownLayout)localView.findViewById(2131493414));
    this.e = ((CommunityCampaignItemView)localView.findViewById(2131493486));
    this.e.setVisibility(8);
    return localView;
  }

  public void onDetach()
  {
    super.onDetach();
    b.O().c(this);
  }

  public void onEventMainThread(CommunityEvent paramCommunityEvent)
  {
    if ((!isAdded()) || (!paramCommunityEvent.b));
    do
    {
      do
      {
        do
        {
          return;
          switch (av.a[paramCommunityEvent.a.ordinal()])
          {
          default:
            return;
          case 1:
          case 2:
          case 3:
          case 4:
          }
        }
        while (this.g == null);
        this.g.setCurUserRole("GROUP_MEMBER");
        e();
        return;
      }
      while (this.g == null);
      this.g.setCurUserRole(null);
      e();
      return;
    }
    while ((this.g == null) || (this.g.getCurUserRole() != null));
    new x(this.f, getActivity()).execute();
    return;
    CommunityTopicDetailActivity.a(getActivity(), (CommunityTopicModel)paramCommunityEvent.c);
  }

  public void onViewCreated(View paramView, Bundle paramBundle)
  {
    super.onViewCreated(paramView, paramBundle);
    this.toolbarContainer.setVisibility(8);
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.p4.community.fragmant.CommunityTopicListTabFragment
 * JD-Core Version:    0.6.0
 */