package com.wandoujia.logv3.model.packages;

import com.squareup.wire.ProtoEnum;

public enum ViewLogPackage$Element
  implements ProtoEnum
{
  private final int value;

  static
  {
    INPUT_BOX = new Element("INPUT_BOX", 2, 3);
    TEXT_LINK = new Element("TEXT_LINK", 3, 4);
    CARD = new Element("CARD", 4, 5);
    SPINNER = new Element("SPINNER", 5, 6);
    MENU_ITEM = new Element("MENU_ITEM", 6, 7);
    LIST_ITEM = new Element("LIST_ITEM", 7, 8);
    LABEL = new Element("LABEL", 8, 9);
    PROGRESS = new Element("PROGRESS", 9, 10);
    BACK = new Element("BACK", 10, 11);
    HEADER = new Element("HEADER", 11, 12);
    SUB_ACTION = new Element("SUB_ACTION", 12, 13);
    POPUP_BUTTON = new Element("POPUP_BUTTON", 13, 14);
    PAGE = new Element("PAGE", 14, 15);
    ICON = new Element("ICON", 15, 16);
    SLIDE = new Element("SLIDE", 16, 17);
    PICTURE = new Element("PICTURE", 17, 18);
    SUB_TAB = new Element("SUB_TAB", 18, 19);
    FOOTER = new Element("FOOTER", 19, 20);
    COVER = new Element("COVER", 20, 21);
    NOTIFICATION = new Element("NOTIFICATION", 21, 22);
    Element[] arrayOfElement = new Element[22];
    arrayOfElement[0] = BUTTON;
    arrayOfElement[1] = TAB;
    arrayOfElement[2] = INPUT_BOX;
    arrayOfElement[3] = TEXT_LINK;
    arrayOfElement[4] = CARD;
    arrayOfElement[5] = SPINNER;
    arrayOfElement[6] = MENU_ITEM;
    arrayOfElement[7] = LIST_ITEM;
    arrayOfElement[8] = LABEL;
    arrayOfElement[9] = PROGRESS;
    arrayOfElement[10] = BACK;
    arrayOfElement[11] = HEADER;
    arrayOfElement[12] = SUB_ACTION;
    arrayOfElement[13] = POPUP_BUTTON;
    arrayOfElement[14] = PAGE;
    arrayOfElement[15] = ICON;
    arrayOfElement[16] = SLIDE;
    arrayOfElement[17] = PICTURE;
    arrayOfElement[18] = SUB_TAB;
    arrayOfElement[19] = FOOTER;
    arrayOfElement[20] = COVER;
    arrayOfElement[21] = NOTIFICATION;
    $VALUES = arrayOfElement;
  }

  private ViewLogPackage$Element(int paramInt)
  {
    this.value = paramInt;
  }

  public final int getValue()
  {
    return this.value;
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.logv3.model.packages.ViewLogPackage.Element
 * JD-Core Version:    0.6.0
 */