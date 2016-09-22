import android.graphics.Paint;
import android.view.View;

class dx extends dw
{
  public final int a(View paramView)
  {
    return paramView.getLayerType();
  }

  public final void a(View paramView, int paramInt, Paint paramPaint)
  {
    paramView.setLayerType(paramInt, paramPaint);
  }

  public final void a(View paramView, boolean paramBoolean)
  {
    paramView.setSaveFromParentEnabled(paramBoolean);
  }
}

/* Location:           C:\Program Files\APK反编译\classes_dex2jar.jar
 * Qualified Name:     dx
 * JD-Core Version:    0.6.0
 */