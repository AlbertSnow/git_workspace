import android.content.Context;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewGroup.LayoutParams;
import android.widget.FrameLayout;
import android.widget.FrameLayout.LayoutParams;

final class bg extends FrameLayout
{
  private bg(Context paramContext)
  {
    super(paramContext);
  }

  static ViewGroup a(View paramView)
  {
    bg localbg = new bg(paramView.getContext());
    ViewGroup.LayoutParams localLayoutParams = paramView.getLayoutParams();
    if (localLayoutParams != null)
      localbg.setLayoutParams(localLayoutParams);
    paramView.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
    localbg.addView(paramView);
    return localbg;
  }

  protected final void dispatchRestoreInstanceState(SparseArray paramSparseArray)
  {
    dispatchThawSelfOnly(paramSparseArray);
  }

  protected final void dispatchSaveInstanceState(SparseArray paramSparseArray)
  {
    dispatchFreezeSelfOnly(paramSparseArray);
  }
}

/* Location:           C:\Program Files\APK反编译\classes_dex2jar.jar
 * Qualified Name:     bg
 * JD-Core Version:    0.6.0
 */