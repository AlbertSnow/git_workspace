import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.util.Log;
import android.util.Pair;
import com.google.android.gms.common.api.Status;

public final class ajn extends Handler
{
  public ajn()
  {
    this(Looper.getMainLooper());
  }

  public ajn(Looper paramLooper)
  {
    super(paramLooper);
  }

  public final void a(aiw paramaiw, aiv paramaiv)
  {
    sendMessage(obtainMessage(1, new Pair(paramaiw, paramaiv)));
  }

  public final void handleMessage(Message paramMessage)
  {
    switch (paramMessage.what)
    {
    default:
      int i = paramMessage.what;
      Log.wtf("BasePendingResult", 45 + "Don't know how to handle message: " + i, new Exception());
      return;
    case 1:
      Pair localPair = (Pair)paramMessage.obj;
      aiw localaiw = (aiw)localPair.first;
      aiv localaiv = (aiv)localPair.second;
      try
      {
        localaiw.a(localaiv);
        return;
      }
      catch (RuntimeException localRuntimeException)
      {
        ajl.b(localaiv);
        throw localRuntimeException;
      }
    case 2:
    }
    ((ajl)paramMessage.obj).c(Status.c);
  }
}

/* Location:           C:\Program Files\APK反编译\classes_dex2jar.jar
 * Qualified Name:     ajn
 * JD-Core Version:    0.6.0
 */