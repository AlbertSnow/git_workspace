import android.app.Activity;
import android.os.RemoteException;
import android.util.Log;

final class mr extends aox
{
  mr(mp parammp)
  {
  }

  protected final void a(apo paramapo)
  {
    Activity localActivity = this.d.getActivity();
    if ((this.d.a == null) && (this.d.b) && (localActivity != null))
      Log.d("AppStreamingFragment", "Creating delegate");
    try
    {
      apr localapr = apr.a(localActivity.getApplicationContext(), apr.a, "com.google.android.gms.piccard.dynamite");
      nc localnc = nd.asInterface(localapr.a("com.google.android.gms.appstreaming.internal.AppStreamingFragmentDelegateImpl"));
      localnc.initialize(apf.a(this.d), apn.a(localapr.b), this.d.d, this.d.c);
      this.d.a = new mq(localnc);
      paramapo.a(this.d.a);
      return;
    }
    catch (RemoteException localRemoteException)
    {
      Log.e("AppStreamingFragment", localRemoteException.getMessage());
      return;
    }
    catch (apz localapz)
    {
      label134: break label134;
    }
  }
}

/* Location:           C:\Program Files\APK反编译\classes_dex2jar.jar
 * Qualified Name:     mr
 * JD-Core Version:    0.6.0
 */