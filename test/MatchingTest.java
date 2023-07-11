




import org.junit.jupiter.api.Test;

import java.time.LocalDateTime;
import java.util.*;

public class MatchingTest {

    @Test

    public void testThatOrderCanMatchRequest(){
        List<Order> orderList  = new ArrayList<>();
        Destination destination = new Destination();
        destination.setReceiverName("Joshua");
        destination.setReceiverLocation(new Address("Yaba", "Herbert Macaulay"));
        PickUp pickUp = new PickUp(new Address("Ikeja", "Computer Village"), "Samuel", "09051243133");
        //given that
        Order order = new Order("Clothing", destination, pickUp, LocalDateTime.now().plusHours(9000L));

        RequestItem requestItem = new RequestItem(new Address("Magodo", "Shangisha"),
                new Address("Lekki", "Phase One"), "09051243133");


        if (order.getDestination().getReceiverLocation().getCity().
                equals(requestItem.getDestination().getCity())  && order.getPickUp().getCurrentLocation().getCity().
                equals(requestItem.getCurrentLocation().getCity())) orderList.add(order);

        System.out.println(orderList.size());
    }
    @Test
    public void testThatSizeEquals1(){
        List<Order> orderList  = new ArrayList<>();
        Destination destination = new Destination();
        destination.setReceiverName("Joshua");
        destination.setReceiverLocation(new Address("Yaba", "Herbert Macaulay"));
        PickUp pickUp = new PickUp(new Address("Ikeja", "Computer Village"), "Samuel", "09051243133");
        //given that
        Order order = new Order("Clothing", destination, pickUp, LocalDateTime.now().plusHours(38389L));

        RequestItem requestItem = new RequestItem(new Address("Yaba", "Herbet Macaulay"),
                new Address("Ikeja", "Computer Village"), "09051243133");


        if (order.getDestination().getReceiverLocation().getCity().
                equals(requestItem.getDestination().getCity())  && order.getPickUp().getCurrentLocation().getCity().
                equals(requestItem.getCurrentLocation().getCity())) orderList.add(order);

        System.out.println(orderList.size());
        System.out.println(orderList);
    }
    @Test
    public void testThatRequestHas2OrderMatches(){
        List<Order> orderList  = new ArrayList<>();
        List<Order> unPairedOrders  = new ArrayList<>();
        Destination destination = new Destination();
        destination.setReceiverName("Joshua");
        destination.setReceiverLocation(new Address("Yaba", "Herbert Macaulay"));
        PickUp pickUp = new PickUp(new Address("Ikeja", "Computer Village"), "Samuel", "09051243133");
        Order order = new Order("Clothing", destination, pickUp, LocalDateTime.now().plusDays(70L));

        Destination destination1 = new Destination();
        destination1.setReceiverName("Renike");
        destination1.setReceiverLocation(new Address("Yaba", "Herbert Macaulay"));
        PickUp pickUp1 = new PickUp(new Address("Yaba", "onike"), "chidi", "09051243133");
        Order order1 = new Order("Document", destination1, pickUp1, LocalDateTime.now().plusDays(500L));

        Destination destination2 = new Destination();
        destination2.setReceiverName("Folahan");
        destination2.setReceiverLocation(new Address("Vi", "Amodu Tijani"));
        PickUp pickUp2 = new PickUp(new Address("Berger", "Kosoko street"), "Samuel", "09051243133");
        Order order2 = new Order("Clothing", destination2, pickUp2, LocalDateTime.now().plusDays(2L));

        Destination destination3 = new Destination();
        destination3.setReceiverName("Zainab");
        destination3.setReceiverLocation(new Address("Yaba", "Herbert Macaulay"));
        PickUp pickUp3 = new PickUp(new Address("Ikeja", "Mega Chicken"), "Monika", "09051243133");
        Order order3 = new Order("Clothing", destination3, pickUp3,LocalDateTime.now().plusDays(7L));
        //given that
unPairedOrders.add(order);
unPairedOrders.add(order2);
unPairedOrders.add(order3);
unPairedOrders.add(order1);
        RequestItem requestItem = new RequestItem(new Address("Yaba", "Herbet Macaulay"),
                new Address("Ikeja", "Computer Village"), "09051243133");

        for (Order order67: unPairedOrders){
        if (order67.getDestination().getReceiverLocation().getCity().
                equals(requestItem.getDestination().getCity())  && order67.getPickUp().getCurrentLocation().getCity().
                equals(requestItem.getCurrentLocation().getCity())) orderList.add(order67);}
         System.out.println(orderList + " Before sorting");

        orderList.sort((o1, o2) -> {
            if (o1.getCreatedAt() == null || o2.getCreatedAt() == null)
                return 0;
            return o1.getCreatedAt().compareTo(o2.getCreatedAt());
        });

      //  System.out.println(LocalDateTime.now().plusDays(6767L) + "first one");
       // System.out.println(LocalDateTime.now().plusDays(56L) + "second one");

        //    System.out.println(orderList.size());

       // System.out.println(orderList + " After sorting");

        System.out.println(orderList + " after sorting");
    }
}

