package com.wandoujia.nirvana.framework.network.page;

public enum PageList$PageStatus
{
  static
  {
    HIT_CACHE_SUCCESS = new PageStatus("HIT_CACHE_SUCCESS", 2);
    HIT_CACHE_INTERMEDIATE = new PageStatus("HIT_CACHE_INTERMEDIATE", 3);
    HIT_CACHE_AND_LOAD_SUCCESS = new PageStatus("HIT_CACHE_AND_LOAD_SUCCESS", 4);
    HIT_CACHE_AND_LOAD_FAILED = new PageStatus("HIT_CACHE_AND_LOAD_FAILED", 5);
    MISS_CACHE_AND_LOAD_SUCCESS = new PageStatus("MISS_CACHE_AND_LOAD_SUCCESS", 6);
    MISS_CACHE_AND_LOAD_FAILED = new PageStatus("MISS_CACHE_AND_LOAD_FAILED", 7);
    PageStatus[] arrayOfPageStatus = new PageStatus[8];
    arrayOfPageStatus[0] = NOT_READY;
    arrayOfPageStatus[1] = ONGOING;
    arrayOfPageStatus[2] = HIT_CACHE_SUCCESS;
    arrayOfPageStatus[3] = HIT_CACHE_INTERMEDIATE;
    arrayOfPageStatus[4] = HIT_CACHE_AND_LOAD_SUCCESS;
    arrayOfPageStatus[5] = HIT_CACHE_AND_LOAD_FAILED;
    arrayOfPageStatus[6] = MISS_CACHE_AND_LOAD_SUCCESS;
    arrayOfPageStatus[7] = MISS_CACHE_AND_LOAD_FAILED;
    $VALUES = arrayOfPageStatus;
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.nirvana.framework.network.page.PageList.PageStatus
 * JD-Core Version:    0.6.0
 */