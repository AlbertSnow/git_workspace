import java.util.logging.Handler;
import java.util.logging.LogRecord;
import java.util.logging.Logger;

final class asp extends Handler
{
  private final String a;
  private final String b;

  asp(String paramString1, String paramString2)
  {
    this.a = paramString1;
    this.b = paramString2;
  }

  public final void close()
  {
  }

  public final void flush()
  {
  }

  public final void publish(LogRecord paramLogRecord)
  {
    if (paramLogRecord != null)
    {
      paramLogRecord.setLoggerName(this.a);
      Object[] arrayOfObject = new Object[2];
      arrayOfObject[0] = this.b;
      arrayOfObject[1] = paramLogRecord.getMessage();
      paramLogRecord.setMessage(String.format("[%s] %s", arrayOfObject));
      aso.a.log(paramLogRecord);
    }
  }
}

/* Location:           C:\Program Files\APK反编译\classes_dex2jar.jar
 * Qualified Name:     asp
 * JD-Core Version:    0.6.0
 */