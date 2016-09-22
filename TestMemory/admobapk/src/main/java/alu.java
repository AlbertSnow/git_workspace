import android.accounts.Account;
import android.os.Binder;
import android.os.RemoteException;
import android.util.Log;

public final class alu extends anc
{
  private int a;

  public static Account a(anb paramanb)
  {
    Object localObject1 = null;
    long l;
    if (paramanb != null)
      l = Binder.clearCallingIdentity();
    try
    {
      Account localAccount = paramanb.a();
      localObject1 = localAccount;
      return localObject1;
    }
    catch (RemoteException localRemoteException)
    {
      Log.w("AccountAccessor", "Remote account accessor probably died");
      return null;
    }
    finally
    {
      Binder.restoreCallingIdentity(l);
    }
    throw localObject2;
  }

  public final Account a()
  {
    int i = Binder.getCallingUid();
    if (i == this.a)
      return null;
    if (ahw.a(null, i))
    {
      this.a = i;
      return null;
    }
    throw new SecurityException("Caller is not GooglePlayServices");
  }

  public final boolean equals(Object paramObject)
  {
    if (this == paramObject)
      return true;
    if (!(paramObject instanceof alu))
      return false;
    return null.equals(null);
  }
}

/* Location:           C:\Program Files\APK反编译\classes_dex2jar.jar
 * Qualified Name:     alu
 * JD-Core Version:    0.6.0
 */