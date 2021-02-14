package restaurant.external;

public class Deposit {

    private Long id;
    private String restaurantNo;
    private String day;
    private String status;
    private Long reservationNo;

    public Long getId() {
        return id;
    }
    public void setId(Long id) {
        this.id = id;
    }
    public String getRestaurantNo() {
        return restaurantNo;
    }
    public void setRestaurantNo(String restaurantNo) {
        this.restaurantNo = restaurantNo;
    }
    public String getDay() {
        return day;
    }
    public void setDay(String day) {
        this.day = day;
    }
    public String getStatus() {
        return status;
    }
    public void setStatus(String status) {
        this.status = status;
    }
    public Long getReservationNo() {
        return reservationNo;
    }
    public void setReservationNo(Long reservationNo) {
        this.reservationNo = reservationNo;
    }

}
