package com.rensource.rental.video;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface VideoTypeRepository extends JpaRepository<VideoType, Long> {
}
