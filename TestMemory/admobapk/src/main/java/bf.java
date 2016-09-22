import java.io.FileDescriptor;
import java.io.PrintWriter;

final class bf
  implements cu, cv
{
  bd a;
  ct b;
  boolean c;
  boolean d;
  boolean e;
  boolean f;
  boolean g;
  boolean h;
  private boolean i;
  private Object j;
  private boolean k;

  final void a()
  {
    this.d = false;
    if ((!this.e) && (this.b != null) && (this.h))
    {
      this.h = false;
      this.b.a(this);
      this.b.a(this);
      this.b.d = false;
    }
  }

  public final void a(String paramString, FileDescriptor paramFileDescriptor, PrintWriter paramPrintWriter, String[] paramArrayOfString)
  {
    paramPrintWriter.print(paramString);
    paramPrintWriter.print("mId=");
    paramPrintWriter.print(0);
    paramPrintWriter.print(" mArgs=");
    paramPrintWriter.println(null);
    paramPrintWriter.print(paramString);
    paramPrintWriter.print("mCallbacks=");
    paramPrintWriter.println(null);
    paramPrintWriter.print(paramString);
    paramPrintWriter.print("mLoader=");
    paramPrintWriter.println(this.b);
    if (this.b != null)
    {
      ct localct = this.b;
      String str = paramString + "  ";
      paramPrintWriter.print(str);
      paramPrintWriter.print("mId=");
      paramPrintWriter.print(localct.a);
      paramPrintWriter.print(" mListener=");
      paramPrintWriter.println(localct.b);
      if (localct.d)
      {
        paramPrintWriter.print(str);
        paramPrintWriter.print("mStarted=");
        paramPrintWriter.print(localct.d);
        paramPrintWriter.print(" mContentChanged=");
        paramPrintWriter.print(false);
        paramPrintWriter.print(" mProcessingChange=");
        paramPrintWriter.println(false);
      }
      if (localct.f)
      {
        paramPrintWriter.print(str);
        paramPrintWriter.print("mAbandoned=");
        paramPrintWriter.print(false);
        paramPrintWriter.print(" mReset=");
        paramPrintWriter.println(localct.f);
      }
    }
    if (this.c)
    {
      paramPrintWriter.print(paramString);
      paramPrintWriter.print("mHaveData=");
      paramPrintWriter.print(false);
      paramPrintWriter.print("  mDeliveredData=");
      paramPrintWriter.println(this.c);
      paramPrintWriter.print(paramString);
      paramPrintWriter.print("mData=");
      paramPrintWriter.println(null);
    }
    paramPrintWriter.print(paramString);
    paramPrintWriter.print("mStarted=");
    paramPrintWriter.print(this.d);
    paramPrintWriter.print(" mReportNextStart=");
    paramPrintWriter.print(this.g);
    paramPrintWriter.print(" mDestroyed=");
    paramPrintWriter.println(this.k);
    paramPrintWriter.print(paramString);
    paramPrintWriter.print("mRetaining=");
    paramPrintWriter.print(this.e);
    paramPrintWriter.print(" mRetainingStarted=");
    paramPrintWriter.print(this.f);
    paramPrintWriter.print(" mListenerRegistered=");
    paramPrintWriter.println(this.h);
  }

  final void b()
  {
    this.k = true;
    this.c = false;
    this.a = null;
    this.j = null;
    this.i = false;
    if (this.b != null)
    {
      if (this.h)
      {
        this.h = false;
        this.b.a(this);
        this.b.a(this);
      }
      ct localct = this.b;
      localct.f = true;
      localct.d = false;
      localct.e = false;
      localct.g = false;
      localct.h = false;
    }
  }

  public final String toString()
  {
    StringBuilder localStringBuilder = new StringBuilder(64);
    localStringBuilder.append("LoaderInfo{");
    localStringBuilder.append(Integer.toHexString(System.identityHashCode(this)));
    localStringBuilder.append(" #");
    localStringBuilder.append(0);
    localStringBuilder.append(" : ");
    cz.a(this.b, localStringBuilder);
    localStringBuilder.append("}}");
    return localStringBuilder.toString();
  }
}

/* Location:           C:\Program Files\APK反编译\classes_dex2jar.jar
 * Qualified Name:     bf
 * JD-Core Version:    0.6.0
 */