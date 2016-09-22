import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import com.google.android.chimera.Fragment;
import com.google.android.chimera.FragmentManager;
import com.google.android.chimera.FragmentTransaction;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.lang.ref.WeakReference;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.WeakHashMap;

public final class ajp extends Fragment
  implements ald
{
  private static WeakHashMap c = new WeakHashMap();
  int a = 0;
  Bundle b;
  private Map d = new cw();

  public static ajp a(com.google.android.chimera.Activity paramActivity)
  {
    WeakReference localWeakReference = (WeakReference)c.get(paramActivity);
    if (localWeakReference != null)
    {
      ajp localajp2 = (ajp)localWeakReference.get();
      if (localajp2 != null)
        return localajp2;
    }
    try
    {
      ajp localajp1 = (ajp)paramActivity.getFragmentManager().findFragmentByTag("ChimeraLifecycleFragmentImpl");
      if ((localajp1 == null) || (localajp1.isRemoving()))
      {
        localajp1 = new ajp();
        paramActivity.getFragmentManager().beginTransaction().add(localajp1, "ChimeraLifecycleFragmentImpl").commitAllowingStateLoss();
      }
      c.put(paramActivity, new WeakReference(localajp1));
      return localajp1;
    }
    catch (ClassCastException localClassCastException)
    {
    }
    throw new IllegalStateException("Fragment with tag ChimeraLifecycleFragmentImpl is not a ChimeraLifecycleFragmentImpl", localClassCastException);
  }

  public final alc a(String paramString, Class paramClass)
  {
    return (alc)paramClass.cast(this.d.get(paramString));
  }

  public final android.app.Activity a()
  {
    return getActivity().getContainerActivity();
  }

  public final void a(String paramString, alc paramalc)
  {
    if (!this.d.containsKey(paramString))
    {
      this.d.put(paramString, paramalc);
      if (this.a > 0)
        new Handler(Looper.getMainLooper()).post(new ajq(this, paramalc, paramString));
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
 * Qualified Name:     ajp
 * JD-Core Version:    0.6.0
 */