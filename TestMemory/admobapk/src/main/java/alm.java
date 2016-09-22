import java.util.Collections;
import java.util.Map;
import java.util.Set;
import java.util.WeakHashMap;

public final class alm
{
  static final ajh[] a = new ajh[0];
  final Set b = Collections.synchronizedSet(Collections.newSetFromMap(new WeakHashMap()));
  private final alo c = new aln(this);
  private final Map d;

  public alm(aid paramaid, aif paramaif)
  {
    this.d = new cw();
    this.d.put(paramaid, paramaif);
  }

  public alm(Map paramMap)
  {
    this.d = paramMap;
  }

  public final void a()
  {
    for (ajh localajh : (ajh[])this.b.toArray(a))
    {
      localajh.a(null);
      if (!localajh.d())
        continue;
      this.b.remove(localajh);
    }
  }

  final void a(ajh paramajh)
  {
    this.b.add(paramajh);
    paramajh.a(this.c);
  }
}

/* Location:           C:\Program Files\APK反编译\classes_dex2jar.jar
 * Qualified Name:     alm
 * JD-Core Version:    0.6.0
 */