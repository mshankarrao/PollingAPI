package com.technocart.repository;

import com.technocart.domain.Coordinates;
import org.springframework.data.repository.CrudRepository;

/**
 * Created by shankarraomata on 5/23/17.
 */
public interface PollingRepository extends CrudRepository<Coordinates, String> {
}
