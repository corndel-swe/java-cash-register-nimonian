package com.corndel.cashregister;

import com.corndel.cashregister.models.Item;
import java.util.List;

public class Level5 {
  public static List<Item> transaction(int cost, List<Item> paid, List<Item> drawer) {
    var paidTotal = Level3.sumDrawer(paid);

    var change = paidTotal - cost;

    if (change < 0) {
      return drawer;
    }

    for (var paidItem : paid) {
      while (paidItem.quantity > 0) {
        drawer = Level1.addItem(paidItem.name, drawer);
        paidItem.quantity -= 1;
      }
    }

    for (var drawerItem : drawer) {
      while (change >= drawerItem.value && drawerItem.quantity > 0) {
        change -= drawerItem.value;
        drawerItem.quantity -= 1;
      }
    }

    return drawer;
  }

}
