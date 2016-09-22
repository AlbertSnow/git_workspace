package com.wandoujia.p4.feedback;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import com.wandoujia.p4.feedback.zendesk.ZendeskModels.AuditsBundle;

final class ab
  implements View.OnClickListener
{
  ab(ViewGroup paramViewGroup, ZendeskModels.AuditsBundle paramAuditsBundle)
  {
  }

  public final void onClick(View paramView)
  {
    Intent localIntent = new Intent(this.a.getContext(), FeedBackDialogActivity.class);
    Bundle localBundle = new Bundle();
    try
    {
      localBundle.putSerializable("comments", this.b);
      localIntent.putExtra("comments", localBundle);
      this.a.getContext().startActivity(localIntent);
      return;
    }
    catch (Exception localException)
    {
    }
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.p4.feedback.ab
 * JD-Core Version:    0.6.0
 */