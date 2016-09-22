package com.wandoujia.p4.app.detail.b;

import com.wandoujia.p4.app.detail.model.CommentJson;
import com.wandoujia.p4.app.detail.model.CommentSummary;
import com.wandoujia.p4.app.detail.model.EnjoySummary;
import com.wandoujia.p4.app.detail.model.b;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public final class c extends com.wandoujia.p4.c.a<com.wandoujia.p4.app.detail.model.a>
{
  private final String a;
  private EnjoySummary b;
  private CommentJson c;

  public c(String paramString)
  {
    this.a = paramString;
  }

  protected final String a()
  {
    return null;
  }

  protected final List<com.wandoujia.p4.app.detail.model.a> a(int paramInt1, int paramInt2)
  {
    if (paramInt1 % paramInt2 != 0)
      return Collections.emptyList();
    a locala = new a();
    d locald = (d)locala.getRequestBuilder();
    locald.a(paramInt1);
    locald.b(paramInt2);
    locald.a(this.a);
    ArrayList localArrayList = new ArrayList();
    CommentSummary localCommentSummary = (CommentSummary)com.wandoujia.p4.a.b().execute(locala);
    if (localCommentSummary != null)
    {
      Iterator localIterator = localCommentSummary.getComments().iterator();
      while (localIterator.hasNext())
        localArrayList.add(b.a((CommentJson)localIterator.next()));
      this.b = localCommentSummary.getEnjoySummary();
      this.c = localCommentSummary.getSavedComment();
    }
    return localArrayList;
  }

  public final EnjoySummary b()
  {
    return this.b;
  }

  public final CommentJson c()
  {
    return this.c;
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.p4.app.detail.b.c
 * JD-Core Version:    0.6.0
 */