package repository;
import model.Customer;
import org.springframework.data.jpa.repository.support.JpaRepositoryImplementation;

public interface CustomerRepository extends JpaRepositoryImplementation<Customer, Long> {
}
