package android.support.v4.content;

import android.content.Context;
import android.support.v4.app.b;
import java.io.FileDescriptor;
import java.io.PrintWriter;

public class f<D>
{
  private int a;
  private g<D> b;
  private boolean c = false;
  private boolean d = false;
  private boolean e = true;

  public f(Context paramContext)
  {
    paramContext.getApplicationContext();
  }

  public final int a()
  {
    return this.a;
  }

  public final void a(int paramInt, g<D> paramg)
  {
    if (this.b != null)
      throw new IllegalStateException("There is already a listener registered");
    this.b = paramg;
    this.a = paramInt;
  }

  public final void a(g<D> paramg)
  {
    if (this.b == null)
      throw new IllegalStateException("No listener register");
    if (this.b != paramg)
      throw new IllegalArgumentException("Attempting to unregister the wrong listener");
    this.b = null;
  }

  public final void a(D paramD)
  {
    if (this.b != null)
      this.b.a(this, paramD);
  }

  public void a(String paramString, FileDescriptor paramFileDescriptor, PrintWriter paramPrintWriter, String[] paramArrayOfString)
  {
    paramPrintWriter.print(paramString);
    paramPrintWriter.print("mId=");
    paramPrintWriter.print(this.a);
    paramPrintWriter.print(" mListener=");
    paramPrintWriter.println(this.b);
    if (this.c)
    {
      paramPrintWriter.print(paramString);
      paramPrintWriter.print("mStarted=");
      paramPrintWriter.print(this.c);
      paramPrintWriter.print(" mContentChanged=");
      paramPrintWriter.print(false);
      paramPrintWriter.print(" mProcessingChange=");
      paramPrintWriter.println(false);
    }
    if ((this.d) || (this.e))
    {
      paramPrintWriter.print(paramString);
      paramPrintWriter.print("mAbandoned=");
      paramPrintWriter.print(this.d);
      paramPrintWriter.print(" mReset=");
      paramPrintWriter.println(this.e);
    }
  }

  public final boolean b()
  {
    return this.c;
  }

  public final boolean c()
  {
    return this.d;
  }

  public final void d()
  {
    this.c = true;
    this.e = false;
    this.d = false;
    e();
  }

  protected void e()
  {
  }

  public final void f()
  {
    this.c = false;
    g();
  }

  protected void g()
  {
  }

  public final void h()
  {
    this.d = true;
  }

  public final void i()
  {
    j();
    this.e = true;
    this.c = false;
    this.d = false;
  }

  protected void j()
  {
  }

  public String toString()
  {
    StringBuilder localStringBuilder = new StringBuilder(64);
    b.a(this, localStringBuilder);
    localStringBuilder.append(" id=");
    localStringBuilder.append(this.a);
    localStringBuilder.append("}");
    return localStringBuilder.toString();
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     android.support.v4.content.f
 * JD-Core Version:    0.6.0
 */