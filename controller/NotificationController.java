package com.project.NotifcationService.NotificationService.controller;

import com.project.NotifcationService.NotificationService.dto.NotificationRecieveDTO;
import com.project.NotifcationService.NotificationService.dto.NotificationResponseDTO;
import com.project.NotifcationService.NotificationService.entity.NotificationEntity;
import com.project.NotifcationService.NotificationService.service.NotificationService;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value="/notification")
public class NotificationController {
    @Autowired
    NotificationService notificationService;

    @PostMapping(value="/")
    public ResponseEntity<String> addNewNotifications(@RequestBody NotificationRecieveDTO notifcationReceiveDTO){
        NotificationEntity  notificationEntity=new NotificationEntity();
        BeanUtils.copyProperties(notifcationReceiveDTO,notificationEntity);
        notificationService.save(notificationEntity);
        return new ResponseEntity<String>(notificationEntity.getNotificationId(),HttpStatus.CREATED);
    }

    @GetMapping(value="/")
    public List<NotificationEntity>findAllNotification(){
        List<NotificationEntity>notificationEntityList=notificationService.findAllNotifications();
        return notificationEntityList;
    }

    @GetMapping(value="/user/{id}")
    public List<NotificationEntity>findNotificationByUser(@PathVariable("id")String id){
        List<NotificationEntity>notificationEntityList=notificationService.findByUserId(id);
        return notificationEntityList;
    }

    @GetMapping(value="/{id}")
    public ResponseEntity<NotificationResponseDTO>findById(@PathVariable(value="id")String id){
        NotificationEntity notificationEntity=notificationService.findById(id);
        NotificationResponseDTO notificationResponseDTO=new NotificationResponseDTO();
        BeanUtils.copyProperties(notificationEntity,notificationResponseDTO);
        return new ResponseEntity<NotificationResponseDTO>(notificationResponseDTO,HttpStatus.FOUND);
    }

    @DeleteMapping("/{id}")
    public HttpStatus deleteById(@PathVariable(value="id")String id){
        notificationService.deleteById(id);
        return HttpStatus.OK;
    }
}
