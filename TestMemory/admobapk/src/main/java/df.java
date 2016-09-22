import java.util.Iterator;
import java.util.Map.Entry;

final class df
  implements Iterator, Map.Entry
{
  private int a;
  private int b;
  private boolean c = false;

  df(db paramdb)
  {
    this.a = (-1 + paramdb.a());
    this.b = -1;
  }

  public final boolean equals(Object paramObject)
  {
    if (!this.c)
      throw new IllegalStateException("This container does not support retaining Map.Entry objects");
    if (!(paramObject instanceof Map.Entry));
    Map.Entry localEntry;
    do
    {
      return false;
      localEntry = (Map.Entry)paramObject;
    }
    while ((!cy.a(localEntry.getKey(), this.d.a(this.b, 0))) || (!cy.a(localEntry.getValue(), this.d.a(this.b, 1))));
    return true;
  }

  public final Object getKey()
  {
    if (!this.c)
      throw new IllegalStateException("This container does not support retaining Map.Entry objects");
    return this.d.a(this.b, 0);
  }

  public final Object getValue()
  {
    if (!this.c)
      throw new IllegalStateException("This container does not support retaining Map.Entry objects");
    return this.d.a(this.b, 1);
  }

  public final boolean hasNext()
  {
    return this.b < this.a;
  }

  public final int hashCode()
  {
    if (!this.c)
      throw new IllegalStateException("This container does not support retaining Map.Entry objects");
    Object localObject1 = this.d.a(this.b, 0);
    Object localObject2 = this.d.a(this.b, 1);
    int i;
    int j;
    if (localObject1 == null)
    {
      i = 0;
      j = 0;
      if (localObject2 != null)
        break label69;
    }
    while (true)
    {
      return j ^ i;
      i = localObject1.hashCode();
      break;
      label69: j = localObject2.hashCode();
    }
  }

  public final void remove()
  {
    if (!this.c)
      throw new IllegalStateException();
    this.d.a(this.b);
    this.b = (-1 + this.b);
    this.a = (-1 + this.a);
    this.c = false;
  }

  public final Object setValue(Object paramObject)
  {
    if (!this.c)
      throw new IllegalStateException("This container does not support retaining Map.Entry objects");
    return this.d.a(this.b, paramObject);
  }

  public final String toString()
  {
    return getKey() + "=" + getValue();
  }
}

/* Location:           C:\Program Files\APK反编译\classes_dex2jar.jar
 * Qualified Name:     df
 * JD-Core Version:    0.6.0
 */