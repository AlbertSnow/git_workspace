import android.annotation.TargetApi;
import android.app.Activity;
import android.app.Fragment;
import android.app.FragmentManager;
import android.app.FragmentTransaction;
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

@TargetApi(11)
public final class ale extends Fragment
  implements ald
{
  private static WeakHashMap c = new WeakHashMap();
  int a = 0;
  Bundle b;
  private Map d = new cw();

  public static ale a(Activity paramActivity)
  {
    WeakReference localWeakReference = (WeakReference)c.get(paramActivity);
    if (localWeakReference != null)
    {
      ale localale2 = (ale)localWeakReference.get();
      if (localale2 != null)
        return localale2;
    }
    try
    {
      ale localale1 = (ale)paramActivity.getFragmentManager().findFragmentByTag("LifecycleFragmentImpl");
      if ((localale1 == null) || (localale1.isRemoving()))
      {
        localale1 = new ale();
        paramActivity.getFragmentManager().beginTransaction().add(localale1, "LifecycleFragmentImpl").commitAllowingStateLoss();
      }
      c.put(paramActivity, new WeakReference(localale1));
      return localale1;
    }
    catch (ClassCastException localClassCastException)
    {
    }
    throw new IllegalStateException("Fragment with tag LifecycleFragmentImpl is not a LifecycleFragmentImpl", localClassCastException);
  }

  public final alc a(String paramString, Class paramClass)
  {
    return (alc)paramClass.cast(this.d.get(paramString));
  }

  public final Activity a()
  {
    return getActivity();
  }

  public final void a(String paramString, alc paramalc)
  {
    if (!this.d.containsKey(paramString))
    {
      this.d.put(paramString, paramalc);
      if (this.a > 0)
        new Handler(Looper.getMainLooper()).post(new alf(this, paramalc, paramString));
      return;
    }
    throw new IllegalArgumentException(59 + String.valueOf(paramString).length() + "LifecycleCallback with tag " + paramString + " already added to this fragment.");
  }

  public final void dump(String paramString, FileDescriptor paramFileDescriptor, PrintWriter paramPrintWriter, String[] paramArrayOfString)
  {
    super.dump(paramString, paramFileDescriptor, paramPrintWriter, paramArrayOfString);
    Iterator localIterator = this.d.values().iterator();
    while (localIterator.hasNext())
      ((alc)localIterator.next()).a(paramString, paramFileDescriptor, paramPrintWriter, paramArrayOfString);
  }

  public final void onActivityResult(int paramInt1, int paramInt2, Intent paramIntent)
  {
    super.onActivityResult(paramInt1, paramInt2, paramIntent);
    Iterator localIterator = this.d.values().iterator();
    while (localIterator.hasNext())
      ((alc)localIterator.next()).a(paramInt1, paramInt2, paramIntent);
  }

  public final void onCreate(Bundle paramBundle)
  {
    super.onCreate(paramBundle);
    this.a = 1;
    this.b = paramBundle;
    Iterator localIterator = this.d.entrySet().iterator();
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

  public final void onSaveInstanceState(Bundle paramBundle)
  {
    super.onSaveInstanceState(paramBundle);
    if (paramBundle == null);
    while (true)
    {
      return;
      Iterator localIterator = this.d.entrySet().iterator();
      while (localIterator.hasNext())
      {
        Map.Entry localEntry = (Map.Entry)localIterator.next();
        Bundle localBundle = new Bundle();
        ((alc)localEntry.getValue()).b(localBundle);
        paramBundle.putBundle((String)localEntry.getKey(), localBundle);
      }
    }
  }

  public final void onStart()
  {
    super.onStop();
    this.a = 2;
    Iterator localIterator = this.d.values().iterator();
    while (localIterator.hasNext())
      ((alc)localIterator.next()).a();
  }

  public final void onStop()
  {
    super.onStop();
    this.a = 3;
    Iterator localIterator = this.d.values().iterator();
    while (localIterator.hasNext())
      ((alc)localIterator.next()).b();
  }
}

/* Location:           C:\Program Files\APK反编译\classes_dex2jar.jar
 * Qualified Name:     ale
 * JD-Core Version:    0.6.0
 */