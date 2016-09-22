package com.wandoujia.p4.pay.loader;

public class Fetcher
{
  private static final int DEFAULT_FIRST_SIZE = 40;
  private static final int DEFAULT_PAGE_SIZE = 20;
  private int curSize;
  private final int firstSize;
  private Fetcher.FetchCallback mFetchCallback;
  private final int pageSize;

  public Fetcher(int paramInt1, int paramInt2, Fetcher.FetchCallback paramFetchCallback)
  {
    this.firstSize = paramInt1;
    this.pageSize = paramInt2;
    this.mFetchCallback = paramFetchCallback;
  }

  public Fetcher(Fetcher.FetchCallback paramFetchCallback)
  {
    this(40, 20, paramFetchCallback);
  }

  public void fetch()
  {
    if (this.curSize != 0);
    for (int i = this.curSize; ; i = this.firstSize)
    {
      Fetcher.GetDataTask localGetDataTask = new Fetcher.GetDataTask(this);
      Integer[] arrayOfInteger = new Integer[2];
      arrayOfInteger[0] = Integer.valueOf(0);
      arrayOfInteger[1] = Integer.valueOf(i);
      localGetDataTask.execute(arrayOfInteger);
      return;
    }
  }

  public void fetchMore()
  {
    if (this.curSize == 0);
    for (int i = this.firstSize; ; i = this.pageSize)
    {
      Fetcher.GetDataTask localGetDataTask = new Fetcher.GetDataTask(this);
      Integer[] arrayOfInteger = new Integer[2];
      arrayOfInteger[0] = Integer.valueOf(this.curSize);
      arrayOfInteger[1] = Integer.valueOf(i);
      localGetDataTask.execute(arrayOfInteger);
      return;
    }
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.p4.pay.loader.Fetcher
 * JD-Core Version:    0.6.0
 */