import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

final class ake extends aki
{
  private final ArrayList a;

  public ake(ajy paramajy, ArrayList paramArrayList)
  {
    super(paramajy);
    this.a = paramArrayList;
  }

  public final void a()
  {
    akk localakk = this.b.a.m;
    ajy localajy = this.b;
    if (localajy.k == null);
    HashSet localHashSet;
    for (Object localObject = Collections.emptySet(); ; localObject = localHashSet)
    {
      localakk.f = ((Set)localObject);
      Iterator localIterator2 = this.a.iterator();
      while (localIterator2.hasNext())
        ((aif)localIterator2.next()).a(this.b.h, this.b.a.m.f);
      localHashSet = new HashSet(localajy.k.b);
      Map localMap = localajy.k.d;
      Iterator localIterator1 = localMap.keySet().iterator();
      while (localIterator1.hasNext())
      {
        aia localaia = (aia)localIterator1.next();
        if (localajy.a.g.containsKey(localaia.b()))
          continue;
        localMap.get(localaia);
        localHashSet.addAll(null);
      }
    }
  }
}

/* Location:           C:\Program Files\APK反编译\classes_dex2jar.jar
 * Qualified Name:     ake
 * JD-Core Version:    0.6.0
 */