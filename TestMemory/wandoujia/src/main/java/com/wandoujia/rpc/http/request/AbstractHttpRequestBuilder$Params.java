package com.wandoujia.rpc.http.request;

import android.text.TextUtils;
import com.wandoujia.base.utils.StringUtil;
import java.io.Serializable;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public final class AbstractHttpRequestBuilder$Params
  implements Serializable
{
  private static final long serialVersionUID = -3710306448939240660L;
  private final Map<String, AbstractHttpRequestBuilder.Value> params = new HashMap();

  public final void clear()
  {
    this.params.clear();
  }

  public final Set<Map.Entry<String, AbstractHttpRequestBuilder.Value>> entrySet()
  {
    return this.params.entrySet();
  }

  public final AbstractHttpRequestBuilder.Value get(String paramString)
  {
    return (AbstractHttpRequestBuilder.Value)this.params.get(paramString);
  }

  public final Map<String, String> getParamMap()
  {
    HashMap localHashMap = new HashMap();
    Iterator localIterator = this.params.entrySet().iterator();
    while (localIterator.hasNext())
    {
      Map.Entry localEntry = (Map.Entry)localIterator.next();
      localHashMap.put(localEntry.getKey(), ((AbstractHttpRequestBuilder.Value)localEntry.getValue()).value);
    }
    return localHashMap;
  }

  public final void put(String paramString1, String paramString2)
  {
    this.params.put(paramString1, new AbstractHttpRequestBuilder.Value(true, paramString2));
  }

  public final void put(String paramString1, String paramString2, boolean paramBoolean)
  {
    this.params.put(paramString1, new AbstractHttpRequestBuilder.Value(paramBoolean, paramString2));
  }

  public final void putAll(Params paramParams)
  {
    this.params.putAll(paramParams.params);
  }

  public final void putAll(Map<String, String> paramMap)
  {
    Iterator localIterator = paramMap.entrySet().iterator();
    while (localIterator.hasNext())
    {
      Map.Entry localEntry = (Map.Entry)localIterator.next();
      this.params.put(localEntry.getKey(), new AbstractHttpRequestBuilder.Value(true, (String)localEntry.getValue()));
    }
  }

  public final String toString()
  {
    ArrayList localArrayList = new ArrayList();
    Iterator localIterator = this.params.entrySet().iterator();
    while (localIterator.hasNext())
    {
      Map.Entry localEntry = (Map.Entry)localIterator.next();
      if ((localEntry.getValue() == null) || (TextUtils.isEmpty(((AbstractHttpRequestBuilder.Value)localEntry.getValue()).value)) || (TextUtils.isEmpty((CharSequence)localEntry.getKey())))
        continue;
      try
      {
        localArrayList.add(String.format("%s=%s", new Object[] { URLEncoder.encode((String)localEntry.getKey(), "UTF-8"), URLEncoder.encode(((AbstractHttpRequestBuilder.Value)localEntry.getValue()).value, "UTF-8") }));
      }
      catch (UnsupportedEncodingException localUnsupportedEncodingException)
      {
      }
    }
    return StringUtil.join(localArrayList, "&");
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou2.jar
 * Qualified Name:     com.wandoujia.rpc.http.request.AbstractHttpRequestBuilder.Params
 * JD-Core Version:    0.6.0
 */