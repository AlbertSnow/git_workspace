import java.util.Collections;
import java.util.Iterator;
import java.util.Set;
import java.util.WeakHashMap;

public final class alh
{
  private final Set a = Collections.newSetFromMap(new WeakHashMap());

  public final void a()
  {
    Iterator localIterator = this.a.iterator();
    while (localIterator.hasNext())
      ((alg)localIterator.next()).a = null;
    this.a.clear();
  }
}

/* Location:           C:\Program Files\APK反编译\classes_dex2jar.jar
 * Qualified Name:     alh
 * JD-Core Version:    0.6.0
 */