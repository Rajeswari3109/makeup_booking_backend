package booking.com.example.booking;

import jakarta.persistence.*;
import java.time.LocalDate;
import java.time.LocalTime;

@Entity
@Table(name = "bookings")
public class Booking {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String customerName;
    private String phoneNumber;
    private String customerEmail;
    private String service;
    private LocalDate bookingDate;
    private LocalTime bookingTime;
    private String status = "Pending";

    // ID
    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }

    // Customer Name
    public String getCustomerName() { return customerName; }
    public void setCustomerName(String customerName) { this.customerName = customerName; }

    // Phone Number
    public String getPhoneNumber() { return phoneNumber; }
    public void setPhoneNumber(String phoneNumber) { this.phoneNumber = phoneNumber; }

    // Customer Email  ← NEW
    public String getCustomerEmail() { return customerEmail; }
    public void setCustomerEmail(String customerEmail) { this.customerEmail = customerEmail; }

    // Service
    public String getService() { return service; }
    public void setService(String service) { this.service = service; }

    // Booking Date
    public LocalDate getBookingDate() { return bookingDate; }
    public void setBookingDate(LocalDate bookingDate) { this.bookingDate = bookingDate; }

    // Booking Time
    public LocalTime getBookingTime() { return bookingTime; }
    public void setBookingTime(LocalTime bookingTime) { this.bookingTime = bookingTime; }

    // Status
    public String getStatus() { return status; }
    public void setStatus(String status) { this.status = status; }
}