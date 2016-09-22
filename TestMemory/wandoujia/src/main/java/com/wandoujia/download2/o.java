package com.wandoujia.download2;

import com.wandoujia.logv3.model.packages.TaskEvent.Result;
import com.wandoujia.logv3.model.packages.TaskEvent.Status;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

final class o
  implements Runnable
{
  o(m paramm)
  {
  }

  public final void run()
  {
    LinkedList localLinkedList1 = new LinkedList();
    LinkedList localLinkedList2 = new LinkedList();
    Iterator localIterator1 = m.a(this.a).iterator();
    if (localIterator1.hasNext())
    {
      i locali2 = (i)localIterator1.next();
      DownloadInfo2 localDownloadInfo2 = locali2.l();
      switch (q.a[localDownloadInfo2.b.ordinal()])
      {
      default:
      case 1:
      case 2:
      case 3:
      case 4:
      }
      while (true)
      {
        localLinkedList1.add(locali2.l());
        break;
        locali2.g();
        continue;
        localLinkedList2.add(locali2);
      }
    }
    Iterator localIterator2 = localLinkedList2.iterator();
    while (localIterator2.hasNext())
    {
      i locali1 = (i)localIterator2.next();
      m.a(this.a, locali1);
      if (m.b(this.a) != null)
        m.b(this.a).a(locali1.l());
      m.a(this.a, TaskEvent.Status.END, TaskEvent.Result.SUCCESS, locali1);
    }
    if ((!localLinkedList1.isEmpty()) && (m.b(this.a) != null))
      m.b(this.a).a(localLinkedList1);
    if (!m.a(this.a).isEmpty())
      m.c(this.a);
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.download2.o
 * JD-Core Version:    0.6.0
 */