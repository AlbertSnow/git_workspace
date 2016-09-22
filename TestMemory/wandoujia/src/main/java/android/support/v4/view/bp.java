package android.support.v4.view;

import android.view.View;
import android.view.WindowInsets;

final class bp extends bo
{
  public final void A(View paramView)
  {
    paramView.stopNestedScroll();
  }

  public final dk a(View paramView, dk paramdk)
  {
    if ((paramdk instanceof dl))
    {
      WindowInsets localWindowInsets1 = ((dl)paramdk).e();
      WindowInsets localWindowInsets2 = paramView.onApplyWindowInsets(localWindowInsets1);
      if (localWindowInsets2 != localWindowInsets1)
        paramdk = new dl(localWindowInsets2);
    }
    return paramdk;
  }

  public final void a(View paramView, as paramas)
  {
    paramView.setOnApplyWindowInsetsListener(new br(paramas));
  }

  public final void a(View paramView, String paramString)
  {
    paramView.setTransitionName(paramString);
  }

  public final void j(View paramView, float paramFloat)
  {
    paramView.setElevation(paramFloat);
  }

  public final void k(View paramView, float paramFloat)
  {
    paramView.setTranslationZ(paramFloat);
  }

  public final void w(View paramView)
  {
    paramView.requestApplyInsets();
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     android.support.v4.view.bp
 * JD-Core Version:    0.6.0
 */