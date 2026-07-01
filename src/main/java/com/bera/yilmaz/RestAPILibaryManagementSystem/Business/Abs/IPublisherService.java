package com.bera.yilmaz.RestAPILibaryManagementSystem.Business.Abs;

import com.bera.yilmaz.RestAPILibaryManagementSystem.Entities.Publisher;
import java.util.List;

public interface IPublisherService {
    Publisher getById(int id);
    Publisher save (Publisher Publisher);
    void delete (int id);
    Publisher update(Publisher Publisher);
    List<Publisher> findAll();
}
