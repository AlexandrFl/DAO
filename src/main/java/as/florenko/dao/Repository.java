package as.florenko.dao;

import org.springframework.stereotype.Component;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import java.util.List;


@Component
public class Repository {
    @PersistenceContext
    private EntityManager entityManager;

    public List findByCity(String name) {
        List users;
        Query query = entityManager.createQuery("select o.productName from Orders o where o.customers.name=:name");
        query.setParameter("name", name);
        users = query.getResultList();
        return users;
    }
}

