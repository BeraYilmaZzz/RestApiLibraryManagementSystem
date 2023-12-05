package com.bera.yilmaz.RestAPILibaryManagementSystem.Api;

import com.bera.yilmaz.RestAPILibaryManagementSystem.Business.Abs.IPublisherService;
import com.bera.yilmaz.RestAPILibaryManagementSystem.Dto.Publisher.PublisherRequest;
import com.bera.yilmaz.RestAPILibaryManagementSystem.Entities.Publisher;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/v1/publisher")
public class PublisherController {
    @Autowired
    private IPublisherService publisherService;
    @Autowired
    private ModelMapper modelMapper;

    @GetMapping("")
    @ResponseStatus()
    public List<PublisherRequest> findAll(){
        List<PublisherRequest> publisherRequestList = this.publisherService.findAll().stream().map(
                publisher -> this.modelMapper.map(publisher,PublisherRequest.class)
        ).collect(Collectors.toList());
        return publisherRequestList;
    }

    @PostMapping("")
    @ResponseStatus(HttpStatus.CREATED)
    public Publisher save(@RequestBody Publisher publisher){
        return this.publisherService.save(publisher);
    }

    @PutMapping("")
    @ResponseStatus(HttpStatus.OK)
    public Publisher update(@RequestBody Publisher publisher){
        Publisher updatedPublisher = this.publisherService.getById(Math.toIntExact(publisher.getId()));
        updatedPublisher.setName(publisher.getName());
        updatedPublisher.setAddress(publisher.getAddress());
        updatedPublisher.setEstablishmentYear(publisher.getEstablishmentYear());
        return this.publisherService.save(updatedPublisher);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable("id") int id){
        this.publisherService.delete(id);
    }

}
