import android.content.Context;
import android.content.res.Resources;
import android.util.DisplayMetrics;
import android.view.MotionEvent;
import com.google.android.gms.ads.internal.bc;
import com.google.android.gms.ads.internal.config.k;
import com.google.android.gms.ads.internal.config.m;
import java.io.UnsupportedEncodingException;
import java.security.NoSuchAlgorithmException;
import java.util.Iterator;
import java.util.LinkedList;

public abstract class gw
  implements gv
{
  public MotionEvent a;
  public LinkedList b = new LinkedList();
  public long c = 0L;
  public long d = 0L;
  public long e = 0L;
  public long f = 0L;
  public long g = 0L;
  public DisplayMetrics h;
  private boolean i = false;

  protected gw(Context paramContext)
  {
    ge.a();
    try
    {
      this.h = paramContext.getResources().getDisplayMetrics();
      return;
    }
    catch (UnsupportedOperationException localUnsupportedOperationException)
    {
      this.h = new DisplayMetrics();
      this.h.density = 1.0F;
    }
  }

  public final String a(Context paramContext)
  {
    return a(paramContext, null, false);
  }

  public final String a(Context paramContext, String paramString)
  {
    return a(paramContext, paramString, true);
  }

  public final String a(Context paramContext, String paramString, boolean paramBoolean)
  {
    if (paramBoolean);
    while (true)
    {
      int j;
      try
      {
        com.google.ads.afma.nano.d locald4 = c(paramContext);
        this.i = true;
        com.google.ads.afma.nano.d locald1 = locald4;
        if ((locald1 == null) || (locald1.e() == 0))
        {
          return Integer.toString(5);
          locald1 = b(paramContext);
          continue;
        }
        com.google.android.gms.ads.internal.config.d locald2 = m.am;
        if (((Boolean)bc.a().n.a(locald2)).booleanValue())
          continue;
        j = 1;
        break label162;
        return ge.a(locald1, paramString, bool1);
        com.google.android.gms.ads.internal.config.d locald3 = m.as;
        boolean bool2 = ((Boolean)bc.a().n.a(locald3)).booleanValue();
        if ((!bool2) || (!paramBoolean))
          continue;
        j = 1;
        break label162;
        j = 0;
        break label162;
        bool1 = false;
        continue;
      }
      catch (NoSuchAlgorithmException localNoSuchAlgorithmException)
      {
        return Integer.toString(7);
      }
      catch (UnsupportedEncodingException localUnsupportedEncodingException)
      {
        return Integer.toString(7);
      }
      catch (Throwable localThrowable)
      {
        return Integer.toString(3);
      }
      label162: if (j != 0)
        continue;
      boolean bool1 = true;
    }
  }

  public final void a(int paramInt1, int paramInt2, int paramInt3)
  {
    if (this.a != null)
      this.a.recycle();
    this.a = MotionEvent.obtain(0L, paramInt3, 1, paramInt1 * this.h.density, paramInt2 * this.h.density, 0.0F, 0.0F, 0, 0.0F, 0.0F, 0, 0);
  }

  public final void a(MotionEvent paramMotionEvent)
  {
    if (this.i)
    {
      this.f = 0L;
      this.e = 0L;
      this.d = 0L;
      this.c = 0L;
      this.g = 0L;
      Iterator localIterator = this.b.iterator();
      while (localIterator.hasNext())
        ((MotionEvent)localIterator.next()).recycle();
      this.b.clear();
      this.a = null;
      this.i = false;
    }
    switch (paramMotionEvent.getAction())
    {
    default:
    case 1:
      com.google.android.gms.ads.internal.config.d locald;
      do
      {
        return;
        this.a = MotionEvent.obtain(paramMotionEvent);
        this.b.add(this.a);
        if (this.b.size() > 6)
          ((MotionEvent)this.b.remove()).recycle();
        this.e = (1L + this.e);
        locald = m.ar;
      }
      while (!((Boolean)bc.a().n.a(locald)).booleanValue());
      StackTraceElement[] arrayOfStackTraceElement = new Throwable().getStackTrace();
      int j = -1 + arrayOfStackTraceElement.length;
      int k = 0;
      for (int m = j; m >= 0; m--)
      {
        k++;
        if ((arrayOfStackTraceElement[m].toString().startsWith("com.google.android.ads.")) || (arrayOfStackTraceElement[m].toString().startsWith("com.google.android.gms.")))
          break;
      }
      this.g = k;
      return;
    case 0:
      this.c = (1L + this.c);
      return;
    case 3:
      this.f = (1L + this.f);
      return;
    case 2:
    }
    this.d += 1 + paramMotionEvent.getHistorySize();
  }

  protected abstract com.google.ads.afma.nano.d b(Context paramContext);

  protected abstract com.google.ads.afma.nano.d c(Context paramContext);
}

/* Location:           C:\Program Files\APK反编译\classes_dex2jar.jar
 * Qualified Name:     gw
 * JD-Core Version:    0.6.0
 */