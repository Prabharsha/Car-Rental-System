package lk.ijse.spring.dto;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.time.LocalDate;

@AllArgsConstructor
@NoArgsConstructor
@Data
@ToString
public class PaymentDTO {
    private String paymentId;
    @JsonFormat(pattern = "yyyy-MM-dd")
    private LocalDate date;
    private String accountNo;
    private String accountHolderName;
    private String bankName;
    private String branchName;
    private double amount;
    private CarRentDTO rental;

}
