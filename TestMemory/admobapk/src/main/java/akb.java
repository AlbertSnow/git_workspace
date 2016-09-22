import com.google.android.gms.common.ConnectionResult;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

final class akb extends aki
{
  private final Map b;

  public akb(ajy paramajy, Map paramMap)
  {
    super(paramajy);
    this.b = paramMap;
  }

  public final void a()
  {
    Iterator localIterator1 = this.b.keySet().iterator();
    int i = 0;
    int j;
    while (true)
      if (localIterator1.hasNext())
      {
        aif localaif2 = (aif)localIterator1.next();
        j = 1;
        if (((aka)this.b.get(localaif2)).a == 0)
          break;
        i = j;
        continue;
      }
      else
      {
        j = i;
      }
    int k;
    if (j != 0)
    {
      k = this.a.d.a(this.a.c);
      if (k == 0)
        break label137;
      ConnectionResult localConnectionResult = new ConnectionResult(k, null);
      this.a.a.a(new akc(this, this.a, localConnectionResult));
    }
    while (true)
    {
      return;
      k = 0;
      break;
      label137: if (this.a.f)
        this.a.e.e_();
      Iterator localIterator2 = this.b.keySet().iterator();
      while (localIterator2.hasNext())
      {
        aif localaif1 = (aif)localIterator2.next();
        amd localamd = (amd)this.b.get(localaif1);
        if (k != 0)
        {
          this.a.a.a(new akd(this, this.a, localamd));
          continue;
        }
        localaif1.a(localamd);
      }
    }
  }
}

/* Location:           C:\Program Files\APK反编译\classes_dex2jar.jar
 * Qualified Name:     akb
 * JD-Core Version:    0.6.0
 */