package com.wandoujia.jupiter.search.view;

import android.content.Context;
import android.graphics.drawable.BitmapDrawable;
import android.text.Selection;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.widget.AutoCompleteTextView;
import android.widget.ListPopupWindow;
import android.widget.PopupWindow;
import com.wandoujia.base.reflect.JavaCalls;
import com.wandoujia.base.utils.SystemUtil;
import com.wandoujia.base.utils.TextUtil;
import com.wandoujia.jupiter.search.model.SearchTypeForHint;

public class SearchSuggestionTextView extends AutoCompleteTextView
{
  private l a;
  private j b;
  private boolean c = true;
  private String d;
  private a e;
  private com.wandoujia.jupiter.search.d.a f;

  public SearchSuggestionTextView(Context paramContext)
  {
    this(paramContext, null);
  }

  public SearchSuggestionTextView(Context paramContext, AttributeSet paramAttributeSet)
  {
    this(paramContext, paramAttributeSet, 0);
  }

  public SearchSuggestionTextView(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet, paramInt);
    setDropDownBackgroundDrawable(new BitmapDrawable());
    addTextChangedListener(new e(this));
    this.e = new a(getContext(), this, false);
    if (SystemUtil.aboveApiLevel(17))
      setOnDismissListener(new f(this));
    Object localObject;
    g localg;
    do
    {
      do
      {
        return;
        localObject = JavaCalls.getField(this, "mPopup");
      }
      while (localObject == null);
      localg = new g(this);
      if ((!SystemUtil.aboveApiLevel(11)) || (!(localObject instanceof ListPopupWindow)))
        continue;
      ((ListPopupWindow)localObject).setOnDismissListener(localg);
      return;
    }
    while (!(localObject instanceof PopupWindow));
    ((PopupWindow)localObject).setOnDismissListener(localg);
  }

  public final void a(String paramString)
  {
    this.c = false;
    setText(TextUtil.fromHtml(paramString));
    Selection.setSelection(getText(), getText().toString().length());
  }

  public final boolean a()
  {
    return this.e.a();
  }

  public String getSuggestionKeyword()
  {
    return this.d;
  }

  protected void onDetachedFromWindow()
  {
    super.onDetachedFromWindow();
    if (this.e != null)
    {
      this.e.c();
      this.e = null;
    }
    if ((this.f != null) && (!this.f.g()))
      this.f.f();
  }

  public boolean onKeyDown(int paramInt, KeyEvent paramKeyEvent)
  {
    if ((paramInt == 84) || (paramInt == 66))
    {
      dismissDropDown();
      if (this.b != null)
      {
        if ((!TextUtils.isEmpty(getText().toString())) || (!this.e.a()))
          break label75;
        this.b.a(getHint().toString());
      }
    }
    try
    {
      while (true)
      {
        boolean bool = super.onKeyDown(paramInt, paramKeyEvent);
        return bool;
        label75: this.b.a(getText().toString());
      }
    }
    catch (Exception localException)
    {
    }
    return true;
  }

  public void setHintType(SearchTypeForHint paramSearchTypeForHint)
  {
    this.e.a(paramSearchTypeForHint);
  }

  public void setOnSearchListener(j paramj)
  {
    this.b = paramj;
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.jupiter.search.view.SearchSuggestionTextView
 * JD-Core Version:    0.6.0
 */