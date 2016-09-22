package com.wandoujia.p4.feedback;

import android.text.TextUtils;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.EditText;
import android.widget.ListView;
import com.wandoujia.base.utils.NetworkUtil;
import com.wandoujia.jupiter.view.p;
import com.wandoujia.p4.feedback.zendesk.ZendeskModels.Audits;
import com.wandoujia.p4.feedback.zendesk.ZendeskModels.Event;
import com.wandoujia.ripple_framework.view.a.h;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

final class a
  implements View.OnClickListener
{
  a(FeedBackDialogActivity paramFeedBackDialogActivity)
  {
  }

  public final void onClick(View paramView)
  {
    if (!NetworkUtil.isNetworkConnected(this.a.getApplicationContext()))
    {
      p.a(this.a, this.a.getString(2131625187), p.b).a();
      return;
    }
    if (TextUtils.isEmpty(FeedBackDialogActivity.a(this.a).getText().toString()))
    {
      h localh = new h(this.a);
      localh.b(this.a.getString(2131624738));
      localh.b(2131624552, new b());
      localh.a().show();
      return;
    }
    long l = ((ZendeskModels.Event)((ZendeskModels.Audits)FeedBackDialogActivity.b(this.a).get(0)).getEvents().get(0)).getAuthor_id();
    ZendeskModels.Audits localAudits = new ZendeskModels.Audits();
    ArrayList localArrayList = new ArrayList();
    ZendeskModels.Event localEvent = new ZendeskModels.Event();
    localEvent.setBody(FeedBackDialogActivity.a(this.a).getText().toString());
    localEvent.setAuthor_id(l);
    localArrayList.add(localEvent);
    localAudits.setEvents(localArrayList);
    localAudits.setCreated_at(new Date());
    com.wandoujia.p4.feedback.zendesk.a.a().a(FeedBackDialogActivity.a(this.a).getText().toString().replace("\n", "\\n"), ((ZendeskModels.Audits)FeedBackDialogActivity.b(this.a).get(0)).getTicket_id(), l);
    FeedBackDialogActivity.b(this.a).add(localAudits);
    FeedBackDialogActivity.c(this.a).setAdapter(new l(FeedBackDialogActivity.b(this.a)));
    FeedBackDialogActivity.c(this.a).setSelection(FeedBackDialogActivity.c(this.a).getBottom());
    FeedBackDialogActivity.a(this.a).setText("");
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.p4.feedback.a
 * JD-Core Version:    0.6.0
 */