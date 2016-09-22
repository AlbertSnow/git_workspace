import android.os.DeadObjectException;
import android.os.RemoteException;
import com.google.android.gms.common.api.Status;
import java.util.concurrent.atomic.AtomicReference;

public abstract class ajh extends ajl
{
  final aid a;
  final aia b;
  private AtomicReference h = new AtomicReference();

  public ajh(aia paramaia, aio paramaio)
  {
    super((aio)anw.a(paramaio, "GoogleApiClient must not be null"));
    this.a = paramaia.b();
    this.b = paramaia;
  }

  @Deprecated
  public ajh(aid paramaid, aio paramaio)
  {
    super((aio)anw.a(paramaio, "GoogleApiClient must not be null"));
    this.a = ((aid)anw.a(paramaid));
    this.b = null;
  }

  private final void a(RemoteException paramRemoteException)
  {
    b(new Status(8, paramRemoteException.getLocalizedMessage(), null));
  }

  protected final void a()
  {
    alo localalo = (alo)this.h.getAndSet(null);
    if (localalo != null)
      localalo.a(this);
  }

  public abstract void a(aic paramaic);

  public final void a(alo paramalo)
  {
    this.h.set(paramalo);
  }

  public final void b(aic paramaic)
  {
    try
    {
      a(paramaic);
      return;
    }
    catch (DeadObjectException localDeadObjectException)
    {
      a(localDeadObjectException);
      throw localDeadObjectException;
    }
    catch (RemoteException localRemoteException)
    {
      a(localRemoteException);
    }
  }

  public final void b(Status paramStatus)
  {
    if (!paramStatus.b());
    for (boolean bool = true; ; bool = false)
    {
      anw.b(bool, "Failed result must not be success");
      a(a(paramStatus));
      return;
    }
  }
}

/* Location:           C:\Program Files\APK反编译\classes_dex2jar.jar
 * Qualified Name:     ajh
 * JD-Core Version:    0.6.0
 */