package com.sachin.springmvc2.dao;
 
import com.sachin.springmvc2.model.User;
import javax.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.stereotype.Repository;

@Repository
//to tell container that bean should be created automatically and object need to be injected
public class UserDao {
    @Autowired
    private HibernateTemplate hibernateTemplate;

    public HibernateTemplate getHibernateTemplate() {
        return hibernateTemplate;
    }

    public void setHibernateTemplate(HibernateTemplate hibernateTemplate) {
        this.hibernateTemplate = hibernateTemplate;
    }
    
    @Transactional
    public int saveUser(User user){
        int id =(int) this.hibernateTemplate.save(user);
        return id;
    }
    
}
