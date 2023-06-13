package io.hashtips;


import io.hashtips.domain.Customer;
import io.hashtips.domain.Sale;
import io.hashtips.domain.Vehicle;
import io.hashtips.repository.CustomerRepository;
import io.hashtips.repository.VehicleRepository;
import io.hashtips.service.CustomerService;
import io.hashtips.service.VehicleService;
import lombok.AllArgsConstructor;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.Collection;

@Component
@AllArgsConstructor
public class DataLoader implements ApplicationRunner {

    CustomerService customerService;
    VehicleService vehicleService;
    CustomerRepository customerRepository;
    VehicleRepository vehicleRepository;

    @Override
    public void run(ApplicationArguments args) {
        Customer c = new Customer();
        c.setCustomerName("Gorka");
        customerRepository.save(c);
        Collection<Sale> vehicleList = new ArrayList<>();
        Vehicle v = new Vehicle();
        v.setVehicleName("Zafira");
        vehicleRepository.save(v);

        /*Sale s = new Sale();
        s.setCustomer(c);
        s.setVehicle(v);
        s.setDiscount(10);
        vehicleList.add(s);
        c.setSales(vehicleList);
        customerService.saveCustomer(c);*/

    }

}