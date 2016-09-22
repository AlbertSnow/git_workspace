package com.wandoujia.jupiter.topic.activity;

import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.ac;
import android.support.v4.app.b;
import android.support.v4.app.q;
import com.wandoujia.jupiter.topic.fragment.TopicFragment;
import com.wandoujia.ripple_framework.activity.BaseActivity;
import java.util.List;

public class TopicDetailActivity extends BaseActivity
{
  private String a;
  private String b;
  private String c;

  protected void onCreate(Bundle paramBundle)
  {
    super.onCreate(paramBundle);
    List localList = b.a(getIntent());
    this.c = getIntent().getDataString();
    if (getIntent().getDataString().startsWith("http://subscribe.wandoujia.com"))
    {
      this.a = "FOLLOW";
      this.b = ((String)localList.get(-1 + localList.size()));
      if ((getIntent() == null) || (getIntent().getExtras() == null))
        break label227;
    }
    label227: for (TopicFragment localTopicFragment = TopicFragment.a(this.c, this.b, this.a, getIntent().getExtras()); ; localTopicFragment = TopicFragment.a(this.c, this.b, this.a))
    {
      getSupportFragmentManager().a().b(16908290, localTopicFragment).a();
      return;
      if (localList.size() >= 2)
      {
        this.a = ((String)localList.get(-2 + localList.size()));
        this.b = ((String)localList.get(-1 + localList.size()));
        break;
      }
      if ((!b.E(getIntent().getDataString())) || (localList.size() <= 1))
        break;
      this.b = ((String)localList.get(-1 + localList.size()));
      break;
    }
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.jupiter.topic.activity.TopicDetailActivity
 * JD-Core Version:    0.6.0
 */