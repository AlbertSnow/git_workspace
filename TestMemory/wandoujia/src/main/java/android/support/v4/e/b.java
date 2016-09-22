package android.support.v4.e;

import java.util.Map;

final class b extends f<K, V>
{
  b(a parama)
  {
  }

  protected final int a()
  {
    return this.d.b;
  }

  protected final int a(Object paramObject)
  {
    return this.d.a(paramObject);
  }

  protected final Object a(int paramInt1, int paramInt2)
  {
    return this.d.a[(paramInt2 + (paramInt1 << 1))];
  }

  protected final V a(int paramInt, V paramV)
  {
    return this.d.a(paramInt, paramV);
  }

  protected final void a(int paramInt)
  {
    this.d.d(paramInt);
  }

  protected final void a(K paramK, V paramV)
  {
    this.d.put(paramK, paramV);
  }

  protected final int b(Object paramObject)
  {
    return this.d.b(paramObject);
  }

  protected final Map<K, V> b()
  {
    return this.d;
  }

  protected final void c()
  {
    this.d.clear();
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     android.support.v4.e.b
 * JD-Core Version:    0.6.0
 */