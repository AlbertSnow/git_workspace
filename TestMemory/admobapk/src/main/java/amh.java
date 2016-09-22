import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import android.util.Log;
import com.google.android.gms.common.ConnectionResult;

public final class amh extends aly
{
  private IBinder c;

  public amh(alx paramalx, int paramInt, IBinder paramIBinder, Bundle paramBundle)
  {
    super(paramalx, paramInt, paramBundle);
    this.c = paramIBinder;
  }

  protected final void a(ConnectionResult paramConnectionResult)
  {
    if (this.d.j != null)
      this.d.j.a(paramConnectionResult);
    this.d.a(paramConnectionResult);
  }

  protected final boolean a()
  {
    IInterface localIInterface;
    do
    {
      try
      {
        String str1 = this.c.getInterfaceDescriptor();
        if (!this.d.b().equals(str1))
        {
          String str2 = String.valueOf(this.d.b());
          Log.e("GmsClient", 34 + String.valueOf(str2).length() + String.valueOf(str1).length() + "service descriptor mismatch: " + str2 + " vs. " + str1);
          return false;
        }
      }
      catch (RemoteException localRemoteException)
      {
        Log.w("GmsClient", "service probably died");
        return false;
      }
      localIInterface = this.d.a(this.c);
    }
    while ((localIInterface == null) || (!this.d.a(2, 3, localIInterface)));
    if (this.d.i != null)
      this.d.i.a(null);
    return true;
  }
}

/* Location:           C:\Program Files\APK反编译\classes_dex2jar.jar
 * Qualified Name:     amh
 * JD-Core Version:    0.6.0
 */