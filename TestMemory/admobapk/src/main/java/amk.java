import android.accounts.Account;
import android.content.Context;
import android.view.View;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public final class amk
{
  public final Account a;
  public final Set b;
  final Set c;
  public final Map d;
  public final String e;
  final String f;
  public final arp g;
  public Integer h;

  public amk(Account paramAccount, Set paramSet, Map paramMap, int paramInt, View paramView, String paramString1, String paramString2, arp paramarp)
  {
    this.a = paramAccount;
    if (paramSet == null);
    HashSet localHashSet;
    for (Set localSet = Collections.EMPTY_SET; ; localSet = Collections.unmodifiableSet(paramSet))
    {
      this.b = localSet;
      if (paramMap == null)
        paramMap = Collections.EMPTY_MAP;
      this.d = paramMap;
      this.e = paramString1;
      this.f = paramString2;
      this.g = paramarp;
      localHashSet = new HashSet(this.b);
      Iterator localIterator = this.d.values().iterator();
      while (localIterator.hasNext())
      {
        localIterator.next();
        localHashSet.addAll(null);
      }
    }
    this.c = Collections.unmodifiableSet(localHashSet);
  }

  public static amk a(Context paramContext)
  {
    return new aip(paramContext).a();
  }
}

/* Location:           C:\Program Files\APK反编译\classes_dex2jar.jar
 * Qualified Name:     amk
 * JD-Core Version:    0.6.0
 */