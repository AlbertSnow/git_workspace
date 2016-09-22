import java.util.AbstractSet;
import java.util.Collection;
import java.util.Iterator;
import java.util.Set;

public final class aok extends AbstractSet
{
  private final cw a;

  public aok()
  {
    this.a = new cw();
  }

  public aok(int paramInt)
  {
    this.a = new cw(paramInt);
  }

  public aok(Collection paramCollection)
  {
    this(paramCollection.size());
    addAll(paramCollection);
  }

  private boolean a(aok paramaok)
  {
    int i = size();
    cw localcw1 = this.a;
    cw localcw2 = paramaok.a;
    int j = localcw2.c;
    localcw1.a(j + localcw1.c);
    if (localcw1.c == 0)
      if (j > 0)
      {
        System.arraycopy(localcw2.a, 0, localcw1.a, 0, j);
        System.arraycopy(localcw2.b, 0, localcw1.b, 0, j << 1);
        localcw1.c = j;
      }
    while (true)
    {
      int m = size();
      int n = 0;
      if (m > i)
        n = 1;
      return n;
      for (int k = 0; k < j; k++)
        localcw1.put(localcw2.b(k), localcw2.c(k));
    }
  }

  public final boolean add(Object paramObject)
  {
    if (this.a.containsKey(paramObject))
      return false;
    this.a.put(paramObject, paramObject);
    return true;
  }

  public final boolean addAll(Collection paramCollection)
  {
    if ((paramCollection instanceof aok))
      return a((aok)paramCollection);
    return super.addAll(paramCollection);
  }

  public final void clear()
  {
    this.a.clear();
  }

  public final boolean contains(Object paramObject)
  {
    return this.a.containsKey(paramObject);
  }

  public final Iterator iterator()
  {
    return this.a.keySet().iterator();
  }

  public final boolean remove(Object paramObject)
  {
    if (!this.a.containsKey(paramObject))
      return false;
    this.a.remove(paramObject);
    return true;
  }

  public final int size()
  {
    return this.a.size();
  }
}

/* Location:           C:\Program Files\APK反编译\classes_dex2jar.jar
 * Qualified Name:     aok
 * JD-Core Version:    0.6.0
 */