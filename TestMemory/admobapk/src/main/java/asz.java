import android.os.Handler;
import android.view.Choreographer;
import android.view.Choreographer.FrameCallback;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.OnTouchListener;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

final class asz
  implements Choreographer.FrameCallback, View.OnTouchListener
{
  private static final Logger f = aso.a("AppStreamingFragment", "ControlManager");
  final atc a;
  final View b;
  final atd c;
  final Handler d;
  volatile boolean e;
  private long g;
  private long h;
  private boolean i;
  private long j;
  private List k;
  private int l;
  private long[] m;
  private long n;
  private long o;

  private asz(atc paramatc, View paramView, Handler paramHandler, atd paramatd)
  {
    anw.a(paramatc);
    anw.a(paramView);
    anw.a(paramHandler);
    anw.a(paramatd);
    this.a = paramatc;
    this.b = paramView;
    this.d = paramHandler;
    this.c = paramatd;
    this.e = true;
    this.k = new ArrayList(2);
    for (int i1 = 0; i1 < 2; i1++)
      this.k.add(new ArrayList());
    this.l = 0;
    this.m = new long[10];
  }

  asz(atc paramatc, View paramView, Handler paramHandler, auz paramauz)
  {
  }

  private boolean a(int paramInt, MotionEvent paramMotionEvent)
  {
    int i1 = 0;
    if (this.e)
      return false;
    avh localavh = new avh();
    avf localavf = new avf();
    long l1 = this.g;
    this.g = (1L + l1);
    localavh.e = l1;
    localavh.a = paramInt;
    localavh.b = paramMotionEvent.getPointerId(paramMotionEvent.getActionIndex());
    localavh.c = new avi[paramMotionEvent.getPointerCount()];
    for (int i2 = 0; i2 < paramMotionEvent.getPointerCount(); i2++)
    {
      localavh.c[i2] = new avi();
      localavh.c[i2].a = paramMotionEvent.getPointerId(i2);
      localavh.c[i2].b = paramMotionEvent.getX(i2);
      localavh.c[i2].c = paramMotionEvent.getY(i2);
      localavh.c[i2].d = this.m[paramMotionEvent.getPointerId(i2)];
    }
    localavh.d = (1000000L * paramMotionEvent.getEventTime());
    localavf.a = localavh;
    while (i1 < 2)
    {
      this.c.a(localavf);
      i1++;
    }
    ((List)this.k.get(this.l)).add(localavf);
    return true;
  }

  private final void b()
  {
    monitorenter;
    try
    {
      if (!this.i)
      {
        this.j = System.currentTimeMillis();
        this.i = true;
      }
      monitorexit;
      return;
    }
    finally
    {
      localObject = finally;
      monitorexit;
    }
    throw localObject;
  }

  final long a()
  {
    monitorenter;
    try
    {
      if (this.i)
      {
        this.i = false;
        long l2 = System.currentTimeMillis();
        long l3 = this.j;
        l1 = l2 - l3;
        return l1;
      }
      long l1 = 0L;
    }
    finally
    {
      monitorexit;
    }
  }

  public final void doFrame(long paramLong)
  {
    if (this.e);
    do
    {
      return;
      avo localavo = new avo();
      long l1 = this.h;
      this.h = (l1 + 1L);
      localavo.a = l1;
      localavo.b = paramLong;
      avf localavf1 = new avf();
      localavf1.c = localavo;
      this.c.a(localavf1);
      if (f.isLoggable(asn.d))
      {
        this.o = (1L + this.o);
        long l2 = System.currentTimeMillis();
        if (l2 - this.n >= 5000L)
        {
          float f1 = 1000.0F * (float)this.o / (float)(l2 - this.n);
          Logger localLogger = f;
          Level localLevel = asn.d;
          Object[] arrayOfObject = new Object[1];
          arrayOfObject[0] = Float.valueOf(f1);
          localLogger.log(localLevel, String.format("Choreographer framerate %.2f fps", arrayOfObject));
          this.n = l2;
          this.o = 0L;
        }
      }
      if (this.b.getDisplay() != null)
        Choreographer.getInstance().postFrameCallback(this);
      for (int i1 = 1; i1 < 2; i1++)
      {
        int i2 = (2 + (-1 + this.l)) % 2;
        Iterator localIterator = ((List)this.k.get(i2)).iterator();
        while (localIterator.hasNext())
        {
          avf localavf2 = (avf)localIterator.next();
          this.c.a(localavf2);
        }
      }
    }
    while (((List)this.k.get(this.l)).isEmpty());
    this.l = ((1 + this.l) % 2);
    ((List)this.k.get(this.l)).clear();
  }

  public final boolean onTouch(View paramView, MotionEvent paramMotionEvent)
  {
    switch (paramMotionEvent.getActionMasked())
    {
    case 3:
    case 4:
    default:
      return false;
    case 0:
    case 5:
      b();
      this.m[paramMotionEvent.getPointerId(paramMotionEvent.getActionIndex())] = (1000000L * paramMotionEvent.getEventTime());
      return a(1, paramMotionEvent);
    case 1:
    case 6:
      return a(3, paramMotionEvent);
    case 2:
    }
    return a(2, paramMotionEvent);
  }
}

/* Location:           C:\Program Files\APK反编译\classes_dex2jar.jar
 * Qualified Name:     asz
 * JD-Core Version:    0.6.0
 */