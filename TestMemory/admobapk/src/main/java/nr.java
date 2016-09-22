import android.content.Context;
import android.content.SharedPreferences;
import com.google.android.gms.clearcut.LogEventParcelable;
import com.google.android.gms.playlog.internal.PlayLoggerContext;
import java.util.ArrayList;
import java.util.TimeZone;

public final class nr
{
  public final awt a = new awt();
  public boolean b = false;
  private int d = this.c.f;
  private String e = this.c.e;
  private String f = this.c.g;
  private String g = this.c.h;
  private int h = 0;
  private final nt i;
  private ArrayList j = null;
  private ArrayList k = null;
  private ArrayList l = null;
  private ArrayList m = null;
  private boolean n = true;

  public nr(np paramnp, byte[] paramArrayOfByte)
  {
    this(paramnp, paramArrayOfByte, null);
  }

  private nr(np paramnp, byte[] paramArrayOfByte, nt paramnt)
  {
    this.f = paramnp.g;
    this.g = paramnp.h;
    this.a.a = paramnp.k.a();
    this.a.b = paramnp.k.b();
    awt localawt1 = this.a;
    Context localContext = paramnp.b;
    if (no.a < 0)
      no.a = localContext.getSharedPreferences("bootCount", 0).getInt("bootCount", 1);
    localawt1.h = no.a;
    awt localawt2 = this.a;
    long l1 = this.a.a;
    localawt2.f = (TimeZone.getDefault().getOffset(l1) / 1000);
    if (paramArrayOfByte != null)
      this.a.e = paramArrayOfByte;
    this.i = null;
  }

  public final LogEventParcelable a()
  {
    LogEventParcelable localLogEventParcelable = new LogEventParcelable(new PlayLoggerContext(this.c.c, this.c.d, this.d, this.e, this.f, this.g, this.c.i, this.h), this.a, this.i, null, np.a(null), np.b(null), np.a(null), np.c(null), this.n);
    return localLogEventParcelable;
  }
}

/* Location:           C:\Program Files\APK反编译\classes_dex2jar.jar
 * Qualified Name:     nr
 * JD-Core Version:    0.6.0
 */