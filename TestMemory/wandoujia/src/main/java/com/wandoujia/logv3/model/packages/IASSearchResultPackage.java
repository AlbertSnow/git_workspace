package com.wandoujia.logv3.model.packages;

import com.squareup.wire.Message;
import com.squareup.wire.Message.Datatype;
import com.squareup.wire.Message.Label;
import com.squareup.wire.ProtoField;
import java.util.Collections;
import java.util.List;

public final class IASSearchResultPackage extends Message
{
  public static final String DEFAULT_ITEM_ID = "";
  public static final List<IASSearchResultPackage.QueryUnderstandingScore> DEFAULT_QUERY_UNDERSTANDING_RESULT = Collections.emptyList();
  public static final List<IASSearchResultPackage.SectionResultPackage> DEFAULT_SECTION_RESULT = Collections.emptyList();

  @ProtoField(tag=3, type=Message.Datatype.STRING)
  public final String item_id;

  @ProtoField(label=Message.Label.REPEATED, tag=1)
  public final List<IASSearchResultPackage.QueryUnderstandingScore> query_understanding_result;

  @ProtoField(label=Message.Label.REPEATED, tag=2)
  public final List<IASSearchResultPackage.SectionResultPackage> section_result;

  private IASSearchResultPackage(IASSearchResultPackage.Builder paramBuilder)
  {
    super(paramBuilder);
    this.query_understanding_result = immutableCopyOf(paramBuilder.query_understanding_result);
    this.section_result = immutableCopyOf(paramBuilder.section_result);
    this.item_id = paramBuilder.item_id;
  }

  public final boolean equals(Object paramObject)
  {
    if (paramObject == this);
    IASSearchResultPackage localIASSearchResultPackage;
    do
    {
      return true;
      if (!(paramObject instanceof IASSearchResultPackage))
        return false;
      localIASSearchResultPackage = (IASSearchResultPackage)paramObject;
    }
    while ((equals(this.query_understanding_result, localIASSearchResultPackage.query_understanding_result)) && (equals(this.section_result, localIASSearchResultPackage.section_result)) && (equals(this.item_id, localIASSearchResultPackage.item_id)));
    return false;
  }

  public final int hashCode()
  {
    int i = 1;
    int j = this.hashCode;
    int k;
    int n;
    if (j == 0)
    {
      if (this.query_understanding_result == null)
        break label89;
      k = this.query_understanding_result.hashCode();
      int m = k * 37;
      if (this.section_result != null)
        i = this.section_result.hashCode();
      n = 37 * (m + i);
      if (this.item_id == null)
        break label94;
    }
    label89: label94: for (int i1 = this.item_id.hashCode(); ; i1 = 0)
    {
      j = i1 + n;
      this.hashCode = j;
      return j;
      k = i;
      break;
    }
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.logv3.model.packages.IASSearchResultPackage
 * JD-Core Version:    0.6.0
 */