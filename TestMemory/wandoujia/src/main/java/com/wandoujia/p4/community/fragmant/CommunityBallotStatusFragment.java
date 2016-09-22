package com.wandoujia.p4.community.fragmant;

import android.app.Activity;
import android.os.Bundle;
import android.support.v4.app.b;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.wandoujia.p4.community.eventbus.CommunityEvent;
import com.wandoujia.p4.community.eventbus.CommunityEvent.Type;
import com.wandoujia.p4.community.views.CommunityBallotInfoView;
import com.wandoujia.p4.community.views.CommunityBallotProgressView;
import com.wandoujia.ripple_framework.fragment.BaseFragment;
import de.greenrobot.event.c;

public class CommunityBallotStatusFragment extends BaseFragment
{
  private String a;
  private boolean b;
  private boolean c;
  private TextView d;
  private CommunityBallotInfoView e;

  protected boolean initializePageUri(View paramView)
  {
    return false;
  }

  public void onActivityCreated(Bundle paramBundle)
  {
    super.onActivityCreated(paramBundle);
    b.a(new f(this, 0), new String[0]);
    b.a(new g(this, 0), new Void[0]);
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
      this.a = localBundle.getString("group_id");
      this.b = localBundle.getBoolean("video_detail_ballot", false);
      this.c = localBundle.getBoolean("show_nominate_card", true);
    }
  }

  public View onCreateView(LayoutInflater paramLayoutInflater, ViewGroup paramViewGroup, Bundle paramBundle)
  {
    View localView = paramLayoutInflater.inflate(2130903195, null);
    this.e = ((CommunityBallotInfoView)localView.findViewById(2131493474));
    this.d = ((TextView)localView.findViewById(2131493473));
    if (this.b)
      ((CommunityBallotProgressView)localView.findViewById(2131493472)).a();
    if (!this.c)
    {
      localView.findViewById(2131493484).setVisibility(8);
      this.e.findViewById(2131493483).setVisibility(8);
    }
    localView.findViewById(2131493485).setOnClickListener(new e(this));
    return localView;
  }

  public void onDetach()
  {
    super.onDetach();
    b.O().c(this);
  }

  public void onEventMainThread(CommunityEvent paramCommunityEvent)
  {
    if ((isAdded()) && (paramCommunityEvent.a == CommunityEvent.Type.BALLOT) && (paramCommunityEvent.b))
    {
      b.a(new f(this, 0), new String[0]);
      b.a(new g(this, 0), new Void[0]);
    }
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.p4.community.fragmant.CommunityBallotStatusFragment
 * JD-Core Version:    0.6.0
 */