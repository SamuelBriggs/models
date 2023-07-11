import java.time.LocalDateTime;

public class RequestItem {
    private Address destination;

    private Address currentLocation;

    private String phoneNumber;

    private LocalDateTime createdAt;

    public RequestItem(Address destination, Address currentLocation, String phoneNumber) {
        this.destination = destination;
        this.currentLocation = currentLocation;
        this.phoneNumber = phoneNumber;
    }

    public Address getDestination() {
        return destination;
    }

    public void setDestination(Address destination) {
        this.destination = destination;
    }

    public Address getCurrentLocation() {
        return currentLocation;
    }

    public void setCurrentLocation(Address currentLocation) {
        this.currentLocation = currentLocation;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public LocalDateTime getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(LocalDateTime createdAt) {
        this.createdAt = createdAt;
    }






}
