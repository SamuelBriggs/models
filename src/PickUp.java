public class PickUp {
    private Address currentLocation;

    private String senderName;

    private String phoneNumber;

    public PickUp(Address address, String senderName, String phoneNumber) {
        this.currentLocation = address;
        this.senderName = senderName;
        this.phoneNumber = phoneNumber;
    }

    public Address getCurrentLocation() {
        return currentLocation;
    }

    public void setCurrentLocation(Address currentLocation) {
        this.currentLocation = currentLocation;
    }

    public String getSenderName() {
        return senderName;
    }

    public void setSenderName(String senderName) {
        this.senderName = senderName;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    @Override
    public String toString() {
        return "PickUp{" +
                "currentLocation=" + currentLocation +
                ", senderName='" + senderName + '\'' +
                ", phoneNumber='" + phoneNumber + '\'' +
                '}';
    }
}
