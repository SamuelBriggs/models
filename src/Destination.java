public class Destination {

    private Address receiverLocation;

    private String receiverName;

    private String receiverPhoneNumber;

    public Address getReceiverLocation() {
        return receiverLocation;
    }

    public void setReceiverLocation(Address currentLocation) {
        this.receiverLocation = currentLocation;

    }

    public String getReceiverName() {
        return receiverName;
    }

    public void setReceiverName(String receiverName) {
        this.receiverName = receiverName;
    }

    public String getReceiverPhoneNumber() {
        return receiverPhoneNumber;
    }

    public void setReceiverPhoneNumber(String receiverPhoneNumber) {
        this.receiverPhoneNumber = receiverPhoneNumber;
    }

    @Override
    public String toString() {
        return "Destination{" +
                "receiverLocation=" + receiverLocation +
                ", receiverName='" + receiverName + '\'' +
                ", receiverPhoneNumber='" + receiverPhoneNumber + '\'' +
                '}';
    }




}
