import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.util.Log;

final class akm extends Handler
{
  akm(akk paramakk, Looper paramLooper)
  {
    super(paramLooper);
  }

  public final void handleMessage(Message paramMessage)
  {
    switch (paramMessage.what)
    {
    default:
      int i = paramMessage.what;
      Log.w("GoogleApiClientImpl", 31 + "Unknown message id: " + i);
      return;
    case 1:
      this.a.e();
      return;
    case 2:
    }
    this.a.d();
  }
}

/* Location:           C:\Program Files\APK反编译\classes_dex2jar.jar
 * Qualified Name:     akm
 * JD-Core Version:    0.6.0
 */