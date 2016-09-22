package com.wandoujia.jupiter.subscribe;

import com.wandoujia.api.proto.Entity.Builder;
import com.wandoujia.api.proto.PublisherTimeDetail;
import com.wandoujia.api.proto.TemplateTypeEnum.TemplateType;
import com.wandoujia.jupiter.a.a;
import com.wandoujia.nirvana.framework.network.page.e;
import com.wandoujia.ripple_framework.model.Model;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Iterator;
import java.util.List;
import java.util.TimeZone;

public final class q extends a
{
  private e<Model> a;
  private Calendar b = null;

  public q(e<Model> parame)
  {
    this.a = parame;
  }

  private static Calendar a(long paramLong)
  {
    Calendar localCalendar = Calendar.getInstance(TimeZone.getTimeZone("UTC"));
    localCalendar.setTimeInMillis(paramLong);
    return localCalendar;
  }

  public final List<Model> a(List<Model> paramList)
  {
    ArrayList localArrayList = new ArrayList();
    Iterator localIterator = paramList.iterator();
    if (localIterator.hasNext())
    {
      Model localModel = (Model)localIterator.next();
      long l;
      int i;
      if ((localModel.J() != null) && (localModel.J().create_time != null))
      {
        l = localModel.J().create_time.longValue();
        if (this.b != null)
          break label147;
        this.b = a(l);
        i = 1;
      }
      while (true)
      {
        if (i == 0)
        {
          localArrayList.add(new Model(new Entity.Builder(localModel.b()).template_type(TemplateTypeEnum.TemplateType.TIME_SPLITTER_CARD).build()));
          this.b = a(l);
        }
        localArrayList.add(localModel);
        break;
        label147: Calendar localCalendar = a(l);
        if (this.b.get(6) == localCalendar.get(6))
        {
          i = 1;
          continue;
        }
        i = 0;
      }
    }
    if (this.a != null)
      return this.a.a(localArrayList);
    return localArrayList;
  }

  public final void a()
  {
    this.b = null;
    if (this.a != null)
      this.a.a();
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.jupiter.subscribe.q
 * JD-Core Version:    0.6.0
 */