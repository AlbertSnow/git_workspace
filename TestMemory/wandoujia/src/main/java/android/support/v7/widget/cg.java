package android.support.v7.widget;

import android.util.SparseArray;
import android.util.SparseIntArray;
import java.util.ArrayList;

public final class cg
{
  private SparseArray<ArrayList<co>> a = new SparseArray();
  private SparseIntArray b = new SparseIntArray();
  private int c = 0;

  public final void a()
  {
    this.a.clear();
  }

  public final void a(int paramInt)
  {
    this.b.put(paramInt, 10);
    ArrayList localArrayList = (ArrayList)this.a.get(paramInt);
    if (localArrayList != null)
      while (localArrayList.size() > 10)
        localArrayList.remove(-1 + localArrayList.size());
  }

  final void a(by paramby1, by paramby2)
  {
    if (paramby1 != null)
      c();
    if (this.c == 0)
      this.a.clear();
    if (paramby2 != null)
      b();
  }

  public final void a(co paramco)
  {
    int i = paramco.d;
    ArrayList localArrayList = (ArrayList)this.a.get(i);
    if (localArrayList == null)
    {
      localArrayList = new ArrayList();
      this.a.put(i, localArrayList);
      if (this.b.indexOfKey(i) < 0)
        this.b.put(i, 5);
    }
    if (this.b.get(i) <= localArrayList.size())
      return;
    paramco.r();
    localArrayList.add(paramco);
  }

  public final co b(int paramInt)
  {
    ArrayList localArrayList = (ArrayList)this.a.get(paramInt);
    if ((localArrayList != null) && (!localArrayList.isEmpty()))
    {
      int i = -1 + localArrayList.size();
      co localco = (co)localArrayList.get(i);
      localArrayList.remove(i);
      return localco;
    }
    return null;
  }

  final void b()
  {
    this.c = (1 + this.c);
  }

  final void c()
  {
    this.c = (-1 + this.c);
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     android.support.v7.widget.cg
 * JD-Core Version:    0.6.0
 */