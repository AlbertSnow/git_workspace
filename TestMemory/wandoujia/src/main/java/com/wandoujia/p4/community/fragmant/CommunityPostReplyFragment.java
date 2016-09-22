package com.wandoujia.p4.community.fragmant;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import com.wandoujia.p4.a;
import com.wandoujia.p4.community.http.c.f;
import com.wandoujia.p4.community.http.model.CommunityReplyModel;
import com.wandoujia.p4.community.http.model.CommunityTopicModel;
import com.wandoujia.p4.community.http.model.CommunityUserModel;

public class CommunityPostReplyFragment extends CommunityPostContentFragment
{
  private CommunityTopicModel a;
  private CommunityReplyModel b;
  private final f c = new z(this);

  protected final CharSequence a()
  {
    if (this.b != null)
    {
      String str = a.a().getString(2131624520);
      Object[] arrayOfObject = new Object[1];
      arrayOfObject[0] = this.b.getAuthor().getNick();
      return String.format(str, arrayOfObject);
    }
    return a.a().getString(2131624522);
  }

  protected final CharSequence b()
  {
    return a.a().getString(2131624782);
  }

  protected final y c()
  {
    return new aa(this);
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
    this.a = ((CommunityTopicModel)localBundle.getSerializable("topic_model"));
    this.b = ((CommunityReplyModel)localBundle.getSerializable("reply_model"));
  }

  protected final int e()
  {
    return 1000;
  }

  protected final int f()
  {
    return 1;
  }

  protected boolean initializePageUri(View paramView)
  {
    return false;
  }

  public void onActivityCreated(Bundle paramBundle)
  {
    super.onActivityCreated(paramBundle);
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.p4.community.fragmant.CommunityPostReplyFragment
 * JD-Core Version:    0.6.0
 */