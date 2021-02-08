package dao.impl;

import dao.UserDao;
import java.util.List;
import model.User;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class UserDaoImpl implements UserDao {
    @Autowired
    private SessionFactory sessionFactory;

    @Override
    public void add(User user) {
        sessionFactory.openSession().save(user);
    }

    @Override
    public List<User> listUsers() {
        return sessionFactory.openSession()
                .createQuery("from User", User.class).getResultList();
    }
}
