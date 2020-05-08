package no.adrsolheim.webapp.album;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;

@Service
public class AlbumServiceImpl implements AlbumService {

    /**
     * No need for @Transactional as JPA provide this functionality
     * under the hood, as opposed to Hibernate.
     */

    private AlbumRepository albumRepo;

    @Autowired
    public AlbumServiceImpl(AlbumRepository ar) {
        albumRepo = ar;
    }

    @Override
    public List<Album> findAll() {
        return albumRepo.findAll();
    }

    @Override
    public Album findById(int id) {

        // Optional can be used to check if a given object/value is present
        Optional<Album> album = albumRepo.findById(id);
        Album result = null;
        if(album.isPresent()) {
            result = album.get();
        } else {
            throw new RuntimeException("Could not find album by id " + id);
        }
        return result;
    }

    @Override
    public void save(Album album) {
        albumRepo.save(album);
    }

    @Override
    public void deleteById(int id) {
        albumRepo.deleteById(id);
    }
}
