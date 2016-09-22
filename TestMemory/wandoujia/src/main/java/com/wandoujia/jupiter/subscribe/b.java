package com.wandoujia.jupiter.subscribe;

import android.content.Context;
import com.wandoujia.api.proto.PublisherBundleDetail;
import com.wandoujia.base.utils.StringUtil;
import com.wandoujia.p4.subscribe.SubscribeConstants.Source;
import com.wandoujia.p4.subscribe.core.SubscribeManager;
import com.wandoujia.p4.subscribe.http.model.SubscribeOnBoardModel.OnBoardType;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public final class b extends com.wandoujia.p4.subscribe.core.b
{
  private final SubscribeOnBoardModel.OnBoardType a;
  private final List<PublisherBundleDetail> b;
  private Context c;

  public b(Context paramContext, SubscribeOnBoardModel.OnBoardType paramOnBoardType, List<PublisherBundleDetail> paramList)
  {
    this.a = paramOnBoardType;
    this.b = paramList;
    this.c = paramContext;
  }

  private String a()
  {
    ArrayList localArrayList = new ArrayList();
    Iterator localIterator = this.b.iterator();
    while (localIterator.hasNext())
      localArrayList.add(((PublisherBundleDetail)localIterator.next()).id);
    return StringUtil.join(localArrayList, ",");
  }

  protected final boolean doSubscribe()
  {
    SubscribeManager.a();
    return SubscribeManager.a(SubscribeConstants.Source.FUNCTION_ONBOARD_GUIDE, this.a, a());
  }

  public final Context getContext()
  {
    return this.c;
  }

  public final String getId()
  {
    return a();
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.jupiter.subscribe.b
 * JD-Core Version:    0.6.0
 */