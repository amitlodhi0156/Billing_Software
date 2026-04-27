package in.amit.billingsoftware.service;

import com.razorpay.RazorpayException;
import in.amit.billingsoftware.io.RazorpayOrderResponse;

public interface RazorpayService {

    RazorpayOrderResponse createOrder(Double amount, String currency) throws RazorpayException;
}
