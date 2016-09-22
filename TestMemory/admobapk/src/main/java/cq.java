import android.os.Bundle;

final class cq
{
  static Bundle[] a(cp[] paramArrayOfcp)
  {
    if (paramArrayOfcp == null)
      return null;
    Bundle[] arrayOfBundle = new Bundle[paramArrayOfcp.length];
    for (int i = 0; i < paramArrayOfcp.length; i++)
    {
      cp localcp = paramArrayOfcp[i];
      Bundle localBundle = new Bundle();
      localBundle.putString("resultKey", localcp.a());
      localBundle.putCharSequence("label", localcp.b());
      localBundle.putCharSequenceArray("choices", localcp.c());
      localBundle.putBoolean("allowFreeFormInput", localcp.d());
      localBundle.putBundle("extras", localcp.e());
      arrayOfBundle[i] = localBundle;
    }
    return arrayOfBundle;
  }
}

/* Location:           C:\Program Files\APK反编译\classes_dex2jar.jar
 * Qualified Name:     cq
 * JD-Core Version:    0.6.0
 */