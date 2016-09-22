package de.greenrobot.event;

public enum ThreadMode
{
  static
  {
    MainThread = new ThreadMode("MainThread", 1);
    BackgroundThread = new ThreadMode("BackgroundThread", 2);
    Async = new ThreadMode("Async", 3);
    ThreadMode[] arrayOfThreadMode = new ThreadMode[4];
    arrayOfThreadMode[0] = PostThread;
    arrayOfThreadMode[1] = MainThread;
    arrayOfThreadMode[2] = BackgroundThread;
    arrayOfThreadMode[3] = Async;
    $VALUES = arrayOfThreadMode;
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou2.jar
 * Qualified Name:     de.greenrobot.event.ThreadMode
 * JD-Core Version:    0.6.0
 */