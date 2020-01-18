package com.danielyoshio.cursomc.services;

import org.springframework.mail.SimpleMailMessage;

import com.danielyoshio.cursomc.domain.Pedido;

public interface EmailService {
	
	void sendOrderConfirmationEmail(Pedido obj);
	
	void sendEmail(SimpleMailMessage msg);	
}
