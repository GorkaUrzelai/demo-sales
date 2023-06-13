package io.hashtips.controller;

import io.hashtips.domain.Customer;
import io.hashtips.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@CrossOrigin
@RequestMapping("/api/customer")
public class CustomerController {
    @Autowired
    private CustomerService customerService;

    @GetMapping
    public ResponseEntity<?> findAll() {
        Customer customer = new Customer();
        customer.setCustomerName("Prueba");
        customerService.saveCustomer(customer);
        return new ResponseEntity<>(customerService.findAll().size(), HttpStatus.CREATED);
    }

    @PostMapping
    public ResponseEntity<?> saveCustomer(@RequestBody Customer customer) {
        return new ResponseEntity<>(customerService.saveCustomer(customer), HttpStatus.CREATED);
    }
}
