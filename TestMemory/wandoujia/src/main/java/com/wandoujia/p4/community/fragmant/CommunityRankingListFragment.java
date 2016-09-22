package com.wandoujia.p4.community.fragmant;

import android.os.Bundle;
import android.support.v4.app.FragmentActivity;
import android.text.TextUtils;
import android.view.View;
import android.widget.TextView;
import com.wandoujia.p4.c.a;
import com.wandoujia.p4.c.l;
import com.wandoujia.p4.c.o;
import com.wandoujia.p4.community.http.b.e;
import com.wandoujia.p4.fragment.NetworkListAsyncloadFragment;

public class CommunityRankingListFragment extends NetworkListAsyncloadFragment<com.wandoujia.p4.community.card.b.h>
{
  private String c;
  private String d;

  protected final a<com.wandoujia.p4.community.card.b.h> a()
  {
    return new o(new e(this.d, this.c), new ae(0));
  }

  protected final com.wandoujia.p4.adapter.h<com.wandoujia.p4.community.card.b.h> b()
  {
    return new ad(this, 0);
  }

  protected final void c()
  {
    if (getView() != null)
    {
      TextView localTextView = (TextView)getView().findViewById(2131492997);
      if (localTextView != null)
      {
        localTextView.setText(2131624487);
        localTextView.setVisibility(0);
      }
    }
  }

  protected int getLayoutResId()
  {
    return 2130903247;
  }

  public void onCreate(Bundle paramBundle)
  {
    super.onCreate(paramBundle);
    Bundle localBundle = getArguments();
    if (localBundle != null)
    {
      this.c = localBundle.getString("scope");
      this.d = localBundle.getString("group_id");
    }
    if ((TextUtils.isEmpty(this.d)) && (getActivity() != null))
      getActivity().finish();
  }

  public void onDestroy()
  {
    super.onDestroy();
    a locala = i().d();
    if (locala != null)
      locala.d();
  }

  protected void onInflated(View paramView, Bundle paramBundle)
  {
    super.onInflated(paramView, paramBundle);
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.p4.community.fragmant.CommunityRankingListFragment
 * JD-Core Version:    0.6.0
 */