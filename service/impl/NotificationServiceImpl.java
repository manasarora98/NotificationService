package com.project.NotifcationService.NotificationService.service.impl;

import com.project.NotifcationService.NotificationService.entity.NotificationEntity;
import com.project.NotifcationService.NotificationService.repository.NotificationRepository;
import com.project.NotifcationService.NotificationService.service.NotificationService;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class NotificationServiceImpl implements NotificationService {
    @Autowired
    NotificationRepository notificationRepository;

    @Override
    public NotificationEntity save(NotificationEntity notificationEntity) {
        return notificationRepository.save(notificationEntity);
    }

    @Override
    public void deleteById(String id) {
        if(notificationRepository.existsById(id)){
            notificationRepository.deleteById(id);
        }
    }

    @Override
    public List<NotificationEntity> findByUserId(String id) {
        List<NotificationEntity> notificationEntityList=(List<NotificationEntity>)notificationRepository.findByUserId(id);
        return notificationEntityList;
    }

    @Override
    public NotificationEntity findById(String id) {
        NotificationEntity notificationEntity=notificationRepository.findById(id).get();
        return notificationEntity;
    }

    @Override
    public List<NotificationEntity> findAllNotifications() {
        List<NotificationEntity> notificationEntityList=(List<NotificationEntity>)notificationRepository.findAll();
        return notificationEntityList;
    }
}
