package com.wandoujia.p4.community.fragmant;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import com.wandoujia.p4.adapter.h;
import com.wandoujia.p4.c.l;
import com.wandoujia.p4.c.o;
import com.wandoujia.p4.community.card.b.e;
import com.wandoujia.p4.community.eventbus.CommunityEvent;
import com.wandoujia.p4.community.http.model.CommunityGroupModel;
import com.wandoujia.p4.fragment.NetworkListAsyncloadFragment;

public class CommunityAllMembersFragment extends NetworkListAsyncloadFragment<e>
{
  private CommunityGroupModel c;

  protected final com.wandoujia.p4.c.a<e> a()
  {
    return new o(new com.wandoujia.p4.community.http.b.a(this.c), new c(this, 0));
  }

  protected final h<e> b()
  {
    return new b(this, 0);
  }

  protected final void c()
  {
    if (getView() != null)
    {
      TextView localTextView = (TextView)getView().findViewById(2131492997);
      if (localTextView != null)
      {
        localTextView.setText(2131624484);
        localTextView.setVisibility(0);
      }
    }
  }

  protected int getLayoutResId()
  {
    return 2130903247;
  }

  public void onAttach(Activity paramActivity)
  {
    super.onAttach(paramActivity);
    android.support.v4.app.b.O().a(this);
  }

  public void onCreate(Bundle paramBundle)
  {
    super.onCreate(paramBundle);
    Bundle localBundle = getArguments();
    if (localBundle != null)
      this.c = ((CommunityGroupModel)localBundle.getSerializable("group_model"));
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
    android.support.v4.app.b.O().c(this);
  }

  public void onEventMainThread(CommunityEvent paramCommunityEvent)
  {
    if ((!isAdded()) || (!paramCommunityEvent.b))
      return;
    switch (a.a[paramCommunityEvent.a.ordinal()])
    {
    default:
      return;
    case 1:
      this.c.setCurUserRole(null);
    case 2:
    }
    g();
  }

  protected void onInflated(View paramView, Bundle paramBundle)
  {
    super.onInflated(paramView, paramBundle);
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.p4.community.fragmant.CommunityAllMembersFragment
 * JD-Core Version:    0.6.0
 */