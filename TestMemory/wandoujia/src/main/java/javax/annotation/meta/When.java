package javax.annotation.meta;

public enum When
{
  static
  {
    MAYBE = new When("MAYBE", 2);
    NEVER = new When("NEVER", 3);
    When[] arrayOfWhen = new When[4];
    arrayOfWhen[0] = ALWAYS;
    arrayOfWhen[1] = UNKNOWN;
    arrayOfWhen[2] = MAYBE;
    arrayOfWhen[3] = NEVER;
    $VALUES = arrayOfWhen;
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou2.jar
 * Qualified Name:     javax.annotation.meta.When
 * JD-Core Version:    0.6.0
 */