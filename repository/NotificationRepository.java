package com.project.NotifcationService.NotificationService.repository;

import com.project.NotifcationService.NotificationService.entity.NotificationEntity;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface NotificationRepository extends CrudRepository<NotificationEntity, String> {
}
