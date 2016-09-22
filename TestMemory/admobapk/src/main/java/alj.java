import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.lang.ref.WeakReference;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.WeakHashMap;

public final class alj extends z
  implements ald
{
  private static WeakHashMap X = new WeakHashMap();
  Bundle W;
  private Map Y = new cw();
  int a = 0;

  public static alj a(ac paramac)
  {
    WeakReference localWeakReference = (WeakReference)X.get(paramac);
    if (localWeakReference != null)
    {
      alj localalj2 = (alj)localWeakReference.get();
      if (localalj2 != null)
        return localalj2;
    }
    try
    {
      alj localalj1 = (alj)paramac.b().a("SupportLifecycleFragmentImpl");
      if ((localalj1 == null) || (localalj1.o))
      {
        localalj1 = new alj();
        paramac.b().a().a(localalj1, "SupportLifecycleFragmentImpl").b();
      }
      X.put(paramac, new WeakReference(localalj1));
      return localalj1;
    }
    catch (ClassCastException localClassCastException)
    {
    }
    throw new IllegalStateException("Fragment with tag SupportLifecycleFragmentImpl is not a SupportLifecycleFragmentImpl", localClassCastException);
  }

  public final alc a(String paramString, Class paramClass)
  {
    return (alc)paramClass.cast(this.Y.get(paramString));
  }

  public final void a(int paramInt1, int paramInt2, Intent paramIntent)
  {
    super.a(paramInt1, paramInt2, paramIntent);
    Iterator localIterator = this.Y.values().iterator();
    while (localIterator.hasNext())
      ((alc)localIterator.next()).a(paramInt1, paramInt2, paramIntent);
  }

  public final void a(Bundle paramBundle)
  {
    super.a(paramBundle);
    this.a = 1;
    this.W = paramBundle;
    Iterator localIterator = this.Y.entrySet().iterator();
    if (localIterator.hasNext())
    {
      Map.Entry localEntry = (Map.Entry)localIterator.next();
      alc localalc = (alc)localEntry.getValue();
      if (paramBundle != null);
      for (Bundle localBundle = paramBundle.getBundle((String)localEntry.getKey()); ; localBundle = null)
      {
        localalc.a(localBundle);
        break;
      }
    }
  }

  public final void a(String paramString, alc paramalc)
  {
    if (!this.Y.containsKey(paramString))
    {
      this.Y.put(paramString, paramalc);
      if (this.a > 0)
        new Handler(Looper.getMainLooper()).post(new alk(this, paramalc, paramString));
      return;
    }
    throw new IllegalArgumentException(59 + String.valueOf(paramString).length() + "LifecycleCallback with tag " + paramString + " already added to this fragment.");
  }

  public final void a(String paramString, FileDescriptor paramFileDescriptor, PrintWriter paramPrintWriter, String[] paramArrayOfString)
  {
    super.a(paramString, paramFileDescriptor, paramPrintWriter, paramArrayOfString);
    Iterator localIterator = this.Y.values().iterator();
    while (localIterator.hasNext())
      ((alc)localIterator.next()).a(paramString, paramFileDescriptor, paramPrintWriter, paramArrayOfString);
  }

  public final void c()
  {
    super.d();
    this.a = 2;
    Iterator localIterator = this.Y.values().iterator();
    while (localIterator.hasNext())
      ((alc)localIterator.next()).a();
  }

  public final void d()
  {
    super.d();
    this.a = 3;
    Iterator localIterator = this.Y.values().iterator();
    while (localIterator.hasNext())
      ((alc)localIterator.next()).b();
  }

  public final void d(Bundle paramBundle)
  {
    super.d(paramBundle);
    if (paramBundle == null);
    while (true)
    {
      return;
      Iterator localIterator = this.Y.entrySet().iterator();
      while (localIterator.hasNext())
      {
        Map.Entry localEntry = (Map.Entry)localIterator.next();
        Bundle localBundle = new Bundle();
        ((alc)localEntry.getValue()).b(localBundle);
        paramBundle.putBundle((String)localEntry.getKey(), localBundle);
      }
    }
  }
}

/* Location:           C:\Program Files\APK反编译\classes_dex2jar.jar
 * Qualified Name:     alj
 * JD-Core Version:    0.6.0
 */