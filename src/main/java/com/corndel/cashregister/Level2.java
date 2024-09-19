package com.corndel.cashregister;

import com.corndel.cashregister.models.Item;
import java.util.List;

public class Level2 {
  public static int countCoins(List<Item> drawer) {
    var count = 0;

    for (var item : drawer) {
      count += item.value < 100 ? item.quantity : 0;
    }

    return count;
  }

  /**
   * Same as count coins but for *notes* instead
   */
  public static int countNotes(List<Item> drawer) {
    var count = 0;

    for (var item : drawer) {
      count += item.value < 100 ? 0 : item.quantity;
    }

    return count;
  }
}
