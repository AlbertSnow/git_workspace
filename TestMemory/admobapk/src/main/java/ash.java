import android.content.Intent;

public final class ash
{
  public static Intent a(aus paramaus)
  {
    Intent localIntent = Intent.parseUri(paramaus.a, 1);
    if (paramaus.b != null)
      localIntent.putExtra("android.intent.extra.INTENT", a(paramaus.b));
    return localIntent;
  }
}

/* Location:           C:\Program Files\APK反编译\classes_dex2jar.jar
 * Qualified Name:     ash
 * JD-Core Version:    0.6.0
 */