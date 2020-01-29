package com.project.NotifcationService.NotificationService.repository;

import com.project.NotifcationService.NotificationService.entity.NotificationEntity;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import javax.management.openmbean.CompositeData;
import java.util.List;

@Repository
public interface NotificationRepository extends CrudRepository<NotificationEntity, String> {
    List<NotificationEntity> findByUserId(String id);

}
