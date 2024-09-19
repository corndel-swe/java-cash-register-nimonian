package com.corndel.cashregister;

import com.corndel.cashregister.models.Item;
import java.util.List;

public class Level4 {
  public static boolean canMakeAmount(int target, List<Item> drawer) {
    var drawerCopy = List.copyOf(drawer);

    for (var item : drawerCopy) {
      while (item.quantity > 0 && target >= item.value) {
        target -= item.value;
        item.quantity -= 1;
      }
    }

    return target == 0;
  }
}
