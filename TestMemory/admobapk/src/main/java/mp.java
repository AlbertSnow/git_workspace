import android.annotation.TargetApi;
import android.app.Fragment;
import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.FrameLayout.LayoutParams;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.google.android.gms.appstreaming.AppStreamingInfo;

@TargetApi(12)
public final class mp extends Fragment
{
  public mq a;
  boolean b = false;
  public ms c = new ms();
  AppStreamingInfo d;
  private final mr e = new mr(this);

  public final void onCreate(Bundle paramBundle)
  {
    super.onCreate(paramBundle);
    if (getArguments() != null)
    {
      AppStreamingInfo localAppStreamingInfo = (AppStreamingInfo)getArguments().getParcelable("extra_AppStreamingInfo");
      if (localAppStreamingInfo != null)
        this.d = localAppStreamingInfo;
    }
    this.b = true;
    mr localmr = this.e;
    localmr.a(paramBundle, new aoz(localmr, paramBundle));
  }

  public final View onCreateView(LayoutInflater paramLayoutInflater, ViewGroup paramViewGroup, Bundle paramBundle)
  {
    mr localmr = this.e;
    FrameLayout localFrameLayout = new FrameLayout(paramLayoutInflater.getContext());
    localmr.a(paramBundle, new apa(localmr, localFrameLayout, paramLayoutInflater, paramViewGroup, paramBundle));
    if (localmr.a == null)
    {
      Context localContext = localFrameLayout.getContext();
      int i = ahv.a(localContext);
      String str1 = aml.a(localContext, i, ahv.e(localContext));
      String str2 = aml.b(localContext, i);
      LinearLayout localLinearLayout = new LinearLayout(localFrameLayout.getContext());
      localLinearLayout.setOrientation(1);
      localLinearLayout.setLayoutParams(new FrameLayout.LayoutParams(-2, -2));
      localFrameLayout.addView(localLinearLayout);
      TextView localTextView = new TextView(localFrameLayout.getContext());
      localTextView.setLayoutParams(new FrameLayout.LayoutParams(-2, -2));
      localTextView.setText(str1);
      localLinearLayout.addView(localTextView);
      if (str2 != null)
      {
        Button localButton = new Button(localContext);
        localButton.setLayoutParams(new FrameLayout.LayoutParams(-2, -2));
        localButton.setText(str2);
        localLinearLayout.addView(localButton);
        localButton.setOnClickListener(new apb(localContext, i));
      }
    }
    return localFrameLayout;
  }

  public final void onDestroy()
  {
    super.onDestroy();
    mr localmr = this.e;
    if (localmr.a != null)
      localmr.a.e();
    while (true)
    {
      this.b = false;
      return;
      localmr.a(1);
    }
  }

  public final void onPause()
  {
    super.onPause();
    mr localmr = this.e;
    if (localmr.a != null)
    {
      localmr.a.c();
      return;
    }
    localmr.a(5);
  }

  public final void onResume()
  {
    super.onResume();
    mr localmr = this.e;
    localmr.a(null, new apd(localmr));
  }

  public final void onSaveInstanceState(Bundle paramBundle)
  {
    super.onSaveInstanceState(paramBundle);
    paramBundle.setClassLoader(AppStreamingInfo.class.getClassLoader());
    mr localmr = this.e;
    if (localmr.a != null)
      localmr.a.b(paramBundle);
    do
      return;
    while (localmr.b == null);
    paramBundle.putAll(localmr.b);
  }

  public final void onStart()
  {
    super.onStart();
    mr localmr = this.e;
    localmr.a(null, new apc(localmr));
  }

  public final void onStop()
  {
    super.onStop();
    mr localmr = this.e;
    if (localmr.a != null)
    {
      localmr.a.d();
      return;
    }
    localmr.a(4);
  }
}

/* Location:           C:\Program Files\APK反编译\classes_dex2jar.jar
 * Qualified Name:     mp
 * JD-Core Version:    0.6.0
 */