import android.os.Build.VERSION;
import java.util.ArrayList;
import java.util.Iterator;

public final class bj
{
  public static final br a;

  static
  {
    if (Build.VERSION.SDK_INT >= 21)
    {
      a = new bt();
      return;
    }
    if (Build.VERSION.SDK_INT >= 20)
    {
      a = new bs();
      return;
    }
    if (Build.VERSION.SDK_INT >= 19)
    {
      a = new bz();
      return;
    }
    if (Build.VERSION.SDK_INT >= 16)
    {
      a = new by();
      return;
    }
    if (Build.VERSION.SDK_INT >= 14)
    {
      a = new bx();
      return;
    }
    if (Build.VERSION.SDK_INT >= 11)
    {
      a = new bw();
      return;
    }
    if (Build.VERSION.SDK_INT >= 9)
    {
      a = new bv();
      return;
    }
    a = new bu();
  }

  static void a(bh parambh, ArrayList paramArrayList)
  {
    Iterator localIterator = paramArrayList.iterator();
    while (localIterator.hasNext())
      parambh.a((bk)localIterator.next());
  }

  static void a(bi parambi, ca paramca)
  {
    if (paramca != null)
    {
      if (!(paramca instanceof bn))
        break label20;
      cj.a(parambi, null, false, null, null);
    }
    label20: 
    do
    {
      return;
      if (!(paramca instanceof bq))
        continue;
      cj.a(parambi, null, false, null, ((bq)paramca).a);
      return;
    }
    while (!(paramca instanceof bm));
    cj.a(parambi, null, false, null, null, null, false);
  }
}

/* Location:           C:\Program Files\APK反编译\classes_dex2jar.jar
 * Qualified Name:     bj
 * JD-Core Version:    0.6.0
 */