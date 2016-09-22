package com.wandoujia.p4.app_launcher.b;

import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.wandoujia.online_config.c;
import com.wandoujia.p4.app_launcher.c.a;
import com.wandoujia.p4.app_launcher.clean.widget.CircleProgressBar;

final class e
{
  private View a;
  private ViewGroup b;
  private TextView c;
  private TextView d;
  private CircleProgressBar e;
  private String f;
  private int g;

  e(View paramView)
  {
    this.a = paramView;
    this.b = ((ViewGroup)paramView.findViewById(2131493405));
    this.c = ((TextView)paramView.findViewById(2131493407));
    this.d = ((TextView)paramView.findViewById(2131492998));
    this.e = ((CircleProgressBar)paramView.findViewById(2131493406));
  }

  public final void a()
  {
    float f1 = 100.0F;
    long l1 = a.a();
    long l2 = a.b();
    this.g = d.a(l1, l2);
    long l3;
    String str;
    if (l2 == 0L)
    {
      l3 = d.a(l1);
      if ((f1 >= 1.0F) || (f1 < 0.1F))
        break label214;
      str = "%.1f%%";
      label52: TextView localTextView = this.c;
      Object[] arrayOfObject1 = new Object[1];
      arrayOfObject1[0] = Float.valueOf(f1);
      localTextView.setText(String.format(str, arrayOfObject1));
      c.a();
      if ((f1 >= (float)c.n()) && (l3 >= c.o()))
        break label251;
      this.e.setPrimaryColor(d.a(this.e, 2131361892));
      this.c.setTextColor(d.a(this.e, 2131361892));
      this.d.setText(2131624631);
      if (f1 >= (float)c.n())
        break label221;
      Object[] arrayOfObject3 = new Object[1];
      arrayOfObject3[0] = Long.valueOf(c.n());
      this.f = String.format("%d%%", arrayOfObject3);
    }
    while (true)
    {
      this.b.setOnClickListener(new f(this, l1, l2));
      return;
      f1 = f1 * (float)l1 / (float)l2;
      break;
      label214: str = "%.0f%%";
      break label52;
      label221: Object[] arrayOfObject2 = new Object[1];
      arrayOfObject2[0] = Long.valueOf(c.o());
      this.f = String.format("%dM", arrayOfObject2);
      continue;
      label251: if ((f1 < (float)c.p()) || (l3 < c.q()))
      {
        this.e.setPrimaryColor(d.a(this.e, 2131361897));
        this.c.setTextColor(d.a(this.e, 2131361897));
        this.d.setText(2131624626);
        if (f1 < (float)c.p())
        {
          Object[] arrayOfObject5 = new Object[1];
          arrayOfObject5[0] = Long.valueOf(c.p());
          this.f = String.format("%d%%", arrayOfObject5);
          continue;
        }
        Object[] arrayOfObject4 = new Object[1];
        arrayOfObject4[0] = Long.valueOf(c.q());
        this.f = String.format("%dM", arrayOfObject4);
        continue;
      }
      this.e.setPrimaryColor(d.a(this.e, 2131361895));
      this.c.setTextColor(d.a(this.e, 2131361895));
      this.d.setText(2131624626);
    }
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.p4.app_launcher.b.e
 * JD-Core Version:    0.6.0
 */