package reactivedemo;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;
import reactivedemo.domain.Customer;

@Repository
public interface CustomerRepository extends MongoRepository<Customer,String> {


}
