import java.time.LocalDateTime;

public class Order {
    private String orderName;
    private String orderType;
    private Destination destination;
    private PickUp pickUp;
    private LocalDateTime createdAt;

    private boolean isAccepted;

    private boolean isCompleted;


    public Order(String orderName, Destination destination, PickUp pickUp, LocalDateTime localDateTime) {

        this.orderName = orderName;
        this.destination = destination;
        this.pickUp= pickUp;
        this.createdAt = localDateTime;


    }

    @Override
    public String toString() {
        return "Order{" +
                "orderName='" + orderName + '\'' +
                ", orderType='" + orderType + '\'' +
                ", destination=" + destination +
                ", pickUp=" + pickUp +
                ", createdAt=" + createdAt +
                '}';
    }

    public String getOrderName() {
        return orderName;
    }

    public void setOrderName(String orderName) {
        this.orderName = orderName;
    }

    public String getOrderType() {
        return orderType;
    }

    public void setOrderType(String orderType) {
        this.orderType = orderType;
    }

    public Destination getDestination() {
        return destination;
    }

    public void setDestination(Destination destination) {
        this.destination = destination;
    }

    public PickUp getPickUp() {
        return pickUp;
    }

    public void setPickUp(PickUp pickUp) {
        this.pickUp = pickUp;
    }

    public LocalDateTime getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(LocalDateTime createdAt) {
        this.createdAt = createdAt;
    }





}
