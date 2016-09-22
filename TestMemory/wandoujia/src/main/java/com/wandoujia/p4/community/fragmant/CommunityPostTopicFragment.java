package com.wandoujia.p4.community.fragmant;

import android.content.Context;
import android.os.Bundle;
import android.support.v4.app.FragmentActivity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.wandoujia.p4.a;
import com.wandoujia.p4.community.http.c.f;
import com.wandoujia.p4.community.http.model.CommunityGroupModel;

public class CommunityPostTopicFragment extends CommunityPostContentFragment
{
  private CommunityGroupModel a;
  private final f b = new ab(this);

  private boolean h()
  {
    return (this.a != null) && ("anime".equalsIgnoreCase(this.a.getSubjectType()));
  }

  protected final CharSequence a()
  {
    Context localContext = a.a();
    Object[] arrayOfObject = new Object[1];
    arrayOfObject[0] = this.a.getTitle();
    return localContext.getString(2131624500, arrayOfObject);
  }

  protected final CharSequence b()
  {
    return a.a().getString(2131624503);
  }

  protected final y c()
  {
    return new ac(this);
  }

  protected final void d()
  {
    if (!isAdded());
    Bundle localBundle;
    do
    {
      return;
      localBundle = getArguments();
    }
    while (localBundle == null);
    this.a = ((CommunityGroupModel)localBundle.getSerializable("group_model"));
  }

  protected final int e()
  {
    return 5000;
  }

  protected final void g()
  {
    super.g();
    if ((h()) && (getActivity() != null))
      getActivity().finish();
  }

  protected boolean initializePageUri(View paramView)
  {
    return false;
  }

  public void onActivityCreated(Bundle paramBundle)
  {
    super.onActivityCreated(paramBundle);
    if (h())
    {
      Object[] arrayOfObject = new Object[1];
      arrayOfObject[0] = this.a.getTitle();
      a(getString(2131624502, arrayOfObject));
      a(f(), 1);
    }
  }

  public View onCreateView(LayoutInflater paramLayoutInflater, ViewGroup paramViewGroup, Bundle paramBundle)
  {
    return super.onCreateView(paramLayoutInflater, paramViewGroup, paramBundle);
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.p4.community.fragmant.CommunityPostTopicFragment
 * JD-Core Version:    0.6.0
 */