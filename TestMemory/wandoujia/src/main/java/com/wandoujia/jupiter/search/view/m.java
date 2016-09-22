package com.wandoujia.jupiter.search.view;

import android.widget.Filter;
import android.widget.Filter.FilterResults;
import com.wandoujia.jupiter.search.model.a;

final class m extends Filter
{
  m(l paraml)
  {
  }

  public final CharSequence convertResultToString(Object paramObject)
  {
    if ((paramObject instanceof a))
      return ((a)paramObject).a();
    return super.convertResultToString(paramObject);
  }

  protected final Filter.FilterResults performFiltering(CharSequence paramCharSequence)
  {
    Filter.FilterResults localFilterResults = new Filter.FilterResults();
    localFilterResults.values = l.a(this.a);
    localFilterResults.count = this.a.getCount();
    return localFilterResults;
  }

  protected final void publishResults(CharSequence paramCharSequence, Filter.FilterResults paramFilterResults)
  {
    if ((paramFilterResults == null) || (paramFilterResults.count <= 0))
    {
      this.a.notifyDataSetInvalidated();
      return;
    }
    this.a.notifyDataSetChanged();
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.jupiter.search.view.m
 * JD-Core Version:    0.6.0
 */