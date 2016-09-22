package com.wandoujia.p4.feedback;

import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;
import com.wandoujia.base.utils.DateUtil;
import com.wandoujia.p4.configs.Config;
import com.wandoujia.p4.feedback.zendesk.ZendeskModels.Audits;
import com.wandoujia.p4.feedback.zendesk.ZendeskModels.AuditsBundle;
import com.wandoujia.p4.feedback.zendesk.ZendeskModels.Event;
import com.wandoujia.p4.utils.c;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public final class aa extends BaseAdapter
{
  private List<ZendeskModels.AuditsBundle> a;

  public aa(List<ZendeskModels.AuditsBundle> paramList)
  {
    this.a = paramList;
  }

  public final int getCount()
  {
    return this.a.size();
  }

  public final long getItemId(int paramInt)
  {
    return paramInt;
  }

  public final View getView(int paramInt, View paramView, ViewGroup paramViewGroup)
  {
    ac localac2;
    if (paramView == null)
    {
      paramView = c.a(paramViewGroup.getContext(), 2130903070);
      localac2 = new ac(0);
      ac.a(localac2, (TextView)paramView.findViewById(2131493183));
      ac.b(localac2, (TextView)paramView.findViewById(2131493185));
      ac.c(localac2, (TextView)paramView.findViewById(2131493184));
      paramView.setTag(localac2);
    }
    ZendeskModels.AuditsBundle localAuditsBundle;
    List localList1;
    ZendeskModels.Audits localAudits;
    StringBuilder localStringBuilder;
    for (ac localac1 = localac2; ; localac1 = (ac)paramView.getTag())
    {
      localAuditsBundle = (ZendeskModels.AuditsBundle)this.a.get(paramInt);
      localList1 = localAuditsBundle.getAudits();
      localAudits = (ZendeskModels.Audits)localList1.get(0);
      ac.a(localac1).setText(DateUtil.timeStamp2Date(String.valueOf(localAudits.getCreated_at().getTime())));
      List localList2 = localAudits.getEvents();
      localStringBuilder = new StringBuilder();
      Iterator localIterator = localList2.iterator();
      while (localIterator.hasNext())
      {
        String str = ((ZendeskModels.Event)localIterator.next()).getBody();
        if (TextUtils.isEmpty(str))
          continue;
        localStringBuilder.append(str);
      }
    }
    ac.b(localac1).setText(localStringBuilder.toString());
    int i = Config.d(localAudits.getTicket_id());
    if (localList1.size() > i)
    {
      ac.c(localac1).setVisibility(0);
      ac.c(localac1).setText("1");
    }
    while (true)
    {
      paramView.setOnClickListener(new ab(paramViewGroup, localAuditsBundle));
      return paramView;
      ac.c(localac1).setVisibility(8);
    }
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.p4.feedback.aa
 * JD-Core Version:    0.6.0
 */