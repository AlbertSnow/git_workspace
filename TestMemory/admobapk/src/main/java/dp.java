import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater.Factory;
import android.view.View;

class dp
  implements LayoutInflater.Factory
{
  final ds a;

  dp(ds paramds)
  {
    this.a = paramds;
  }

  public View onCreateView(String paramString, Context paramContext, AttributeSet paramAttributeSet)
  {
    return this.a.a(null, paramString, paramContext, paramAttributeSet);
  }

  public String toString()
  {
    return getClass().getName() + "{" + this.a + "}";
  }
}

/* Location:           C:\Program Files\APK反编译\classes_dex2jar.jar
 * Qualified Name:     dp
 * JD-Core Version:    0.6.0
 */