package android.support.v4.e;

import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class a<K, V> extends l<K, V>
  implements Map<K, V>
{
  private f<K, V> c;

  private f<K, V> a()
  {
    if (this.c == null)
      this.c = new b(this);
    return this.c;
  }

  public final boolean a(Collection<?> paramCollection)
  {
    return f.a(this, paramCollection);
  }

  public Set<Map.Entry<K, V>> entrySet()
  {
    f localf = a();
    if (localf.a == null)
      localf.a = new h(localf);
    return localf.a;
  }

  public Set<K> keySet()
  {
    f localf = a();
    if (localf.b == null)
      localf.b = new i(localf);
    return localf.b;
  }

  public void putAll(Map<? extends K, ? extends V> paramMap)
  {
    a(this.b + paramMap.size());
    Iterator localIterator = paramMap.entrySet().iterator();
    while (localIterator.hasNext())
    {
      Map.Entry localEntry = (Map.Entry)localIterator.next();
      put(localEntry.getKey(), localEntry.getValue());
    }
  }

  public Collection<V> values()
  {
    f localf = a();
    if (localf.c == null)
      localf.c = new k(localf);
    return localf.c;
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     android.support.v4.e.a
 * JD-Core Version:    0.6.0
 */