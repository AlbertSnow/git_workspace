import android.util.Log;
import android.util.SparseArray;
import com.google.android.gms.common.ConnectionResult;
import java.io.FileDescriptor;
import java.io.PrintWriter;

public class ajd extends aji
{
  public final SparseArray a = new SparseArray();

  public ajd(ald paramald)
  {
    super(paramald);
    this.g.a("AutoManageHelper", this);
  }

  public final void a()
  {
    super.a();
    boolean bool = this.b;
    String str = String.valueOf(this.a);
    Log.d("AutoManageHelper", 14 + String.valueOf(str).length() + "onStart " + bool + " " + str);
    if (!this.c)
      for (int i = 0; i < this.a.size(); i++)
        ((aje)this.a.valueAt(i)).b.b();
  }

  protected final void a(ConnectionResult paramConnectionResult, int paramInt)
  {
    Log.w("AutoManageHelper", "Unresolved error while connecting client. Stopping auto-manage.");
    if (paramInt < 0)
      Log.wtf("AutoManageHelper", "AutoManageLifecycleHelper received onErrorResolutionFailed callback but no failing client ID is set", new Exception());
    air localair;
    do
    {
      aje localaje1;
      do
      {
        return;
        localaje1 = (aje)this.a.get(paramInt);
      }
      while (localaje1 == null);
      aje localaje2 = (aje)this.a.get(paramInt);
      this.a.remove(paramInt);
      if (localaje2 != null)
      {
        localaje2.b.b(localaje2);
        localaje2.b.c();
      }
      localair = localaje1.c;
    }
    while (localair == null);
    localair.a(paramConnectionResult);
  }

  public final void a(String paramString, FileDescriptor paramFileDescriptor, PrintWriter paramPrintWriter, String[] paramArrayOfString)
  {
    for (int i = 0; i < this.a.size(); i++)
    {
      aje localaje = (aje)this.a.valueAt(i);
      paramPrintWriter.append(paramString).append("GoogleApiClient #").print(localaje.a);
      paramPrintWriter.println(":");
      localaje.b.a(String.valueOf(paramString).concat("  "), paramFileDescriptor, paramPrintWriter, paramArrayOfString);
    }
  }

  public final void b()
  {
    super.b();
    for (int i = 0; i < this.a.size(); i++)
      ((aje)this.a.valueAt(i)).b.c();
  }

  protected final void c()
  {
    for (int i = 0; i < this.a.size(); i++)
      ((aje)this.a.valueAt(i)).b.b();
  }
}

/* Location:           C:\Program Files\APK反编译\classes_dex2jar.jar
 * Qualified Name:     ajd
 * JD-Core Version:    0.6.0
 */