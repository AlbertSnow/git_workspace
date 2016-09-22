package com.sina.weibo.sdk.api.share.ui;

import android.content.Context;
import android.support.v7.app.f;
import android.text.Editable;
import android.text.style.ImageSpan;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.widget.EditText;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class EditBlogView extends EditText
{
  private List<f> a;
  private boolean b = true;

  public EditBlogView(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
    a();
  }

  public EditBlogView(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet, paramInt);
    a();
  }

  private void a()
  {
    getContext();
    this.a = new ArrayList();
  }

  public final int a(int paramInt)
  {
    if (paramInt == -1);
    Editable localEditable;
    Object[] arrayOfObject;
    do
    {
      do
      {
        return paramInt;
        localEditable = getText();
      }
      while (paramInt >= localEditable.length());
      arrayOfObject = localEditable.getSpans(paramInt, paramInt, ImageSpan.class);
    }
    while ((arrayOfObject == null) || (arrayOfObject.length == 0) || (paramInt == localEditable.getSpanStart(arrayOfObject[0])));
    return localEditable.getSpanEnd(arrayOfObject[0]);
  }

  public InputConnection onCreateInputConnection(EditorInfo paramEditorInfo)
  {
    return new a(this, super.onCreateInputConnection(paramEditorInfo));
  }

  public boolean onKeyDown(int paramInt, KeyEvent paramKeyEvent)
  {
    return super.onKeyDown(paramInt, paramKeyEvent);
  }

  protected void onSelectionChanged(int paramInt1, int paramInt2)
  {
    super.onSelectionChanged(paramInt1, paramInt2);
    if ((!this.b) || (this.a == null) || (this.a.isEmpty()));
    while (true)
    {
      return;
      Iterator localIterator = this.a.iterator();
      while (localIterator.hasNext())
        localIterator.next();
    }
  }

  public void setOnEnterListener$73709a8(f paramf)
  {
  }

  public void setOnSelectionListener$11e5c074(f paramf)
  {
    this.a.add(paramf);
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.sina.weibo.sdk.api.share.ui.EditBlogView
 * JD-Core Version:    0.6.0
 */