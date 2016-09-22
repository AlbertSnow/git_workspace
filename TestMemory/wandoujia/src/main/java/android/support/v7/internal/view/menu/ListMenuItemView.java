package android.support.v7.internal.view.menu;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.support.v7.appcompat.R.id;
import android.support.v7.appcompat.R.layout;
import android.support.v7.appcompat.R.styleable;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.ViewGroup.LayoutParams;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.LinearLayout.LayoutParams;
import android.widget.RadioButton;
import android.widget.TextView;

public class ListMenuItemView extends LinearLayout
  implements aa
{
  private m a;
  private ImageView b;
  private RadioButton c;
  private TextView d;
  private CheckBox e;
  private TextView f;
  private Drawable g;
  private int h;
  private Context i;
  private boolean j;
  private Context k;
  private LayoutInflater l;
  private boolean m;

  public ListMenuItemView(Context paramContext, AttributeSet paramAttributeSet)
  {
    this(paramContext, paramAttributeSet, 0);
  }

  public ListMenuItemView(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet);
    this.k = paramContext;
    TypedArray localTypedArray = paramContext.obtainStyledAttributes(paramAttributeSet, R.styleable.MenuView, paramInt, 0);
    this.g = localTypedArray.getDrawable(R.styleable.MenuView_android_itemBackground);
    this.h = localTypedArray.getResourceId(R.styleable.MenuView_android_itemTextAppearance, -1);
    this.j = localTypedArray.getBoolean(R.styleable.MenuView_preserveIconSpacing, false);
    this.i = paramContext;
    localTypedArray.recycle();
  }

  private void b()
  {
    this.c = ((RadioButton)getInflater().inflate(R.layout.abc_list_menu_item_radio, this, false));
    addView(this.c);
  }

  private void c()
  {
    this.e = ((CheckBox)getInflater().inflate(R.layout.abc_list_menu_item_checkbox, this, false));
    addView(this.e);
  }

  private LayoutInflater getInflater()
  {
    if (this.l == null)
      this.l = LayoutInflater.from(this.k);
    return this.l;
  }

  private void setShortcut$25d965e(boolean paramBoolean)
  {
    if ((paramBoolean) && (this.a.e()));
    char c1;
    String str;
    for (int n = 0; ; n = 8)
    {
      if (n == 0)
      {
        TextView localTextView = this.f;
        c1 = this.a.d();
        if (c1 != 0)
          break;
        str = "";
        localTextView.setText(str);
      }
      if (this.f.getVisibility() != n)
        this.f.setVisibility(n);
      return;
    }
    StringBuilder localStringBuilder = new StringBuilder(null);
    switch (c1)
    {
    default:
      localStringBuilder.append(c1);
    case '\n':
    case '\b':
    case ' ':
    }
    while (true)
    {
      str = localStringBuilder.toString();
      break;
      localStringBuilder.append(null);
      continue;
      localStringBuilder.append(null);
      continue;
      localStringBuilder.append(null);
    }
  }

  public final void a(m paramm)
  {
    this.a = paramm;
    int n;
    int i1;
    if (paramm.isVisible())
    {
      n = 0;
      setVisibility(n);
      setTitle(paramm.a(this));
      setCheckable(paramm.isCheckable());
      boolean bool1 = paramm.e();
      paramm.d();
      if (!bool1)
        break label147;
      boolean bool2 = this.a.e();
      i1 = 0;
      if (!bool2)
        break label147;
    }
    char c1;
    String str;
    while (true)
    {
      if (i1 == 0)
      {
        TextView localTextView = this.f;
        c1 = this.a.d();
        if (c1 != 0)
          break label154;
        str = "";
        localTextView.setText(str);
      }
      if (this.f.getVisibility() != i1)
        this.f.setVisibility(i1);
      setIcon(paramm.getIcon());
      setEnabled(paramm.isEnabled());
      return;
      n = 8;
      break;
      label147: i1 = 8;
    }
    label154: StringBuilder localStringBuilder = new StringBuilder(null);
    switch (c1)
    {
    default:
      localStringBuilder.append(c1);
    case '\n':
    case '\b':
    case ' ':
    }
    while (true)
    {
      str = localStringBuilder.toString();
      break;
      localStringBuilder.append(null);
      continue;
      localStringBuilder.append(null);
      continue;
      localStringBuilder.append(null);
    }
  }

  public final boolean a()
  {
    return false;
  }

  public m getItemData()
  {
    return this.a;
  }

  protected void onFinishInflate()
  {
    super.onFinishInflate();
    setBackgroundDrawable(this.g);
    this.d = ((TextView)findViewById(R.id.title));
    if (this.h != -1)
      this.d.setTextAppearance(this.i, this.h);
    this.f = ((TextView)findViewById(R.id.shortcut));
  }

  protected void onMeasure(int paramInt1, int paramInt2)
  {
    if ((this.b != null) && (this.j))
    {
      ViewGroup.LayoutParams localLayoutParams = getLayoutParams();
      LinearLayout.LayoutParams localLayoutParams1 = (LinearLayout.LayoutParams)this.b.getLayoutParams();
      if ((localLayoutParams.height > 0) && (localLayoutParams1.width <= 0))
        localLayoutParams1.width = localLayoutParams.height;
    }
    super.onMeasure(paramInt1, paramInt2);
  }

  public void setCheckable(boolean paramBoolean)
  {
    if ((!paramBoolean) && (this.c == null) && (this.e == null));
    label60: 
    do
    {
      return;
      Object localObject1;
      Object localObject2;
      if (this.a.f())
      {
        if (this.c == null)
          b();
        RadioButton localRadioButton2 = this.c;
        CheckBox localCheckBox2 = this.e;
        localObject1 = localRadioButton2;
        localObject2 = localCheckBox2;
        if (!paramBoolean)
          break label160;
        ((CompoundButton)localObject1).setChecked(this.a.isChecked());
        if (!paramBoolean)
          break label153;
      }
      for (int n = 0; ; n = 8)
      {
        if (((CompoundButton)localObject1).getVisibility() != n)
          ((CompoundButton)localObject1).setVisibility(n);
        if ((localObject2 == null) || (((CompoundButton)localObject2).getVisibility() == 8))
          break;
        ((CompoundButton)localObject2).setVisibility(8);
        return;
        if (this.e == null)
          c();
        CheckBox localCheckBox1 = this.e;
        RadioButton localRadioButton1 = this.c;
        localObject1 = localCheckBox1;
        localObject2 = localRadioButton1;
        break label60;
      }
      if (this.e == null)
        continue;
      this.e.setVisibility(8);
    }
    while (this.c == null);
    label153: label160: this.c.setVisibility(8);
  }

  public void setChecked(boolean paramBoolean)
  {
    if (this.a.f())
      if (this.c == null)
        b();
    for (Object localObject = this.c; ; localObject = this.e)
    {
      ((CompoundButton)localObject).setChecked(paramBoolean);
      return;
      if (this.e != null)
        continue;
      c();
    }
  }

  public void setForceShowIcon(boolean paramBoolean)
  {
    this.m = paramBoolean;
    this.j = paramBoolean;
  }

  public void setIcon(Drawable paramDrawable)
  {
    int n;
    if (this.m)
    {
      n = 1;
      if ((n != 0) || (this.j))
        break label26;
    }
    label26: 
    do
    {
      return;
      n = 0;
      break;
    }
    while ((this.b == null) && (paramDrawable == null) && (!this.j));
    if (this.b == null)
    {
      this.b = ((ImageView)getInflater().inflate(R.layout.abc_list_menu_item_icon, this, false));
      addView(this.b, 0);
    }
    if ((paramDrawable != null) || (this.j))
    {
      ImageView localImageView = this.b;
      if (n != 0);
      while (true)
      {
        localImageView.setImageDrawable(paramDrawable);
        if (this.b.getVisibility() == 0)
          break;
        this.b.setVisibility(0);
        return;
        paramDrawable = null;
      }
    }
    this.b.setVisibility(8);
  }

  public void setTitle(CharSequence paramCharSequence)
  {
    if (paramCharSequence != null)
    {
      this.d.setText(paramCharSequence);
      if (this.d.getVisibility() != 0)
        this.d.setVisibility(0);
    }
    do
      return;
    while (this.d.getVisibility() == 8);
    this.d.setVisibility(8);
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     android.support.v7.internal.view.menu.ListMenuItemView
 * JD-Core Version:    0.6.0
 */