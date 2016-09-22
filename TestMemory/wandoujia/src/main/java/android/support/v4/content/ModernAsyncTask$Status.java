package android.support.v4.content;

public enum ModernAsyncTask$Status
{
  static
  {
    FINISHED = new Status("FINISHED", 2);
    Status[] arrayOfStatus = new Status[3];
    arrayOfStatus[0] = PENDING;
    arrayOfStatus[1] = RUNNING;
    arrayOfStatus[2] = FINISHED;
    $VALUES = arrayOfStatus;
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     android.support.v4.content.ModernAsyncTask.Status
 * JD-Core Version:    0.6.0
 */