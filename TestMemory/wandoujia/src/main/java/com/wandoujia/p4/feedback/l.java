package com.wandoujia.p4.feedback;

import android.content.Context;
import android.text.TextUtils;
import android.text.method.LinkMovementMethod;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;
import com.wandoujia.base.utils.DateUtil;
import com.wandoujia.p4.feedback.zendesk.ZendeskModels.Audits;
import com.wandoujia.p4.feedback.zendesk.ZendeskModels.Event;
import com.wandoujia.p4.utils.c;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public final class l extends BaseAdapter
{
  private List<ZendeskModels.Audits> a;

  public l(List<ZendeskModels.Audits> paramList)
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

  public final int getItemViewType(int paramInt)
  {
    ZendeskModels.Audits localAudits = (ZendeskModels.Audits)this.a.get(paramInt);
    if (((ZendeskModels.Event)((ZendeskModels.Audits)this.a.get(0)).getEvents().get(0)).getAuthor_id() == ((ZendeskModels.Event)localAudits.getEvents().get(0)).getAuthor_id())
      return 0;
    return 1;
  }

  public final View getView(int paramInt, View paramView, ViewGroup paramViewGroup)
  {
    int i = getItemViewType(paramInt);
    ZendeskModels.Audits localAudits = (ZendeskModels.Audits)this.a.get(paramInt);
    m localm1;
    m localm2;
    label124: StringBuilder localStringBuilder;
    String str;
    if (paramView == null)
    {
      localm1 = new m(0);
      if (i == 1)
      {
        paramView = c.a(paramViewGroup.getContext(), 2130903066);
        m.a(localm1, (TextView)paramView.findViewById(2131493171));
        m.b(localm1, (TextView)paramView.findViewById(2131493170));
        m.c(localm1, (TextView)paramView.findViewById(2131493172));
        m.a(localm1).setText(paramViewGroup.getContext().getText(2131624761));
        paramView.setTag(localm1);
        localm2 = localm1;
        SimpleDateFormat localSimpleDateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm");
        m.b(localm2).setText(DateUtil.timeStamp2Date(String.valueOf(localAudits.getCreated_at().getTime()), localSimpleDateFormat));
        List localList = localAudits.getEvents();
        localStringBuilder = new StringBuilder();
        Iterator localIterator = localList.iterator();
        while (localIterator.hasNext())
        {
          str = ((ZendeskModels.Event)localIterator.next()).getBody();
          if (TextUtils.isEmpty(str))
            continue;
          int j = str.indexOf("<a href=");
          if (j < 0)
            break label366;
          localStringBuilder.append(str.substring(0, j));
        }
      }
    }
    while (true)
    {
      m.c(localm2).setText(localStringBuilder.toString());
      m.c(localm2).setAutoLinkMask(15);
      m.c(localm2).setMovementMethod(LinkMovementMethod.getInstance());
      return paramView;
      if (i != 0)
        break;
      paramView = c.a(paramViewGroup.getContext(), 2130903072);
      m.a(localm1, (TextView)paramView.findViewById(2131493191));
      m.b(localm1, (TextView)paramView.findViewById(2131493192));
      m.c(localm1, (TextView)paramView.findViewById(2131493190));
      m.a(localm1).setText("我");
      break;
      localm2 = (m)paramView.getTag();
      break label124;
      label366: localStringBuilder.append(str);
    }
  }

  public final int getViewTypeCount()
  {
    return 2;
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.p4.feedback.l
 * JD-Core Version:    0.6.0
 */