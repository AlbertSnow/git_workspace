import java.util.logging.Logger;

public final class aso
{
  static final Logger a = Logger.getAnonymousLogger();

  public static Logger a(String paramString1, String paramString2)
  {
    Logger localLogger = Logger.getAnonymousLogger();
    localLogger.setUseParentHandlers(false);
    localLogger.addHandler(new asp(paramString1, paramString2));
    return localLogger;
  }
}

/* Location:           C:\Program Files\APK反编译\classes_dex2jar.jar
 * Qualified Name:     aso
 * JD-Core Version:    0.6.0
 */