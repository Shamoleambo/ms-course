package com.devsuperior.hrpayroll.services;

import org.springframework.stereotype.Service;

import com.devsuperior.hrpayroll.entities.Payment;

@Service
public class PaymentServices {

	public Payment getPayment(long id, int days) {
		return new Payment("Bod", 200.0, days);
	}
}
