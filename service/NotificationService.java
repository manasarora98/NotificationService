package com.project.NotifcationService.NotificationService.service;

import com.project.NotifcationService.NotificationService.entity.NotificationEntity;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface NotificationService {

    NotificationEntity save(NotificationEntity notificationEntity);

    void deleteById(String id);

    NotificationEntity findById(String id);

    List<NotificationEntity> findAllNotifications();

    List<NotificationEntity> findByUserId(String id);
}
