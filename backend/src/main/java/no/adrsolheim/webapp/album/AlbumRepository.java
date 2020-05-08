package no.adrsolheim.webapp.album;

import org.springframework.data.jpa.repository.JpaRepository;

public interface AlbumRepository extends JpaRepository<Album, Integer> {

    // Implementation is provided by the spring boot jpa dependency
    // This interface replaces a DAO class
}
