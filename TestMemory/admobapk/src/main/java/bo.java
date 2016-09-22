import android.app.Notification;
import android.app.PendingIntent;
import android.content.Context;
import java.util.ArrayList;

public final class bo
{
  public Context a;
  public CharSequence b;
  public CharSequence c;
  public PendingIntent d;
  int e;
  boolean f = true;
  public ArrayList g = new ArrayList();
  boolean h = false;
  int i = 0;
  int j = 0;
  public Notification k = new Notification();
  public ArrayList l;

  public bo(Context paramContext)
  {
    this.a = paramContext;
    this.k.when = System.currentTimeMillis();
    this.k.audioStreamType = -1;
    this.e = 0;
    this.l = new ArrayList();
  }

  public static CharSequence a(CharSequence paramCharSequence)
  {
    if (paramCharSequence == null);
    do
      return paramCharSequence;
    while (paramCharSequence.length() <= 5120);
    return paramCharSequence.subSequence(0, 5120);
  }
}

/* Location:           C:\Program Files\APK反编译\classes_dex2jar.jar
 * Qualified Name:     bo
 * JD-Core Version:    0.6.0
 */