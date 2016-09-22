package android.support.v7.app;

import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.content.res.Resources.Theme;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.media.AudioManager;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.support.v4.app.ao;
import android.support.v4.view.aa;
import android.support.v4.view.bg;
import android.support.v4.view.bs;
import android.support.v7.appcompat.R.attr;
import android.support.v7.appcompat.R.id;
import android.support.v7.appcompat.R.layout;
import android.support.v7.appcompat.R.style;
import android.support.v7.appcompat.R.styleable;
import android.support.v7.internal.view.menu.g;
import android.support.v7.internal.view.menu.i;
import android.support.v7.internal.view.menu.j;
import android.support.v7.internal.widget.ActionBarContextView;
import android.support.v7.internal.widget.ContentFrameLayout;
import android.support.v7.internal.widget.ViewStubCompat;
import android.support.v7.internal.widget.ac;
import android.support.v7.internal.widget.ba;
import android.text.TextUtils;
import android.util.AndroidRuntimeException;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.KeyCharacterMap;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.LayoutInflater.Factory;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewGroup.LayoutParams;
import android.view.ViewParent;
import android.view.Window;
import android.view.Window.Callback;
import android.view.WindowManager;
import android.view.WindowManager.LayoutParams;
import android.widget.FrameLayout;
import android.widget.ListAdapter;
import android.widget.PopupWindow;
import android.widget.TextView;

class AppCompatDelegateImplV7 extends m
  implements aa, j
{
  private boolean A;
  private Rect B;
  private Rect C;
  private android.support.v7.internal.a.a D;
  android.support.v7.b.a i;
  ActionBarContextView j;
  PopupWindow k;
  Runnable l;
  private android.support.v7.internal.widget.z m;
  private v n;
  private z o;
  private boolean p;
  private ViewGroup q;
  private ViewGroup r;
  private TextView s;
  private View t;
  private boolean u;
  private AppCompatDelegateImplV7.PanelFeatureState[] v;
  private AppCompatDelegateImplV7.PanelFeatureState w;
  private boolean x;
  private int y;
  private final Runnable z = new r(this);

  AppCompatDelegateImplV7(Context paramContext, Window paramWindow)
  {
    super(paramContext, paramWindow);
  }

  private AppCompatDelegateImplV7.PanelFeatureState a(Menu paramMenu)
  {
    AppCompatDelegateImplV7.PanelFeatureState[] arrayOfPanelFeatureState = this.v;
    int i1;
    if (arrayOfPanelFeatureState != null)
      i1 = arrayOfPanelFeatureState.length;
    for (int i2 = 0; ; i2++)
    {
      if (i2 >= i1)
        break label55;
      AppCompatDelegateImplV7.PanelFeatureState localPanelFeatureState = arrayOfPanelFeatureState[i2];
      if ((localPanelFeatureState != null) && (localPanelFeatureState.h == paramMenu))
      {
        return localPanelFeatureState;
        i1 = 0;
        break;
      }
    }
    label55: return null;
  }

  private void a(int paramInt, AppCompatDelegateImplV7.PanelFeatureState paramPanelFeatureState, Menu paramMenu)
  {
    if (paramMenu == null)
    {
      if ((paramPanelFeatureState == null) && (paramInt >= 0) && (paramInt < this.v.length))
        paramPanelFeatureState = this.v[paramInt];
      if (paramPanelFeatureState != null)
        paramMenu = paramPanelFeatureState.h;
    }
    if ((paramPanelFeatureState != null) && (!paramPanelFeatureState.m));
    Window.Callback localCallback;
    do
    {
      return;
      localCallback = this.b.getCallback();
    }
    while (localCallback == null);
    localCallback.onPanelClosed(paramInt, paramMenu);
  }

  private void a(AppCompatDelegateImplV7.PanelFeatureState paramPanelFeatureState, KeyEvent paramKeyEvent)
  {
    int i1 = -1;
    if ((paramPanelFeatureState.m) || (n()));
    label116: label122: label126: WindowManager localWindowManager;
    label128: Resources.Theme localTheme;
    label274: label372: int i2;
    label390: int i3;
    label412: ViewGroup.LayoutParams localLayoutParams1;
    while (true)
    {
      return;
      int i5;
      if (paramPanelFeatureState.a == 0)
      {
        Context localContext2 = this.a;
        if ((0xF & localContext2.getResources().getConfiguration().screenLayout) != 4)
          break label116;
        i5 = 1;
        if (localContext2.getApplicationInfo().targetSdkVersion < 11)
          break label122;
      }
      for (int i6 = 1; ; i6 = 0)
      {
        if ((i5 != 0) && (i6 != 0))
          break label126;
        Window.Callback localCallback = this.b.getCallback();
        if ((localCallback == null) || (localCallback.onMenuOpened(paramPanelFeatureState.a, paramPanelFeatureState.h)))
          break label128;
        a(paramPanelFeatureState, true);
        return;
        i5 = 0;
        break;
      }
      continue;
      localWindowManager = (WindowManager)this.a.getSystemService("window");
      if ((localWindowManager == null) || (!b(paramPanelFeatureState, paramKeyEvent)))
        continue;
      if ((paramPanelFeatureState.e != null) && (!paramPanelFeatureState.o))
        break label789;
      if (paramPanelFeatureState.e != null)
        break label603;
      Context localContext1 = m();
      TypedValue localTypedValue = new TypedValue();
      localTheme = localContext1.getResources().newTheme();
      localTheme.setTo(localContext1.getTheme());
      localTheme.resolveAttribute(R.attr.actionBarPopupTheme, localTypedValue, true);
      if (localTypedValue.resourceId != 0)
        localTheme.applyStyle(localTypedValue.resourceId, true);
      localTheme.resolveAttribute(R.attr.panelMenuListTheme, localTypedValue, true);
      if (localTypedValue.resourceId == 0)
        break;
      localTheme.applyStyle(localTypedValue.resourceId, true);
      android.support.v7.internal.view.a locala = new android.support.v7.internal.view.a(localContext1, 0);
      locala.getTheme().setTo(localTheme);
      paramPanelFeatureState.j = locala;
      TypedArray localTypedArray = locala.obtainStyledAttributes(R.styleable.Theme);
      paramPanelFeatureState.b = localTypedArray.getResourceId(R.styleable.Theme_panelBackground, 0);
      paramPanelFeatureState.d = localTypedArray.getResourceId(R.styleable.Theme_android_windowAnimationStyle, 0);
      localTypedArray.recycle();
      paramPanelFeatureState.e = new x(this, paramPanelFeatureState.j);
      paramPanelFeatureState.c = 81;
      if (paramPanelFeatureState.e == null)
        continue;
      if (paramPanelFeatureState.g == null)
        break label630;
      paramPanelFeatureState.f = paramPanelFeatureState.g;
      i2 = 1;
      if (i2 == 0)
        break label760;
      if (paramPanelFeatureState.f == null)
        break label783;
      if (paramPanelFeatureState.g == null)
        break label762;
      i3 = 1;
      if (i3 == 0)
        break label787;
      localLayoutParams1 = paramPanelFeatureState.f.getLayoutParams();
      if (localLayoutParams1 != null)
        break label825;
    }
    label783: label787: label789: label819: label825: for (ViewGroup.LayoutParams localLayoutParams2 = new ViewGroup.LayoutParams(-2, -2); ; localLayoutParams2 = localLayoutParams1)
    {
      int i4 = paramPanelFeatureState.b;
      paramPanelFeatureState.e.setBackgroundResource(i4);
      ViewParent localViewParent = paramPanelFeatureState.f.getParent();
      if ((localViewParent != null) && ((localViewParent instanceof ViewGroup)))
        ((ViewGroup)localViewParent).removeView(paramPanelFeatureState.f);
      paramPanelFeatureState.e.addView(paramPanelFeatureState.f, localLayoutParams2);
      if (!paramPanelFeatureState.f.hasFocus())
        paramPanelFeatureState.f.requestFocus();
      for (i1 = -2; ; i1 = -2)
      {
        label603: label630: label760: label762: ViewGroup.LayoutParams localLayoutParams3;
        label756: 
        do
        {
          paramPanelFeatureState.l = false;
          WindowManager.LayoutParams localLayoutParams = new WindowManager.LayoutParams(i1, -2, 0, 0, 1002, 8519680, -3);
          localLayoutParams.gravity = paramPanelFeatureState.c;
          localLayoutParams.windowAnimations = paramPanelFeatureState.d;
          localWindowManager.addView(paramPanelFeatureState.e, localLayoutParams);
          paramPanelFeatureState.m = true;
          return;
          localTheme.applyStyle(R.style.Theme_AppCompat_CompactMenu, true);
          break label274;
          if ((!paramPanelFeatureState.o) || (paramPanelFeatureState.e.getChildCount() <= 0))
            break label372;
          paramPanelFeatureState.e.removeAllViews();
          break label372;
          if (paramPanelFeatureState.h != null)
          {
            if (this.o == null)
              this.o = new z(this, 0);
            z localz = this.o;
            if (paramPanelFeatureState.h == null);
            for (android.support.v7.internal.view.menu.z localz1 = null; ; localz1 = paramPanelFeatureState.i.a(paramPanelFeatureState.e))
            {
              paramPanelFeatureState.f = ((View)localz1);
              if (paramPanelFeatureState.f == null)
                break label756;
              i2 = 1;
              break;
              if (paramPanelFeatureState.i != null)
                continue;
              paramPanelFeatureState.i = new g(paramPanelFeatureState.j, R.layout.abc_list_menu_item_layout);
              paramPanelFeatureState.i.a(localz);
              paramPanelFeatureState.h.a(paramPanelFeatureState.i);
            }
          }
          i2 = 0;
          break label390;
          break;
          if (paramPanelFeatureState.i.a().getCount() > 0)
          {
            i3 = 1;
            break label412;
          }
          i3 = 0;
          break label412;
          break;
          if (paramPanelFeatureState.g == null)
            break label819;
          localLayoutParams3 = paramPanelFeatureState.g.getLayoutParams();
        }
        while ((localLayoutParams3 != null) && (localLayoutParams3.width == i1));
      }
    }
  }

  private void a(AppCompatDelegateImplV7.PanelFeatureState paramPanelFeatureState, boolean paramBoolean)
  {
    if ((paramBoolean) && (paramPanelFeatureState.a == 0) && (this.m != null) && (this.m.c()))
      b(paramPanelFeatureState.h);
    do
    {
      return;
      boolean bool = paramPanelFeatureState.m;
      WindowManager localWindowManager = (WindowManager)this.a.getSystemService("window");
      if ((localWindowManager != null) && (bool) && (paramPanelFeatureState.e != null))
        localWindowManager.removeView(paramPanelFeatureState.e);
      paramPanelFeatureState.k = false;
      paramPanelFeatureState.l = false;
      paramPanelFeatureState.m = false;
      if ((bool) && (paramBoolean))
        a(paramPanelFeatureState.a, paramPanelFeatureState, null);
      paramPanelFeatureState.f = null;
      paramPanelFeatureState.o = true;
    }
    while (this.w != paramPanelFeatureState);
    this.w = null;
  }

  private boolean a(AppCompatDelegateImplV7.PanelFeatureState paramPanelFeatureState, int paramInt, KeyEvent paramKeyEvent)
  {
    if (paramKeyEvent.isSystem());
    do
      return false;
    while (((!paramPanelFeatureState.k) && (!b(paramPanelFeatureState, paramKeyEvent))) || (paramPanelFeatureState.h == null));
    return paramPanelFeatureState.h.performShortcut(paramInt, paramKeyEvent, 1);
  }

  private void b(i parami)
  {
    if (this.u)
      return;
    this.u = true;
    this.m.h();
    Window.Callback localCallback = this.b.getCallback();
    if ((localCallback != null) && (!n()))
      localCallback.onPanelClosed(8, parami);
    this.u = false;
  }

  private boolean b(AppCompatDelegateImplV7.PanelFeatureState paramPanelFeatureState, KeyEvent paramKeyEvent)
  {
    if (n())
      return false;
    if (paramPanelFeatureState.k)
      return true;
    if ((this.w != null) && (this.w != paramPanelFeatureState))
      a(this.w, false);
    Window.Callback localCallback = this.b.getCallback();
    if (localCallback != null)
      paramPanelFeatureState.g = localCallback.onCreatePanelView(paramPanelFeatureState.a);
    int i1;
    label87: Context localContext;
    TypedValue localTypedValue;
    Resources.Theme localTheme1;
    Resources.Theme localTheme2;
    label241: Object localObject;
    if ((paramPanelFeatureState.a == 0) || (paramPanelFeatureState.a == 8))
    {
      i1 = 1;
      if ((i1 != 0) && (this.m != null))
        this.m.g();
      if (paramPanelFeatureState.g != null)
        break label610;
      if ((paramPanelFeatureState.h != null) && (!paramPanelFeatureState.p))
        break label478;
      if (paramPanelFeatureState.h == null)
      {
        localContext = this.a;
        if (((paramPanelFeatureState.a != 0) && (paramPanelFeatureState.a != 8)) || (this.m == null))
          break label639;
        localTypedValue = new TypedValue();
        localTheme1 = localContext.getTheme();
        localTheme1.resolveAttribute(R.attr.actionBarTheme, localTypedValue, true);
        if (localTypedValue.resourceId == 0)
          break label455;
        localTheme2 = localContext.getResources().newTheme();
        localTheme2.setTo(localTheme1);
        localTheme2.applyStyle(localTypedValue.resourceId, true);
        localTheme2.resolveAttribute(R.attr.actionBarWidgetTheme, localTypedValue, true);
        if (localTypedValue.resourceId != 0)
        {
          if (localTheme2 == null)
          {
            localTheme2 = localContext.getResources().newTheme();
            localTheme2.setTo(localTheme1);
          }
          localTheme2.applyStyle(localTypedValue.resourceId, true);
        }
        Resources.Theme localTheme3 = localTheme2;
        if (localTheme3 == null)
          break label639;
        localObject = new android.support.v7.internal.view.a(localContext, 0);
        ((Context)localObject).getTheme().setTo(localTheme3);
      }
    }
    while (true)
    {
      i locali = new i((Context)localObject);
      locali.a(this);
      paramPanelFeatureState.a(locali);
      if (paramPanelFeatureState.h == null)
        break;
      if ((i1 != 0) && (this.m != null))
      {
        if (this.n == null)
          this.n = new v(this, 0);
        this.m.a(paramPanelFeatureState.h, this.n);
      }
      paramPanelFeatureState.h.g();
      if (!localCallback.onCreatePanelMenu(paramPanelFeatureState.a, paramPanelFeatureState.h))
      {
        paramPanelFeatureState.a(null);
        if ((i1 == 0) || (this.m == null))
          break;
        this.m.a(null, this.n);
        return false;
        i1 = 0;
        break label87;
        label455: localTheme1.resolveAttribute(R.attr.actionBarWidgetTheme, localTypedValue, true);
        localTheme2 = null;
        break label241;
      }
      paramPanelFeatureState.p = false;
      label478: paramPanelFeatureState.h.g();
      if (paramPanelFeatureState.q != null)
      {
        paramPanelFeatureState.h.b(paramPanelFeatureState.q);
        paramPanelFeatureState.q = null;
      }
      if (!localCallback.onPreparePanel(0, paramPanelFeatureState.g, paramPanelFeatureState.h))
      {
        if ((i1 != 0) && (this.m != null))
          this.m.a(null, this.n);
        paramPanelFeatureState.h.h();
        return false;
      }
      int i2;
      if (paramKeyEvent != null)
      {
        i2 = paramKeyEvent.getDeviceId();
        if (KeyCharacterMap.load(i2).getKeyboardType() == 1)
          break label633;
      }
      label610: label633: for (boolean bool = true; ; bool = false)
      {
        paramPanelFeatureState.n = bool;
        paramPanelFeatureState.h.setQwertyMode(paramPanelFeatureState.n);
        paramPanelFeatureState.h.h();
        paramPanelFeatureState.k = true;
        paramPanelFeatureState.l = false;
        this.w = paramPanelFeatureState;
        return true;
        i2 = -1;
        break;
      }
      label639: localObject = localContext;
    }
  }

  private AppCompatDelegateImplV7.PanelFeatureState d(int paramInt)
  {
    Object localObject1 = this.v;
    if ((localObject1 == null) || (localObject1.length <= paramInt))
    {
      AppCompatDelegateImplV7.PanelFeatureState[] arrayOfPanelFeatureState = new AppCompatDelegateImplV7.PanelFeatureState[paramInt + 1];
      if (localObject1 != null)
        System.arraycopy(localObject1, 0, arrayOfPanelFeatureState, 0, localObject1.length);
      this.v = arrayOfPanelFeatureState;
      localObject1 = arrayOfPanelFeatureState;
    }
    Object localObject2 = localObject1[paramInt];
    if (localObject2 == null)
    {
      AppCompatDelegateImplV7.PanelFeatureState localPanelFeatureState = new AppCompatDelegateImplV7.PanelFeatureState(paramInt);
      localObject1[paramInt] = localPanelFeatureState;
      return localPanelFeatureState;
    }
    return (AppCompatDelegateImplV7.PanelFeatureState)localObject2;
  }

  private void e(int paramInt)
  {
    this.y |= 1 << paramInt;
    if ((!this.x) && (this.q != null))
    {
      bg.a(this.q, this.z);
      this.x = true;
    }
  }

  private void p()
  {
    if (!this.p)
    {
      LayoutInflater localLayoutInflater = LayoutInflater.from(this.a);
      if (!this.h)
        if (this.g)
        {
          this.r = ((ViewGroup)localLayoutInflater.inflate(R.layout.abc_dialog_title_material, null));
          this.e = false;
          this.d = false;
        }
      while (this.r == null)
      {
        throw new IllegalArgumentException("AppCompat does not support the current theme features");
        if (!this.d)
          continue;
        TypedValue localTypedValue = new TypedValue();
        this.a.getTheme().resolveAttribute(R.attr.actionBarTheme, localTypedValue, true);
        if (localTypedValue.resourceId != 0);
        for (Object localObject = new android.support.v7.internal.view.a(this.a, localTypedValue.resourceId); ; localObject = this.a)
        {
          this.r = ((ViewGroup)LayoutInflater.from((Context)localObject).inflate(R.layout.abc_screen_toolbar, null));
          this.m = ((android.support.v7.internal.widget.z)this.r.findViewById(R.id.decor_content_parent));
          this.m.setWindowCallback(this.b.getCallback());
          if (!this.e)
            break;
          this.m.a(9);
          break;
        }
        if (this.f);
        for (this.r = ((ViewGroup)localLayoutInflater.inflate(R.layout.abc_screen_simple_overlay_action_mode, null)); ; this.r = ((ViewGroup)localLayoutInflater.inflate(R.layout.abc_screen_simple, null)))
        {
          if (Build.VERSION.SDK_INT < 21)
            break label279;
          bg.a(this.r, new s(this));
          break;
        }
        label279: ((ac)this.r).setOnFitSystemWindowsListener(new t(this));
      }
      if (this.m == null)
        this.s = ((TextView)this.r.findViewById(R.id.title));
      ba.b(this.r);
      ViewGroup localViewGroup = (ViewGroup)this.b.findViewById(16908290);
      ContentFrameLayout localContentFrameLayout = (ContentFrameLayout)this.r.findViewById(R.id.action_bar_activity_content);
      while (localViewGroup.getChildCount() > 0)
      {
        View localView = localViewGroup.getChildAt(0);
        localViewGroup.removeViewAt(0);
        localContentFrameLayout.addView(localView);
      }
      this.b.setContentView(this.r);
      localViewGroup.setId(-1);
      localContentFrameLayout.setId(16908290);
      if ((localViewGroup instanceof FrameLayout))
        ((FrameLayout)localViewGroup).setForeground(null);
      CharSequence localCharSequence = o();
      if (!TextUtils.isEmpty(localCharSequence))
        b(localCharSequence);
      localContentFrameLayout.a(this.q.getPaddingLeft(), this.q.getPaddingTop(), this.q.getPaddingRight(), this.q.getPaddingBottom());
      TypedArray localTypedArray = this.a.obtainStyledAttributes(R.styleable.Theme);
      localTypedArray.getValue(R.styleable.Theme_windowMinWidthMajor, localContentFrameLayout.getMinWidthMajor());
      localTypedArray.getValue(R.styleable.Theme_windowMinWidthMinor, localContentFrameLayout.getMinWidthMinor());
      if (localTypedArray.hasValue(R.styleable.Theme_windowFixedWidthMajor))
        localTypedArray.getValue(R.styleable.Theme_windowFixedWidthMajor, localContentFrameLayout.getFixedWidthMajor());
      if (localTypedArray.hasValue(R.styleable.Theme_windowFixedWidthMinor))
        localTypedArray.getValue(R.styleable.Theme_windowFixedWidthMinor, localContentFrameLayout.getFixedWidthMinor());
      if (localTypedArray.hasValue(R.styleable.Theme_windowFixedHeightMajor))
        localTypedArray.getValue(R.styleable.Theme_windowFixedHeightMajor, localContentFrameLayout.getFixedHeightMajor());
      if (localTypedArray.hasValue(R.styleable.Theme_windowFixedHeightMinor))
        localTypedArray.getValue(R.styleable.Theme_windowFixedHeightMinor, localContentFrameLayout.getFixedHeightMinor());
      localTypedArray.recycle();
      localContentFrameLayout.requestLayout();
      this.p = true;
      AppCompatDelegateImplV7.PanelFeatureState localPanelFeatureState = d(0);
      if ((!n()) && ((localPanelFeatureState == null) || (localPanelFeatureState.h == null)))
        e(8);
    }
  }

  final android.support.v7.b.a a(android.support.v7.b.b paramb)
  {
    if (this.i != null)
      this.i.c();
    w localw = new w(this, paramb);
    Object localObject;
    if (this.j == null)
    {
      if (!this.g)
        break label383;
      TypedValue localTypedValue = new TypedValue();
      Resources.Theme localTheme1 = this.a.getTheme();
      localTheme1.resolveAttribute(R.attr.actionBarTheme, localTypedValue, true);
      if (localTypedValue.resourceId != 0)
      {
        Resources.Theme localTheme2 = this.a.getResources().newTheme();
        localTheme2.setTo(localTheme1);
        localTheme2.applyStyle(localTypedValue.resourceId, true);
        localObject = new android.support.v7.internal.view.a(this.a, 0);
        ((Context)localObject).getTheme().setTo(localTheme2);
        this.j = new ActionBarContextView((Context)localObject);
        this.k = new PopupWindow((Context)localObject, null, R.attr.actionModePopupWindowStyle);
        this.k.setContentView(this.j);
        this.k.setWidth(-1);
        ((Context)localObject).getTheme().resolveAttribute(R.attr.actionBarSize, localTypedValue, true);
        int i1 = TypedValue.complexToDimensionPixelSize(localTypedValue.data, ((Context)localObject).getResources().getDisplayMetrics());
        this.j.setContentHeight(i1);
        this.k.setHeight(-2);
        this.l = new u(this);
      }
    }
    else
    {
      label242: if (this.j != null)
      {
        this.j.c();
        android.support.v7.internal.view.b localb = new android.support.v7.internal.view.b(this.j.getContext(), this.j, localw);
        if (!paramb.a(localb, localb.b()))
          break label430;
        localb.d();
        this.j.a(localb);
        this.j.setVisibility(0);
        this.i = localb;
        if (this.k != null)
          this.b.getDecorView().post(this.l);
        this.j.sendAccessibilityEvent(32);
        if (this.j.getParent() != null)
          bg.w((View)this.j.getParent());
      }
    }
    while (true)
    {
      return this.i;
      localObject = this.a;
      break;
      label383: ViewStubCompat localViewStubCompat = (ViewStubCompat)this.r.findViewById(R.id.action_mode_bar_stub);
      if (localViewStubCompat == null)
        break label242;
      localViewStubCompat.setLayoutInflater(LayoutInflater.from(m()));
      this.j = ((ActionBarContextView)localViewStubCompat.a());
      break label242;
      label430: this.i = null;
    }
  }

  public final View a(View paramView, String paramString, Context paramContext, AttributeSet paramAttributeSet)
  {
    View localView = b(paramView, paramString, paramContext, paramAttributeSet);
    if (localView != null)
      return localView;
    boolean bool1;
    if (Build.VERSION.SDK_INT < 21)
    {
      bool1 = true;
      if (this.D == null)
        this.D = new android.support.v7.internal.a.a();
      if ((!bool1) || (!this.p) || (paramView == null) || (paramView.getId() == 16908290) || (bg.C(paramView)))
        break label107;
    }
    label107: for (boolean bool2 = true; ; bool2 = false)
    {
      return this.D.a(paramView, paramString, paramContext, paramAttributeSet, bool2, bool1);
      bool1 = false;
      break;
    }
  }

  public final void a(int paramInt)
  {
    p();
    ViewGroup localViewGroup = (ViewGroup)this.r.findViewById(16908290);
    localViewGroup.removeAllViews();
    LayoutInflater.from(this.a).inflate(paramInt, localViewGroup);
    this.c.onContentChanged();
  }

  public final void a(Bundle paramBundle)
  {
    super.a(paramBundle);
    this.q = ((ViewGroup)this.b.getDecorView());
    ActionBar localActionBar;
    if (((this.c instanceof Activity)) && (ao.b((Activity)this.c) != null))
    {
      localActionBar = l();
      if (localActionBar == null)
        this.A = true;
    }
    else
    {
      return;
    }
    localActionBar.a(true);
  }

  public final void a(i parami)
  {
    if ((this.m != null) && (this.m.b()) && ((!bs.b(ViewConfiguration.get(this.a))) || (this.m.d())))
    {
      Window.Callback localCallback = this.b.getCallback();
      if (!this.m.c())
        if ((localCallback != null) && (!n()))
        {
          if ((this.x) && ((0x1 & this.y) != 0))
          {
            this.q.removeCallbacks(this.z);
            this.z.run();
          }
          AppCompatDelegateImplV7.PanelFeatureState localPanelFeatureState2 = d(0);
          if ((localPanelFeatureState2.h != null) && (!localPanelFeatureState2.p) && (localCallback.onPreparePanel(0, localPanelFeatureState2.g, localPanelFeatureState2.h)))
          {
            localCallback.onMenuOpened(8, localPanelFeatureState2.h);
            this.m.e();
          }
        }
      do
      {
        return;
        this.m.f();
      }
      while (n());
      localCallback.onPanelClosed(8, d(0).h);
      return;
    }
    AppCompatDelegateImplV7.PanelFeatureState localPanelFeatureState1 = d(0);
    localPanelFeatureState1.o = true;
    a(localPanelFeatureState1, false);
    a(localPanelFeatureState1, null);
  }

  public final void a(View paramView)
  {
    p();
    ViewGroup localViewGroup = (ViewGroup)this.r.findViewById(16908290);
    localViewGroup.removeAllViews();
    localViewGroup.addView(paramView);
    this.c.onContentChanged();
  }

  public final void a(View paramView, ViewGroup.LayoutParams paramLayoutParams)
  {
    p();
    ViewGroup localViewGroup = (ViewGroup)this.r.findViewById(16908290);
    localViewGroup.removeAllViews();
    localViewGroup.addView(paramView, paramLayoutParams);
    this.c.onContentChanged();
  }

  public final boolean a(i parami, MenuItem paramMenuItem)
  {
    Window.Callback localCallback = this.b.getCallback();
    if ((localCallback != null) && (!n()))
    {
      AppCompatDelegateImplV7.PanelFeatureState localPanelFeatureState = a(parami.o());
      if (localPanelFeatureState != null)
        return localCallback.onMenuItemSelected(localPanelFeatureState.a, paramMenuItem);
    }
    return false;
  }

  final boolean a(KeyEvent paramKeyEvent)
  {
    int i1 = paramKeyEvent.getKeyCode();
    int i2;
    if (paramKeyEvent.getAction() == 0)
      i2 = 1;
    while (true)
    {
      if (i2 == 0)
        break label89;
      switch (i1)
      {
      default:
        if (Build.VERSION.SDK_INT < 11)
        {
          return b(paramKeyEvent);
          i2 = 0;
        }
        break;
      case 82:
        if (paramKeyEvent.getRepeatCount() == 0)
        {
          AppCompatDelegateImplV7.PanelFeatureState localPanelFeatureState3 = d(0);
          if (!localPanelFeatureState3.m)
            b(localPanelFeatureState3, paramKeyEvent);
        }
        return true;
      }
    }
    return false;
    label89: AppCompatDelegateImplV7.PanelFeatureState localPanelFeatureState2;
    boolean bool1;
    switch (i1)
    {
    default:
      return false;
    case 82:
      if (this.i == null)
      {
        localPanelFeatureState2 = d(0);
        if ((this.m == null) || (!this.m.b()) || (bs.b(ViewConfiguration.get(this.a))))
          break label251;
        if (this.m.c())
          break label237;
        if ((n()) || (!b(localPanelFeatureState2, paramKeyEvent)))
          break;
        bool1 = this.m.e();
      }
      while (true)
      {
        label204: if (bool1)
        {
          AudioManager localAudioManager = (AudioManager)this.a.getSystemService("audio");
          if (localAudioManager != null)
            localAudioManager.playSoundEffect(0);
        }
        return true;
        label237: bool1 = this.m.f();
        continue;
        label251: if ((!localPanelFeatureState2.m) && (!localPanelFeatureState2.l))
          break;
        bool1 = localPanelFeatureState2.m;
        a(localPanelFeatureState2, true);
      }
      if (!localPanelFeatureState2.k)
        break;
      if (localPanelFeatureState2.p)
        localPanelFeatureState2.k = false;
    case 4:
    }
    for (boolean bool2 = b(localPanelFeatureState2, paramKeyEvent); ; bool2 = true)
    {
      if (bool2)
      {
        a(localPanelFeatureState2, paramKeyEvent);
        bool1 = true;
        break label204;
        AppCompatDelegateImplV7.PanelFeatureState localPanelFeatureState1 = d(0);
        if ((localPanelFeatureState1 != null) && (localPanelFeatureState1.m))
        {
          a(localPanelFeatureState1, true);
          return true;
        }
        int i3;
        if (this.i != null)
        {
          this.i.c();
          i3 = 1;
        }
        while (i3 != 0)
        {
          return true;
          ActionBar localActionBar = a();
          if ((localActionBar != null) && (localActionBar.d()))
          {
            i3 = 1;
            continue;
          }
          i3 = 0;
        }
        break;
      }
      bool1 = false;
      break label204;
    }
  }

  View b(View paramView, String paramString, Context paramContext, AttributeSet paramAttributeSet)
  {
    if ((this.c instanceof LayoutInflater.Factory))
    {
      View localView = ((LayoutInflater.Factory)this.c).onCreateView(paramString, paramContext, paramAttributeSet);
      if (localView != null)
        return localView;
    }
    return null;
  }

  public final void b(View paramView, ViewGroup.LayoutParams paramLayoutParams)
  {
    p();
    ((ViewGroup)this.r.findViewById(16908290)).addView(paramView, paramLayoutParams);
    this.c.onContentChanged();
  }

  final void b(CharSequence paramCharSequence)
  {
    if (this.m != null)
      this.m.setWindowTitle(paramCharSequence);
    do
    {
      return;
      if (l() == null)
        continue;
      l().a(paramCharSequence);
      return;
    }
    while (this.s == null);
    this.s.setText(paramCharSequence);
  }

  final boolean b(int paramInt)
  {
    int i1;
    if (paramInt == 8)
    {
      ActionBar localActionBar = a();
      if (localActionBar != null)
        localActionBar.c(false);
      i1 = 1;
    }
    AppCompatDelegateImplV7.PanelFeatureState localPanelFeatureState;
    boolean bool;
    do
    {
      do
      {
        return i1;
        i1 = 0;
      }
      while (paramInt != 0);
      localPanelFeatureState = d(paramInt);
      bool = localPanelFeatureState.m;
      i1 = 0;
    }
    while (!bool);
    a(localPanelFeatureState, false);
    return false;
  }

  final boolean b(KeyEvent paramKeyEvent)
  {
    a();
    if ((this.w != null) && (a(this.w, paramKeyEvent.getKeyCode(), paramKeyEvent)))
      if (this.w != null)
        this.w.l = true;
    boolean bool;
    do
    {
      return true;
      if (this.w != null)
        break;
      AppCompatDelegateImplV7.PanelFeatureState localPanelFeatureState = d(0);
      b(localPanelFeatureState, paramKeyEvent);
      bool = a(localPanelFeatureState, paramKeyEvent.getKeyCode(), paramKeyEvent);
      localPanelFeatureState.k = false;
    }
    while (bool);
    return false;
  }

  public final void c()
  {
    p();
  }

  final boolean c(int paramInt)
  {
    if (paramInt == 8)
    {
      ActionBar localActionBar = a();
      if (localActionBar != null)
        localActionBar.c(true);
      return true;
    }
    return false;
  }

  public final void d()
  {
    if ((this.d) && (this.p))
    {
      ActionBar localActionBar = a();
      if (localActionBar != null)
        localActionBar.c();
    }
  }

  public final void e()
  {
    ActionBar localActionBar = a();
    if (localActionBar != null)
      localActionBar.b(false);
  }

  public final void f()
  {
    ActionBar localActionBar = a();
    if (localActionBar != null)
      localActionBar.b(true);
  }

  public final void g()
  {
    a();
    e(0);
  }

  public final boolean i()
  {
    if (this.p)
      throw new AndroidRuntimeException("Window feature must be requested before adding content");
    this.h = true;
    return true;
  }

  public final void j()
  {
    LayoutInflater localLayoutInflater = LayoutInflater.from(this.a);
    if (localLayoutInflater.getFactory() == null)
      android.support.v4.view.u.a(localLayoutInflater, this);
  }

  public final ActionBar k()
  {
    p();
    android.support.v7.internal.a.b localb;
    if ((this.c instanceof Activity))
      localb = new android.support.v7.internal.a.b((Activity)this.c, this.e);
    while (true)
    {
      if (localb != null)
        localb.a(this.A);
      return localb;
      boolean bool = this.c instanceof Dialog;
      localb = null;
      if (!bool)
        continue;
      localb = new android.support.v7.internal.a.b((Dialog)this.c);
    }
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     android.support.v7.app.AppCompatDelegateImplV7
 * JD-Core Version:    0.6.0
 */