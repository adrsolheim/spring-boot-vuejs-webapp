package no.adrsolheim.webapp.album;

import java.util.List;

public interface AlbumService {

    public List<Album> findAll();

    public Album findById(int id);

    public void save(Album album);

    public void deleteById(int id);
}
