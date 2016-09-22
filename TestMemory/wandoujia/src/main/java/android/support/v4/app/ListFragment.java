package android.support.v4.app;

import android.os.Bundle;
import android.os.Handler;
import android.os.IBinder;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AnimationUtils;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.FrameLayout;
import android.widget.FrameLayout.LayoutParams;
import android.widget.LinearLayout;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.ProgressBar;
import android.widget.TextView;

public class ListFragment extends Fragment
{
  ListView a;
  private final Handler b = new Handler();
  private final Runnable c = new ai(this);
  private final AdapterView.OnItemClickListener d = new aj();
  private ListAdapter e;
  private View f;
  private TextView g;
  private View h;
  private View i;
  private boolean j;

  public static void a()
  {
  }

  private void a(boolean paramBoolean1, boolean paramBoolean2)
  {
    b();
    if (this.h == null)
      throw new IllegalStateException("Can't be used with a custom content view");
    if (this.j == paramBoolean1)
      return;
    this.j = paramBoolean1;
    if (paramBoolean1)
    {
      if (paramBoolean2)
      {
        this.h.startAnimation(AnimationUtils.loadAnimation(getActivity(), 17432577));
        this.i.startAnimation(AnimationUtils.loadAnimation(getActivity(), 17432576));
      }
      while (true)
      {
        this.h.setVisibility(8);
        this.i.setVisibility(0);
        return;
        this.h.clearAnimation();
        this.i.clearAnimation();
      }
    }
    if (paramBoolean2)
    {
      this.h.startAnimation(AnimationUtils.loadAnimation(getActivity(), 17432576));
      this.i.startAnimation(AnimationUtils.loadAnimation(getActivity(), 17432577));
    }
    while (true)
    {
      this.h.setVisibility(0);
      this.i.setVisibility(8);
      return;
      this.h.clearAnimation();
      this.i.clearAnimation();
    }
  }

  private void b()
  {
    if (this.a != null)
      return;
    View localView1 = getView();
    if (localView1 == null)
      throw new IllegalStateException("Content view not yet created");
    int k;
    if ((localView1 instanceof ListView))
    {
      this.a = ((ListView)localView1);
      this.j = true;
      this.a.setOnItemClickListener(this.d);
      if (this.e == null)
        break label295;
      ListAdapter localListAdapter = this.e;
      this.e = null;
      if (this.e == null)
        break label289;
      k = 1;
      label86: this.e = localListAdapter;
      if (this.a != null)
      {
        this.a.setAdapter(localListAdapter);
        if ((!this.j) && (k == 0))
        {
          IBinder localIBinder = getView().getWindowToken();
          boolean bool = false;
          if (localIBinder != null)
            bool = true;
          a(true, bool);
        }
      }
    }
    while (true)
    {
      this.b.post(this.c);
      return;
      this.g = ((TextView)localView1.findViewById(16711681));
      if (this.g == null)
        this.f = localView1.findViewById(16908292);
      View localView2;
      while (true)
      {
        this.h = localView1.findViewById(16711682);
        this.i = localView1.findViewById(16711683);
        localView2 = localView1.findViewById(16908298);
        if ((localView2 instanceof ListView))
          break;
        if (localView2 == null)
        {
          throw new RuntimeException("Your content must have a ListView whose id attribute is 'android.R.id.list'");
          this.g.setVisibility(8);
          continue;
        }
        throw new RuntimeException("Content has view with id attribute 'android.R.id.list' that is not a ListView class");
      }
      this.a = ((ListView)localView2);
      if (this.f == null)
        break;
      this.a.setEmptyView(this.f);
      break;
      label289: k = 0;
      break label86;
      label295: if (this.h == null)
        continue;
      a(false, false);
    }
  }

  public View onCreateView(LayoutInflater paramLayoutInflater, ViewGroup paramViewGroup, Bundle paramBundle)
  {
    FragmentActivity localFragmentActivity = getActivity();
    FrameLayout localFrameLayout1 = new FrameLayout(localFragmentActivity);
    LinearLayout localLinearLayout = new LinearLayout(localFragmentActivity);
    localLinearLayout.setId(16711682);
    localLinearLayout.setOrientation(1);
    localLinearLayout.setVisibility(8);
    localLinearLayout.setGravity(17);
    localLinearLayout.addView(new ProgressBar(localFragmentActivity, null, 16842874), new FrameLayout.LayoutParams(-2, -2));
    localFrameLayout1.addView(localLinearLayout, new FrameLayout.LayoutParams(-1, -1));
    FrameLayout localFrameLayout2 = new FrameLayout(localFragmentActivity);
    localFrameLayout2.setId(16711683);
    TextView localTextView = new TextView(getActivity());
    localTextView.setId(16711681);
    localTextView.setGravity(17);
    localFrameLayout2.addView(localTextView, new FrameLayout.LayoutParams(-1, -1));
    ListView localListView = new ListView(getActivity());
    localListView.setId(16908298);
    localListView.setDrawSelectorOnTop(false);
    localFrameLayout2.addView(localListView, new FrameLayout.LayoutParams(-1, -1));
    localFrameLayout1.addView(localFrameLayout2, new FrameLayout.LayoutParams(-1, -1));
    localFrameLayout1.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
    return localFrameLayout1;
  }

  public void onDestroyView()
  {
    this.b.removeCallbacks(this.c);
    this.a = null;
    this.j = false;
    this.i = null;
    this.h = null;
    this.f = null;
    this.g = null;
    super.onDestroyView();
  }

  public void onViewCreated(View paramView, Bundle paramBundle)
  {
    super.onViewCreated(paramView, paramBundle);
    b();
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     android.support.v4.app.ListFragment
 * JD-Core Version:    0.6.0
 */