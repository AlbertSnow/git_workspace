package android.support.v7.app;

import android.content.Context;
import android.content.DialogInterface.OnClickListener;
import android.content.res.Resources.Theme;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.os.Handler;
import android.os.Message;
import android.support.v7.appcompat.R.attr;
import android.support.v7.appcompat.R.id;
import android.support.v7.appcompat.R.styleable;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.view.ViewGroup.LayoutParams;
import android.view.Window;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout.LayoutParams;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.ScrollView;
import android.widget.TextView;
import com.tencent.mm.sdk.channel.a;

final class b
{
  private int A;
  private Handler B;
  private final View.OnClickListener C = new c(this);
  private final Context a;
  private final aa b;
  private final Window c;
  private CharSequence d;
  private ListView e;
  private View f;
  private Button g;
  private CharSequence h;
  private Message i;
  private Button j;
  private CharSequence k;
  private Message l;
  private Button m;
  private CharSequence n;
  private Message o;
  private ScrollView p;
  private Drawable q;
  private ImageView r;
  private TextView s;
  private TextView t;
  private View u;
  private ListAdapter v;
  private int w = -1;
  private int x;
  private int y;
  private int z;

  public b(Context paramContext, aa paramaa, Window paramWindow)
  {
    this.a = paramContext;
    this.b = paramaa;
    this.c = paramWindow;
    this.B = new g(paramaa);
    TypedArray localTypedArray = paramContext.obtainStyledAttributes(null, R.styleable.AlertDialog, R.attr.alertDialogStyle, 0);
    this.x = localTypedArray.getResourceId(R.styleable.AlertDialog_android_layout, 0);
    localTypedArray.getResourceId(R.styleable.AlertDialog_buttonPanelSideLayout, 0);
    this.y = localTypedArray.getResourceId(R.styleable.AlertDialog_listLayout, 0);
    localTypedArray.getResourceId(R.styleable.AlertDialog_multiChoiceItemLayout, 0);
    this.z = localTypedArray.getResourceId(R.styleable.AlertDialog_singleChoiceItemLayout, 0);
    this.A = localTypedArray.getResourceId(R.styleable.AlertDialog_listItemLayout, 0);
    localTypedArray.recycle();
  }

  private static void a(Button paramButton)
  {
    LinearLayout.LayoutParams localLayoutParams = (LinearLayout.LayoutParams)paramButton.getLayoutParams();
    localLayoutParams.gravity = 1;
    localLayoutParams.weight = 0.5F;
    paramButton.setLayoutParams(localLayoutParams);
  }

  private static boolean c(View paramView)
  {
    if (paramView.onCheckIsTextEditor())
      return true;
    if (!(paramView instanceof ViewGroup))
      return false;
    ViewGroup localViewGroup = (ViewGroup)paramView;
    int i1 = localViewGroup.getChildCount();
    while (i1 > 0)
    {
      i1--;
      if (c(localViewGroup.getChildAt(i1)))
        return true;
    }
    return false;
  }

  public final void a()
  {
    this.b.b().i();
    int i1 = this.x;
    this.b.setContentView(i1);
    ViewGroup localViewGroup1 = (ViewGroup)this.c.findViewById(R.id.contentPanel);
    this.p = ((ScrollView)this.c.findViewById(R.id.scrollView));
    this.p.setFocusable(false);
    this.t = ((TextView)this.c.findViewById(16908299));
    int i2;
    label213: int i3;
    label260: label307: label348: label366: int i4;
    label374: ViewGroup localViewGroup2;
    a locala;
    label451: FrameLayout localFrameLayout;
    View localView2;
    if (this.t != null)
    {
      this.t.setVisibility(8);
      this.p.removeView(this.t);
      if (this.e != null)
      {
        ViewGroup localViewGroup3 = (ViewGroup)this.p.getParent();
        int i8 = localViewGroup3.indexOfChild(this.p);
        localViewGroup3.removeViewAt(i8);
        localViewGroup3.addView(this.e, i8, new ViewGroup.LayoutParams(-1, -1));
      }
    }
    else
    {
      this.g = ((Button)this.c.findViewById(16908313));
      this.g.setOnClickListener(this.C);
      if (!TextUtils.isEmpty(this.h))
        break label682;
      this.g.setVisibility(8);
      i2 = 0;
      this.j = ((Button)this.c.findViewById(16908314));
      this.j.setOnClickListener(this.C);
      if (!TextUtils.isEmpty(this.k))
        break label707;
      this.j.setVisibility(8);
      this.m = ((Button)this.c.findViewById(16908315));
      this.m.setOnClickListener(this.C);
      if (!TextUtils.isEmpty(this.n))
        break label735;
      this.m.setVisibility(8);
      Context localContext = this.a;
      TypedValue localTypedValue = new TypedValue();
      localContext.getTheme().resolveAttribute(R.attr.alertDialogCenterButtons, localTypedValue, true);
      if (localTypedValue.data == 0)
        break label763;
      i3 = 1;
      if (i3 != 0)
      {
        if (i2 != 1)
          break label769;
        a(this.g);
      }
      if (i2 == 0)
        break label801;
      i4 = 1;
      localViewGroup2 = (ViewGroup)this.c.findViewById(R.id.topPanel);
      locala = a.a(this.a, null, R.styleable.AlertDialog, R.attr.alertDialogStyle);
      if (this.u == null)
        break label807;
      ViewGroup.LayoutParams localLayoutParams = new ViewGroup.LayoutParams(-1, -2);
      localViewGroup2.addView(this.u, 0, localLayoutParams);
      this.c.findViewById(R.id.title_template).setVisibility(8);
      View localView1 = this.c.findViewById(R.id.buttonPanel);
      if (i4 == 0)
      {
        localView1.setVisibility(8);
        View localView3 = this.c.findViewById(R.id.textSpacerNoButtons);
        if (localView3 != null)
          localView3.setVisibility(0);
      }
      localFrameLayout = (FrameLayout)this.c.findViewById(R.id.customPanel);
      if (this.f == null)
        break label978;
      localView2 = this.f;
      label526: int i5 = 0;
      if (localView2 != null)
        i5 = 1;
      if ((i5 == 0) || (!c(localView2)))
        this.c.setFlags(131072, 131072);
      if (i5 == 0)
        break label984;
      ((FrameLayout)this.c.findViewById(R.id.custom)).addView(localView2, new ViewGroup.LayoutParams(-1, -1));
      if (this.e != null)
        ((LinearLayout.LayoutParams)localFrameLayout.getLayoutParams()).weight = 0.0F;
    }
    while (true)
    {
      ListView localListView = this.e;
      if ((localListView != null) && (this.v != null))
      {
        localListView.setAdapter(this.v);
        int i6 = this.w;
        if (i6 >= 0)
        {
          localListView.setItemChecked(i6, true);
          localListView.setSelection(i6);
        }
      }
      locala.b();
      return;
      localViewGroup1.setVisibility(8);
      break;
      label682: this.g.setText(this.h);
      this.g.setVisibility(0);
      i2 = 1;
      break label213;
      label707: this.j.setText(this.k);
      this.j.setVisibility(0);
      i2 |= 2;
      break label260;
      label735: this.m.setText(this.n);
      this.m.setVisibility(0);
      i2 |= 4;
      break label307;
      label763: i3 = 0;
      break label348;
      label769: if (i2 == 2)
      {
        a(this.j);
        break label366;
      }
      if (i2 != 4)
        break label366;
      a(this.m);
      break label366;
      label801: i4 = 0;
      break label374;
      label807: this.r = ((ImageView)this.c.findViewById(16908294));
      if (!TextUtils.isEmpty(this.d));
      for (int i7 = 1; ; i7 = 0)
      {
        if (i7 == 0)
          break label944;
        this.s = ((TextView)this.c.findViewById(R.id.alertTitle));
        this.s.setText(this.d);
        if (this.q == null)
          break label897;
        this.r.setImageDrawable(this.q);
        break;
      }
      label897: this.s.setPadding(this.r.getPaddingLeft(), this.r.getPaddingTop(), this.r.getPaddingRight(), this.r.getPaddingBottom());
      this.r.setVisibility(8);
      break label451;
      label944: this.c.findViewById(R.id.title_template).setVisibility(8);
      this.r.setVisibility(8);
      localViewGroup2.setVisibility(8);
      break label451;
      label978: localView2 = null;
      break label526;
      label984: localFrameLayout.setVisibility(8);
    }
  }

  public final void a(int paramInt, CharSequence paramCharSequence, DialogInterface.OnClickListener paramOnClickListener, Message paramMessage)
  {
    if (paramOnClickListener != null)
      paramMessage = this.B.obtainMessage(paramInt, paramOnClickListener);
    switch (paramInt)
    {
    default:
      throw new IllegalArgumentException("Button does not exist");
    case -1:
      this.h = paramCharSequence;
      this.i = paramMessage;
      return;
    case -2:
      this.k = paramCharSequence;
      this.l = paramMessage;
      return;
    case -3:
    }
    this.n = paramCharSequence;
    this.o = paramMessage;
  }

  public final void a(Drawable paramDrawable)
  {
    this.q = paramDrawable;
    if (this.r != null)
    {
      if (paramDrawable != null)
        this.r.setImageDrawable(paramDrawable);
    }
    else
      return;
    this.r.setVisibility(8);
  }

  public final void a(View paramView)
  {
    this.u = paramView;
  }

  public final void a(CharSequence paramCharSequence)
  {
    this.d = paramCharSequence;
    if (this.s != null)
      this.s.setText(paramCharSequence);
  }

  public final boolean a(KeyEvent paramKeyEvent)
  {
    return (this.p != null) && (this.p.executeKeyEvent(paramKeyEvent));
  }

  public final ListView b()
  {
    return this.e;
  }

  public final void b(View paramView)
  {
    this.f = paramView;
  }

  public final boolean b(KeyEvent paramKeyEvent)
  {
    return (this.p != null) && (this.p.executeKeyEvent(paramKeyEvent));
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     android.support.v7.app.b
 * JD-Core Version:    0.6.0
 */