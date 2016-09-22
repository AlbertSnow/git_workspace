import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class cw extends dh
  implements Map
{
  private db d;

  public cw()
  {
  }

  public cw(int paramInt)
  {
    super(paramInt);
  }

  private final db a()
  {
    if (this.d == null)
      this.d = new cx(this);
    return this.d;
  }

  public Set entrySet()
  {
    db localdb = a();
    if (localdb.a == null)
      localdb.a = new dd(localdb);
    return localdb.a;
  }

  public Set keySet()
  {
    db localdb = a();
    if (localdb.b == null)
      localdb.b = new de(localdb);
    return localdb.b;
  }

  public void putAll(Map paramMap)
  {
    a(this.c + paramMap.size());
    Iterator localIterator = paramMap.entrySet().iterator();
    while (localIterator.hasNext())
    {
      Map.Entry localEntry = (Map.Entry)localIterator.next();
      put(localEntry.getKey(), localEntry.getValue());
    }
  }

  public Collection values()
  {
    db localdb = a();
    if (localdb.c == null)
      localdb.c = new dg(localdb);
    return localdb.c;
  }
}

/* Location:           C:\Program Files\APK反编译\classes_dex2jar.jar
 * Qualified Name:     cw
 * JD-Core Version:    0.6.0
 */