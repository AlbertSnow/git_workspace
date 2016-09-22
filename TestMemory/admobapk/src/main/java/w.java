import android.content.Context;
import android.os.Build.VERSION;
import android.util.AttributeSet;
import android.view.View;

abstract class w extends v
{
  public View onCreateView(View paramView, String paramString, Context paramContext, AttributeSet paramAttributeSet)
  {
    View localView = a(paramView, paramString, paramContext, paramAttributeSet);
    if ((localView == null) && (Build.VERSION.SDK_INT >= 11))
      localView = super.onCreateView(paramView, paramString, paramContext, paramAttributeSet);
    return localView;
  }
}

/* Location:           C:\Program Files\APK反编译\classes_dex2jar.jar
 * Qualified Name:     w
 * JD-Core Version:    0.6.0
 */