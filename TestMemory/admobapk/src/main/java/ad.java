import android.os.Handler;
import android.os.Message;

final class ad extends Handler
{
  ad(ac paramac)
  {
  }

  public final void handleMessage(Message paramMessage)
  {
    switch (paramMessage.what)
    {
    default:
      super.handleMessage(paramMessage);
    case 1:
      do
        return;
      while (!this.a.c);
      this.a.a(false);
      return;
    case 2:
    }
    this.a.a();
    this.a.b.c();
  }
}

/* Location:           C:\Program Files\APK反编译\classes_dex2jar.jar
 * Qualified Name:     ad
 * JD-Core Version:    0.6.0
 */