import android.os.RemoteException;
import com.google.android.gms.appstreaming.AppStreamingState;
import java.util.logging.Level;
import java.util.logging.Logger;

final class nb
  implements asq
{
  private static final Logger a = aso.a("AppStreamingFragment", "AppStreamingStateListenerWrapper");
  private ni b;

  nb(ni paramni)
  {
    this.b = paramni;
  }

  private final void a(AppStreamingState paramAppStreamingState)
  {
    if (this.b != null);
    try
    {
      this.b.a(paramAppStreamingState);
      return;
    }
    catch (RemoteException localRemoteException)
    {
      Logger localLogger = a;
      Level localLevel = asn.a;
      int i = paramAppStreamingState.c;
      localLogger.log(localLevel, 45 + "Failed to makeCallback with state " + i);
    }
  }

  private static mx e(atz paramatz)
  {
    if (paramatz == null)
      return new mx();
    mx localmx = new mx();
    localmx.c = paramatz.a;
    int i;
    switch (paramatz.b)
    {
    default:
      i = 0;
    case 1:
    case 2:
    }
    while (true)
    {
      localmx.d = i;
      return localmx;
      i = 1;
      continue;
      i = 2;
    }
  }

  public final void a(int paramInt)
  {
    mx localmx = new mx();
    localmx.a = 8;
    localmx.b = paramInt;
    a(localmx.a());
  }

  public final void a(atz paramatz)
  {
    mx localmx = e(paramatz);
    localmx.a = 2;
    a(localmx.a());
  }

  public final void b(int paramInt)
  {
    mx localmx = new mx();
    localmx.a = 6;
    localmx.b = paramInt;
    a(localmx.a());
  }

  public final void b(atz paramatz)
  {
    mx localmx = e(paramatz);
    localmx.a = 3;
    a(localmx.a());
  }

  public final void c(atz paramatz)
  {
    mx localmx = e(paramatz);
    localmx.a = 4;
    a(localmx.a());
  }

  public final void d(atz paramatz)
  {
    mx localmx = e(paramatz);
    localmx.a = 7;
    a(localmx.a());
  }
}

/* Location:           C:\Program Files\APK反编译\classes_dex2jar.jar
 * Qualified Name:     nb
 * JD-Core Version:    0.6.0
 */