package com.corndel.cashregister;

import com.corndel.cashregister.models.Item;
import java.util.List;

public class Level3 {
  public static int sumDrawer(List<Item> drawer) {
    int total = 0;

    for (var item : drawer) {
      total += item.quantity * item.value;
    }

    return total;
  }
}
