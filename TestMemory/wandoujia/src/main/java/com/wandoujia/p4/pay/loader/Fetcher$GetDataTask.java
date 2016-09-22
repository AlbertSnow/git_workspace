package com.wandoujia.p4.pay.loader;

import android.os.AsyncTask;

class Fetcher$GetDataTask extends AsyncTask<Integer, Void, String>
{
  private int mSize;
  private int mStart;

  Fetcher$GetDataTask(Fetcher paramFetcher)
  {
  }

  protected String doInBackground(Integer[] paramArrayOfInteger)
  {
    if (paramArrayOfInteger.length == 2)
    {
      this.mStart = paramArrayOfInteger[0].intValue();
      this.mSize = paramArrayOfInteger[1].intValue();
      String str = Fetcher.access$000(this.this$0).doFetch(this.mStart, this.mSize);
      int i = Fetcher.access$000(this.this$0).onFetched(str, this.mStart, this.mSize);
      if (i > 0)
        Fetcher.access$102(this.this$0, i + this.mStart);
      return str;
    }
    return null;
  }

  protected void onPostExecute(String paramString)
  {
    Fetcher.access$000(this.this$0).onPostFetch(paramString, this.mStart, this.mSize);
    super.onPostExecute(paramString);
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.p4.pay.loader.Fetcher.GetDataTask
 * JD-Core Version:    0.6.0
 */