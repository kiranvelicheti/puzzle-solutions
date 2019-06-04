package reactivedemo;

import com.google.common.collect.Lists;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import reactivedemo.domain.Customer;
import reactor.core.publisher.Flux;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/react")
@RequiredArgsConstructor
public class ReactiveController {

    private final CustomerRepository repository;

    @GetMapping
    public List<Customer> firstReactMethod() {
        Customer c1 = Customer.builder().firstName("kiran").lastName("velicheti").build();
        Customer c2 = Customer.builder().firstName("test").lastName("velicheti").build();
        ArrayList<Customer> customers = Lists.newArrayList(c1, c2);
        Flux.just(customers)
                .log()
                .subscribe(repository::saveAll)
                .dispose();
        return repository.findAll();
    }
}
